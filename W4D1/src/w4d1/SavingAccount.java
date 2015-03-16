/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4d1;

/**
 *
 * @author mena
 */
public class SavingAccount extends Account implements interestCalculate{

    private double interstRate;

    public double getInterstRate() {
        return interstRate;
    }

    public void setInterstRate(double interstRate) {
        this.interstRate = interstRate;
    }

    @Override
    public double calculateInterstRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
