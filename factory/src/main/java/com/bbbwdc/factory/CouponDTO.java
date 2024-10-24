package com.bbbwdc.factory;


import lombok.Data;

@Data
public class CouponDTO {
    private String couponId;
    private String couponType;
    private String startDate;
    private String endDate;
    private String memo;
    private String couponName;
}
