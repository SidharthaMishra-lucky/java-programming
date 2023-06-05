class VowelException extends Exception {
    public VowelException(String message) {
        super(message);
    }
}

class BlankException extends Exception {
    public BlankException(String message) {
        super(message);
    }
}

class ExitException extends Exception {
    public ExitException(String message) {
        super(message);
    }
}

public class TestException {
    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                throw new ArrayIndexOutOfBoundsException();
            }

            char c = args[0].charAt(0);

            if (c == 'X') {
                throw new ExitException("Exiting program!");
            } else if (c == ' ') {
                throw new BlankException("Input cannot be a blank space!");
            } else if (isVowel(c)) {
                throw new VowelException("Input cannot be a vowel!");
            } else {
                System.out.println("Valid character");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter a character as a command line argument!");
        } catch (VowelException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (BlankException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ExitException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
