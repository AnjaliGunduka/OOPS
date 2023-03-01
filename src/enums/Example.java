package enums;


public enum Example {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public Example next() {
        return values()[(ordinal() + 1) % values().length];
    }
}
