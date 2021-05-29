package solerartigues_uf2_p2;

import java.util.Date;

public class Lloguer
{
	// ATRIBUTS
	private Date data;
	private int dies;
	private Vehicle vehicle;
	// Exercici 18: afegir constants on sigui possible
	public static final double PREU_UNITAT_LLOGUER = 30.0;
		
	public static final double COST_INICIAL_BASIC = 3;
	public static final double COST_INICIAL_GENERAL = 4;
	public static final double COST_INICIAL_LUXE = 6;
	
	public static final double DIES_SENSE_DESCOMPTE_BASIC = 3;
	public static final double DIES_SENSE_DESCOMPTE_GENERAL = 2;
	
	public static final double COST_DESCOMPTE_BASIC = 1.5;
	public static final double COST_DESCOMPTE_GENERAL = 2.5;

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
	
	// Exercici 7: moure el mètode de càlcul a la classe lloguer
    public double quantitat()
    {
    	double quantitat = 0;
    	switch (this.getVehicle().getCategoria()) {
        case Vehicle.BASIC:
            quantitat = COST_INICIAL_BASIC;
            if (this.getDies() > DIES_SENSE_DESCOMPTE_BASIC) {
                quantitat= (this.getDies() - DIES_SENSE_DESCOMPTE_BASIC) * COST_DESCOMPTE_BASIC;
            }
            break;
            
        case Vehicle.GENERAL:
            quantitat = COST_INICIAL_GENERAL;
            if (this.getDies() > DIES_SENSE_DESCOMPTE_GENERAL) {
                quantitat= (this.getDies() - DIES_SENSE_DESCOMPTE_GENERAL) * COST_DESCOMPTE_GENERAL;
            }
            break;
            
        case Vehicle.LUXE:
            quantitat= this.getDies() * COST_INICIAL_LUXE;
            break;
    	}
    	return quantitat;
    }
    
    // Exercici 12: moure el mètode de calcular bonificacions a Lloguer
    public double bonificacions()
    {
        // afegeix lloguers freqüents
        double bonificacions = 1.0;

        // afegeix bonificació per dos dies de lloguer de Luxe
        if (this.getVehicle().getCategoria() == Vehicle.LUXE &&
        		this.getDies()>1 ) {
            bonificacions ++;
        }
        return bonificacions;
    }
}
