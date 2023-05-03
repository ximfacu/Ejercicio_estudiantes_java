
import javax.swing.JOptionPane;

public class ProcesoPrincipal {

	public static void main(String[] args) {
		
		String nombres[];
		int edad [], sumaEdades=0;
		int promedio=0;
		int cantEstudiantes=Integer.parseInt
				(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
		
		nombres= new String[cantEstudiantes];
		edad= new int [cantEstudiantes];
		
		for (int i = 0; i < nombres.length; i++) {
			nombres [i]=JOptionPane.showInputDialog("Ingrese el nombre del estudiante " +(i+1));
			edad [i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombres[i]));
			System.out.println("Nombre del estudiante " +nombres[i] + " "
					+ ",edad: " + edad[i]);
		}
		for (int j = 0; j < edad.length; j++) {
			 sumaEdades=sumaEdades+edad[j];
		}
		promedio= sumaEdades/cantEstudiantes;
				System.out.println("El promedio de edades es: " + promedio);
				
				int edadMayor=edad[0];
				int edadMenor=edad[0];
				
				for (int i = 0; i < edad.length; i++) {
					if (edad[i] > edadMayor) {
						edadMayor=edad[i];
					} else if(edad[i] < edadMenor){
						edadMenor=edad[i];
					}
				}
				System.out.println("Edad mayor es: " + edadMayor);
				System.out.println("Edad menor es: " + edadMenor);
				
				int cantEdadMayor=0;
				int cantEdadMenor=0;
				
				for (int i = 0; i < edad.length; i++) {
					if (edad[i] >=18 ) {
						cantEdadMayor += 1;
					} else {
						cantEdadMenor += 1;
					}
				}
				
				System.out.println("Cantidad edad mayor: " + cantEdadMayor);
				System.out.println("Cantidad edad menor: " + cantEdadMenor);
				
				
				
				String buscarNombre= JOptionPane.showInputDialog("Ingrese el nombre a buscar");
				int cont=0;
				
				for (int i = 0; i < nombres.length; i++) {
					if (nombres[i].equalsIgnoreCase(buscarNombre)) {
						System.out.println("Encontro el nombre: "
					+nombres[i]+ " edad:"+ edad[i]+ " en la posisición: "+  i );
						cont++;
					}
				}
					
					if (cont > 0) {
						System.out.println("Lo encontró "+cont+" veces");
					} else {
						System.out.println("No encontró el nombre " +buscarNombre);
					}
					
				
				
				int buscarEdad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad a buscar"));
				int cant=0;
				
				for (int i = 0; i < edad.length; i++) {
					if(edad[i] == buscarEdad) {
						System.out.println("Encontro la edad: " +edad[i]+ "  en la posición " + i);
						cant++;
				}
			}
					if (cant > 0) {
						System.out.println("Lo encontró "+cant+" veces");
					} else {
						System.out.println("No encontró el la edad " +buscarEdad);
					}
			
	}
}


