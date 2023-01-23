public class Main {
    public static void main(String[] args) {

        String palindrome = "ABСBA";

        for (int i = 0; i < palindrome.length() / 2 ; i++) {

            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {

                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
