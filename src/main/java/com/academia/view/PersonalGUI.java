package com.academia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class PersonalGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldAdress;
	private JTextField textFieldNumber;
	private JTextField textFieldNeightbornhood;
	private JTextField textFieldCity;
	private JTextField textFieldTelephone;
	private JTextField textField_1;
	private JTextField textGender;
	private JTextField textFieldPeriod;
	private JTextField textFieldCref;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalGUI frame = new PersonalGUI();
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
	public PersonalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Nome:");
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		
		JLabel lblAge = new JLabel("Idade:");
		
		textFieldAge = new JTextField();
		textFieldAge.setText("");
		textFieldAge.setColumns(10);
		
		JLabel lblAdress = new JLabel("Endereço:");
		
		textFieldAdress = new JTextField();
		textFieldAdress.setColumns(10);
		
		JLabel lblNumberl = new JLabel("Numero:");
		
		textFieldNumber = new JTextField();
		textFieldNumber.setColumns(10);
		
		JLabel lblNeightbornhood = new JLabel("Bairro:");
		
		textFieldNeightbornhood = new JTextField();
		textFieldNeightbornhood.setColumns(10);
		
		JLabel lblCity = new JLabel("Cidade:");
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		
		JLabel lblTelephone = new JLabel("Telefone:");
		
		textFieldTelephone = new JTextField();
		textFieldTelephone.setColumns(10);
		
		JLabel lblPostalCode = new JLabel("Codigo Postal:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Genero:");
		
		textGender = new JTextField();
		textGender.setColumns(10);
		
		JLabel lblPeriod = new JLabel("Periodo:");
		
		textFieldPeriod = new JTextField();
		textFieldPeriod.setText("");
		textFieldPeriod.setColumns(10);
		
		JLabel lblCref = new JLabel("CREF:");
		
		textFieldCref = new JTextField();
		textFieldCref.setText("");
		textFieldCref.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		
		JButton btnAlterar = new JButton("Alterar");
		
		JButton btnExcluir = new JButton("Excluir");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAge)
						.addComponent(lblAdress)
						.addComponent(lblNeightbornhood)
						.addComponent(lblCity)
						.addComponent(lblPeriod))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 590, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addComponent(textFieldAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(35)
										.addComponent(lblTelephone)
										.addGap(18)
										.addComponent(textFieldTelephone, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
										.addGap(51)
										.addComponent(lblGender)
										.addGap(18)
										.addComponent(textGender))
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(textFieldNeightbornhood, Alignment.LEADING)
											.addComponent(textFieldAdress, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
										.addGap(29)
										.addComponent(lblNumberl)
										.addGap(18)
										.addComponent(textFieldNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblCref)
										.addComponent(textFieldCity, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnIncluir, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
											.addGap(80)
											.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
											.addGap(74)
											.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(47)
											.addComponent(lblPostalCode)
											.addGap(18)
											.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(18)
											.addComponent(textFieldCref, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))))
							.addGap(43))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textFieldPeriod, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblName))
						.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge)
						.addComponent(textFieldAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelephone)
						.addComponent(textFieldTelephone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGender)
						.addComponent(textGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdress)
						.addComponent(textFieldAdress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumberl)
						.addComponent(textFieldNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNeightbornhood)
						.addComponent(textFieldNeightbornhood, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCity)
						.addComponent(textFieldCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPostalCode))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPeriod)
						.addComponent(textFieldPeriod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCref)
						.addComponent(textFieldCref, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIncluir)
						.addComponent(btnExcluir)
						.addComponent(btnAlterar))
					.addGap(54))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
