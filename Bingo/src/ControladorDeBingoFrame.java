
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class ControladorDeBingoFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JButton btnNewButton;
	private JButton btnGuardarListaDe;
	private ArrayList<Carton> listaCargada;
	private ArrayList<Carton> cartones;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControladorDeBingoFrame frame = new ControladorDeBingoFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public ControladorDeBingoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false);
		ArrayList<JTextField> campos = new ArrayList<JTextField>();
		cartones = new ArrayList<Carton>();

		int[] numeros = new int[15];

		JComboBox<Carton> comboBox = new JComboBox<Carton>();
		comboBox.setBounds(283, 68, 141, 20);
		contentPane.add(comboBox);

		if (cargarArchivo()) {
			cartones = listaCargada;
			for (Carton c : cartones) {
				comboBox.addItem(c);
			}
		}

		textField = new JTextField();
		textField.setBounds(10, 11, 38, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		campos.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(58, 11, 38, 20);
		contentPane.add(textField_1);
		campos.add(textField_1);
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 11, 38, 20);
		contentPane.add(textField_2);
		campos.add(textField_2);
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(154, 11, 38, 20);
		contentPane.add(textField_3);
		campos.add(textField_3);
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(202, 11, 38, 20);
		contentPane.add(textField_4);
		campos.add(textField_4);
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 40, 38, 20);
		contentPane.add(textField_5);
		campos.add(textField_5);
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(58, 40, 38, 20);
		contentPane.add(textField_6);
		campos.add(textField_6);
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(106, 40, 38, 20);
		contentPane.add(textField_7);
		campos.add(textField_7);
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(154, 40, 38, 20);
		contentPane.add(textField_8);
		campos.add(textField_8);
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(202, 40, 38, 20);
		contentPane.add(textField_9);
		campos.add(textField_9);
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 68, 38, 20);
		contentPane.add(textField_10);
		campos.add(textField_10);
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(58, 68, 38, 20);
		contentPane.add(textField_11);
		campos.add(textField_11);
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(106, 68, 38, 20);
		contentPane.add(textField_12);
		campos.add(textField_12);
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(154, 68, 38, 20);
		contentPane.add(textField_13);
		campos.add(textField_13);
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(202, 68, 38, 20);
		contentPane.add(textField_14);
		campos.add(textField_14);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(283, 104, 141, 61);
		textArea.setBackground(new Color(172, 172, 172));
		contentPane.add(textArea);

		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

			}
		});

		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int item = comboBox.getSelectedIndex();
				String acum = "";
				for (int i = 0; i < 5; i++) {
					acum = acum.concat(cartones.get(item).getNumeros()[i] + " - ");
				}
				acum = acum.concat("\n");
				for (int i = 5; i < 10; i++) {
					acum = acum.concat(cartones.get(item).getNumeros()[i] + " - ");
				}
				acum = acum.concat("\n");
				for (int i = 10; i < 14; i++) {
					acum = acum.concat(cartones.get(item).getNumeros()[i] + " - ");
				}
				acum = acum.concat(cartones.get(item).getNumeros()[14] + "");
				textArea.setText(acum);
			}

		});

		btnNewButton = new JButton("Cargar Carton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int i = 0;
					for (JTextField jTextField : campos) {
						numeros[i] = Integer.valueOf(jTextField.getText());
						i++;
					}
					String nombreDeCarton = "Carton Nro: " + (cartones.size() + 1);

					cartones.add(new Carton(nombreDeCarton, numeros));
					comboBox.addItem(new Carton(nombreDeCarton, numeros));
					comboBox.setSelectedIndex(cartones.size() - 1);

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser numeros", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnNewButton.setBounds(283, 10, 141, 23);
		contentPane.add(btnNewButton);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 176, 414, 203);
		textPane.setEditable(false);
		contentPane.add(textPane);

		JLabel lblListaDeCartones = new JLabel("Lista de cartones");
		lblListaDeCartones.setBounds(282, 46, 113, 14);
		contentPane.add(lblListaDeCartones);

		SimpleAttributeSet sas;

		sas = new SimpleAttributeSet();

		JCheckBox chckbxSinConexion = new JCheckBox("Sin conexion");
		chckbxSinConexion.setBounds(10, 377, 121, 23);
		contentPane.add(chckbxSinConexion);

		StyleConstants.setBold(sas, true);
		StyleConstants.setItalic(sas, true);
		JButton btnControlar = new JButton("Controlar");
		btnControlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultados r = new Resultados();
				ArrayList<String> res;
				if (!chckbxSinConexion.isSelected()) {

					textPane.setText("");
					res = r.obtenerNumeros();
					if (res == null) {
						JOptionPane.showMessageDialog(null,
								"No se encuentran los resultados del dia de hoy, intente mas\n tarde o revise su conexión a internet",
								"Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
				} else {
					if (r.cargarResultados() == true) {

						res = r.listaDeNumeros;
					} else {
						return;
					}
				}
				for (Carton carton : cartones) {

					ArrayList<Integer> lista = carton.controlarAciertos(Resultados.convertirAListaDeEnteros(res));

					try {
						textPane.getStyledDocument().insertString(textPane.getStyledDocument().getLength(),
								carton.toString() + ": ", sas);
						for (Integer num : lista) {
							textPane.getStyledDocument().insertString(textPane.getStyledDocument().getLength(),
									num + " ", sas);

						}
						textPane.getStyledDocument().insertString(textPane.getStyledDocument().getLength(), "\n", sas);

					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		btnControlar.setBounds(10, 142, 89, 23);
		contentPane.add(btnControlar);

		JButton btnEliminarUnCarton = new JButton("Eliminar carton");
		btnEliminarUnCarton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!cartones.isEmpty()) {
					int eliminar = comboBox.getSelectedIndex();
					comboBox.removeItem(comboBox.getSelectedItem());
					cartones.remove(eliminar);
				}

			}
		});
		btnEliminarUnCarton.setBounds(106, 142, 134, 23);
		contentPane.add(btnEliminarUnCarton);

		btnGuardarListaDe = new JButton("Guardar lista de cartones");
		btnGuardarListaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter(new File("lista.in"));
					PrintWriter pw = new PrintWriter(fw);
					for (Carton c : cartones) {
						pw.write(c.getNombre() + " ");
						for (int i = 0; i < 15; i++) {
							pw.write(c.getNumeros()[i] + " ");
						}
						pw.println();
					}
					pw.close();
					JOptionPane.showMessageDialog(null, "Los cartones se han guargado exitosamente", "Success",
							JOptionPane.INFORMATION_MESSAGE);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "No se ha podido guardar la lista de cartones", "Error",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}

			}
		});
		btnGuardarListaDe.setBounds(10, 105, 182, 23);
		contentPane.add(btnGuardarListaDe);

		btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (JTextField jtf : campos) {
					jtf.setText("");
				}

			}
		});
		btnNewButton_1.setBounds(202, 105, 66, 23);
		contentPane.add(btnNewButton_1);

		JScrollPane scrollPane = new JScrollPane(textPane);
		scrollPane.setBounds(10, 176, 414, 203);
		contentPane.add(scrollPane);

		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, this.getWidth(), this.getHeight());
		contentPane.add(fondo);

		ImageIcon im = new ImageIcon("bing.jpg");
		Image image = im.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
		fondo.setIcon(new ImageIcon(image));

	}

	public boolean cargarArchivo() {
		try {
			FileReader fr = new FileReader(new File("lista.in"));
			BufferedReader br = new BufferedReader(fr);
			String text;
			String nombre = "";
			String[] valores;
			listaCargada = new ArrayList<Carton>();
			while ((text = br.readLine()) != null) {
				valores = text.split(" ");
				nombre = nombre.concat(valores[0] + " " + valores[1] + " " + valores[2]);
				int[] vec = new int[15];
				for (int i = 0; i < 15; i++) {
					vec[i] = Integer.valueOf(valores[3 + i]);
				}
				listaCargada.add(new Carton(nombre, vec));
				nombre = "";
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;

	}
}
