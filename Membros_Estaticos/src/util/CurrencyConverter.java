package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double dolar, double quant) {
		return dolar * quant * (1 + IOF);
	}

}