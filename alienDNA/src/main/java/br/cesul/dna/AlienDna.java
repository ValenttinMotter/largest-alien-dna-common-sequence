package br.cesul.dna;

import java.util.ArrayList;

public class AlienDna {
    private String dna;

    public AlienDna(String dna) {
        this.dna = dna;
    }

    public String getDna() {
        return dna;
    }

    public static int getLargestSequenceOfDna(String dna, String dna2) {

        ArrayList<Character> dnaFormatted = new ArrayList<>(getDnaFormatted(dna));
        ArrayList<Character> dnaFormatted2 = new ArrayList<>(getDnaFormatted(dna2));

        int t[][] = new int[dnaFormatted.size() + 1][dnaFormatted2.size() + 1];

        int largestSequence = 0;

        for (int i = 1; i <= dnaFormatted.size(); i++) {
            for (int j = 1; j <= dnaFormatted2.size(); j++) {
                if (dnaFormatted.get(i - 1) == dnaFormatted2.get(j - 1)) {
                    t[i][j] = t[i - 1][j - 1] + 1;
                    if (largestSequence < t[i][j]) {
                        largestSequence = t[i][j];
                    }
                }
            }
        }
        return largestSequence;
    }

    private static ArrayList<Character> getDnaFormatted(String dna) {
        ArrayList<Character> formattedDna = new ArrayList<>();

        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (Character.isLowerCase(c)) {
                formattedDna.add(Character.toUpperCase(c));
                formattedDna.add(Character.toUpperCase(c));
            } else {
                formattedDna.add(c);
            }
        }

        return formattedDna;
    }
}