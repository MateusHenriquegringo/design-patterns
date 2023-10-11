package dio.singleton;

import dio.facade.Facade;
import dio.strategy.*;

public class Test {
	public static void main(String[] args) {
		// SINGLETON DESIGN PATTERN
		// USADO POR @BEAN E AUTOWIRED
		SingletonLazy lazy = SingletonLazy.getInstance();
		SingletonEager eager = SingletonEager.getInstance();
		SingletonLazyHolder holder = SingletonLazyHolder.getInstance();

		System.out.println(lazy);
		System.out.println(eager);
		System.out.println(holder);

		SingletonLazy lazy2 = SingletonLazy.getInstance();
		SingletonEager eager2 = SingletonEager.getInstance();
		SingletonLazyHolder holder2 = SingletonLazyHolder.getInstance();

		System.out.println(lazy2);
		System.out.println(eager2);
		System.out.println(holder2);

		//  STRATEGY
		//  USADO POR @SERVICE E @REPOSITORY
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento ofensivo = new ComportamentoOfensivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(ofensivo);
		robo.mover();

		// FACADE

		Facade facede = new Facade();
		System.out.println();
		facede.migrarCliente("mateus","99950000");
	}
}
