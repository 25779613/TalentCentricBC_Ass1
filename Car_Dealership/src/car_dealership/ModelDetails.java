/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_dealership;

/**
 *
 * @author SALMAN
 */
public class ModelDetails extends Model{
    
    private String DriveType;
    private int NumOfDoors;
    private String Color;
    private String DriveTrain;
    
    Make Make = new Make();
    public void ModelDetails(String DriveType, int NumOfNumOfDoors, String Color,String DriveTrain)
    {
        setDriveType(DriveType);
        setNumOfDoors(NumOfDoors);
        setColor(Color);
        setDriveTrain(DriveTrain);
    }
    
    public void setDriveType(String DriveType)
    {
        this.DriveType = DriveType;
    }
    
      public void setNumOfDoors (int NumOfDoors)
    {
        this.NumOfDoors = NumOfDoors;
    }
      
      public void setColor(String Color)
    {
        this.Color = Color;
    }
      
      public void setDriveTrain (String DriveTrain)
    {
        this.DriveTrain = DriveTrain;
    }
    
    public String getDriveType()
    {
        return DriveType;
    }
    
    public int getNumOfDoors()
    {
        return NumOfDoors;
    }
    
    public String getColor()
    {
        return Color;
    }
    
    public String getDriveTrain()
    {
        return DriveTrain;
    }
}
