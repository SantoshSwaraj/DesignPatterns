package main.test;

import org.junit.Before;

import main.singleton.Singleton_eager_init;
import main.singleton.Singleton_lazy_init;
public class SingletonTest {
	
	@Before
	public void setup(){
		
	}
	
	@org.junit.Test
	public void Test(){
		
		System.out.println("==========Singleton lazy-init technique==============");
		Singleton_lazy_init instance = Singleton_lazy_init.getInstance();
		System.out.println("InstanceAddress:"+instance);
		System.out.println("===========================================");
		Singleton_lazy_init instance1 = Singleton_lazy_init.getInstance();
		System.out.println("InstanceAddress:"+instance1 );
		
		System.out.println("==========Singleton eager-init technique===============");
		Singleton_eager_init instance2 = Singleton_eager_init.getInstance();
		System.out.println("InstanceAddress:"+instance2);
		System.out.println("===========================================");
		Singleton_eager_init instance3 = Singleton_eager_init.getInstance();
		System.out.println("InstanceAddress:"+instance3 );
		
	}
}
