package com.mimibang.invoice.dao;

import com.mimibang.invoice.domain.PaymentDay;
import com.mimibang.invoice.domain.PaymentDayExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDayMapper {
    long countByExample(PaymentDayExample example);

    int deleteByExample(PaymentDayExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(PaymentDay record);

    int insertSelective(PaymentDay record);

    List<PaymentDay> selectByExample(PaymentDayExample example);

    PaymentDay selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") PaymentDay record, @Param("example") PaymentDayExample example);

    int updateByExample(@Param("record") PaymentDay record, @Param("example") PaymentDayExample example);

    int updateByPrimaryKeySelective(PaymentDay record);

    int updateByPrimaryKey(PaymentDay record);
}