
package javaapplication33;

public class ThinandLight extends Laptop{

    ThinandLight(String brand, String storage, String ram, String cpu) {
        super(brand,storage, ram, cpu);
    }
    void printType(){
        System.out.println("Thin and Light Laptop");
    }
    
}
