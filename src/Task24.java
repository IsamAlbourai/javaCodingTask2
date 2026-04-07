public class Task24 {
    public static void main(String[] args) {

        Integer n = 19;

        Boolean result;

        if (n % 20 == 18 || n % 20 == 19) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);
    }
}