/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_makepal.lib;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author tsaqi
 */
public class FamilyMember {
   private String spouseName;
    private String spouseIdNumber;

    private List<String> childNames;
    private List<String> childIdNumbers;

    public FamilyMember() {
        this.spouseName = "";
        this.spouseIdNumber = "";
        childNames = new LinkedList<String>();
	childIdNumbers = new LinkedList<String>();
    }

    public void setSpouse(String spouseName, String spouseIdNumber, EmployeeProfile employee) {
    this.spouseName = spouseName;
    this.spouseIdNumber = employee.getIdNumber();
    }

    public void addChild(String childName, String childIdNumber) {
    childNames.add(childName);
       childIdNumbers.add(childIdNumber);
    }


    public boolean isMarried() {
        return spouseIdNumber != null && !spouseIdNumber.isEmpty();
    }

    public int getNumberOfChildren() {
        return childIdNumbers.size();
    }

    public String getSpouseIdNumber() { return spouseIdNumber; }
}
