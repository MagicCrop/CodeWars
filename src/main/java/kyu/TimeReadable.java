package kyu;

public class TimeReadable {
    public static String makeReadable(int seconds) {
        String hourString;
        String minString;
        String secString;

        int hours = seconds/3600;
        seconds -= hours * 3600;
        int minutes = seconds/60;
        seconds -= minutes * 60;

        if (hours < 10) {
            hourString = String.format("0%d", hours);
        } else {
            hourString = String.valueOf(hours);
        }
        if (minutes < 10) {
            minString = "0" + minutes;
        } else {
            minString = String.valueOf(minutes);
        }
        if (seconds < 10) {
            secString = "0" +seconds;
        } else {
            secString = String.valueOf(seconds);
        }
        return String.format("%s:%s:%s", hourString, minString, secString);
    }
}
//better solution
/*
    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
 */
