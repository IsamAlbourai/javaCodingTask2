public class Task23 {
    public static void main(String[] args) {

        Integer n = 23;

        Boolean result;

        if (n % 11 == 0 || n % 11 == 1) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);
    }
}
