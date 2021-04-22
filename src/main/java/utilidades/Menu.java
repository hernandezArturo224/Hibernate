package utilidades;

public class Menu {
	private String [] opciones;
	
	public Menu(String [] options) {
		this.opciones = options;
	}
	
	public String muestraMenu() {
		StringBuilder builder = new StringBuilder(this.opciones[0]);
		builder.append("\n");
		int i;
		for(i=1;i<this.opciones.length;i++) {
			builder.append(this.opciones[i]);
			builder.append("\n");
		}
		return builder.toString();
	}
	

}
