package com.alexander.day1.entity;

public enum CustomMonth {
    JANUARY(1, 31),
    FEBRUARY(2, 28),
    MARCH(3, 31),
    APRIL(4, 30),
    MAY(5, 31),
    JUNE(6, 30),
    JULY(7, 31),
    AUGUST(8, 31),
    SEPTEMBER(9, 30),
    OCTOBER(10, 31),
    NOVEMBER(11, 30),
    DECEMBER(12, 31);

    private int monthNumber;
    private int days;

    private CustomMonth(int monthNumber, int days) {
        this.monthNumber = monthNumber;
        this.days = days;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomMonth{");
        sb.append("monthNumber=").append(monthNumber);
        sb.append(", days=").append(days);
        sb.append('}');
        return sb.toString();
    }
}
