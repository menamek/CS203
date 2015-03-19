/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4d1;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mena
 */
public class SavingAccount extends Account implements interestRate {

    private double interestRate = 0.07;

    @Override
    public void addInterest() {
        super.deposit(super.getCurBalance() * interestRate);
    }
}
