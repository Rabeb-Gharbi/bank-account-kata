package com.bank.account.kata;

import com.bank.account.kata.model.ClientAccount;
import com.bank.account.kata.utils.AccountUtils;
import com.bank.account.kata.utils.AmountUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ClientAccount clientAccount = new ClientAccount();

		try {
			clientAccount.depositInAccount(AmountUtils.amountValue(2000), AccountUtils.convertStringToDate("15-03-2022"));
			clientAccount.withdrawalFromAccount(AmountUtils.amountValue(1000), AccountUtils.convertStringToDate("14-04-2012"));


		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

