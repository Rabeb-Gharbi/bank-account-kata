package com.bank.account.kata.model;

import com.bank.account.kata.utils.AmountUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientAccount {


	AmountUtils balanceUtils = AmountUtils.amountValue(0);

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	public ClientAccount(){
	}


	public void depositInAccount(AmountUtils amountUtils, Date dateTransaction) {
		displayTransaction(amountUtils, dateTransaction);
	} 

	private void displayTransaction(AmountUtils amountUtils, Date dateTransaction) {
		Statement transaction = new Statement(amountUtils);
		AmountUtils newBalanceValue = transaction.getNewBalanceValue(balanceUtils);
		balanceUtils = newBalanceValue;
	}

}
