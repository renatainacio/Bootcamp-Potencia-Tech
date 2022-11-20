package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * @author renatainacio
 * */


public class SingletonLazyHolder {

    //Static factory, lazy initialization, thread safe
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    //    Construtor privado que garante que ninguém externamente vai instanciar o Singleton
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
