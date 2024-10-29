package main.java.ru.astonkurs2.model.enemies;

import main.java.ru.astonkurs2.model.heroes.Archer;
import main.java.ru.astonkurs2.model.heroes.Hero;

public class Fairy extends Enemy{

	public Fairy(int health) {
		super(health);
	}
	
	public void takeDamage(int damage, Hero hero) {
		double luck = Math.random();
		if (luck > 0.3) {
			damage = 0;
			System.out.print("");
			System.out.print("fairy avoided attack! damage = 0, ");
		}
		setHealth(getHealth() - damage);
		System.out.println("fairy's health = " + getHealth());
		if (isAlife()) {
			System.out.print("fairy attacked back");
			attackBack(hero);
		} else
			System.out.println("fairy is dead!");
		System.out.println("");
	}

	public void attackBack(Hero hero) {
		//фея уклоняется в 70% случаев, но сама наносит очень маленький урон 0-10хп
		int damage = (int) (Math.ceil(Math.random() * 10));

		if (hero instanceof Archer) {
			double luck = Math.random();
			if (luck < 0.5) {
				damage = 0;
				System.out.print("");
				System.out.print(", distance attack! fairy can't attack back");
			}
		}

		hero.takeDamage(damage);
		System.out.print(", damage = " + damage);
		System.out.println("");
		System.out.println(hero.isAlife() ? "hero's health = " + hero.getHealth() : "hero is dead");
	}

}
