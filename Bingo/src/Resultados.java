import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Resultados {

	int last;
	ArrayList<String> lista = new ArrayList<String>();
	String subStringDir;
	ArrayList<String> listaDeNumeros;

	public boolean cargarResultados() {
		String res = JOptionPane.showInputDialog("Ingrese los numeros ganadores separados por un espacio");
		if(res==null)
			return false;
		String[] numerosGanadores = res.split(" ");
		if (numerosGanadores.length != 20) {
			JOptionPane.showMessageDialog(null, "Deben ingresarse 20 numeros separados por un espacio", "Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		try {
			listaDeNumeros=new ArrayList<String>();
			for (int i = 0; i < 20; i++) {
				listaDeNumeros.add(numerosGanadores[i]);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Deben ingresarse 20 numeros separados por un espacio", "Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		return true;
	}

	public ArrayList<String> obtenerNumeros() {
		listaDeNumeros = new ArrayList<String>();
		String acumuladorDeTexto = "";
		String direccion = "http://www.jugandoonline.com.ar/laquiniela/sorteos.asp";
		try {
			System.setProperty("java.net.useSystemProxies", "true"); // sin esto no anda en la facu
			System.setProperty("file.encoding", "UTF-8");
			URL url = new URL(direccion);
			InputStream is = url.openStream();
			try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
				String line;
				while ((line = br.readLine()) != null) {
					last = line.indexOf("Ciudad Nocturno");

					if (last != -1)
						while ((line = br.readLine()) != null) {

							last = line.indexOf("Pos cabeza");
							if (last != -1) {
								acumuladorDeTexto = br.readLine();
								subStringDir = acumuladorDeTexto.substring(acumuladorDeTexto.indexOf("\">") + 2,
										acumuladorDeTexto.indexOf("</di"));
								subStringDir = subStringDir.substring(2);
								listaDeNumeros.add(subStringDir);
								for (int i = 0; i < 9; i++) {
									br.readLine();
									acumuladorDeTexto = br.readLine();

									subStringDir = acumuladorDeTexto.substring(acumuladorDeTexto.indexOf("\">") + 2,
											acumuladorDeTexto.indexOf("</di"));
									subStringDir = subStringDir.substring(2);
									listaDeNumeros.add(subStringDir);
								}
								br.readLine();
								br.readLine();
								for (int i = 0; i < 10; i++) {
									br.readLine();
									acumuladorDeTexto = br.readLine();

									subStringDir = acumuladorDeTexto.substring(acumuladorDeTexto.indexOf("\">") + 2,
											acumuladorDeTexto.indexOf("</di"));
									subStringDir = subStringDir.substring(2);
									listaDeNumeros.add(subStringDir);
								}
								is.close();
								return listaDeNumeros;
							}

						}

				}

				is.close();
				return null;
			}
		} catch (Exception e) {
			return null;
		}

	}

	public void mostrar(ArrayList<String> lista) {
		for (String string : lista) {
			System.out.println(string);
		}
	}

	public void mostrar2(ArrayList<Integer> lista) {
		for (Integer string : lista) {
			System.out.println(string);
		}
	}

	public static ArrayList<Integer> convertirAListaDeEnteros(ArrayList<String> listaEntrada) {
		ArrayList<Integer> listaDeSalida = new ArrayList<Integer>();
		for (String string : listaEntrada) {
			listaDeSalida.add(Integer.parseInt(string));
		}
		return listaDeSalida;
	}

}
