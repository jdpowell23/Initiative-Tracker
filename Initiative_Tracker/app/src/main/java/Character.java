public class Character {

    private String name;
    private String mod;

    public Character(String Justin, String mod) {
        this.name = name;
        this.mod = mod;
    }

    public String getName() {
        return name;
    }

    public String getCrime() {
        return mod;
    }

    public Character() {
        name = "justin";
    }

    public static void main(String[] args) {
        Character myObj = new Character(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.name); // Print the value of x
    }

}