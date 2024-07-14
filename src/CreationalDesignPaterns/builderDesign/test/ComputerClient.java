package CreationalDesignPaterns.builderDesign.test;

import CreationalDesignPaterns.builderDesign.beans.Computer;

public class ComputerClient {
    public static void main(String[] args) {
        Computer client1 = new Computer.ComputerBuilder("8gb", "256gb","ryzen7").build();
        Computer client2 = new Computer.ComputerBuilder("8gb", "256gb","ryzen7").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

        System.out.println("client1 is"+ client1);
        System.out.println("client2 is"+ client2);


    }
}
