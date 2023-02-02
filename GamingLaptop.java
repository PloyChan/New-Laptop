
package javaapplication33;

public class GamingLaptop extends Laptop{
    GamingLaptop(String brand, String storage, String ram, String cpu) {
        super(brand,storage, ram, cpu);
        
    }
    void printType(){
        System.out.println("GAMING LAPTOP");
    }
}
