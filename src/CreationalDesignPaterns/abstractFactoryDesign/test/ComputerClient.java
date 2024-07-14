package CreationalDesignPaterns.abstractFactoryDesign.test;

import CreationalDesignPaterns.abstractFactoryDesign.factory.ComputerFactory;
import CreationalDesignPaterns.abstractFactoryDesign.factory.PCFactory;
import CreationalDesignPaterns.abstractFactoryDesign.beans.Computer;

public class ComputerClient {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(new PCFactory("8gb", "512gb", "dell"));
        Computer server = ComputerFactory.createComputer(new PCFactory("800gb", "5000gb", "selff"));
        System.out.println("PC object is:" + pc);
        System.out.println("Server object is:" + server);




    }
}
