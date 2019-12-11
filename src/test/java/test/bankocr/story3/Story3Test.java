package test.bankocr.story3;

import bankocr.kata.AccountNumber;
import bankocr.kata.Checksum;
import org.junit.jupiter.api.Test;
import test.bankocr.AccountReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Story3Test {

    @Test
    void isValid() throws IOException, URISyntaxException {
        String[] aspectedStatus={"", "ILL", "ERR", "ILL"};

        List<AccountNumber> accounts = AccountReader.readAccounts("case4");

        for (int i=0; i<accounts.size();i++) {
            Checksum checksum=new Checksum(accounts.get(i));
            System.out.println(accounts.get(i)+" "+(checksum.getStatus()));
            assertThat(checksum.getStatus(), is(aspectedStatus[i]));
        }
    }
}