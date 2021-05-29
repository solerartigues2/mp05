package solerartigues_uf2_p2;

import java.util.Date;

public class Lloguer
{
	// ATRIBUTS
	private Date data;
	private int dies;
	private Vehicle vehicle;

	// CONSTRUCTOR
	public Lloguer(Date data, int dies, Vehicle vehicle)
	{
		this.data = data;
		this.dies = dies;
		this.vehicle = vehicle;
	}
	
	public Date getData() { return data; }
	public int getDies() { return dies;	}
	public Vehicle getVehicle() { return vehicle; }
}
