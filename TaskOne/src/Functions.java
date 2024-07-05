import java.util.Scanner;

public class Functions {

    static void introPoint(){
        showFullMenu();
        System.out.println("Please select the Sports type you want: ");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();

        switch (type) {
            case SportsConstants.SPORTS_WITH_BALL:
                showSportsWithBallMenu();
                selectionSportWithBall();
               scheduleSportsWithBall();
                break;

            case SportsConstants.SPORTS_WITHOUT_BALL:
                showSportsWithoutBallMenu();
                selectionSportWithoutBall();
                scheduleSportsWithoutBall();
                break;
        }
    }

    static void showFullMenu(){
        System.out.println("Hello , This is the list of our Club\n" +
                "1- Sports With Ball :- \n" +
                "\t1-  Soccer (Football)\n" +
                "\t2- Basketball\n" +
                "\t3- Cricket\n" +
                "\t4- Tennis\n" +
                "\t5- Volleyball\n" +
                "\t6- Table Tennis (Ping Pong)\n" +
                "\t7- Baseball\n" +
                "\t8- Rugby\n" +
                "\t9- American Football\n" +
                "\t10- Golf\n" +
                "\n" +
                "\n" +
                "2- Sports Without Ball :-\n" +
                "\n" +
                "\t1- Diving\n" +
                "\t2- Gymnastics\n" +
                "\t3- Road Cycling\n" +
                "\t4- Downhill Skiing\n" +
                "\t5- Track\n" +
                "\t6- Ice Skating\n" +
                "\t7- Material Arts\n");
    }

    static void showSportsWithBallMenu(){

        System.out.println("Sports With Ball :-\n"+
                "\t1- Soccer (Football)\n" +
                "\t2- Basketball\n" +
                "\t3- Cricket\n" +
                "\t4- Tennis\n" +
                "\t5- Volleyball\n" +
                "\t6- Table Tennis (Ping Pong)\n" +
                "\t7- Baseball\n" +
                "\t8- Rugby\n" +
                "\t9- American Football\n" +
                "\t10- Golf\n");


    }

    static void scheduleSportsWithBall(){
        System.out.println( "------- Schedule ------- \n\t 1- Saturday [10:00 Am]" +
                "\n\t 2- Monday [12:00 Pm]" +
                "\n\t 3- Wednesday [2:00 Pm]\n ");
        Scanner scanner = new Scanner(System.in);
        int appointment = scanner.nextInt();
        switch (appointment){
            case SportsConstants.SheduleSportWithBall.SATUREDAY:
                System.out.println("Successfully booked on Saturday at [10:00 Am]");
                break;

            case SportsConstants.SheduleSportWithBall.MONDAY:
                System.out.println("Successfully booked on Monday at [12:00 Pm]");
                break;

                case SportsConstants.SheduleSportWithBall.WEDNESDAY:
                    System.out.println("Successfully booked on Wednesday at [2:00 Pm]");
                    break;

            default:
                System.out.println("Invalid appointment");
                break;
        }

    }

    static void scheduleSportsWithoutBall(){
        System.out.println( "\t 1- Sunday [11:00 Am]" +
                "\n\t 2- Tuesday [1:00 Pm]" +
                "\n\t 3- Thursday [3:00 Pm]");

        Scanner scanner = new Scanner(System.in);
        int appointment = scanner.nextInt();
        switch (appointment){
            case SportsConstants.SheduleSportWithoutBall.SUNDAY:
                System.out.println("Successfully booked on Sunday at [11:00 Am]");
                break;

            case SportsConstants.SheduleSportWithoutBall.TUESDAY:
                System.out.println("Successfully booked on Tuesday at [1:00 Pm]");
                break;

            case SportsConstants.SheduleSportWithoutBall.THURSDAY:
                System.out.println("Successfully booked on Thursday at [3:00 Pm]");
                break;

            default:
                System.out.println("Invalid appointment");
                break;
        }



    }

    static void showSportsWithoutBallMenu(){

        System.out.println( "Sports Without Ball :-\n" +
                "\t1- Diving\n" +
                "\t2- Gymnastics\n" +
                "\t3- Road Cycling\n" +
                "\t4- Downhill Skiing\n" +
                "\t5- Track\n" +
                "\t6- Ice Skating\n" +
                "\t7- Material Arts\n");

    }

    static void selectionSportWithBall(){
        System.out.println("Please enter the sport you want : ");
        Scanner sc = new Scanner(System.in);
        int sport = sc.nextInt();

        switch (sport) {
            case SportsConstants.SportsWithBall.SOCCER_FOOTBALL:
                System.out.println("Times available in Soccer Football are : ");
              break;

            case SportsConstants.SportsWithBall.BASKETBALL:
                System.out.println("Times available in  Basketball are : ");
                break;

            case SportsConstants.SportsWithBall.CRICKET:
                System.out.println("Times available in  Cricket are : ");
                break;

            case SportsConstants.SportsWithBall.TENNIS:
                System.out.println("Times available in  Tennis are : ");
                break;

            case SportsConstants.SportsWithBall.VOLLEY_BALL:
                System.out.println("Times available in  Volleyball are : ");
                break;


            case SportsConstants.SportsWithBall.PING_PONG:
                System.out.println("Times available in  PingPong are : ");
                break;

            case SportsConstants.SportsWithBall.BASE_BALL:
                System.out.println("Times available in  Baseball are : ");
                break;

            case SportsConstants.SportsWithBall.RUGBY:
                System.out.println("Times available in  Rugby are : ");
                break;

            case SportsConstants.SportsWithBall.AMERICAN_FOOTBALL:
                System.out.println("Times available in American Football are : ");
                break;

            case SportsConstants.SportsWithBall.GOLF:
                System.out.println("Times available in  Golf are : ");
                break;

            default:
                System.out.println("invalid sport selection");
                break;
        }
    }

    static void selectionSportWithoutBall(){
        System.out.println("Please enter the sport you want : ");
        Scanner sc = new Scanner(System.in);
        int sport = sc.nextInt();

        switch (sport) {
            case SportsConstants.SportsWithoutBall.DIVING:
                System.out.println("Times available in Diving are : ");
                break;


            case SportsConstants.SportsWithoutBall.GYMNASTICS:
                System.out.println("Times available in  Gymnastics are : ");
                break;

            case SportsConstants.SportsWithoutBall.ROAD_CYCLING:
                System.out.println("Times available in  Road Cycling are : ");
                break;

            case SportsConstants.SportsWithoutBall.DOWNHILL_SKIING:
                System.out.println("Times available in  Downhill Skiing are : ");
                break;


            case SportsConstants.SportsWithoutBall.TRACK:
                System.out.println("Times available in  Track are : ");
                break;

            case SportsConstants.SportsWithoutBall.ICE_SKATING:
                System.out.println("Times available in  Ice Skating are : ");
                break;

            case SportsConstants.SportsWithoutBall.MARTIAL_ARTS:
                System.out.println("Times available in  Martial Arts are : ");
                break;

            default:
                System.out.println("invalid sport selection");
                break;
        }


    }



}
