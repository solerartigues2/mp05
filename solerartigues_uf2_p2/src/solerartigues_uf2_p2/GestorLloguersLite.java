package solerartigues_uf2_p2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLloguersLite
{
	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		
		// Vehicle1
		Vehicle vehicle1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Date date = dateFormat.parse("3/4/2020");
		Lloguer lloguer1 = new Lloguer(date, 4, vehicle1);

		// Vehicle2
		Vehicle vehicle2 = new Vehicle("Audi", "RS5", Vehicle.LUXE);
		date = dateFormat.parse("6/5/2009");
		Lloguer lloguer2 = new Lloguer(date, 3, vehicle2);

		// Vehicle3
		Vehicle vehicle3 = new Vehicle("Fiat", "Multipla", Vehicle.GENERAL);
		date = dateFormat.parse("4/11/2014");
		Lloguer lloguer3 = new Lloguer(date, 3, vehicle3);

		Client jo = new Client ("12345678A","Bernat Soler Artiges","123 45 67 89");
		jo.afegeix(lloguer1);
		jo.afegeix(lloguer2);
		jo.afegeix(lloguer3);
		System.out.print(jo.informe());
	}
}
