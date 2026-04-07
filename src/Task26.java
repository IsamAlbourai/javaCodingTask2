public class Task26 {
    public static void main(String[] args) {

        Integer n = 15;

        String result;

        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz!";
        } else if (n % 3 == 0) {
            result = "Fizz!";
        } else if (n % 5 == 0) {
            result = "Buzz!";
        } else {
            result = n + "!";
        }

        System.out.println(result);
    }
}