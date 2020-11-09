package Service;
import java.util.Scanner;
import model.Plane;

public class PlaneService {
    public Plane creat() {
        System.out.println("-------------creating plane--------");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the model");
        String model = s.nextLine();
        while (model.length()==0){
            System.out.println("please enter correct value");
            model = s.nextLine();
        }
        System.out.println("Enter the country");
        String country = s.nextLine();
        while (country.length()==0){
            System.out.println("please enter correct value");
            country = s.nextLine();
        }
        System.out.println("Enter the year of made");
        int year = s.nextInt();
        while (year<1903||year>2020){
            System.out.println("please enter correct value");
            year = s.nextInt();
        }
        System.out.println("Enter the hours in air");
        int hours = s.nextInt();
        while (hours<0||hours>10000){
            System.out.println("please enter correct value");
            hours = s.nextInt();
        }
        System.out.println("Enter military or not (true or false)");
        boolean military = s.nextBoolean();

        System.out.println("Enter the engine type");
        String engineType = s.nextLine();
        while (engineType.length()==0){
            System.out.println("please enter correct value");
            engineType = s.nextLine();
        }
        System.out.println("Enter the weight");
        int weight = s.nextInt();
        while (weight<1000||hours>160000){
            System.out.println("please enter correct value");
            weight = s.nextInt();
        }
        System.out.println("Enter the wingspan");
        int wingspan = s.nextInt();
        while (wingspan<10||wingspan>45){
            System.out.println("please enter correct value");
            wingspan = s.nextInt();
        }
        System.out.println("Enter the top speed");
        int topSpeed = s.nextInt();
        while (topSpeed==0){
            System.out.println("please enter correct value");
            topSpeed = s.nextInt();
        }
        System.out.println("Enter the number of seats");
        int seats = s.nextInt();
        while (seats==0){
            System.out.println("please enter correct value");
            seats = s.nextInt();
        }
        System.out.println("Enter the cost of plane");
        double cost = s.nextDouble();
        while (cost==0){
            System.out.println("please enter correct value");
            cost = s.nextDouble();
        }
        return new Plane(model,country,year,hours,military,engineType,weight,wingspan,topSpeed,seats,cost);
    }
    public void printInfo(Plane p1){
        System.out.println("model: " + p1.getModel());
        System.out.println("country: " + p1.getCountry());
        System.out.println("year: "+ p1.getYear());
        System.out.println("hours: " +p1.getHours());
        System.out.println("military: "+p1.isMilitary());
        System.out.println("engineType: "+p1.getEngineType());
        System.out.println("weight: "+p1.getWeight() );
        System.out.println("wingspan: "+p1.getWingspan());
        System.out.println("topSpeed: "+p1.getTopSpeed());
        System.out.println("seats: "+p1.getSeats());
        System.out.println("cost: "+p1.getCost());
    }
    public void areMilitary(Plane p1){
        if(p1.isMilitary()==true){
            System.out.println("cost: "+p1.getCost());
            System.out.println("topSpeed: "+p1.getTopSpeed());
        }else{
        System.out.println("model: " + p1.getModel());
        System.out.println("country: " + p1.getCountry());
        }
    }
    public Plane newer(Plane p1,Plane p2){
        if(p1.getYear()>=p2.getYear()){
            return p1;
        }
        return  p2;
    }
    public Plane biggerWing(Plane p1,Plane p2){
        if(p1.getWingspan()>p2.getWingspan()){
            return p1;
        }
        return  p2;
    }
    public Plane highestCost(Plane p1,Plane p2,Plane p3){

        if(p1.getCost()>=p2.getCost()&&p1.getCost()>= p3.getCost()){
            return p1;
        }else if(p2.getCost()>=p1.getCost()&&p2.getCost()>=p3.getCost()){
            return p2;

        }else{
            return p3;
        }
    }
    public Plane smallestSC(Plane p1,Plane p2,Plane p3){

        if(p1.getSeats()<=p2.getSeats()&&p1.getSeats()<= p3.getSeats()){
            return p1;
        }else if(p2.getSeats()<=p1.getSeats()&&p2.getSeats()<=p3.getSeats()){
            return p2;

        }else{
            return p3;
        }
    }
    public void notMilitary(Plane[] array) {

        for (Plane plane : array) {
            if (plane.isMilitary() == false) {
                ;
            }

        }

    }

}
