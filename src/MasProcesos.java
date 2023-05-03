import javax.swing.JOptionPane;

public class MasProcesos {

		String nombres[];
		int valida=0;
		public void iniciar() {
			String menu="MENU ESTUDIANTES\n";
			menu=menu+"1. Registrar\n";
			menu+="2. Imprimir\n";
			menu+="3. Buscar por nombre\n";
			menu+="4. Salir\n";
			menu+="Ingrese una opción:";
			
			int opc=0;
			do {
				opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
				validarOpcion(opc);
			} while (opc!=4);
		}
		
		private void validarOpcion(int opc) {
				switch (opc) {
				case 1: 
					valida=1;
					registrarEstudiantes();
					break;
				case 2:
						if (nombres!=null) {
							imprimirEstudiantes();
						}else {
							System.out.println("No hay datos");
						}

					break; 
				case 3:buscarEstudiantePorNombre();
					break;
				case 4: System.out.println("Chao!");
					break;
				default: System.out.println("No existe el código!");
					break;
				}
		}
		
		private void registrarEstudiantes() {
			int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
			nombres= new String[n];

			for (int i = 0; i < nombres.length; i++) {
				nombres[i]=JOptionPane.showInputDialog("Ingrese el nombre");
			}
			
			System.out.println("Ingresa a registrar");
		}

		public void imprimirEstudiantes() {
			System.out.println(nombres);
			for (int i = 0; i < nombres.length; i++) {
				System.out.println(nombres[i]);
			}
			System.out.println("Imprimir");
		}
		
		public void buscarEstudiantePorNombre() {
			System.out.println("Buscar Nombre");
			int cont=0;
			String nombreBuscar=JOptionPane.showInputDialog("Ingrese el nombre a buscar");
			
			for (int i = 0; i < nombres.length; i++) {
				if (nombres[i].equals(nombreBuscar)) {
					System.out.println("Lo encontró en la pos: "+i);
					cont++;
				}
			}
			
			if (cont>0) {
				System.out.println("Lo encontró "+cont+" veces");
			}else {
				System.out.println("No encontró el nombre "+nombreBuscar);
			}
			
		}
		
		
	

	}


