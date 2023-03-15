import javax.swing.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);
        String message;
        if (isPalindrome(number)) {
            message = number + " is a palindrome number.";
        } else {
            message = number + " is not a palindrome number.";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        while (originalNumber > 0) {
            int remainder = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            originalNumber /= 10;
        }
        return number == reversedNumber;
    }
}
