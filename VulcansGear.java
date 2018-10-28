

public class VulcansGear implements Armor{
	public int getPrice() {
		// TODO Auto-generated method stub
		return 110;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getDefensePoints() {
		// TODO Auto-generated method stub
		
		return 30;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Vulcan's Gear";
	}
	@Override
	public boolean isArmor() {
		// TODO Auto-generated method stub
		return true;
	}
}
