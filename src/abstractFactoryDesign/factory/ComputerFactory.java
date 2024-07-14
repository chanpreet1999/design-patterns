package abstractFactoryDesign.factory;

import abstractFactoryDesign.beans.Computer;

public class ComputerFactory {
    public static Computer createComputer(ComputerAbstractFactory caf){
        return caf.createComputer();
    }
}
