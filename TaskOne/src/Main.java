import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   boolean flag = true;
        Functions.introPoint();
        while (flag){

            System.out.println("Do you want to book again? (y/n)");
            Scanner sc2 = new Scanner(System.in);
            String answer = sc2.nextLine();
            if (answer.equalsIgnoreCase("y")){
              Functions.introPoint();
            }
            else if (answer.equalsIgnoreCase("n")){
                System.out.println("Sorry to see you leave .... ");
                flag = false;
            }
            else {
                System.out.println("Invalid answer");
                flag = false;
            }

        }

        }

    }

