package ro.ase.cts.builderV2.main;

import ro.ase.cts.builderV2.classes.Rezervare;
import ro.ase.cts.builderV2.classes.BuilderV2;

public class Program {

	public static void main(String[] args) {
		BuilderV2 builder = new BuilderV2();
		builder.setBauturaRacoritoare(true);
		builder.setMancareInclusa(true);
		
		Rezervare rezervare1 = builder.setCodRezervare(5).build();
		Rezervare rezervare2 = builder.setCodRezervare(6).build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
	}

}
