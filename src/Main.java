public class Main{
    public static void main(String[] args) {
    double balance = 5000;
    final double INTEREST_RATE =.17;
    double interestCalc = 0;
    interestCalc = balance * INTEREST_RATE;
    balance = balance + interestCalc;
    System.out.println("The interest after one month is: " + interestCalc);
    interestCalc = balance * INTEREST_RATE;
        System.out.println("The interest after the second month is: " + interestCalc);
    }
}