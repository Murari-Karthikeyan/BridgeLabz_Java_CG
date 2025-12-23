public class ArrayIndexDemo {

    static void generateException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);
    }

    static void handleException() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
