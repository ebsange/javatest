public class dog {
    private String name;
    private int age;
    private String color;

    public dog(String newName, int newAge, String newColor) {
        name = newName;
        age = newAge;
        color = newColor;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return "supercolor";
    }
}
