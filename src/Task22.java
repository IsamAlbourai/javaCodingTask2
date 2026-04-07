public class Task22 {
    public static void main(String[] args) {

        Integer day = 0;
        Boolean vacation = false;

        String result;

        if (day >= 1 && day <= 5) {
            if (vacation) {
                result = "10:00";
            } else {
                result = "7:00";
            }
        } else {
            if (vacation) {
                result = "off";
            } else {
                result = "10:00";
            }
        }

        System.out.println(result);
    }
}
