package com.Map;

public class apartment {
   private int floor;
   private String family;
   private double Consume_water;

    public apartment(int floor, String family, double consume_water) {
        this.floor = floor;
        this.family = family;
        Consume_water = consume_water;
    }

    @Override
    public String toString() {
        return "apartment{" +
                "floor=" + floor +
                ", family='" + family + '\'' +
                ", Consume_water=" + Consume_water +
                '}';
    }
}
