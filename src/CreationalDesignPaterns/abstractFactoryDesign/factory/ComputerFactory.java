package CreationalDesignPaterns.abstractFactoryDesign.factory;

import CreationalDesignPaterns.abstractFactoryDesign.beans.Computer;

public class ComputerFactory {
    public static Computer createComputer(ComputerAbstractFactory caf){
        return caf.createComputer();
    }
}
