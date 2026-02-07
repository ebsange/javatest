public class PuppyTest {
    // client class
    public static void main(String[] args) {
        //初始化object
       Puppy a = new Puppy("a", 4, "black");
       Puppy b = a;
       a.addAge(5);
       System.out.println(b.getAge());
    }
}