package main.java.ru.astonkurs2.model.heroes;

import main.java.ru.astonkurs2.model.enemies.Enemy;

public class Archer extends Hero{
	
	public Archer(String name, int health) {
		super(name, health);
	}
	
	public String getName() {
		return super.getName() + ", the archer, ";
	}

	@Override
	public void attackEnemy(Enemy enemy) {
		
		int damage = 0;
		if (isAlife()) damage = countDamage();
		System.out.println(getName() + "attacked enemy, damage = " + damage);
		enemy.takeDamage(damage, this);
	}
	
	//удар - от 10 до 50, и с вероятностью 50% враг не ответит на удар (лучник отошел с линии атаки)
	public int countDamage()
	{
		double damage = 10 + (Math.ceil(Math.random() * 40));
		return (int) damage;
	}
	
	public Boolean isAlife()
	{
		return getHealth() > 0;
	}

}

