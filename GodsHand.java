


public class GodsHand implements Weapons {


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 350;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getAttackPoints() {
		// TODO Auto-generated method stub
		int damage = (int)(Math.random() * 11 + 21);
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
		return "God's Hand";
	}
}

