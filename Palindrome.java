public class Palindrome {
    public static void main(String[] args) {
        String input = "11011";
        StringBuilder sb = new StringBuilder((input));
        String reverseString = sb.reverse().toString();

        if (input.equals(reverseString)) {
            System.out.println("The input string is a palindrome ");
        } else{
            System.out.println("The input string is not a palindrome ");
        }

    }
}
