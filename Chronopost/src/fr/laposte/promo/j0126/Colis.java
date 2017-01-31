package fr.laposte.promo.j0126;

public class Colis {
	private String id;
	private int volume;
	
	public Colis(String id, int volume) {
		super();
		this.id = id;
		this.volume = volume;
	}

	public void sAnnoncer() {
		System.out.println("Je suis le colis n°" + this.id + " et mon volume est de " + this.volume + " m3");
	}

	public int getVolume() {
		return volume;
	}
	
}
