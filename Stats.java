
//Needs to be private?
public class Stats {

    int health;
    int attack; //listed stats (parts of class)
    int defense;
    int dexterity;

    public Stats() {
    }

    /**
     *
     * Construct from {@code int (integers of stat values}
     *
     * @param health
     *            {@code int} to initialize from
     * @param attack
     *            {@code int} to initialize from
     * @param defense
     *            {@code int} to initialize from
     * @param dexterity
     *            {@code int} to initialize from
     *
     */
    public Stats(int health, int attack, int defense, int dexterity) {
        this.health = health;
        this.attack = attack; //setting object value to those in constructor
        this.defense = defense;
        this.dexterity = dexterity;

    }

    //METHODS FOR CHANGING STATS

    /**
     *
     * @param changeStat
     *            increases speed by its value
     *
     */
    public void increaseDexterity(int changeStat) {
        //increase speed by speed + changeStat
        this.dexterity += changeStat;
        System.out.println("speed changed to " + this.dexterity);
    }
    
    /**
     * 
     * Returns health as int
     * 
     */
    public int getHealth() {
    	return this.health;
    }
    
    public int getAttack() {
    	return this.attack;
    }

    public int getDefense() {
    	return this.defense;
    }
    
    public int getDexerity() {
    	return this.dexterity;
    }

    
    /**
     *
     * @param changeStat
     *            increases health by its value
     *
     */

    public void increaseHealth(int changeStat) {

        this.health += changeStat;
        System.out.println("health changed to " + this.health);
    }

    /**
     *
     * @param changeStat
     *            increases defense by its value
     *
     */

    public void increaseDefense(int changeStat) {

        this.defense += changeStat;
        System.out.println("defense increased to " + this.defense);
    }

    /**
     *
     * @param changeStat
     *            increases attack by its value
     *
     */

    public void increaseAttack(int changeStat) {
        this.attack = this.attack + changeStat;
        System.out.println("attack increased to " + this.attack);
    }

    /**
     *
     * @param changeStat
     *            decreases speed by its value
     *
     */
    public void decreaseDexterity(int changeStat) {
        //decrease speed by speed - changeStat
        this.dexterity -= changeStat;
        System.out.println("speed changed to " + this.dexterity);
    }

    /**
     *
     * @param changeStat
     *            decreases health by its value
     *
     */

    public void decreaseHealth(int changeStat) {
        //decrease health by health - changeStat
        this.health -= changeStat;
        System.out.println("health changed to " + this.health);
    }

    /**
     *
     * @param changeStat
     *            decreases defense by its value
     *
     */

    public void decreaseDefense(int changeStat) {
        //decrease defense by defense - changeStat
        this.defense -= changeStat;
        System.out.println("defense increased to " + this.defense);
    }

    /**
     *
     * @param changeStat
     *            decreases attack by its value
     *
     */

    public void decreaseAttack(int changeStat) {
        this.attack -= changeStat;
        System.out.println("attack increased to " + this.attack);
    }

    /**
     *
     * @param changeStat
     *            sets speed to its value
     *
     */
    //METHODS FOR SETTING STATS
    public void setSpeed(int newStat) {
        this.dexterity = newStat;
        System.out.println("speed set to " + this.dexterity);
    }

    /**
     *
     * @param changeStat
     *            sets health to its value
     *
     */

    public void setHealth(int newStat) {
        this.health = newStat;
        System.out.println("health set to " + this.health);
    }

    /**
     *
     * @param changeStat
     *            sets defense to its value
     *
     */

    public void setDefense(int newStat) {
        this.defense = newStat;
        System.out.println("defense set to " + this.defense);
    }

    /**
     *
     * @param changeStat
     *            sets attack to its value
     *
     */

    public void setAttack(int newStat) {
        this.attack = newStat;
        System.out.println("attack set to " + this.attack);
    }
    //THIS METHOD WILL CHANGED BASED ON THE VALUE OF STATS-- PROBABLY SPACE
    //IT OUT MORE

    /**
     *
     * DISPLAYS ALL STATS AS THEY CURRENTLY ARE
     *
     */
    public void display() {
        System.out.println("|---------------|");
        System.out.println("|    Attack:" + this.attack + "   |");
        System.out.println("|---------------|");
        System.out.println("|   Defense:" + this.defense + "   |");
        System.out.println("|---------------|");
        System.out.println("|   Health:" + this.health + "  |");
        System.out.println("|---------------|");
        System.out.println("|   Dexterity:" + this.dexterity + "   |");
        System.out.println("|---------------|");

    }

}
