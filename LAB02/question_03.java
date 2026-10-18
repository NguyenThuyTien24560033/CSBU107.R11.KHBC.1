class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23. Given: " + hour);
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59. Given: " + minute);
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59. Given: " + second);
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d%n", this.hour, this.minute, this.second);
    }

    private int toTotalSeconds() {
        return this.hour * 3600 + this.minute * 60 + this.second;
    }

    private void fromTotalSeconds(int totalSeconds) {
        int secondsInDay = 24 * 3600;
        
        totalSeconds = totalSeconds % secondsInDay;
        if (totalSeconds < 0) {
            totalSeconds += secondsInDay;
        }

        this.hour = totalSeconds / 3600;
        totalSeconds %= 3600;
        this.minute = totalSeconds / 60;
        this.second = totalSeconds % 60;
    }

    public void addSeconds(int seconds) {
        int totalSeconds = toTotalSeconds() + seconds;
        fromTotalSeconds(totalSeconds);
    }

    public void subtractSeconds(int seconds) {
        addSeconds(-seconds);
    }

    public static void main(String[] args) {
        System.out.println(" Default Constructor ");
        Time t1 = new Time();
        System.out.print("Initial time: ");
        t1.display();

        System.out.println("\n Add Seconds Over Midnight ");
        Time t2 = new Time(23, 59, 50);
        System.out.print("Before: ");
        t2.display();
        t2.addSeconds(20);
        System.out.print("After (+20s): ");
        t2.display();

        System.out.println("\n  Subtract Seconds Under Midnight ");
        Time t3 = new Time(0, 0, 10);
        System.out.print("Before: ");
        t3.display();
        t3.subtractSeconds(20);
        System.out.print("After (-20s): ");
        t3.display();
    }
}