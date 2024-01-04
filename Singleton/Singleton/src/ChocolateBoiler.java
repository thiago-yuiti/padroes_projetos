public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // preencha a caldeira com uma mistura de leite e chocolate
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drene o leite e o chocolate fervidos
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // coloque o conteudo em ebuliçao
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
