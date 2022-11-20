package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author renatainacio
 * */


public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    //    Construtor privado que garante que ninguém externamente vai instanciar o Singleton
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
