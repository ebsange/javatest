public class Puppy extends dog {
    public Puppy(String newName, int newAge, String newColor) {
        super(newName, newAge, newColor);
    }

    public String getColor() {
        return "subColor";
    }

    public String test() {
        return "yes";
    }
}