public class Main {
    public static void main(String[] args) {

        String palindrome = "ABCBA";

        for (int i = 0; i < palindrome.length() / 2 ; i++) {

            if (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - 1 -i)) {
                System.out.println("Palindrome");
                break;
            }
            else {
                System.out.println("Not Palindrome");
                break;
            }
        }
    }
}
