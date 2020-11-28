package aplicacao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Swing extends JFrame {

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
					Swing window = new Swing();
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
	public Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("Pedido");
		btnNewButton.setBounds(126, 66, 152, 40);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NovaJanelaPedido innerFrame = new NovaJanelaPedido();
		        innerFrame.setVisible(true);
			}

		});

		JButton btnListagem = new JButton("Listagem");
		btnListagem.setBounds(126, 149, 152, 40);
		btnListagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NovaJanelaListagem innerFrame = new NovaJanelaListagem();
		        innerFrame.setVisible(true);
			}
		});
		btnListagem.setFont(new Font("Tahoma", Font.PLAIN, 23));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnListagem);
	}

}
