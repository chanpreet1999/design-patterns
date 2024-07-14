package CreationalDesignPaterns.singletonDesign.test;

import CreationalDesignPaterns.singletonDesign.beans.EagerInitializationSingleton;
import CreationalDesignPaterns.singletonDesign.beans.LazyInitializationSingleton;

public class SingletonClient {

    public static void main(String[] args) {
        EagerInitializationSingleton eager = EagerInitializationSingleton.getInstance();
        LazyInitializationSingleton lzy = LazyInitializationSingleton.getInstance();

        System.out.println("Eager Singleton: " + eager);
        System.out.println("Lazy Singleton: " + lzy);

    }

}
