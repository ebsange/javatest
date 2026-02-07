public class Puppy {
    //instance variable
    private int age;
    private String name;
    private String color;
    private static String status = "live";
 
    // 构造器constrctor with parameter
    public Puppy(String newName, int newAge, String newColor) {
        name = newName;
        age = newAge;
        color = newColor;
    }


    //overload
    public void addAge(int newAge) {
        age += newAge;
    }

    public double addAge(double newAge) {
        age += newAge;
        return age;
    }

    public int getAge() {
        return age;
    }


}