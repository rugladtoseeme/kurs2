package main.java.ru.astonkurs2.model.heroes;

import main.java.ru.astonkurs2.features.Mortal;
import main.java.ru.astonkurs2.model.enemies.Enemy;

public abstract class Hero implements Mortal{
	
	private int health;
	private String name;
	
	public Hero(String name, int health) {
		this.health = health;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract void attackEnemy(Enemy enemy);

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void takeDamage(int damage)
	{
		health -= damage;
	}
	
}
