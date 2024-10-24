package com.bbbwdc.factory.validation;

import com.bbbwdc.factory.CouponDTO;
import lombok.extern.java.Log;

@Log
public class Coupon01ValidationStrategy implements ValidationStrategy {
    @Override
    public void validate(CouponDTO couponDTO) {
        log.info("优惠券验证，类型：01");
    }
}
