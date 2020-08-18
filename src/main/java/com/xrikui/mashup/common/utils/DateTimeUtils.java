package com.xrikui.mashup.common.utils;

import java.time.LocalTime;

public class DateTimeUtils {

    public static String YYYY_MM_DD = "yyyyMMdd";

    public static String YYYY_MM_DD_HH_MM_SS = "yyyy年MM月dd日 HH:mm:ss";

    public static String YYYY_MM_DD_HH_MM_SS_E = "yyyy:MM:dd HH:mm:ss";

    public static boolean checkTime() {
        return LocalTime.now().isAfter(LocalTime.of(9, 29, 59)) && LocalTime.now().isBefore(LocalTime.of(15, 0, 1));
    }
}
