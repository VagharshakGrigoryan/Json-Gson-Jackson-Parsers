package com.epam.json.gson.entity;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Objects;

public class CurrencyRate {

    @SerializedName("ccy")
    private String from;
    @SerializedName("base_ccy")
    private String to;
    private BigDecimal buy;
    private BigDecimal sale;

    public CurrencyRate() {
    }

    public CurrencyRate(String from, String to, BigDecimal buy, BigDecimal sale) {
        this.from = from;
        this.to = to;
        this.buy = buy;
        this.sale = sale;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public void setBuy(BigDecimal buy) {
        this.buy = buy;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", buy=" + buy +
                ", sale=" + sale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyRate that = (CurrencyRate) o;
        return Objects.equals(from, that.from) && Objects.equals(to, that.to) && Objects.equals(buy, that.buy) && Objects.equals(sale, that.sale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, buy, sale);
    }
}
