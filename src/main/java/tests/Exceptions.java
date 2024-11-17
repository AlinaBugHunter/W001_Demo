package tests;

public class Exceptions {
    public static void main(String[] args) {

        String[] strArray = { "str1", "str2", "str3" };

        uncheckedException(strArray);

        try {
            pause();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static void uncheckedException(String[] strArray) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(strArray[i]);
            }
            System.out.println("Program is working");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void checkedException() throws InterruptedException {
        Thread.sleep(3000);
    }

    private static void pause() throws InterruptedException {
        checkedException();
        System.out.println("Paused for 3 sec");
    }
}
