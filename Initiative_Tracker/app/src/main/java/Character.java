public class Character {

    //Instantance variables
    private String name;
    private int mod;

    //Instance Constructor
    public Character(String initName, int initMod){

        name = initName;
        mod = initMod;

    }

    public String getName() {
        return name;
    }

    public int getCrime() {
        return mod;
    }

}