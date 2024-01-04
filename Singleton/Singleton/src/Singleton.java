public class Singleton {
    private volatile static Singleton uniqueInstance;
    // outras variaveis de instancia uteis aqui
    private Singleton()  {}

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
