public class MobileRecharge {
    public static void main(String[] args) {
        int accountBalance = 500; // User's account balance in Rupees
        int rechargeAmount = 299; // Cost of the recharge

        if (accountBalance >= rechargeAmount) {
            accountBalance -= rechargeAmount;
            System.out.println("Recharge successful. Remaining balance: Rs. " + accountBalance);
        }
    }
}
