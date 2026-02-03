public class Puppy {
    //variable
    private int age;
    private String name;
    private static String sex = "male";
 
    // 构造器constrctor with parameter
    public Puppy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //none-argument constructor
    public Puppy() {
        name = "AAA";
        age = 5;
    }
    //public return-type(数据类型，void) name
    public void setAge(int age) {
        this.age += age;
    }

    public void setName(String name) {
        this.name = name;
    }
    //overload
    public int addAge(int newAge) {
        age = newAge;
        return age;
    }
 
    public String addAge(String newName) {
        return name;
    }
    public int doubleage() {

        return age+=2;
    }

    public int getAge(){
        return age;
    }

    public static String getSex(){
        return sex;
    }

}