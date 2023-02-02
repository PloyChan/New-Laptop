
package javaapplication33;

public class GeneralLaptop extends Laptop{
    
    GeneralLaptop(String brand, String storage, String ram, String cpu) {
        super(brand,storage, ram, cpu);
    }
    void printType(){
        System.out.println("General Laptop");
    }
}
