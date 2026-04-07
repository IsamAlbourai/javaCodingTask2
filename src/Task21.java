public class Task21 {
    public static void main(String[] args) {

        Integer temp = 95;
        Boolean isSummer = true;

        Boolean result;

        if (isSummer) {
            if (temp >= 60 && temp <= 100) {
                result = true;
            } else {
                result = false;
            }
        } else {
            if (temp >= 60 && temp <= 90) {
                result = true;
            } else {
                result = false;
            }
        }

        System.out.println(result);
    }
}
