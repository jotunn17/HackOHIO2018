

public class Chainmail implements Armor{
	public int getPrice() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getDefensePoints() {
		// TODO Auto-generated method stub
		
		return 8;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isArmor() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Chainmail";
	}
}
