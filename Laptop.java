
package javaapplication33;

public class Laptop {

    String brand;
    String storage;
    String ram;
    String cpu;

    Laptop(String brand, String storage, String ram, String cpu) {
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
        this.cpu = cpu;
    }

    Laptop() {
        
    }
    void printHDD() {
        System.out.println("Storge: "+ this.storage);
    }
    void printRAM() {
        System.out.println("RAM: " + this.ram);
    }
    void printCPU() {
        System.out.println("CPU: " + this.cpu);
    }
    void printBrand() {
        System.out.println("Brand is " + this.brand);
    }
    
}
