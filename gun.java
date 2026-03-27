public class gun {
    //instance variable
    private int bulletNum;
    private double harm;
    private static int x = 4;
    private final int y = 4;

    //constructor with parameter
    public gun(int bulletNum, double harm) {
        this.bulletNum = bulletNum;
        this.harm = harm;
    }

    //non-argument constructor
    public gun(){
        bulletNum = 20;
        harm = 30.0;
    }

    //method
    public int shoot() {
        bulletNum -= 1;
        return bulletNum;
    }

    public double hurt (double gunHarm) {
        harm *= gunHarm;
        return harm;
    }

    public void getBullet() {
        System.out.println(bulletNum);
    }

    public static String test() {
        return "Great Guns!";
    }
}
