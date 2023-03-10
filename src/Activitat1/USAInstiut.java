package Activitat1;

public class USAInstiut {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Institut Jaume_Huguet1 = new Institut("Jaume Huguet");
		Institut Jaume_Huguet2 = new Institut("Jaume Huguet2",700);
		Alumne Isaac = new Alumne("Isaac", 18,"1111111A","icabre@institutjaumehuguet.cat");
		Alumne Anna = new Alumne("Anna", 20,"2222222B","asamadashvili@institutjaumehuguet.cat");
		Alumne LuisMiguel = new Alumne("Luis Miguel",22,"333333c","lyupanqui@insitutjaumehuguet.cat");
		Alumne Josep = new Alumne("Josep",18,"444444d","jsarrias@insitutjaumehuguet.cat");
		Alumne Sergi = new Alumne("Sergi",18,"555555e","smiro@insitutjaumehuguet.cat");
		Alumne Alexis = new Alumne("Alexis",18,"66666f","asalguero@insitutjaumehuguet.cat");
		
		Jaume_Huguet1.afegirAlumne(Isaac);
		Jaume_Huguet1.afegirAlumne(Anna);
		Jaume_Huguet1.afegirAlumne(LuisMiguel);
		
		Jaume_Huguet2.afegirAlumne(Josep);
		Jaume_Huguet2.afegirAlumne(Sergi);
		Jaume_Huguet2.afegirAlumne(Alexis);

		System.out.println("********Institut 1********");
		for(int i = 0; i<3; i++) {
			System.out.println(Jaume_Huguet1.getLlista()[i].getNom());
		}
		System.out.println("");
		System.out.println("********Institut 2********");
		for(int i = 0; i<3; i++) {
			System.out.println(Jaume_Huguet2.getLlista()[i].getNom());
		}
		
		
	}

}
