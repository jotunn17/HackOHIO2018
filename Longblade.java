

public class Longblade implements Weapons {


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getAttackPoints() {
		// TODO Auto-generated method stub
		int damage = (int)(Math.random() * 5 + 8);
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
		return "Longblade";
	}
}

