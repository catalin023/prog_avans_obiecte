package lab7.exercitiu1.model;

public enum Currency {
    RON("Romania", "RO"),
    EUR("Uniunea Europeana", "UE"),
    USD("Statele Unite ale Americii", "USA"),
    GBP("United Kingdom", "UK"),
    TRY("Turcia", "TR");

    private final String name;
    private final String symbol;

    Currency(String n, String s) {
        name = n;
        symbol = s;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}
