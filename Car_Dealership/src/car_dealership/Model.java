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
public class Model extends Make {
    private String ModelName;
    private Year YearOfManufacture;
    
    public void Model(String ModelName, Year YearOfManufacture)
{
    setModelName(ModelName);
    setYear(YearOfManufacture);
}

 public void setModelName(String ModelName)
     {
         this.ModelName = ModelName;
     }   
 
 public void setYear(Year YearOfManufacture)
     {
         this.YearOfManufacture = YearOfManufacture;
     }   
 
 public String getModelName()
     {
         return ModelName;
     }   
 public Year getYearOfManufacture()
     {
         return YearOfManufacture;
     }
}


