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
public class Make {
     private String BrandName;
     private String CountryOfOrigin;
     
     public void make(String BrandName,String CountryOfOrigin)
     {
         setBrandName(BrandName);
         setCountryOfOrigin(CountryOfOrigin);
         
     }
     
     public void setBrandName(String BrandName)
     {
         this.BrandName = BrandName;
     }
     
     public void setCountryOfOrigin(String CountryOfOrigin)
     {
         this.CountryOfOrigin = CountryOfOrigin;
     }
    
          public String getBrandName()
     {
         return BrandName;
     }
          
     public String getCountryOfOrigin()
     {
         return CountryOfOrigin;
     }
     

     
}
