package edu.dmacc.coma510;

public class Problem1 {
    public static void main(String[] args) {
        int numberOfPlateAppearances = 100;
        int numberOfWalks = 4;
        int numberOfHits = 24;

        int calculatedBattingAverage = numberOfHits / (numberOfPlateAppearances - numberOfWalks);

        System.out.println(calculatedBattingAverage); // 0.25
    }
}
