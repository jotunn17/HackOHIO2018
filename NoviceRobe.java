

public class NoviceRobe implements Armor{
	public int getPrice() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getDefensePoints() {
		// TODO Auto-generated method stub
		
		return 5;
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
		return "Novice Robe";
	}
}
