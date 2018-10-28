
public class OldStick implements Weapons {

	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getAttackPoints() {
		// TODO Auto-generated method stub
		int damage = (int)(Math.random() * 2 + 1);
		return damage;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isArmor() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Old Stick";
	}
	
}
