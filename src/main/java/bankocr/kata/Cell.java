package bankocr.kata;
/**/

import java.util.stream.IntStream;

/**
 *
 **/
public class Cell {

    private final static String MAP =
            " _     _  _     _  _  _  _  _ " +
                    "| |  | _| _||_||_ |_   ||_||_|" +
                    "|_|  ||_  _|  | _||_|  ||_| _|";

    private final static int MAP_ROW_SIZE = MAP.length() / 3;

    public int getValue() {
        return value;
    }

    private int value;

    public Cell(String cellAsText) {
        this.value = parse(cellAsText);
    }

    boolean checkDigit(int i, String buffer) {
        String c = MAP.substring(i * 3, i * 3 + 3) +
                MAP.substring(MAP_ROW_SIZE
                        + i * 3, MAP_ROW_SIZE + i * 3 + 3) +
                MAP.substring(MAP_ROW_SIZE * 2
                        + i * 3, MAP_ROW_SIZE * 2 + i * 3 + 3);

        return c.equals(buffer);
    }

    int parse(String buffer) {
        return IntStream.range(0, 10).filter(index -> checkDigit(index, buffer)).findFirst().orElse(-1);
    }

    @Override
    public String toString() {
        return "" + (value==-1? "?" : value);
    }
}
