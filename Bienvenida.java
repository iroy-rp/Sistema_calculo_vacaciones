import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener
{

	private JLabel label1,label2,label3,logo1;
	private JButton boton1,boton2;
	private JTextField textF1;
	public static String nombre1 = "";

	public Bienvenida()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//con esto vamos a hacer que el programa no quede en segundo plano
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("image/icon.png")).getImage());

        // se colaca el logo dentro de la ventana
        logo1 = new JLabel();
        logo1.setIcon(new ImageIcon("image/logo-coca.png"));
        logo1.setBounds(10,10,300,150);
        add(logo1);

		label1 = new JLabel("Sistema de control Vacacional");
		label1.setBounds(50,130,250,30);
		label1.setFont(new Font("Andale Mono",3,16));
		label1.setForeground(new Color(255,255,255));
		add(label1);

		label2 = new JLabel("Ingrese su nombre: ");
		label2.setBounds(90,170,200,30);
		label2.setFont(new Font("Andale Mono",3,14));
		label2.setForeground(new Color(255,255,255));
		add(label2);

		textF1 = new JTextField();
		textF1.setBounds(60,200,200,30);
		textF1.setBackground(new Color(224,224,224));
		textF1.setFont(new Font("Andale Mono",1,14));
		textF1.setForeground(new Color(255,0,0));
		add(textF1);

		boton1 = new JButton("Ingresar");
    	boton1.setBounds(90,240,150,30);
    	boton1.setBackground(new Color(224,224,224));
		boton1.setFont(new Font("Andale Mono",1,14));
		boton1.setForeground(new Color(255,0,0));
    	add(boton1);
    	boton1.addActionListener(this);
    	//boton1.setEnabled(false);

    	boton2 = new JButton("Salir");
    	boton2.setBounds(90,280,150,30);
    	boton2.setBackground(new Color(224,224,224));
		boton2.setFont(new Font("Andale Mono",1,14));
		boton2.setForeground(new Color(255,0,0));
    	add(boton2);
    	boton2.addActionListener(this);
    	//boton2.setEnabled(true);

		label3 = new JLabel("2022 The Coca-Cola Company");
		label3.setBounds(80,350,200,30);
		label3.setFont(new Font("Andale Mono",3,12));
		label3.setForeground(new Color(255,255,255));
		add(label3);

	}

	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == boton1)
		{
			nombre1 = textF1.getText();
			int tam = nombre1.length();

			if(tam == 0)
			{
				JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");
			}
			else
			{
				Terminos term1 = new Terminos();
            	term1.setBounds(0,0,600,400);
	        	term1.setVisible(true);
	            term1.setResizable(false);
	            term1.setLocationRelativeTo(null);
	            this.setVisible(false);//esto cierra la ventana principal
			}
		}

		if(e.getSource() == boton2)
		{
			System.exit(0);
		}
	}

	public static void main(String[] args) 
	{
		Bienvenida bienvenido = new Bienvenida();
    	bienvenido.setBounds(0,0,350,450);
		bienvenido.setVisible(true);
	    bienvenido.setResizable(false);
	    bienvenido.setLocationRelativeTo(null);	
	}
}
