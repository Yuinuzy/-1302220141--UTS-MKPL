package uts_makepal.lib;

public class TaxFunction {
    private static final int PEMASUKAN_BEBAS_PAJAK = 54_000_000;
    private static final int BONUS_BEBAS_PAJAK_PASANGAN = 4_500_000;
    private static final int BONUS_BEBAS_PAJAK_PER_ANAK = 1_500_000;
    private static final double RATE_PAJAK = 0.05;
    private static final int MAX_PAJAK_UNTUK_ANAK = 3;
    private static final int MAX_BULAN_UNTUK_BEKERJA = 12;
    
    public static int calculateTax(TaxParameter params) {
        validateMonthsWorking(params.getNumberOfMonthsWorking());
        int effectiveChildren = Math.min(params.getNumberOfChildren(), MAX_PAJAK_UNTUK_ANAK);
        int taxableIncome = calculateTaxableIncome(params);
        int taxFreeIncome = calculateTaxFreeIncome(params.isIsMarried(), effectiveChildren);
        
        int tax = (int) Math.round(RATE_PAJAK * (taxableIncome - taxFreeIncome));
        return Math.max(0, tax);
    }

    private static void validateMonthsWorking(int numberOfMonthsWorking) {
        if (numberOfMonthsWorking > MAX_BULAN_UNTUK_BEKERJA) {
            throw new IllegalArgumentException("More than 12 months worked per year");
        }
    }

    private static int calculateTaxableIncome(TaxParameter params) {
        return ((params.getMonthlySalary() + params.getOtherMonthlyIncome()) * params.getNumberOfMonthsWorking()) - params.getDeductible();
    }

    private static int calculateTaxFreeIncome(boolean isMarried, int numberOfChildren) {
        int taxFreeIncome = PEMASUKAN_BEBAS_PAJAK;
        if (isMarried) {
            taxFreeIncome += BONUS_BEBAS_PAJAK_PASANGAN;
        }
        taxFreeIncome += numberOfChildren * BONUS_BEBAS_PAJAK_PER_ANAK;
        return taxFreeIncome;
    }
}
