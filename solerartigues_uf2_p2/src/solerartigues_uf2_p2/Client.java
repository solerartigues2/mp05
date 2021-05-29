package solerartigues_uf2_p2;

import java.util.Vector;

public class Client {
    private String nif;
    private String nom;
    private String telefon;
    private Vector<Lloguer> lloguers;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new Vector<Lloguer>();
    }

    public String getNif()     { return nif;     }
    public String getNom()     { return nom;     }
    public String getTelefon() { return telefon; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) { this.telefon = telefon; }
    
    public void afegeix(Lloguer lloguer)
    {
        if (! lloguers.contains(lloguer)) lloguers.add(lloguer);
    }
    
    public void elimina(Lloguer lloguer)
    {
        if (lloguers.contains(lloguer)) lloguers.remove(lloguer);
    }
    
    public boolean conte(Lloguer lloguer) { return lloguers.contains(lloguer); }

    // Exercici 11
    /*public double bonificacionsDelLloguer(Lloguer lloguer)
    {
        // afegeix lloguers freqüents
        double bonificacions = 1.0;

        // afegeix bonificació per dos dies de lloguer de Luxe
        if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE &&
                lloguer.getDies()>1 ) {
            bonificacions ++;
        }
        return bonificacions;
    }*/
    
    // 15: Moure càlcul import total a un mètode
    public double importTotal()
    {
    	double total = 0;
        for (Lloguer lloguer: lloguers) {
        	// Exercici 10, substituir les variables temporals per crides
            // eliminem variable quantitat;

            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
            // Exercici 10, substituir les variables temporales per crides
                // substituim variable pel seu càlcul
                (lloguer.quantitat() * 30) + "€" + "\n";
            total += lloguer.quantitat() * 30;
        }
        return total;
    }
    
    // 16: Moure càlcul bonificacions a un mètode
    public int bonificacionsTotals()
    {
    	int bonificacions = 0;
    	for (Lloguer lloguer: lloguers)
    	{
        	bonificacions += lloguer.bonificacions();
    	}
    	return bonificacions;
    }
    
    public String informe()
    {
        String resultat = "Informe de lloguers del client " +
            getNom() +
            " (" + getNif() + ")\n";


        // afegeix informació final
        resultat += "Import a pagar: " + importTotal() + "€\n" +
            "Punts guanyats: " + bonificacionsTotals() + "\n";
        return resultat;
    }
}
