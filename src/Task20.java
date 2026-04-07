public class Task20 {
    public static void main(String[] args) {

        Integer a = 12;
        Integer b = 23;

        Integer aLeft = a / 10;
        Integer aRight = a % 10;

        Integer bLeft = b / 10;
        Integer bRight = b % 10;

        Boolean result;

        if (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);
    }
}
