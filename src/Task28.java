public class Task28 {
    public static void main(String[] args) {

        Integer die1 = 6;
        Integer die2 = 6;
        boolean noDoubles = true;

        int sum;

        if (!noDoubles) {
            sum = die1 + die2;
        } else {
            if (die1 != die2) {
                sum = die1 + die2;
            } else {
                if (die1 == 6) {
                    die1 = 1;
                } else {
                    die1 = die1 + 1;
                }
                sum = die1 + die2;
            }
        }

        System.out.println(sum);
    }
}
