package com.bbbwdc.test;


import com.bbbwdc.factory.CouponDTO;
import com.bbbwdc.factory.ValidationStrategyFactory;
import com.bbbwdc.factory.validation.ValidationStrategy;
import lombok.extern.java.Log;
import org.junit.Test;


@Log
public class ApiTest {

    @Test
    public void testValidation() {
        CouponDTO couponDTO1 = new CouponDTO();
        couponDTO1.setCouponType("01");
        ValidationStrategy validationStrategy = ValidationStrategyFactory.createValidationStrategy(couponDTO1.getCouponType());
        validationStrategy.validate(couponDTO1);

        CouponDTO couponDTO2 = new CouponDTO();
        couponDTO2.setCouponType("02");
        ValidationStrategy validationStrategy2 = ValidationStrategyFactory.createValidationStrategy(couponDTO2.getCouponType());
        validationStrategy2.validate(couponDTO2);

        CouponDTO couponDTO3 = new CouponDTO();
        couponDTO3.setCouponType("03");
        ValidationStrategy validationStrategy3 = ValidationStrategyFactory.createValidationStrategy(couponDTO3.getCouponType());
        validationStrategy3.validate(couponDTO3);
    }
    

    @Test
    public void shit() {
        CouponDTO couponDTO = new CouponDTO();
        couponDTO.setCouponType("01");
        if ("01".equals(couponDTO.getCouponType())) {
            log.info("优惠券验证，类型：01");
        } else if ("02".equals(couponDTO.getCouponType())) {
            log.info("优惠券验证，类型：02");
        } else if ("03".equals(couponDTO.getCouponType())) {
            log.info("优惠券验证，类型：03");
        }
    }
}