package javaapplication33;

public class Main {
    public static void main(String[] args) {
        GamingLaptop lt2 = new GamingLaptop("Acer","SSD","8GB DDR4","INTEL CORE I7-12700H");
        HybidBook lt3 = new HybidBook("Lenovo","SSD","4GB DDR4","INTEL PENTIUM GOLD 7505");
        ThinandLight lt4 = new ThinandLight("Dell","SSD","16GB DDR5","INTEL CORE I7-12700H");
        GeneralLaptop lt5 = new GeneralLaptop("ASUS","SSD","8GB DDR4","INTEL CORE I5-8265U");
        
        lt2.printBrand();
        lt2.printType();
        lt2.printHDD();
        lt2.printRAM();
        lt2.printCPU();
        
        lt3.printBrand();
        lt3.printType();
        lt3.printHDD();
        lt3.printRAM();
        lt3.printCPU();
        
        lt4.printBrand();
        lt4.printType();
        lt4.printHDD();
        lt4.printRAM();
        lt4.printCPU();
        
        lt5.printBrand();
        lt5.printType();
        lt5.printHDD();
        lt5.printRAM();
        lt5.printCPU();
    }
}
