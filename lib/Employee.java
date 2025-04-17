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
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	
	
	
	public int getAnnualIncomeTax() {
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		return TaxFunction.calculateTax(gaji.getMonthlySalary(), gaji.getOtherMonthlyIncome(), date.monthWorkingInYear(), gaji.getAnnualDeductible(), family.getSpouseIdNumber().equals(""), family.getNumberOfChildren());
	}
}
