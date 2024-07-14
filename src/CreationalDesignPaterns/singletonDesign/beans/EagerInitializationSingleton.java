package CreationalDesignPaterns.singletonDesign.beans;

public class EagerInitializationSingleton {
    private EagerInitializationSingleton() {}
    private static EagerInitializationSingleton instance = new EagerInitializationSingleton();
    public static EagerInitializationSingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getClass());
    }
}
