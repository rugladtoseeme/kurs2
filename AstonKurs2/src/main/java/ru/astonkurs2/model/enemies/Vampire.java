package main.java.ru.astonkurs2.model.enemies;

import main.java.ru.astonkurs2.model.heroes.Archer;
import main.java.ru.astonkurs2.model.heroes.Hero;

public class Vampire extends Enemy {

	public Vampire(int health) {
		super(health);
	}

	public void takeDamage(int damage, Hero hero) {
		setHealth(getHealth() - damage);
		System.out.println("vampire's health = " + getHealth());
		if (isAlife()) {
			System.out.print("vampire attacked back");
			attackBack(hero);
		} else
			System.out.println("vampire is dead!");
		System.out.println("");
	}

	public void attackBack(Hero hero) {
		int damage = (int) (Math.ceil(Math.random() * 30 + 10));

		if (hero instanceof Archer) {
			double luck = Math.random();
			if (luck < 0.5) {
				damage = 0;
				System.out.print("");
				System.out.print(", distance attack! vampire can't attack back");
			}
		}

		//вампир с вероятностью 35% может восстановить здоровье равное 50% нанесенного им урона
		double luck = Math.random();
		if (luck > 0.65) {
			int healPoints = (int)(damage*0.5);
			setHealth(getHealth() + healPoints);
			System.out.print("");
			System.out.print(", vampire sucked heroes blood and gained " + healPoints + "hp, vampire's health = " + getHealth());
		}

		hero.takeDamage(damage);
		System.out.print(", damage = " + damage);
		System.out.println("");
		System.out.println(hero.isAlife() ? "hero's health = " + hero.getHealth() : "hero is dead");
	}
}
