package com.mimibang.invoice.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mimibang.invoice.util.JsonInstantDeserializer;
import com.mimibang.invoice.util.JsonInstantSerializer;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 发票账期
 * Created by jby on 2018/3/31.
 */
public class PaymentDay {

    private String uuid;

    private String name;

    private String description;

    private Instant startTime;

    private Instant endTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonSerialize(using = JsonInstantSerializer.class)
    public Instant getStartTime() {
        return startTime;
    }

    @JsonDeserialize(using = JsonInstantDeserializer.class)
    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    @JsonSerialize(using = JsonInstantSerializer.class)
    public Instant getEndTime() {
        return endTime;
    }

    @JsonDeserialize(using = JsonInstantDeserializer.class)
    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }
}
