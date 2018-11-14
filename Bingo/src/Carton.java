import java.util.ArrayList;

public class Carton {

	private int[] numeros;
	
	public int[] getNumeros() {
		return numeros;
	}
	

	private String nombre;
	public Carton(){
		numeros=new int[15];
	}
	public Carton(String nombre){
		numeros=new int[15];
		this.setNombre(nombre);
	}
	public Carton(String nombre,int[] numeros){
		this.numeros=numeros.clone();
		this.setNombre(nombre);
	}
	public void cargar(int []vec) {
		this.numeros=vec;
	}
	
	public ArrayList<Integer> controlarAciertos(ArrayList<Integer>quiniela) {
		ArrayList<Integer>aciertos=new ArrayList<Integer>();
		boolean[] numerosChequeados= new boolean[15];
		for ( Integer integer : quiniela) {
			for(int i=0;i<15;i++) {
				if(integer==numeros[i]&&numerosChequeados[i]==false) {
					numerosChequeados[i]=true;
					aciertos.add(integer);
					break;
				}
			}
		}
		
		return aciertos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return this.nombre;
	}
	
}
