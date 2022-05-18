package com.bank.account.kata.model;

import com.bank.account.kata.utils.AmountUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientAccount {


	AmountUtils balanceUtils = AmountUtils.amountValue(0);

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	public static final String HEADER = "operation,   date,           amount,       balance";

	public ClientAccount() {
		System.out.println(HEADER);
	}


	public void depositInAccount(AmountUtils amountUtils, Date dateTransaction) {
		displayTransaction(amountUtils, dateTransaction);
	}

	public void withdrawalFromAccount(AmountUtils amountUtils, Date dateTransaction) {
		displayTransaction(amountUtils.negative(), dateTransaction);
	}

	private void displayTransaction(AmountUtils amountUtils, Date dateTransaction) {
		Statement transaction = new Statement(amountUtils);
		AmountUtils newBalanceValue = transaction.getNewBalanceValue(balanceUtils);
		balanceUtils = newBalanceValue;
		displayOperation(newBalanceValue, amountUtils, dateTransaction);
	}

	public void displayOperation(AmountUtils currentBalance, AmountUtils amountUtils, Date dateTransaction) {
		StringBuilder builder = new StringBuilder();
		displayOperation(builder, amountUtils);
		displayDate(builder, dateTransaction);
		displayAmout(builder, amountUtils);
		displayBalance(builder, currentBalance);
		System.out.println(builder.toString());
	}

	private void displayBalance(StringBuilder builder, AmountUtils currentBalance) {
		builder.append("     ")
				.append(currentBalance.convertAmountToString());
	}

	private void displayAmout(StringBuilder builder,  AmountUtils amountUtils) {
		String stringValue = " " + amountUtils.absValue().convertAmountToString();

		builder.append("     ")
				.append(StringUtils.rightPad(stringValue, 10));
	}

	private void displayOperation(StringBuilder builder, AmountUtils amountUtils) {
		if (amountUtils.isGreaterThan(AmountUtils.amountValue(0))) {
			builder.append("credit");
		} else {
			builder.append("debit ");}
	}

	private void displayDate(StringBuilder builder, Date dateTransaction) {
		builder.append("       ");
		builder.append(dateFormat.format(dateTransaction));
	}




}
