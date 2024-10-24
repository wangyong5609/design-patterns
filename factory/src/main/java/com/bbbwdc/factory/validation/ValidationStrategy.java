package com.bbbwdc.factory.validation;

import com.bbbwdc.factory.CouponDTO;

/**
 * 验证策略接口
 */
public interface ValidationStrategy {

    void validate(CouponDTO couponDTO);
}
