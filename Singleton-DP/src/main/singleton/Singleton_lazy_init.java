package main.singleton;

public class Singleton_lazy_init {
	private static Singleton_lazy_init instance;
	private Singleton_lazy_init(){}
	public static Singleton_lazy_init getInstance(){
			if(instance==null){
				synchronized(Singleton_lazy_init.class){
					instance=new Singleton_lazy_init();
			}
		}
		return instance;
	}
}