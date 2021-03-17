/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_dealership;
import java.time.Year;

/**
 *
 * @author SALMAN
 */
public class Car {
    
    ModelDetails modDets = new ModelDetails();
    
    public Car(String BrandName, String CountryOfOrigin, String ModelName, Year YearOfManufacture,
            String DriveType, int NumOfDoors, String Color, String DriveTrain)
    {
        modDets.Make.setBrandName(BrandName);
        modDets.Make.setCountryOfOrigin(CountryOfOrigin);
        modDets.setModelName(ModelName);
        modDets.setYear(YearOfManufacture);
        modDets.setDriveType(DriveType);
        modDets.setNumOfDoors(NumOfDoors);
        modDets.setColor(Color);
        modDets.setDriveTrain(DriveTrain);
        
    }
    
    public void CarDisplay()
    {
        System.out.print("==============Feedback===============\n" + 
                "The brand of the car is: "+ modDets.Make.getBrandName()+"\n"+
                "The Country of origin is: " + modDets.Make.getCountryOfOrigin()+"\n"+
                "The Model name is : "+ modDets.getModelName()+"\n"+
                "The year the car was manufactured is: "+ modDets.getYearOfManufacture()+"\n"+
                "The drive type of the car is: "+ modDets.getDriveType()+"\n"+
                "The number of doors the car has is: "+ modDets.getNumOfDoors()+"\n"+
                "The color of the car is: "+ modDets.getColor()+"\n"+
                "The drive train of the car is: "+ modDets.getDriveTrain() +
                "\n==========End of feedback===========");
                
    }
}
