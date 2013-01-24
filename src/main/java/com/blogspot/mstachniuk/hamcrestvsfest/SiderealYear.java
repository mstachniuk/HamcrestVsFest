package com.blogspot.mstachniuk.hamcrestvsfest;

public class SiderealYear {

    private final double earthDays;

    public SiderealYear(double earthDays) {
        this.earthDays = earthDays;
    }

    public double inEarthDays() {
        return earthDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SiderealYear that = (SiderealYear) o;

        return Double.compare(that.earthDays, earthDays) == 0;
    }

    @Override
    public int hashCode() {
        long temp = earthDays != +0.0d ? Double.doubleToLongBits(earthDays) : 0L;
        return (int) (temp ^ (temp >>> 32));
    }
}
