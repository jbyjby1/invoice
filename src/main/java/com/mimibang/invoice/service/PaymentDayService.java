package com.mimibang.invoice.service;

import com.mimibang.invoice.dao.PaymentDayMapper;
import com.mimibang.invoice.domain.PaymentDay;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by jby on 2018/3/31.
 */
@Service
public class PaymentDayService {

    @Autowired
    private PaymentDayMapper paymentDayMapper;

    public List<PaymentDay> queryAllPaymentDays(){
        return paymentDayMapper.selectByExample(null);
    }

    public Boolean addPaymentDay(PaymentDay paymentDay){
        if(paymentDay == null){
            return false;
        }
        if(StringUtils.isBlank(paymentDay.getUuid())){
            paymentDay.setUuid(UUID.randomUUID().toString());
        }
        int result = paymentDayMapper.insert(paymentDay);
        return result > 0;
    }
}
