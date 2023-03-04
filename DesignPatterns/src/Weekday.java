package DesignPatterns.src;

public enum Weekday {
    MONDAY("Work"),
    TUESDAY("Work"),
    WEDNESDAY("Work"),
    THURSDAY("Work"),
    FRIDAY("Work"),
    STAURDAY("Holiday"),
    SUNDAY("Holiday");

    private String weekdayRepr;

    Weekday(String repr) {
        this.weekdayRepr = repr;
    }

    public String getRepr() {
        return this.weekdayRepr;
    }

    public boolean isWeekDay() {
        if (this.getRepr().equals("Work")) {
            return true;
        } else
            return false;

    }
    public boolean isHoliday() {
        if (this.getRepr().equals("Holiday")) {
            return true;
        } else
            return false;

    }


}
