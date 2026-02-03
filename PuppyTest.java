public class PuppyTest {
    // 主方法
    public static void main(String[] args) {
       Puppy a = new Puppy("a",4);
       Puppy b = new Puppy();
       Puppy c = a;
       a.setName("bb");
       System.out.println(a.addAge("ccc")));
       System.out.println(c.addAge(4));
       System.out.println(a.getAge());
       System.out.println(Puppy.getSex());
       //System.out.println(b.doubleage());
    }
}