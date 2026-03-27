public class scoreTest {
    public static void main(String[] args) {
        score cassey = new score("cassey", 95);
        score naomi = cassey;
        System.out.println(cassey.Grade());
        System.out.println(cassey.addScore(5));
        System.out.println(naomi.addScore(0));
        System.out.println(naomi.studentName());
        System.out.println(cassey.studentName());

    }
    
}
//client class