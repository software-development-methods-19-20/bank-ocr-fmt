package bankocr.kata;

import java.util.List;
import java.util.stream.IntStream;

public class Checksum {
    public boolean isValid() {
        return valid;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    private final boolean valid;

    private AccountNumber accountNumber;

    public Checksum(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
        this.valid=checksum(accountNumber);
    }

    private boolean checksum(AccountNumber accountNumber) {
        final List<Cell> cells=accountNumber.getCells();
        int size=cells.size();
        int result=IntStream.range(0, size).map(index -> (size-index)*cells.get(index).getValue()).sum()% 11;
        return result==0;
    }

    public String getStatus() {
        if (valid) {
            return "";
        } else {
            if (accountNumber.hasInvalidCells()) {
                return "ILL";
            } else {
                return "ERR";
            }
        }
    }
}
