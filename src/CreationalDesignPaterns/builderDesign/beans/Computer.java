package CreationalDesignPaterns.builderDesign.beans;

public class Computer {
//   required params
    private String ram;
    private String hdd;
    private String cpu;

//    optional params
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.hdd = computerBuilder.hdd;
        this.cpu = computerBuilder.cpu;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU()+", isGraphicsCardEnabled="+this.isGraphicsCardEnabled()+", isBluetoothEnabled="+this.isBluetoothEnabled();
    }

    public String getRAM() {
        return ram;
    }
    public String getHDD() {
        return hdd;
    }
    public String getCPU() {
        return cpu;
    }
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        //   required params
        private String ram;
        private String hdd;
        private String cpu;

        //    optional params
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String ram, String hdd, String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}
