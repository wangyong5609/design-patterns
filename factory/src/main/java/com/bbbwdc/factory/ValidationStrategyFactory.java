package com.bbbwdc.factory;


import com.bbbwdc.factory.validation.Coupon01ValidationStrategy;
import com.bbbwdc.factory.validation.Coupon02ValidationStrategy;
import com.bbbwdc.factory.validation.Coupon03ValidationStrategy;
import com.bbbwdc.factory.validation.ValidationStrategy;

/**
 * 验证策略工厂
 */
public class ValidationStrategyFactory {
    public static ValidationStrategy createValidationStrategy(String couponTypeCode) { 
        if ("01".equals(couponTypeCode)) {
            return new Coupon01ValidationStrategy();
        } else if ("02".equals(couponTypeCode)) {
            return new Coupon02ValidationStrategy();
        } else if ("03".equals(couponTypeCode)) {
            return new Coupon03ValidationStrategy();
        }else {
            throw new IllegalArgumentException("Unsupported coupon type: " + couponTypeCode);
        }
    }
}