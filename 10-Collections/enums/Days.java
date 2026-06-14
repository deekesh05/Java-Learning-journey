package enums;

public enum Days {

    SUNDAY(false)
    ,MONDAY(true)
    ,TUESDAY(true)
    ,WEDNESDAY(true)
    ,THURSDAY(true)
    ,FRIDAY(true)
    ,SATURDAY(false);
    private final boolean isWeekday;

    Days(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public  String typeof()
    {
        return isWeekday ? "Weekday" : "Weekend";
    }
}
