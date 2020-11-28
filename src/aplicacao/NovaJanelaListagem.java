package aplicacao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NovaJanelaListagem extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaJanelaListagem window = new NovaJanelaListagem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NovaJanelaListagem() {
		getContentPane().setLayout(null);
		
		JLabel lblListagem = new JLabel("Listagem");
		lblListagem.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblListagem.setBounds(151, 0, 176, 44);
		getContentPane().add(lblListagem);
		
		JButton btnNewButton = new JButton("Produtos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(187, 85, 122, 36);
		getContentPane().add(btnNewButton);
		
		JButton btnClientes = new JButton("Pedidos do cliente");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClientes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClientes.setBounds(10, 131, 167, 36);
		getContentPane().add(btnClientes);
		
		JButton btnNewButton_2 = new JButton("Arrecarda\u00E7\u00E3o");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(319, 135, 107, 29);
		getContentPane().add(btnNewButton_2);
		
		JButton btnClientes_1 = new JButton("Clientes");
		btnClientes_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClientes_1.setBounds(319, 85, 107, 36);
		getContentPane().add(btnClientes_1);
		
		JButton btnNewButton_4 = new JButton("Pedidos Pagos");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(10, 85, 167, 36);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Produtos Top");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(187, 177, 122, 36);
		getContentPane().add(btnNewButton_5);
		
		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPedidos.setBounds(187, 131, 122, 36);
		getContentPane().add(btnPedidos);
		
		JButton btnNewButton_7 = new JButton("Pedidos n\u00E3o Pagos");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_7.setBounds(10, 177, 167, 36);
		getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("Saida:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(10, 236, 107, 29);
		getContentPane().add(lblNewLabel);
		
		JLabel lblistagemresul = new JLabel("");
		lblistagemresul.setBounds(10, 275, 416, 293);
		getContentPane().add(lblistagemresul);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
