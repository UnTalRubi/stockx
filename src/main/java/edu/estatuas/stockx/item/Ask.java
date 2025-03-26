package edu.estatuas.stockx.item;

public class Ask implements Offer {

    private String size;
    private Integer ask;

    public Ask(String size, int ask) {

        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask.intValue();
    }

    @Override
    public String toString() {
        return "\t\s\s\s\s" + this.size() + "\t\t\s\s\s" + this.value() + "\n";
    }

    @Override
    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }
}
