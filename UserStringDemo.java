public class UserStringDemo {
    public static void main(String[] args) {
        UserString userStr1 = new UserString("apple");
        UserString userStr2 = new UserString("orange");

        // Count all the characters
        int charCount1 = userStr1.countCharacters();
        int charCount2 = userStr2.countCharacters();
        System.out.println("Character count for apple: " + charCount1);
        System.out.println("Character count for orange: " + charCount2);

        // Compare two strings
        boolean isEqual = userStr1.compareStrings(userStr2.getString());
        System.out.println("Strings are equal: " + isEqual);

        // Convert to uppercase
        String upperCaseStr1 = userStr1.toUpperCase();
        String upperCaseStr2 = userStr2.toUpperCase();
        System.out.println("Uppercase string for apple: " + upperCaseStr1);
        System.out.println("Uppercase string for orange: " + upperCaseStr2);

        // Concatenate two strings
        String concatenatedStr = userStr1.concatenateStrings(userStr2.getString());
        System.out.println("Concatenated string: " + concatenatedStr);

        // Check if a string is palindrome
        boolean isPalindrome1 = userStr1.isPalindrome();
        boolean isPalindrome2 = userStr2.isPalindrome();
        System.out.println("apple is palindrome: " + isPalindrome1);
        System.out.println("orange is palindrome: " + isPalindrome2);

        // Find the position of a given character
        int position1 = userStr1.findPosition('p');
        int position2 = userStr2.findPosition('r');
        System.out.println("Position of 'p' in apple: " + position1);
        System.out.println("Position of 'r' in orange: " + position2);

        // Make a substring from a desired start and end position
        String subString1 = userStr1.makeSubstring(1, 3);
        String subString2 = userStr2.makeSubstring(2, 5);
        System.out.println("Substring of apple: " + subString1);
        System.out.println("Substring of orange: " + subString2);

        // Search the presence of a substring
        boolean isSubstringPresent1 = userStr1.isSubstringPresent("app");
        boolean isSubstringPresent2 = userStr2.isSubstringPresent("ange");
        System.out.println("Substring present in apple: " + isSubstringPresent1);
        System.out.println("Substring present in orange: " + isSubstringPresent2);

        // Replace a substring with a new string
        String replacedStr1 = userStr1.replaceSubstring("ap", "le");
        String replacedStr2 = userStr2.replaceSubstring("or", "an");
        System.out.println("Replaced string for apple: " + replacedStr1);
        System.out.println("Replaced string for orange: " + replacedStr2);
    }
}
