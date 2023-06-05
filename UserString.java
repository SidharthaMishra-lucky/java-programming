public class UserString {
    private String inputString;

    public UserString(String inputString) {
        this.inputString = inputString;
    }

    // Method to count all the characters
    public int countCharacters() {
        return inputString.length();
    }

    // Method to count number of words
    public int countWords() {
        String[] words = inputString.trim().split("\\s+");
        return words.length;
    }

    // Method to compare two strings
    public boolean compareStrings(String str) {
        return inputString.equals(str);
    }

    // Method to convert to uppercase
    public String toUpperCase() {
        return inputString.toUpperCase();
    }

    // Method to convert to lowercase
    public String toLowerCase() {
        return inputString.toLowerCase();
    }

    // Method to concatenate two strings
    public String concatenateStrings(String str) {
        return inputString.concat(str);
    }

    // Method to check if a string is palindrome
    public boolean isPalindrome() {
        String reverse = new StringBuilder(inputString).reverse().toString();
        return inputString.equals(reverse);
    }

    // Method to find the position of a given character
    public int findPosition(char ch) {
        return inputString.indexOf(ch);
    }

    // Method to make a substring from a desired start and end position
    public String makeSubstring(int startIndex, int endIndex) {
        return inputString.substring(startIndex, endIndex);
    }

    // Method to search the presence of a substring
    public boolean isSubstringPresent(String substring) {
        return inputString.contains(substring);
    }

    // Method to replace a substring with a new string
    public String replaceSubstring(String oldStr, String newStr) {
        return inputString.replace(oldStr, newStr);
    }

    // Method to swap two substrings between two strings
    public String swapSubstrings(String str1, String str2) {
        int index1 = inputString.indexOf(str1);
        int index2 = inputString.indexOf(str2);
        if (index1 != -1 && index2 != -1) {
            if (index1 > index2) {
                int temp = index1;
                index1 = index2;
                index2 = temp;
                String tempStr = str1;
                str1 = str2;
                str2 = tempStr;
            }
            return inputString.substring(0, index1) + str2 + inputString.substring(index1 + str1.length(), index2) + str1 + inputString.substring(index2 + str2.length());
        }
        return inputString;
    }
public static void main(String[] args) {
    UserString userStr = new UserString("Hello World");

    // Count all the characters
    int charCount = userStr.countCharacters();
    System.out.println("Character count: " + charCount);

    // Count number of words
    int wordCount = userStr.countWords();
    System.out.println("Word count: " + wordCount);

    // Compare two strings
    boolean isEqual = userStr.compareStrings("Hello World");
    System.out.println("Strings are equal: " + isEqual);

    // Convert to uppercase
    String upperCaseStr = userStr.toUpperCase();
    System.out.println("Uppercase string: " + upperCaseStr);

    // Convert to lowercase
    String lowerCaseStr = userStr.toLowerCase();
    System.out.println("Lowercase string: " + lowerCaseStr);

    // Concatenate two strings
    String concatenatedStr = userStr.concatenateStrings("!");
    System.out.println("Concatenated string: " + concatenatedStr);

    // Check if a string is palindrome
    boolean isPalindrome = userStr.isPalindrome();
    System.out.println("String is palindrome: " + isPalindrome);

    // Find the position of a given character
    int position = userStr.findPosition('o');
    System.out.println("Position of 'o': " + position);

    // Make a substring from a desired start and end position
    String subString = userStr.makeSubstring(3, 7);
    System.out.println("Substring: " + subString);

    // Search the presence of a substring
    boolean isSubstringPresent = userStr.isSubstringPresent("World");
    System.out.println("Substring present: " + isSubstringPresent);

    // Replace a substring with a new string
    String replacedStr = userStr.replaceSubstring("Hello", "Hi");
    System.out.println("Replaced string: " + replacedStr);

    // Swap two substrings between two strings
    String swappedStr = userStr.swapSubstrings("Hello", "World");
    System.out.println("Swapped string: " + swappedStr);
}
}