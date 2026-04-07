public class Task16 {
    public static void main(String[] args) {

        String str = "fib";

        String result;

        if (str.startsWith("f") && str.endsWith("b")) {
            result = "FizzBuzz";
        } else if (str.startsWith("f")) {
            result = "Fizz";
        } else if (str.endsWith("b")) {
            result = "Buzz";
        } else {
            result = str;
        }

        System.out.println(result);
    }
}