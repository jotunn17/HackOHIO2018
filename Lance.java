

public class Lance implements Weapons {


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 60;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getAttackPoints() {
		// TODO Auto-generated method stub
		int damage = (int)(Math.random() * 5 + 4);
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
		return "Lance";
	}
}

