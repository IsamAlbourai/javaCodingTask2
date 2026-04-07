public class Task27 {
    public static void main(String[] args) {

        Integer a = 5;
        Integer b = 5;
        Integer c = 7;
        boolean equalOk = true;

        boolean result;

        if (equalOk) {
            if (a <= b && b <= c) {
                result = true;
            } else {
                result = false;
            }
        } else {
            if (a < b && b < c) {
                result = true;
            } else {
                result = false;
            }
        }

        System.out.println(result);
    }
}