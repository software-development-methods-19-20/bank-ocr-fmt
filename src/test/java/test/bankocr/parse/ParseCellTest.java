package test.bankocr.parse;

import bankocr.kata.Cell;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ParseCellTest {

    @Test
    void zeroCell() {
        String zeroAsText =
                        " _ " +
                        "| |" +
                        "|_|";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("0")));
    }

    @Test
    void oneCell() {
        String zeroAsText =
                        "   " +
                        "  |" +
                        "  |";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("1")));
    }

    @Test
    void twoCell() {
        String zeroAsText =
                " _ "+
                " _|"+
                "|_ ";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("2")));
    }

    @Test
    void threeCell() {
        String zeroAsText =
                " _ "+
                " _|" +
                " _|";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("3")));
    }

    @Test
    void fourCell() {
        String zeroAsText =
                "   "+
                "|_|" +
                "  |";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("4")));
    }

    @Test
    void fiveCell() {
        String zeroAsText =
              " _ "+
              "|_ "+
              " _|";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("5")));
    }

    @Test
    void sixCell() {
        String zeroAsText =
                " _ "+
                "|_ "+
                "|_|";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("6")));
    }

    @Test
    void sevenCell() {
        String zeroAsText =
               " _ " +
               "  |" +
               "  |";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("7")));
    }

    @Test
    void eightCell() {
        String zeroAsText =
               " _ "+
               "|_|"+
               "|_|";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("8")));
    }

    @Test
    void nineCell() {
        String zeroAsText =
                " _ "+
                "|_|"+
                " _|";
        assertThat(new Cell(zeroAsText).toString(), is(equalTo("9")));
    }

}
