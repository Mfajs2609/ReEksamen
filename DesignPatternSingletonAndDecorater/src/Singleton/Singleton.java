package Singleton;

// singleton design pattern
public class Singleton {

    private static Singleton obj;

    //hidden constructor
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}
