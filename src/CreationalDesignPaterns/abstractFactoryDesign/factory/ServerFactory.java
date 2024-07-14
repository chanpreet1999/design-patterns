package CreationalDesignPaterns.abstractFactoryDesign.factory;

import CreationalDesignPaterns.abstractFactoryDesign.beans.Computer;
import CreationalDesignPaterns.abstractFactoryDesign.beans.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server( this.ram, this.cpu, this.hdd);
    }
}
