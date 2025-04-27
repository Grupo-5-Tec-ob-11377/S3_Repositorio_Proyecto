package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textNom;
	private JLabel lblNewLabel_1;
	private JTextField textCod;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JRadioButton rdbtnNewRadioButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setTitle("Registro de Asistencia para Estudiantes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(27, 64, 66, 14);
			contentPane.add(lblNewLabel);
		}
		{
			textNom = new JTextField();
			textNom.setBounds(145, 61, 114, 20);
			contentPane.add(textNom);
			textNom.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Código del Estudiante:");
			lblNewLabel_1.setBounds(20, 23, 127, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			textCod = new JTextField();
			textCod.setBounds(145, 20, 114, 20);
			contentPane.add(textCod);
			textCod.setColumns(10);
		}
		{
			rdbtnNewRadioButton = new JRadioButton("Asistió");
			rdbtnNewRadioButton.setBounds(80, 104, 71, 23);
			contentPane.add(rdbtnNewRadioButton);
		}
		{
			rdbtnNewRadioButton_1 = new JRadioButton("Tardanza ");
			rdbtnNewRadioButton_1.setBounds(168, 104, 78, 23);
			contentPane.add(rdbtnNewRadioButton_1);
		}
		{
			rdbtnNewRadioButton_2 = new JRadioButton("Faltó");
			rdbtnNewRadioButton_2.setBounds(256, 104, 66, 23);
			contentPane.add(rdbtnNewRadioButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 151, 382, 144);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(299, 36, 89, 42);
			contentPane.add(btnNewButton);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
	}
}
