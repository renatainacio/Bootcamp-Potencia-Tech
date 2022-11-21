package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //testes Singleton Lazy:
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        //verificando se o endereço de memória é o mesmo:
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        //testes Singleton Eager:
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        //verificando se o endereço de memória é o mesmo:
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        //testes Singleton Lazy Holder:
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        //verificando se o endereço de memória é o mesmo:
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Testes Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Renata", "050741000");
    }
}
