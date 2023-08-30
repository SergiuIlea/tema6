package org.fasttrack.Tema16.Exercitiu;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean isInRange(int value){
        return value >= start && value <= end;
    }
}

