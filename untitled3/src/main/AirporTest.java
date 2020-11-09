package main;

import Service.PlaneService;
import model.Plane;

public class AirporTest {
    public static void main(String[] args) {
        PlaneService ps= new PlaneService();
        Plane plane1 = ps.creat();
        Plane plane2 = ps.creat();
        Plane plane3 = ps.creat();
//Task1
        ps.printInfo(plane1);
//Task2
        System.out.println("--------------------");
        ps.areMilitary(plane1);
        System.out.println("--------------------");
//Task3
        System.out.println("--------------------");
        System.out.println(ps.newer(plane1,plane2));
        System.out.println("--------------------");
//Task4
        System.out.println("--------------------");
        System.out.println(ps.highestCost(plane1,plane2,plane3));
        System.out.println("--------------------");
        // Task6
        System.out.println("--------------------");
        System.out.println(ps.smallestSC(plane1,plane2,plane3));
        System.out.println("--------------------");
    }
}
