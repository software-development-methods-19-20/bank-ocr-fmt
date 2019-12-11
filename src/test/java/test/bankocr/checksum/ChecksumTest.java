package test.bankocr.checksum;

import bankocr.kata.AccountNumber;
import bankocr.kata.Checksum;
import org.junit.jupiter.api.Test;
import test.bankocr.AccountReader;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

class ChecksumTest {

    @Test
    void isValid() throws IOException, URISyntaxException {
        boolean[] aspectedChecksum={true, false, true};

        List<AccountNumber> accounts = AccountReader.readAccounts("checksum");

        for (int i=0; i<accounts.size();i++) {
            Checksum checksum=new Checksum(accounts.get(i));
            System.out.println(accounts.get(i)+" "+(checksum.isValid()?"VALID": "INVALID"));
            assertThat(checksum.isValid(), is(aspectedChecksum[i]));
        }
    }
}