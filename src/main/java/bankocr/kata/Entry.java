package bankocr.kata;

import java.util.ArrayList;
import java.util.List;

public class Entry {

    List<Cell> cells = new ArrayList<>();

    public List<Cell> getCells() {
        return cells;
    }

    public Entry(String firstLine, String secondLine, String thirdLine) {
        String line1;
        String line2;
        String line3;
        while (cells.size()!=9) {
            line1= getCurrentNumber(firstLine);
            line2= getCurrentNumber(secondLine);
            line3= getCurrentNumber(thirdLine);
            Cell cell = new Cell(line1+ line2 + line3);
            cells.add(cell);
            firstLine = getNextNumber(firstLine);
            secondLine = getNextNumber(secondLine);
            thirdLine = getNextNumber(thirdLine);
        }
    }

    private String getCurrentNumber(String line) {
        if (line.length()<3) {
            line=line+"  ";
        }
        return line.substring(0, 3);
    }

    private String getNextNumber(String line) {
        if (line.length()<3) {
            line=line+"  ";
        }
        return line.substring(3);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        cells.forEach(cell -> stringBuilder.append(cell.toString()));
        return stringBuilder.toString();
    }
}
