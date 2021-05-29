package solerartigues_uf2_p2;

public class Vehicle
{
	//ATRIBUTS
	public static final String BASIC = "BASIC";
	public static final String GENERAL = "GENERAL";
	public static final String LUXE = "LUXE";
	
	private String model, marca, categoria;

	//CONSTRUCTOR
	public Vehicle(String marca, String model, String categoria)
	{
		this.model = model;
		this.marca = marca;
		this.categoria = categoria;
	}

	public String getCategoria() { return categoria; }
	public String getMarca() { return marca; }
	public String getModel() { return model; }
}