import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class clientReceipt {

    Scanner scanner = new Scanner(System.in);
    String [] hotels = {"Tulib", "Semiramis", "Hilton", "Regency"};
    int choicedHotel;

    String cityName, hotelName;
    Date startDate, endDate;
    int bedNums;
    boolean wifi, parking, breakfast, deliveryAirport;


    void receipt () throws ParseException {

        // take values from user
        city();
        hotel();
        bed();
        wifi();
        breakfast();
        parking();
        deliveryAirport();
        startDate();
        endDate();

        //print full info
        printFullReceipt();


    }





    void startDate() throws ParseException {
        Date date = null;
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter Start date: (gg/aa/yy) :");
        String dateString = scanner.nextLine();
        if(null != dateString && dateString.length() > 0){
            date = sdf.parse(dateString);
        }
        startDate = date;
    }


    void endDate() throws ParseException {
        Date date = null;
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter End date: (gg/aa/yy) :");
        String dateString = scanner.nextLine();
        if(null != dateString && dateString.length() > 0){
            date = sdf.parse(dateString);
        }
        endDate = date;
    }

    void city(){
        String [] cities = {"Sharm El-Shiekh", "Alexandria", "Dahab", "Hurghada"};
        System.out.println("Hello please select the distination you want: ");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(i+1 + "- " + cities[i]);
        }


        int choicedCity = scanner.nextInt();
        if (choicedCity >= 1 && choicedCity < cities.length+1)
        cityName = cities[choicedCity-1];
        else
            cityName = "Sorry, invalid selection";
    }

    void hotel(){
        System.out.println("Please enter the hotel you want : ");
        for (int i = 0; i < hotels.length; i++) {
            System.out.println(i+1 + "- " + hotels[i]);
        }
        choicedHotel = scanner.nextInt();
        if (choicedHotel >= 1 && choicedHotel < hotels.length+1)
            hotelName =  hotels[choicedHotel-1];
        else
            hotelName = "Sorry, invalid selection";

    }

    void bed(){
        int [] beds = {1, 2, 3};
        System.out.println("Please enter the beds you want : ");
        for (int i = 0; i < beds.length; i++) {
            System.out.println(i+1 + "- " + beds[i] + " beds");
        }
        int choicedBed = scanner.nextInt();
        if (choicedBed >= 1 && choicedBed < beds.length+1)
            bedNums =  beds[choicedBed-1];
        else
            bedNums = 0;
    }

    void wifi(){
        System.out.println("Do you want to connect to the internet? y/n");
        char choicedWifi = scanner.next().charAt(0);
        if (choicedWifi == 'y' || choicedWifi == 'Y')
            wifi = true;
        else
            wifi = false;

    }

    void breakfast(){
        System.out.println("Do you want breakfast ? y/n");
        char choicedBreakfast = scanner.next().charAt(0);
        if (choicedBreakfast == 'y' || choicedBreakfast == 'Y')
            breakfast = true;
        else
            breakfast = false;
    }

    void parking(){
        System.out.println("Do you want parking ? y/n");
        char choicedParking = scanner.next().charAt(0);
        if (choicedParking  == 'y' || choicedParking == 'Y')
            parking = true;
        else
            parking = false;
    }

    void deliveryAirport(){
        System.out.println("Do you want delivery airport ? y/n");
        char choicedDeliveryAirport = scanner.next().charAt(0);
        if (choicedDeliveryAirport == 'y' || choicedDeliveryAirport == 'Y')
            deliveryAirport = true;
        else
            deliveryAirport = false;
    }

    void printFullReceipt(){

        System.out.println("The City name is : " + cityName+
                "\nThe Hotel name is : " + hotelName);
                          latLong();
        System.out.println("The peroid of time is : [ " + startDate + " TO " + endDate + " ]");
        System.out.println("\nThe beds number is : " + bedNums);
        if (wifi)
            System.out.println("Wifi : available");
        else
            System.out.println("Wifi : Not available");


        if(breakfast)
            System.out.println("Breakfast : available");
        else
            System.out.println("Breakfast : Not available");

        if(parking)
            System.out.println("Parking : available");
        else
            System.out.println("Parking : Not available");

        if(deliveryAirport)
            System.out.println("Delivery Airport : available");
        else
            System.out.println("Delivery Airport : Not available");


    }
    void latLong (){
        switch (choicedHotel){

            case 1:
                System.out.println("\tLat is : 111111111\t Long is : 11111111" );
                break;

            case 2:
                System.out.println("\tLat is : 2222222222\t Long is : 22222222" );
                break;

            case 3:
                System.out.println("\tLat is : 333333333\t Long is : 333333333" );
                break;

            case 4:
                System.out.println("\tLat is : 44444444\t Long is : 444444444" );

            default:
                System.out.println("Invalid hotel, so can't show Lat and Long ");
                break;
        }


    }


}
