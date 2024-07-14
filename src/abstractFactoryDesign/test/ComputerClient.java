package abstractFactoryDesign.test;

import abstractFactoryDesign.factory.ComputerFactory;
import abstractFactoryDesign.factory.PCFactory;
import abstractFactoryDesign.beans.Computer;

public class ComputerClient {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(new PCFactory("8gb", "512gb", "dell"));
        Computer server = ComputerFactory.createComputer(new PCFactory("800gb", "5000gb", "selff"));
        System.out.println("PC object is:" + pc);
        System.out.println("Server object is:" + server);




    }
}
