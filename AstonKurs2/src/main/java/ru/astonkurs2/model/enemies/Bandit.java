package main.java.ru.astonkurs2.model.enemies;

import main.java.ru.astonkurs2.model.heroes.Archer;
import main.java.ru.astonkurs2.model.heroes.Hero;

public class Bandit extends Enemy{

	public Bandit(int health) {
		super(health);
	}

	public void takeDamage(int damage, Hero hero) {
		
		double luck = Math.random();
		if (luck > 0.7) {
			damage = 0;
			System.out.print("");
			System.out.print("bandit avoided attack! damage = 0, ");
		}
		
		setHealth(getHealth() - damage);
		
		System.out.println("bandit's health = " + getHealth());
		if (isAlife()) {
			System.out.print("bandit attacked back");
			attackBack(hero);
		} else
			System.out.println("bandit is dead!");
		System.out.println("");
	}

	//разбойник умеет уклоняться с вероятностью 30%, повышенная ловкость позволяет ему атаковать уклоняющегося лучника, 
	//а также он обладает неплохой атакой
	public void attackBack(Hero hero) {
		int damage = (int)(Math.ceil(Math.random()*25 + 20));
		
		if (hero instanceof Archer)
		{
			double luck = Math.random();
			if (luck < 0.3) 
				{
				damage = 0;
				System.out.print("");
				System.out.print(", distance attack! bandit can't attack back");
				}
		}
		hero.takeDamage(damage);
		System.out.print(", damage = " + damage);
		System.out.println("");
		System.out.println(hero.isAlife()?"hero's health = " + hero.getHealth():"hero is dead");
	}
}
