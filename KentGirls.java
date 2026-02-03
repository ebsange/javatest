public class KentGirls {
    private String name;
    private int age;

    public KentGirls (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Muatator
    public int countAge () {
        return age + 3;
    }

    //Accessor
    public String returnName () {
        return this.name;
    }
}
