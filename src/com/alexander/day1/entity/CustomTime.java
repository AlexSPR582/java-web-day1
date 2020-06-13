package com.alexander.day1.entity;

public class CustomTime {
    private int hours;
    private int minutes;
    private int seconds;

    public CustomTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        CustomTime time = (CustomTime) object;
        return hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return 31 * hours * minutes * seconds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomTime{");
        sb.append("hours=").append(hours);
        sb.append(", minutes=").append(minutes);
        sb.append(", seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }
}
