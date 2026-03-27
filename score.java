public class score {
    //instance variable
    private String name;
    private int grade;
    private int testScore;

    public score (String name, int testScore) {
        this.name = name;
        this.testScore = testScore;
    }

    public String Grade () {
        if (testScore >= 90) {
            return name + " is A";
        }
        else {
            return name + " is B";
        }
    }

    public int addScore (int x) {
        return this.testScore += x;
    }

    public String studentName () {
        return name;
    }
}
//class 定义类