/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_makepal.lib;

/**
 *
 * @author tsaqi
 */
public class TaxParameter {
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int numberOfMonthsWorking;
    private int deductible;
    private boolean isMarried;
    private int numberOfChildren;

    public TaxParameter(int monthlySalary, int otherMonthlyIncome, int numberOfMonthsWorking,int deductible, boolean isMarried, int numberOfChildren) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.numberOfMonthsWorking = numberOfMonthsWorking;
        this.deductible = deductible;
        this.isMarried = isMarried;
        this.numberOfChildren = numberOfChildren;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getNumberOfMonthsWorking() {
        return numberOfMonthsWorking;
    }

    public int getDeductible() {
        return deductible;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }
    
    
}
