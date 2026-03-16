public class KentGirls {
    private String name;
    private int age;
    private static String sex = "female";

    //non-argument constructor
    public KentGirls() {
        this.name = "cassey";
        this.age = 18;
    }

    //constructor with parameters
    public KentGirls (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Muatator
    public int countAge (int x) {
        return this.age += x;
    }

    public static String offclass () {
        return "16:30";
    }

    //如果年龄大于17，那么2026年毕业；else2027年毕业
    public String graduateAge () {
        if (age > 17) {
            return "graduate in 2026";
        }
        else{
            return "graduate in 2027";
        }
    }

    //Accessor
    public String returnName () {
        return this.name;
    }

    public void newName () {
        System.out.println(this.name + " is a girl");
    }
}
