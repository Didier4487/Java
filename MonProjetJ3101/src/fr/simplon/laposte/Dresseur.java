package fr.simplon.laposte;

import java.util.ArrayList;

public class Dresseur {

		public void faireBouger(ArrayList<IMouvement> ceQueJePossede){
			for (IMouvement maPossession : ceQueJePossede) {
				maPossession.bouger();
			}
		}
}
