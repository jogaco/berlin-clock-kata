package skeleton;

public class BerlinClockToDigitalConverter {
    
    String convertLastMinutesRow(String time) {
        String[] parts = time.split(":");
        String minutes = parts[1];
        return convertMinutes(minutes);
    }

    private String convertMinutes(String minutes) {
        Integer minutesNumber = Integer.parseInt(minutes);
        int lightsOn = minutesNumber % 5;
        String lightsResult = "";
        for (int i = 0; i < lightsOn; i++) {
            lightsResult += "Y";
        }

        for (int i = 0; i < 4 - lightsOn; i++) {
            lightsResult += "O";
        }

        return lightsResult;
    }

    public String convertFiveMinutesRow(String time) {
        String[] parts = time.split(":");
        String minutes = parts[1];
        return convertFiveMinutes(minutes);
    }

    private String convertFiveMinutes(String minutes) {
        int minutesInt = Integer.parseInt(minutes);
        int lightsOn = minutesInt / 5;
        String result = "";
        for (int i = 0; i < lightsOn; ++i) {
            if ((i + 1) % 3 == 0) {
                result += "R";
            } else {
                result += "Y";
            }
        }
        for (int i = 0; i < 11 - lightsOn; i++) {
            result += "O";
        }
        return result;
    }
}