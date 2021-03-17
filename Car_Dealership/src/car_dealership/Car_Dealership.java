/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package car_dealership;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.time.Year;

/**
 *
 * @author SALMAN
 */
public class Car_Dealership {

    /**
     * @param args the command line arguments
     */
    static String BrandName;
    static String CountryOfOrigin;
    static String ModelName;
    static Year YearOfManufacture;
    static String DriveType;
    static int NumOfDoors;
    static String Color;
    static String DriveTrain;
    static String newModel;
    
    static int CurrentYear = 2022;
    static final int YearFirstCar = 1886;
    
    static Scanner in = new Scanner(System.in);
    static PrintStream fileWriter;
    static Scanner read;
    static int counter;
    
    static List<String> brandName = new ArrayList();
    static List<String> modelName = new ArrayList();
    static List<String> colors = new ArrayList();
    static List<String> countryCode = new ArrayList();
    static List<String> countries = new ArrayList();
   
    
    public static void main(String[] args) {
       
        
//       colors.add("blue"); //to be read from file lowwwercased
//       countries.add("australia");//to be read from file lowwwercased
//       countryCode.add("au");//to be read from file lowwwercased
//       countryCode.add("fiesta");//to be read from file lowwwercased
       try{
            
           QuestionsMake();
           QuestionsModel();
           QuestionsModelDetails();
           Car Car = new Car(BrandName, CountryOfOrigin, ModelName,
                   YearOfManufacture, DriveType, NumOfDoors, 
                   Color, DriveTrain);
           Car.CarDisplay();
           
       }catch(Exception e)
       {
           System.out.println(e);
       }finally{
           read.close();
          // fileWriter.close();
       }
    }
    
    public static void QuestionsMake()
    {
       try
       {
           read = new Scanner(new File("Car_makes.txt"));
           while(read.hasNextLine())
           {
               brandName.add(read.nextLine());
           }
           read = new Scanner(new File("Countries.txt "));
           while(read.hasNextLine())
           {
               countries.add(read.nextLine());
           }
           read = new Scanner(new File("Countries_alfa2Code.txt "));
           while(read.hasNextLine())
           {
               countryCode.add(read.nextLine());
           }
           
       }
       catch(Exception e)
       {
           System.err.println(" File doesnt exist :" +e.getMessage());
       }
       
       int counter = 1;
       
       System.out.println("Please enter the brand of the vehicle eg: Audi,BMW,VW");
       BrandName = in.nextLine();
       while(!brandName.contains(BrandName.toLowerCase()) && counter<5)
       {
           System.err.println(counter+"/5 tries. Please re-enter the brand of the vehicle eg: Audi,BMW,VW");
           BrandName = in.nextLine();
           counter++;
       }

       System.out.println("Please enter the country of origin");
       CountryOfOrigin = in.nextLine();
       
       while(!countries.contains(CountryOfOrigin.toLowerCase()) && !countryCode.contains(CountryOfOrigin.toLowerCase()) && counter < 5)// && counter != 5
       {
           System.err.println(counter+"/5 tries. Please re-enter the country of origin as Country or Country Code");               
           CountryOfOrigin = in.nextLine();
           counter++;
       }

 

       
    }
    
