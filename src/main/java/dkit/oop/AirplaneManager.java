package dkit.oop;

import javax.swing.*;
import java.util.*;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {
    public static Scanner input = App.scanner;
    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.
//public void add(Airplane airplane){
//    System.out.println("Airplane Type: ");
//     String type = input.nextLine();
//    System.out.println("Airplane Max Load(KG): ");
//    int MAX_LOAD_KG = input.nextInt();
//    Airplane plane = new Airplane(type,MAX_LOAD_KG);
//    airplaneList.add(plane);
//}
//
//    public void displayAllAirplanes() {
//        for (Airplane airplane: airplaneList){
//            System.out.println(airplane);
//        }
//    }
//
//    public void displayAllPassengerAirplanes(String type) {
//        if (type.equals("passengerPlane")){
//            ArrayList<Airplane> airplaneList = sort(type);
//            for(Airplane airplane : new Airplane){
//                System.out.println(airplane);
//            }
//        }
//    }
//    public void getAllCargoAirplanes(String type) {
//        if (type.equals("cargoPlane")){
//            ArrayList<Airplane> airplaneList = sort(type);
//            for(Airplane airplane : airplane){
//                System.out.println(airplane);
//            }
//        }
//    }
//    public void addPassengerNameToAirplane( airplaneId, passengerName){
//
//    }

//    public void findAirplaneByPassengerName (String passengerName){
//
//    }

//     public void displayAllAirplanesInOrderOfType(String type ){
//         ArrayList<Airplane> airplanes= new ArrayList<>();
//         for(Airplane airplane : airplane){
//             if(airplane.getType().equals(type)){
//                 airplanes.add(airplane);
//             }
//         }
//         Collections.sort(airplane, new Comparator<Airplane>(){
//             @Override
//             public int compare(Airplane o1, Airplane o2){
//                 int result = o1.getType().compareTo(o2.getType());
//                 return result;
//             }
//
//         }
//     }


} // end of AirplaneManager


