package map.city;

import item.Potion;
import item.armor.*;
import item.weapons.*;
import map.landmarks.Landmark;
import npc.Inventory;

public class City implements Landmark {
	
	private String name;
	final private String[] LOCALE = {"inn", "shop"};
	private Inventory shopInventory;
	private int population;
	
	@Override
	public String label() {
		return "city";
	}

	@Override
	public String name() {
		return name;
	}

	public String[] locations() {
		return LOCALE;
	}

	@Override
	public char icon() {
		// TODO Auto-generated method stub
		return 'C';
	}
	
	public City() {
		
		population = (int)(Math.random() * 400) + 200;
		
	}
	public void printStats() {
		System.out.println("You are in the city of " + name + ".");
		System.out.println("Population: " + population);
		
	}
	@Override
	public boolean canLeave() {
		// TODO Auto-generated method stub
		return true;
	}


	public void shopMenu()
	{
		System.out.print("Welcome to the shop!");
		System.out.println("The items are:");
		for(int i = 0; i<shopInventory.numOfItems();i++)
		{
			System.out.print("Name: " + shopInventory.getItem(i).getName() + " Price: " + shopInventory.getItem(i).getPrice());
		}
	}
	public void getShopInventory()
	{
		Inventory shopInventory = new Inventory();
		Armor[] armors = {(Armor) new Chainmail(), (Armor) new NoviceRobe(), (Armor) new PeasantsCloth(), 
				(Armor) new PhoenixTunic(), (Armor) new PlateArmor(), (Armor) new VulcansGear()};
		Weapons[] weapons = {(Weapons) new Chainmail(), (Weapons) new NoviceRobe(), (Weapons) new PeasantsCloth(), 
				(Weapons) new PhoenixTunic(), (Weapons) new PlateArmor(), (Weapons) new VulcansGear()};
		int rand =  (int)(Math.random() * armors.length);
		int rand2 =  (int)(Math.random() * weapons.length);
		shopInventory.increaseInventory(armors[rand]);
		shopInventory.increaseInventory(new Potion());
		shopInventory.increaseInventory(weapons[rand2]);
	}

	@Override
	public void dialogue() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * TODO: Finish City
	 */
}
