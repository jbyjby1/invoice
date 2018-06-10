package com.mimibang.invoice.controller;

import com.mimibang.invoice.domain.PaymentDay;
import com.mimibang.invoice.domain.RsPaymentDay;
import com.mimibang.invoice.service.PaymentDayService;
import com.mimibang.invoice.util.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by jby on 2018/3/31.
 */
@RestController
@RequestMapping("/payment")
public class PaymentDayController {

    public static Logger logger = LoggerFactory.getLogger(PaymentDayController.class);

    @Autowired
    private PaymentDayService paymentDayService;

    @RequestMapping("/list")
    public String queryAllPaymentDays(){
        List<PaymentDay> allPaymentDays = paymentDayService.queryAllPaymentDays();
        try{
            RsPaymentDay rsPaymentDay = new RsPaymentDay();
            rsPaymentDay.setPaymentDays(allPaymentDays);
            String result = JsonUtils.toJson(rsPaymentDay);
            return result;
        }catch (Exception e){
            logger.error("Convert all payment days error.", e);
            return null;
        }
    }

    @RequestMapping("/add")
    public String addPaymentDay(){
        PaymentDay paymentDay = new PaymentDay();
        paymentDay.setName("aaa");
        paymentDay.setDescription("bbb");
        paymentDay.setStartTime(Instant.now());
        paymentDay.setEndTime(Instant.now());
        try{
            paymentDayService.addPaymentDay(paymentDay);
            RsPaymentDay rsPaymentDay = new RsPaymentDay();
            rsPaymentDay.setPaymentDay(paymentDay);
            String result = JsonUtils.toJson(rsPaymentDay);
            return result;
        }catch (Exception e){
            logger.error("add paymentday error.", e);
            return null;
        }
    }
}
