public class Task18 {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 7;
        Integer c = 11;

        Boolean result;

        if (a - b >= 10 || b - a >= 10) {
            result = true;
        } else if (a - c >= 10 || c - a >= 10) {
            result = true;
        } else if (b - c >= 10 || c - b >= 10) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);
    }
}
