package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author renatainacio
 * */


public class SingletonLazy {
    private static SingletonLazy instancia;

//    Construtor privado que garante que ninguém externamente vai instanciar o Singleton
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
