package main.java.ru.astonkurs2.model.heroes;

import main.java.ru.astonkurs2.model.enemies.Enemy;

public class Mage extends Hero {
	
	public Mage(String name, int health) {
		super(name, health);
	}

	public String getName() {
		return super.getName() + ", the mage, ";
	}
	
	@Override
	public void attackEnemy(Enemy enemy) {
		
		int damage = 0;
		if (isAlife()) damage = countDamage();
		System.out.println(getName() + "attacked enemy, damage = " + damage);
		enemy.takeDamage(damage, this);
	}
	
	//удар - от 20 до 40, и файрболл 100 единиц здоровья с вероятностью 10%
	public int countDamage()
	{
		double damage = 2 * (Math.random() * 10) + 20;
		double luck = Math.random();
		if (luck >= 0.9) 
			{
			damage = 100;
			System.out.println("mage casted a fireball!");
			}
		return (int) damage;
	}

	public Boolean isAlife()
	{
		return getHealth() > 0;
	}
}
