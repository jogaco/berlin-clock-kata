package berlinclock;

public class BerlinClock {

    private static final int HOURS = 0;
    private static final int MINUTES = 1;
    private static final int SECONDS = 2;

    public String convertLastMinutesRow(String time) {
        String[] parts = splitTime(time);
        return convertMinutes(parts[MINUTES]);
    }

    public String convertFiveMinutesRow(String time) {
        String[] parts = splitTime(time);
        return convertFiveMinutes(parts[MINUTES]);
    }


    private String[] splitTime(String time) {
        return time.split(":");
    }

    private String convertMinutes(String minutes) {
        Integer minutesNumber = Integer.parseInt(minutes);
        int lightsOn = minutesNumber % 5;

        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < lightsOn; i++) {
            result.append('Y');
        }

        for (int i = 0; i < 4 - lightsOn; i++) {
            result.append('O');
        }

        return result.toString();
    }

    private String convertFiveMinutes(String minutes) {
        int minutesInt = Integer.parseInt(minutes);
        int lightsOn = minutesInt / 5;
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < lightsOn; ++i) {
            if ((i + 1) % 3 == 0) {
                result.append('R');
            } else {
                result.append('Y');
            }
        }
        for (int i = 0; i < 11 - lightsOn; i++) {
            result.append('O');
        }
        return result.toString();
    }
}