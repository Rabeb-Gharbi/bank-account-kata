package com.bank.account.kata.model;

import com.bank.account.kata.utils.AmountUtils;


public class Statement {

	private AmountUtils value;

	public Statement(AmountUtils value) {
		this.value = value;
	}

	public AmountUtils getNewBalanceValue(AmountUtils actualBalance) {
		return actualBalance.addValue(value);
	}

}
