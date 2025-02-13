public class CreditCardInterest {
        public static void main(String[] args) {
            double balance = 5000;
            double annualInterestRate = 0.17;
            double monthlyInterestRate = annualInterestRate / 12;
            int months = 2;

            for (int i = 1; i <= months; i++) {
                double interest = balance * monthlyInterestRate;
                balance += interest;
                System.out.printf("Month %d: Interest = $%.2f, Balance = $%.2f%n", i, interest, balance);
            }
        }
    }
    
