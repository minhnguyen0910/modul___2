package casetudy.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public final String CODE_VILLA_SERVICE_REGEX = "^SVVL-\\d{4}$";
    public final String CODE_ROOM_SERVICE_REGEX = "^SVRO-\\d{4}$";
    public Pattern pattern;
    public Matcher matcher;

    public boolean checkCodeVillaServiceRegex(String codeVillaService) {
        pattern = Pattern.compile(CODE_VILLA_SERVICE_REGEX);
        matcher = pattern.matcher(codeVillaService);
        return matcher.matches();
    }

    public boolean checkCodeRoomServiceRegex(String codeRoomService) {
        pattern = Pattern.compile(CODE_ROOM_SERVICE_REGEX);
        matcher = pattern.matcher(codeRoomService);
        return matcher.matches();
    }
}
