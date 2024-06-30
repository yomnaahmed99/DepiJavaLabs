import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the selection number : " +
                "\n1.Informational\n2.Success\n3.Redirection\n" +
                "4.Client Error\n5.Server Error\n");
        int selectedNumber = sc.nextInt();
        int response;

        switch (selectedNumber){
            case Constants.INFORMATIONAL:
                System.out.println("Informational\n Please enter the code number :  \nfor Continue press 100");
                response = sc.nextInt();
                switch (response){
                    case Constants.Informational.CONTINUE:
                        System.out.println("Continued Successfully");
                        break;

                    default:
                        System.out.println("Not vaild code in Informational");
                        break;
                }
                break;

            case Constants.SUCCESS:
                System.out.println("Sucess \n Please enter the code number :  \nfor Ok press 200\n" +
                        "for Created press 201\nfor Accepted press 202\nfor No Content press 204");
                response = sc.nextInt();
                switch (response){
                    case Constants.Success.OK:
                        System.out.println("Ok Successfully");
                        break;

                    case Constants.Success.CREATED:
                        System.out.println("Created Successfully");
                        break;
                    case Constants.Success.ACCEPTED:
                        System.out.println("Accepted Successfully");
                        break;

                    case Constants.Success.NO_CONTENT:
                            System.out.println("No Content successfully");
                            break;

                    default:
                        System.out.println("Not vaild code in Success");
                        break;
                }
                break;

            case Constants.REDIRECTION:
                System.out.println("Rediction \n Please enter the code number :  \nfor Moved Permanently press 301" +
                        "\nfor Found press 302\nfor Not Modified press 304");
                response = sc.nextInt();
                switch (response){
                    case Constants.Redirection.MOVED_PERMANENTLY:
                        System.out.println("Moved Permanently successfully");
                        break;
                    case Constants.Redirection.FOUND:
                            System.out.println("Found Successfully");
                            break;
                    case Constants.Redirection.NOT_MODIFIED:
                                System.out.println("Not Modified Successfully");
                                break;

                    default:
                        System.out.println("Not vaild code in Redirection");
                        break;
                }
                break;

            case Constants.CLIENT_ERROR:
                System.out.println("Client Error \n Please enter the code number :  \nfor Bad Request press 400\n" +
                        "for Unauthorized press 401\nfor Forbidden press 403\n" +
                        "for Not Found press 404\nfor Method Not Allowed press 405\n" +
                        "for Conflict press 409\nfor Too Many Requests press 429");
                response = sc.nextInt();
                switch (response) {
                    case Constants.ClientError.BAD_REQUEST:
                        System.out.println("Bad Request Successfully");
                        break;

                    case Constants.ClientError.UNAUTHORIZED:
                            System.out.println("Unauthorized Successfully");
                            break;

                    case Constants.ClientError.FORBIDDEN:
                                System.out.println("Forbidden Successfully");
                                break;

                    case Constants.ClientError.NOT_FOUND:
                                    System.out.println("Not Found Successfully");
                                    break;

                    case Constants.ClientError.METHOD_NOT_ALLOWED:
                        System.out.println("Method Not Allowed Successfully");
                        break;

                    case Constants.ClientError.CONFLICT:
                        System.out.println("Conflict Successfully");
                        break;

                    case Constants.ClientError.TOO_MANY_REQUESTS:
                        System.out.println("Too Many Requests Successfully");
                        break;

                    default:
                        System.out.println("Not vaild code in Client Error");
                        break;
                }
                break;

            case Constants.SERVER_ERROR:
                System.out.println("Server Error \n Please enter the code number :  \nfor Internal Server Error\n" +
                        "for Bad Gateway press 502\nfor Service Unavilable press 503\n" +
                        "for Gateway Timeout press 504");
                response = sc.nextInt();
                switch (response){
                    case Constants.ServerError.INTERNAL_SERVER_ERROR:
                        System.out.println("Internal Server Error Successfully");
                        break;

                    case Constants.ServerError.BAD_GATEWAY:
                        System.out.println("Bad Gateway Successfully");
                        break;


                        case Constants.ServerError.SERVICE_UNAVAILABLE:
                            System.out.println("Service Unavailable Successfully");
                            break;

                            case Constants.ServerError.GATEWAY_TIMEOUT:
                                System.out.println("Gateway Timeout Successfully");
                                break;

                    default:
                        System.out.println("Not vaild code in Server Error");
                        break;
                }
                break;

            default:
                System.out.println("Invalid selection");
                break;
        }

    }
}