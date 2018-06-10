package com.mimibang.invoice.mapper;

import com.mimibang.invoice.domain.PaymentDay;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jby on 2018/3/31.
 */
@Mapper
@Component
public interface PaymentDaysMapper {

    @Select("select * from payment_days where uuid = #{uuid}")
    @Results({@Result(column = "start_time", property = "startTime"),
            @Result(column = "end_time", property = "endTime") })
    PaymentDay findByUuid(@Param("uuid") String state);

    @Select("select * from payment_days")
    @Results({@Result(column = "start_time", property = "startTime"),
            @Result(column = "end_time", property = "endTime") })
    List<PaymentDay> queryAll();

    @Insert("insert into payment_days values(#{uuid}, #{name}, #{description}, #{startTime}, #{endTime})")
    int add(PaymentDay paymentDay);
}
