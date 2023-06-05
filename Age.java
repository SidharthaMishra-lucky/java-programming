class Age
{
    public static void main(String args[]) 
   {
        String name = "Sidhartha"; 
        int current_age = 0; 
        int previous_age = 0;
        int next_age = 0; 
        current_age = 22; 
        int lastDigit = current_age % 10;
        next_age = current_age + lastDigit;
        int firstDigit = current_age/10;
        previous_age = current_age - firstDigit;
        System.out.println("Name: " +name+ "current Age"+current_age);
        System.out.println("Previous age: " + previous_age);
        System.out.println("Next age: " + next_age);
        System.out.println("Name" +name+ "current Age"+current_age+ "previous Age"+previous_age+ "Next Age"+next_age);

    }
}
