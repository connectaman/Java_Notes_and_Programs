package Control_Statement.Switch;

public class SwitchExample {
    public static void main(String[] args) {
        //Declaring a variable for switch expression
        int number=20;
        //Switch expression
        switch(number){
            //Case statements
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            //Default case statement
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
}
