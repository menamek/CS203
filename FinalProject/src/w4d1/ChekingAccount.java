/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4d1;

import java.io.Serializable;

/**
 *
 * @author mena
 */
public class ChekingAccount extends Account implements interestRate{
    private double interestRate=0.01;

    @Override
    public void addInterest() {
        deposit(super.getCurBalance() * interestRate);
    }

}
