package CreationalDesignPaterns.factoryDesign.test;

import CreationalDesignPaterns.factoryDesign.beans.Computer;
import CreationalDesignPaterns.factoryDesign.factory.ComputerFactory;
import CreationalDesignPaterns.factoryDesign.factory.ComputerType;

public class ComputerClient {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();

        Computer computer1 = factory.createComputer(ComputerType.PC, "i7", "8", "16");

        Computer computer2 = factory.createComputer(ComputerType.SERVER, "Ryzen 5", "6", "12");

        System.out.println(computer1);
        System.out.println(computer2);


    }
}
