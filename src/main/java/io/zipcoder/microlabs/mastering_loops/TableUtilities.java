package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int i = 1; i <= tableSize; i++) {
            table = table + getMultiplicationTableRow(tableSize, i) + "\n";
        }
        return table;
    }

    public static String getMultiplicationTableRow(int rowSize, int multiplier) {
        String table = "";
        for (int i = 1; i <= rowSize; i++) {
            table = table + String.format("%5s", (i * multiplier) + " |");
        }
        return table;
    }

}