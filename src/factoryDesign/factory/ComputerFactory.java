package factoryDesign.factory;

import factoryDesign.beans.Computer;
import factoryDesign.beans.PC;
import factoryDesign.beans.Server;


public class ComputerFactory {
    public Computer createComputer(ComputerType computerType, String ram, String hdd, String cpu){
        switch(computerType){
            case PC:
                return new PC(ram, hdd, cpu);
            case SERVER:
                return new Server(ram, hdd, cpu);
            default:
                throw new IllegalArgumentException("Invalid computer type");
        }
    }

}
