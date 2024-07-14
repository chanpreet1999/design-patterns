package CreationalDesignPaterns.singletonDesign.beans;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;
    private LazyInitializationSingleton() {}
    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getClass());
    }
}
