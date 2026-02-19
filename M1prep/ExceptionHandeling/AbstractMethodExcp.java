package ExceptionHandeling;

public class AbstractMethodExcp {
    
}


class InvalidIncomeException extends Exception {
    public InvalidIncomeException(String message) {
        super(message);
    }
}

class TaxComputationException extends Exception {
    public TaxComputationException(String message) {
        super(message);
    }
}

abstract class TaxPayer {

    protected double income;

    public TaxPayer(double income) {
        this.income = income;
    }

    public abstract double calculateTax()
            throws InvalidIncomeException, TaxComputationException;
}

class TaxCalculator {

    public static double computeTax(double income)
            throws InvalidIncomeException, TaxComputationException {

        if (income < 0) {
            throw new InvalidIncomeException("Income cannot be negative.");
        }

        double tax;

        try {
            if (income <= 250000) {
                tax = 0;
            }
            else if (income <= 500000) {
                tax = (income - 250000) * 0.05;
            }
            else if (income <= 1000000) {
                tax = (250000 * 0.05) +
                      (income - 500000) * 0.20;
            }
            else {
                tax = (250000 * 0.05) +
                      (500000 * 0.20) +
                      (income - 1000000) * 0.30;
            }
        }
        catch (Exception e) {
            throw new TaxComputationException("Error in tax slab computation.");
        }

        return tax;
    }
}

class SalariedTaxPayer extends TaxPayer {

    public SalariedTaxPayer(double income) {
        super(income);
    }

    @Override
    public double calculateTax()
            throws InvalidIncomeException, TaxComputationException {
        return TaxCalculator.computeTax(income);
    }
}

class BusinessTaxPayer extends TaxPayer {

    public BusinessTaxPayer(double income) {
        super(income);
    }

    @Override
    public double calculateTax()
            throws InvalidIncomeException, TaxComputationException {
        return TaxCalculator.computeTax(income);
    }
}

public class Driver {

    public static void main(String[] args) {

        String type = "Business";
        double income = -750000;

        TaxPayer taxpayer;

        if (type.equalsIgnoreCase("Salaried")) {
            taxpayer = new SalariedTaxPayer(income);
        } else {
            taxpayer = new BusinessTaxPayer(income);
        }

        try {
            double tax = taxpayer.calculateTax();
            System.out.println("Calculated Tax: ₹" + tax);
        }
        catch (InvalidIncomeException | TaxComputationException e) {
            System.out.println("Tax Calculation Error!");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
