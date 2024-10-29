package main.java.ru.astonkurs2.model.enemies;

import main.java.ru.astonkurs2.features.Mortal;
import main.java.ru.astonkurs2.model.heroes.Archer;
import main.java.ru.astonkurs2.model.heroes.Hero;

public abstract class Enemy implements Mortal {

	private int health;

	public Enemy(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public abstract void takeDamage(int damage, Hero hero);

	public abstract void attackBack(Hero hero);

	public Boolean isAlife() {
		return health > 0;
	}

}
