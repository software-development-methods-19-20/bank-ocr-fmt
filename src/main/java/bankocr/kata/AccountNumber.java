package bankocr.kata;

import java.util.List;

public class AccountNumber {

    private Entry entry;

    public AccountNumber(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return entry.toString();
    }

    List<Cell> getCells() {
        return entry.getCells();
    }

    public boolean hasInvalidCells() {
        return entry.getCells().stream().filter(item -> item.toString().equals("?")).findAny().map(item -> true).orElse(false);
    }
}
