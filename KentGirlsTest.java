public class KentGirlsTest {
    public static void main(String[] args) {
        KentGirls Stacey = new KentGirls("Stacey", 17);
        KentGirls cassey = new KentGirls();

        System.out.println(Stacey.countAge(2));
        System.out.println(cassey.countAge(4));
        System.out.println(Stacey.graduateAge());
        System.out.println(KentGirls.offclass());
    }
}
