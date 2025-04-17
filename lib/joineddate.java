/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_makepal.lib;

import java.time.LocalDate;

/**
 *
 * @author tsaqi
 */
public class joineddate {
    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;
    
    public joineddate(int yearJoined, int monthJoined, int dayJoined){
        this.dayJoined = dayJoined;
        this.monthJoined = monthJoined;
        this.yearJoined = yearJoined;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public int getMonthJoined() {
        return monthJoined;
    }

    public int getDayJoined() {
        return dayJoined;
    }

    public int getMonthWorkingInYear() {
        return monthWorkingInYear;
    }
    
    public int monthWorkingInYear() {
        LocalDate date = LocalDate.now();
		
	if (date.getYear() == yearJoined) {
            monthWorkingInYear = date.getMonthValue() - monthJoined;
        }else {
            monthWorkingInYear = 12;
        }
        return monthWorkingInYear;
    }
}
