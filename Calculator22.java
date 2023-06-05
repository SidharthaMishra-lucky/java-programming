class FewArgumentsException extends Exception {
    public FewArgumentsException(String message) {
        super(message);
    }
}

class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String message) {
        super(message);
    }
}

class NegativeResultException extends Exception {
    public NegativeResultException(String message) {
        super(message);
    }
}

public class Calculator22 {
    public static void main(String[] args) {
        try {
            if (args.length < 3) {
                throw new FewArgumentsException("FewArgumentsException: Insufficient number of arguments!");
            }

            int operand1 = Integer.parseInt(args[0]);
            int operand2 = Integer.parseInt(args[2]);
            char operator = args[1].charAt(0);
            int result = 0;

            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
                default:
                    throw new InvalidOperatorException("InvalidOperatorException: Invalid arithmetic operator!");
            }

            if (result < 0) {
                throw new NegativeResultException("NegativeResultException: Result is negative!");
            }

            System.out.println("Result: " + result);
        } catch (FewArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception occurred!");
        } catch (NegativeResultException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
