package main.singleton;

public class Singleton_eager_init {
	private static Singleton_eager_init instance = new Singleton_eager_init();
	private Singleton_eager_init(){}
	
	public static Singleton_eager_init getInstance(){
		return instance;
	}
}
