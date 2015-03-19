/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4d1;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author mena
 */
public class Account implements Serializable {

    private double curBalance;
    private double interestRate;
    private String customerName;
    private Date openDate;
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date GetDate(){
        return openDate;
    }
    public String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    public void openDate(Date date) {
        this.openDate = date;
    }

    public Double getCurBalance() {
        return curBalance;
    }

    public void deposit(double amount) {
        this.curBalance+= amount;
    }

    public void withdraw(double amount) {
        
       this.curBalance -= amount;
    }

    public void setCustomer(String anr) {
        this.customerName = anr;
    }

    public String getCustomer() {
        return customerName;
    }
     
    
}
