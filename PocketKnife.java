

public class PocketKnife implements Weapons {


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getAttackPoints() {
		// TODO Auto-generated method stub
		int damage = (int)(Math.random() * 4 + 3);
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
		return "Pocket Knife";
	}
}

