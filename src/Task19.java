public class Task19 {
    public static void main(String[] args) {

        Integer a = 0;
        Integer b = 0;
        Integer c = 0;

        Integer result;

        if (a == 2 && b == 2 && c == 2) {
            result = 10;
        } else if (a == b && b == c) {
            result = 5;
        } else if (b != a && c != a) {
            result = 1;
        } else {
            result = 0;
        }

        System.out.println(result);
    }
}
