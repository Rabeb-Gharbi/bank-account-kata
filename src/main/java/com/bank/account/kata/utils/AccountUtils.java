package com.bank.account.kata.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AccountUtils {

    public static Date convertStringToDate(String dateInput) throws ParseException {

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.FRANCE);
            return (formatter.parse(dateInput));
    }



}
