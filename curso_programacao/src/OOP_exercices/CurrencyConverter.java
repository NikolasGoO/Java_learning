package OOP_exercices;

public class CurrencyConverter {
	public static double DollarPrice = 3.10;
	
	public static double ConverterInReal(double dollars)
	{
		double convertedReal = dollars * DollarPrice;
		double tax = convertedReal * 0.06;
		double finalConverted = convertedReal + tax;
		return finalConverted;
	}
}
