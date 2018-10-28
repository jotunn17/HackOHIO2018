
public class Inventory {
	int gold;
	Item[] items  ;
	private int size;
	
	public Inventory()
	{
		this.gold  = 0;
		this.items = new Item[10];
		this.size = 0;
	}
	
	public Inventory(int gold, Item []items)
	{
		this.gold  = gold;
		this.items = items;
		this.size = items.length;
	}
	public void viewGold()
	{
		System.out.print("You have "+ this.gold + " gold");
	}
	public void increaseGold(int ammount)
	{
		this.gold += ammount;
	}
	public void decreaseGold(int ammount)
	{
		this.gold -= ammount;
	}
	public void viewItems()
	{
		System.out.print("You have ");
		for(int i = 0; i<items.length;i++)
		{
			System.out.print(items[i]+", ");
		}
	}
	public int numOfItems()
	{
		int count = 0;
		for(Item i: items)
		{
			if(i!=null)
			{
				count++;
			}
		}
		return count;
	}
	
	public void increaseInventory(Item item)
	{
		if(numOfItems()!=items.length)
		{
			items[numOfItems()+1] = item;
			size++;
		}
		else
		{
			System.out.print("Your inventory is full");
		}
	}
	public Item decreaseInventory(Item item)
	{
		int loc = -1;
		for(int i = 0;i<size && loc<0;i++)
		{
			if(items[i].equals(item))
			{
				loc = i;
				
			}
		}
		Item toRet= items[loc];
		for(int i = loc;i<size-1;i++)
		{
			items[i] = items[i+1];
		}
		size--;
		return toRet;
	}
	
	public Item getItem(int i)
	{
		return items[i];
	}
}
