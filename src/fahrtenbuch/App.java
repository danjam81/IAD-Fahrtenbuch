/*
 * Projekt: Fahrtenbuch
   Kunde: E. Reichel/CGI
 * Authoren: Alle aus Gruppe 1: Daniel, Saleh, Ali, Sophie, Jahed, Michael
 */
 
package fahrtenbuch;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application {

    private static List<Driver> objDrivers = new ArrayList<>(getDriverList()); //Holt alle Fahrer aus CSV
    private static ArrayList<String> driverName = new ArrayList<String>(); // Alle Namen von Fahrer

    private static List<Car> objCars = new ArrayList<>(getCarList()); //Holt alle Autos aus CSV
    private static ArrayList<String> carName = new ArrayList<String>(); // Alle Namen von Autos
    
    @Override
    public void start(Stage primaryStage) {
        //Start des Programms
        getDriverName();
        getCarsName();
        
        FirstPage jf = new FirstPage(driverName, carName);
        jf.setVisible(true);
     
    }
// Hauptmehode zum Starten des ganzen Pogramms
    public static void main(String[] args) {
        launch(args);
    }
// Initialisierung der Arrayliste Fahrer
    public static ArrayList<Driver> getDriverList() {
        ArrayList<Driver> drivers = new ArrayList<>();

        //Arrayliste von driver csv wird geladen
        try {
            java.io.BufferedReader filereader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("driver.csv")));

            String Zeile = "";

            filereader.readLine();

            while (null != (Zeile = filereader.readLine())) {
                String[] split = Zeile.split(",");

                    System.out.println(split[0]);
                    System.out.println(split[1]);
                drivers.add(new Driver(Integer.parseInt(split[0]), split[1]));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return drivers;
    }
    
        public static ArrayList<Car> getCarList() {
        ArrayList<Car> cars = new ArrayList<>();

        //Driver von csv
        try {

            java.io.BufferedReader filereader2 = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("car.csv")));

            String Zeile2 = "";

            filereader2.readLine();

            while (null != (Zeile2 = filereader2.readLine())) {
                String[] split = Zeile2.split(";");

                System.out.println(split[0]);
                cars.add(new Car(split[2]));

                System.out.println(cars.add(new Car(split[2])));
 
                }
                

        } catch (Exception ex) {
            ex.printStackTrace();
        }	
        return cars;
    }
        
    //Funktion um driverliste aufzulisten
    public static void getDriverName() {
        
        objDrivers.forEach(driver -> driverName.add(driver.getName()));
    }
    
   public static void getCarsName() {
        objCars.forEach(car -> carName.add(car.getModel()));
    }  

}

