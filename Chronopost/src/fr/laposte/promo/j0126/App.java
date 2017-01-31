package fr.laposte.promo.j0126;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colis monColis = new Colis("AA123456FR",1);
		VehiculeElectique monVehicule1 = new VehiculeElectique("AA123AA","RENAULT","ZOE",5,"petit",2);
		VehiculeDiesel monVehicule2 = new VehiculeDiesel("AB123AA","RENAULT","Trafic",25,"tous",3);
		//monVehicule1.sAnnoncer();
		monColis.sAnnoncer();
		
		if (monColis.getVolume() > 2) {
			monVehicule2.sAnnoncer();
		}
		else {
			monVehicule1.sAnnoncer();
		}
	}

}
