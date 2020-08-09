package com.xrikui.mashup.common.utils;

import java.math.BigDecimal;

public class BigDecimalUtils {

    /**
     * 将String类型转换成BigDecimal类型
     *
     * @param var1 String参数
     */
    public static BigDecimal transform(String var1) {
        return BigDecimal.valueOf(Double.parseDouble(var1));
    }


    /**
     * 计算利率
     *
     * @param var1 计算分子
     * @param var2 计算分母
     * @param var3 保留位数
     */
    public static BigDecimal calculateRate(BigDecimal var1, BigDecimal var2, int var3) {
        return var1.subtract(var2).divide(var2, var3, BigDecimal.ROUND_HALF_UP);
    }
}
