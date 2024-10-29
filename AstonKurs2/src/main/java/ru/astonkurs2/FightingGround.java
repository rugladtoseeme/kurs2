package main.java.ru.astonkurs2;

import main.java.ru.astonkurs2.model.enemies.Bandit;
import main.java.ru.astonkurs2.model.enemies.Enemy;
import main.java.ru.astonkurs2.model.enemies.Fairy;
import main.java.ru.astonkurs2.model.enemies.Vampire;
import main.java.ru.astonkurs2.model.heroes.Archer;
import main.java.ru.astonkurs2.model.heroes.Mage;
import main.java.ru.astonkurs2.model.heroes.Warrior;

public class FightingGround {

	
	public static void main(String[] args) {
		//Warrior war1 = new Warrior("mary", 200);
		Archer war1 = new Archer("john", 200);
		//Mage war1 = new Mage("steve", 200);
		
		
		//Enemy en1 = new Vampire(200);
		Enemy en1 = new Fairy(200);
		//Enemy en1 = new Bandit(200);
		
		
		while (en1.isAlife() && war1.isAlife())
		{
			war1.attackEnemy(en1);
		} 
	}
}
