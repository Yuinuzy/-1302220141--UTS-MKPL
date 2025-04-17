package uts_makepal.lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;


public class Employee {

	EmployeeProfile profile;
	joineddate date;
	Gaji gaji;
        FamilyMember family;
	
	
	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, joineddate date,  boolean gender) {
		this.profile = profile;
                this.date = date;
                this.family = family;	
	}
	public int getAnnualIncomeTax() {
		return TaxFunction.calculateTax(gaji.getMonthlySalary(), gaji.getOtherMonthlyIncome(), date.monthWorkingInYear(), gaji.getAnnualDeductible(), family.getSpouseIdNumber().equals(""), family.getNumberOfChildren());
	}
}
