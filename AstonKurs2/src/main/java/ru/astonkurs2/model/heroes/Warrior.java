package main.java.ru.astonkurs2.model.heroes;

import main.java.ru.astonkurs2.model.enemies.Enemy;

public class Warrior extends Hero{
	
	public Warrior(String name, int health) {
		super(name, health);
	}
	
	public String getName() {
		return super.getName() + ", the warrior, ";
	}

	@Override
	public void attackEnemy(Enemy enemy)
	{
		int damage = 0;
		if (isAlife()) damage = countDamage();
		System.out.println(getName() + "attacked enemy, damage = " + damage);
		enemy.takeDamage(damage, this);
	}
	
	//удар - от 40 до 50, и усиленный удар 75 единиц здоровья с вероятностью 20%
	public int countDamage()
	{
		double damage = Math.ceil(Math.random()*10 + 40);
		double luck = Math.random();
		if (luck >= 0.8) 
			{
			damage = 75;
			System.out.println("warrior used their powerful attack!");
			}
		return (int) damage;
	}
	
	public Boolean isAlife()
	{
		return getHealth() > 0;
	}

}
