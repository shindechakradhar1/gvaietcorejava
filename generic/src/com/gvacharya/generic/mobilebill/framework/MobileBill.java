package com.gvacharya.generic.mobilebill.framework;

@FunctionalInterface
public interface MobileBill<T extends Payable> {
	public Float generateBill(T noOfDays);
}
