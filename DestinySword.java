


public class DestinySword implements Weapons {


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 180;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getAttackPoints() {
		// TODO Auto-generated method stub
		int damage = (int)(Math.random() * 6 + 14);
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
		return "Destiny Sword";
	}
}

