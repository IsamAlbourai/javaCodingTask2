public class Task25 {
    public static void main(String[] args) {

        Boolean isMorning = false;
        Boolean isMom = false;
        Boolean isAsleep = false;

        Boolean result;

        if (isAsleep) {
            result = false;
        } else if (isMorning) {
            if (isMom) {
                result = true;
            } else {
                result = false;
            }
        } else {
            result = true;
        }

        System.out.println(result);
    }
}
