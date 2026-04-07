public class Task17 {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 1;
        Integer c = 2;
        Boolean bOk = true;

        Boolean result;

        if (bOk) {
            if (c > b) {
                result = true;
            } else {
                result = false;
            }
        } else {
            if (b > a && c > b) {
                result = true;
            } else {
                result = false;
            }
        }

        System.out.println(result);
    }
}