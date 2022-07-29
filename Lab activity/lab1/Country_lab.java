package lab1;

import java.util.HashSet;
import java.util.Iterator;

public class Country_lab {

HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> storeCountryNames(String CountryName) {
	H1.add(CountryName);
	return H1;
	}
	public String retreiveCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
	public static void main(String[] args) {
		Country_lab countries = new Country_lab();
		countries.storeCountryNames("India");
		countries.storeCountryNames("USA");
		countries.storeCountryNames("Pakistan");
		countries.storeCountryNames("Bangladesh");
		countries.storeCountryNames("China");

		System.out.println("China: " + countries.retreiveCountry("China"));
		System.out.println("Japan: " + countries.retreiveCountry("Japan"));		
	}

}