    public static void QuestionsModel()
    {
        try
        {
            read = new Scanner(new File("Car_models.txt"));
           while(read.hasNextLine())
           {
               modelName.add(read.nextLine());
           }
        }catch(Exception e)
        {
            System.err.println("File doesnt exist");
        }
        counter =1;
        System.out.println("Please enter the model name eg: E46 320i");
       ModelName= in.nextLine();
        while(!modelName.contains(ModelName.toLowerCase()) && counter<5)
       {
           /*if(!modelName.contains(ModelName.toLowerCase()))
           {
               System.out.println("Car does not exist in the directory do you wish to add it (y/n)");
               newModel = in.nextLine();
               try
               {
                   fileWriter = new PrintStream(new File("Car_models.txt"));
                   switch(newModel.toLowerCase())
                   {
                       case "y" : 
                           fileWriter.println(ModelName.toLowerCase());
                           System.out.println("Please restart to use updated model directory");
                           break;
                       case "yes" :
                           fileWriter.println(ModelName.toLowerCase());
                           System.out.println("Please restart to use updated model directory");
                           break;
                       default:
                           break;

                   }
                   
               
               }catch(Exception e)
               {
                   System.out.println("File doesnt exist");
               }
               
               
               

           }*/
           System.err.println(counter+"/5 tries. Please re-enter the brand of the vehicle eg: Audi,BMW,VW");
           ModelName = in.nextLine();
           counter++;
       }


       //Year of Manufacture
       System.out.println("Please enter the year of manufacture(YYYY)");//number validation           
       counter = 1;
       String YearInput;
       do
       {
           YearInput = in.nextLine();
           if(YearInput.length()==4)//Year has to be of length 4
           {
               try
                {
                    if(Integer.valueOf(YearInput)<=CurrentYear && Integer.valueOf(YearInput)>=YearFirstCar)//Year can't be of next year and cant be before first car ever made
                      YearOfManufacture = Year.parse(YearInput);
                    else
                      System.err.println(counter+"/5 tries. Please re-enter the year of manufacture");  
                }
                catch(Exception e)
                {                        
                    System.err.println(counter+"/5 tries. Please re-enter the year of manufacture");                   
                    YearInput = "9999";
                }
           }
           else
           {
               System.err.println(counter+"/5 tries. Year has to be in format YYYY.\nPlease re-enter the year of manufacture");
               YearInput = "9999";
           }                   
            counter++;
       }
       while(counter<=5 && Integer.valueOf(YearInput)>CurrentYear || Integer.valueOf(YearInput)< YearFirstCar);                              

    }
    
    public static void QuestionsModelDetails()
    {
        
        try
        {
            read = new Scanner(new File("Colors.txt "));
             while(read.hasNextLine())
           {
               colors.add(read.nextLine());
           }
             
        }catch(Exception e)
       {
           System.err.println(" File doesnt exist :" +e.getMessage());
       }
          
        
       System.out.println("Please enter the drive type eg: left/right");//word/letter validation
       DriveType= in.nextLine();
       while(!DriveType.contains("left") && !DriveType.contains("right"))
       {
           System.err.println("Your only choice is left/right");
           DriveType= in.nextLine();
       }
       

       try
       {
           System.out.println("Please enter the number of doors");
           //number validation
           counter =1;
           NumOfDoors= Integer.valueOf(in.nextLine());
           while(NumOfDoors !=2 && NumOfDoors !=4 && counter<5)
           {
               System.err.println(counter+"/5 tries.Incorrect Please re-enter the number of doors 2 or 4");
               NumOfDoors= Integer.valueOf(in.nextLine());
               counter++;
           }
       }catch(NumberFormatException e)
       {
          try
          {
               System.err.println(counter+"/5 tries .Please enter the number characters only ");
               NumOfDoors= Integer.valueOf(in.nextLine());

               while(NumOfDoors !=2 && NumOfDoors !=4 && counter<5)
               {
                   System.err.println(counter+"/5 tries.Incorrect the number of doors 2 or 4");
                   NumOfDoors= Integer.valueOf(in.nextLine());
                   counter++;
               }

          }catch(NumberFormatException ee)
           {
               System.out.println("Default number of doors has been set");
               NumOfDoors = 4;
           }
          
       }
       

       System.out.println("Please enter the color of the vehicle");
       Color = in.nextLine();
       while(!colors.contains(Color.toLowerCase()))
       {
           System.err.println("Please enter the color of the vehicle, again.");
           Color = in.nextLine();
       }
      
       


       System.out.println("Please enter the drive train of the vehicle eg: AWD,4WD,2WD,RWD,FWD");
       DriveTrain = in.nextLine();
       boolean driveTrain =true;
       while(driveTrain)
       {
           if(DriveTrain.toLowerCase().contains("4wd"))
               driveTrain =false;
           else if(DriveTrain.toLowerCase().contains("awd"))
               driveTrain =false;
           else if(DriveTrain.toLowerCase().contains("2wd"))
               driveTrain =false;
           else if(DriveTrain.toLowerCase().contains("rwd"))
               driveTrain =false;
           else if(DriveTrain.toLowerCase().contains("fwd"))
               driveTrain =false;
           else
           {
               System.err.println("Please re-enter the drive train of the vehicle eg: AWD,4WD,2WD etc");
               DriveTrain = in.nextLine();
           }
       }
    }
}
