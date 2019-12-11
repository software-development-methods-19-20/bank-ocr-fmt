package test.bankocr;

import bankocr.kata.AccountNumber;
import bankocr.kata.Entry;
import test.bankocr.BankOcrAcceptanceTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AccountReader {
    public static List<AccountNumber> readAccounts(String fileName) throws IOException, URISyntaxException {
        URL url = BankOcrAcceptanceTest.class.getClassLoader().getResource(fileName);
        Path filePath=Path.of(url.toURI());

        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<AccountNumber> result = new ArrayList<>();
        List<String> buffer = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            buffer.add(line);

            if (buffer.size() == 3) {
                result.add(new AccountNumber(new Entry(buffer.get(0), buffer.get(1), buffer.get(2))));
            } else if (buffer.size() == 4) {
                buffer.clear();
            }

        }

        return result;
    }
}
