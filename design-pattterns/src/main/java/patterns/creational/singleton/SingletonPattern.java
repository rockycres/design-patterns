package patterns.creational.singleton;

/**
 * Singleton  lets you ensure that a class has only one instance, while providing a global access point to this instance.
 */
public class SingletonPattern {

    private SingletonPattern(){
    }

    private static volatile SingletonPattern singletonInstance;

    public static SingletonPattern getInstance(){

        SingletonPattern ins = singletonInstance;

        if(ins != null){
            return ins;
        }

        synchronized (SingletonPattern.class){
            if(singletonInstance == null){
                singletonInstance =  new SingletonPattern();
            }
            return  singletonInstance;
        }


    }

}
