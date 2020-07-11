package com.spring.entity;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

public class FormatTest{

    @NumberFormat(style = NumberFormat.Style.NUMBER)
    int normal;

    @NumberFormat(style = NumberFormat.Style.PERCENT)
    double percent;

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    double money;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    Date date;
    
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNormal() {
		return normal;
	}
	public void setNormal(int normal) {
		this.normal = normal;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}


}
