package com.bank.account.kata.utils;

public class AmountUtils {

	private int value;

	public AmountUtils(int value) {
		this.value = value;
	}

	public static AmountUtils amountValue(int value) {
		return new AmountUtils(value);
	}

	public AmountUtils addValue(AmountUtils otherAmount) {
		return amountValue(this.value + otherAmount.value);
	}

	public boolean isGreaterThan(AmountUtils secondAmount) {
		return this.value > secondAmount.value;
	}

	public AmountUtils absValue() {
		return amountValue(Math.abs(value));
	}

	public String convertAmountToString() {
		return String.valueOf(value);
	}

	public AmountUtils negative() {
		return amountValue(-value);
	}

}
