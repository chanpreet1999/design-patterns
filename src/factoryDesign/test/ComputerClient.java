package factoryDesign.test;

import factoryDesign.beans.Computer;
import factoryDesign.factory.ComputerFactory;
import factoryDesign.factory.ComputerType;

public class ComputerClient {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();

        Computer computer1 = factory.createComputer(ComputerType.PC, "i7", "8", "16");

        Computer computer2 = factory.createComputer(ComputerType.SERVER, "Ryzen 5", "6", "12");

        System.out.println(computer1);
        System.out.println(computer2);


    }
}
