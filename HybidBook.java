
package javaapplication33;

public class HybidBook extends Laptop{

    HybidBook(String brand, String storage, String ram, String cpu) {
       super(brand, storage, ram, cpu);
    }
    void printType(){
        System.out.println("Hybrid Laptop");
    }
    
}
