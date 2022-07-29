package lab;

public class CalculatorSimulator {

	public static void main(String[] args) throws TaxNotEligibleException, CountryNotValidException, EmployeeNameInvalidException 
	{

		TaxCalculator f = new TaxCalculator();
		System.out.println("Tax Amount is :" + f.calculateTax(70000));

	}
}
