public class MobileRecharge02 {
    public static void main(String[] args) {
        int accountBalance = 200;  // User's account balance in Rupees
        int rechargeAmount = 299;  // Desired recharge amount
        int lowerRechargeAmount = 149;  // Lower-cost recharge option

        if (accountBalance >= rechargeAmount) {
            accountBalance -= rechargeAmount;
            System.out.println("Recharge successful. Remaining balance: Rs. " + accountBalance);
        } else if (accountBalance >= lowerRechargeAmount) {
            System.out.println("Insufficient balance for Rs. 299 recharge. Would you like to recharge Rs. 149 instead?");
        } else {
            System.out.println("Insufficient balance for any recharge.");
        }
    }
}