import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Desarrollador extends JFrame implements ActionListener
{
	private JLabel label1,label2,label3,label4,perfil1;
	Color blanco = new Color(255,255,255);
	Color azul = new Color(3,169,244);
	private JMenuBar menubar;
	private JMenu menu1;
	private JMenuItem sm;

	public Desarrollador()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Acerca de");
		getContentPane().setBackground(new Color(41,67,78));
		setIconImage(new ImageIcon(getClass().getResource("image/start.jpg")).getImage());

	    label2 = new JLabel("Programador y Diseñador de este S.O");
		label2.setBounds(5,10,250,30);
		label2.setFont(new Font("Andale Mono",1,12));
		label2.setForeground(blanco);
		add(label2);

		perfil1 = new JLabel();
		perfil1.setIcon(new ImageIcon("image/perfil.png"));
		perfil1.setBounds(70,35,100,100);
		add(perfil1);

		label1 = new JLabel("Gustavo Robles Portillo");
		label1.setBounds(50,130,200,30);
		label1.setFont(new Font("Andale Mono",1,12));
		label1.setForeground(blanco);
		add(label1);

		label3 = new JLabel("visita mi github: ");
		label3.setBounds(70,150,250,30);
		label3.setFont(new Font("Andale Mono",1,12));
		label3.setForeground(blanco); 
		add(label3);

		label4 = new JLabel("https://github.com/Strexc");
		label4.setBounds(50,170,250,30);
		label4.setFont(new Font("Andale Mono",1,12));
		label4.setForeground(azul);
		add(label4);

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		menu1 = new JMenu("Opc");
		menu1.setFont(new Font("Andale Mono",1,14));
		menu1.setForeground(new Color(255,0,0));
		menubar.add(menu1);

		sm = new JMenuItem("Salir");
		sm.setFont(new Font("Andale Mono",1,14));
		sm.setForeground(new Color(255,0,0));
		sm.addActionListener(this);
		menu1.add(sm);



	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == sm)
		{
			//this.dispose();
			this.dispose();
		}
	}

	public static void main(String[] args) 
	{   
		Desarrollador des = new Desarrollador();
		des.setBounds(0,0,250,270);
		des.setVisible(true);
		des.setResizable(false);
		des.setLocationRelativeTo(null);
	}
} 