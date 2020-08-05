package com.xrikui.mashup.common.utils;

import java.math.BigDecimal;

public class BigDecimalUtils {

    public static BigDecimal transform(String var1) {
        return BigDecimal.valueOf(Double.parseDouble(var1));
    }
}
