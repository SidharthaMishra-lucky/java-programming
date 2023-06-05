public class AgeCalculator 
{
    public static void main(String[] args) 
   {
        String name = "Sidhartha"; 
        int currentAge = 0; 
        int previousAge = 0;
        int nextAge = 0; 
        currentAge = 22; 
        int lastDigit = currentAge % 10;
        nextAge = currentAge + lastDigit;
        int firstDigit = Integer.parseInt(Integer.toString(currentAge).substring(0, 1));
        previousAge = currentAge - firstDigit;
        System.out.println("Name: " + name);
        System.out.println("Current age: " + currentAge);
        System.out.println("Previous age: " + previousAge);
        System.out.println("Next age: " + nextAge);
    }
}
