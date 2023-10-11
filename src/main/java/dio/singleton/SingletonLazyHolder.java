package dio.singleton;

public class SingletonLazyHolder {
	private static class Holder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	public static SingletonLazyHolder getInstance() {
		return Holder.instancia;
	}
}
