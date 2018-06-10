package com.mimibang.invoice.domain;

import java.util.List;

/**
 * Created by jby on 2018/3/31.
 */
public class RsPaymentDay {

    private PaymentDay paymentDay;

    private List<PaymentDay> paymentDays;

    public PaymentDay getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(PaymentDay paymentDay) {
        this.paymentDay = paymentDay;
    }

    public List<PaymentDay> getPaymentDays() {
        return paymentDays;
    }

    public void setPaymentDays(List<PaymentDay> paymentDays) {
        this.paymentDays = paymentDays;
    }
}
