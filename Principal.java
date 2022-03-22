import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class Principal extends JFrame implements ActionListener,ChangeListener
{

	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,logo1;
	private JTextField textf1,textf2,textf3;
	private JTextArea textarea1;
	private JScrollPane scrollp1;
	private JMenuBar menubar;
	private JMenu menu1,menu2,menu3,smenu4;
	private JMenuItem m2,m3,m4,m5,sm1,sm2,sm3;
	private JComboBox comb1,comb2;
	String nombreT = "";
	private String texto1 = "\n\n"+
	"        Aquí aparece el resultado del cálculo de tus vacaciones.\n";

	Desarrollador des = new Desarrollador();
	public Principal()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pagina Principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("image/icon.png")).getImage());

		//traer datos de otros archivos
		Bienvenida getName = new Bienvenida();
		nombreT = getName.nombre1;

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		menu1 = new JMenu("Opciones");
//		menu1.setBackground(new Color(0,0,0));
		menu1.setFont(new Font("Andale Mono",1,14));
		menu1.setForeground(new Color(255,0,0));
		menubar.add(menu1);

		menu2 = new JMenu("Calcular");
		//menu2.setBackground(new Color(255,0,0));
		menu2.setFont(new Font("Andale Mono",1,14));
		menu2.setForeground(new Color(255,0,0));
		menubar.add(menu2);

		menu3 = new JMenu("Acerca de");
		//menu3.setBackground(new Color(255,0,0));
		menu3.setFont(new Font("Andale Mono",1,14));
		menu3.setForeground(new Color(255,0,0));
		menubar.add(menu3);

		smenu4 = new JMenu("Color de Fondo");//subMenu
		//smenu4.setBackground(new Color(255,0,0));
		smenu4.setFont(new Font("Andale Mono",1,14));
		smenu4.setForeground(new Color(255,0,0));
		smenu4.addActionListener(this);
		menu1.add(smenu4);

		m2 = new JMenuItem("Nuevo");
		//m2.setBackground(new Color(0,0,0));
		m2.setFont(new Font("Andale Mono",1,14));
		m2.setForeground(new Color(255,0,0));
		m2.addActionListener(this);
		menu1.add(m2);

		m3 = new JMenuItem("Salir");
		//m3.setBackground(new Color(0,0,0));
		m3.setFont(new Font("Andale Mono",1,14));
		m3.setForeground(new Color(255,0,0));
		m3.addActionListener(this);
		menu1.add(m3);

		m4 = new JMenuItem("Vacaciones");
		//m4.setBackground(new Color(0,0,0));
		m4.setFont(new Font("Andale Mono",1,14));
		m4.setForeground(new Color(255,0,0));
		m4.addActionListener(this);
		menu2.add(m4);

		m5 = new JMenuItem("El creador");
		//m5.setBackground(new Color(0,0,0));
		m5.setFont(new Font("Andale Mono",1,14));
		m5.setForeground(new Color(255,0,0));
		m5.addActionListener(this);
		menu3.add(m5);

		sm1 = new JMenuItem("ROJO");
		//sm1.setBackground(new Color(0,0,0));
		sm1.setFont(new Font("Andale Mono",1,14));
		sm1.setForeground(new Color(255,0,0));
		sm1.addActionListener(this);
		smenu4.add(sm1);

		sm2 = new JMenuItem("GRIS");
		//sm2.setBackground(new Color(255,0,0));
		sm2.setFont(new Font("Andale Mono",1,14));
		sm2.setForeground(new Color(255,0,0));
		sm2.addActionListener(this);
		smenu4.add(sm2);

		sm3 = new JMenuItem("NEGRO");
		//sm3.setBackground(new Color(0,0,0));
		sm3.setFont(new Font("Andale Mono",1,14));
		sm3.setForeground(new Color(255,0,0));
		sm3.addActionListener(this);
		smenu4.add(sm3);

		logo1 = new JLabel();
		logo1.setIcon(new ImageIcon("image/logo-coca.png"));
		logo1.setBounds(10,10,300,150);
		add(logo1);

		label1 = new JLabel("Bienvenido");
		label1.setBounds(290,10,200,150);
//		label1.setBackground(new Color(0,0,0));
		label1.setFont(new Font("Andale Mono",1,30));
		label1.setForeground(new Color(255,255,255));
		add(label1);

		label2 = new JLabel(nombreT);
		label2.setBounds(460,10,200,150);
		label2.setFont(new Font("Andale Mono",1,30));
		label2.setForeground(new Color(255,255,255));
		add(label2);

		label3 = new JLabel("Datos del trabajador para calcular sus dias de vacaciones");
		label3.setBounds(105,120,500,100);
		label3.setFont(new Font("Andale Mono",1,15));
		label3.setForeground(new Color(255,255,255));
		add(label3);

		label4 = new JLabel("Nombre Completo");
		label4.setBounds(40,200,300,30);
		label4.setFont(new Font("Andale Mono",1,13));
		label4.setForeground(new Color(255,255,255));
		add(label4);

	    label5 = new JLabel("Selecciona el Departamento");
		label5.setBounds(220,200,300,30);
		label5.setFont(new Font("Andale Mono",1,13));
		label5.setForeground(new Color(255,255,255));
		add(label5);

		textf1 = new JTextField();
		textf1.setBounds(40,230,130,25);
		textf1.setFont(new Font("Andale Mono",1,13));
		textf1.setForeground(new Color(255,0,0));
		add(textf1);

		comb1 = new JComboBox();
		//(der-izq,abj-arri,largo,ancho)
		comb1.setBounds(220,230,250,30);
		comb1.addItem("");
		comb1.addItem("Atencion a Clientes");
		comb1.addItem("Departamento de Logistica");
		comb1.addItem("Departamento de Gerencia");
		add(comb1);

		label6 = new JLabel("Apellido Paterno");
		label6.setBounds(40,270,300,30);
		label6.setFont(new Font("Andale Mono",1,13));
		label6.setForeground(new Color(255,255,255));
		add(label6);

		label7 = new JLabel("Selecciona la antiguedad");
		label7.setBounds(220,270,300,30);
		label7.setFont(new Font("Andale Mono",1,13));
		label7.setForeground(new Color(255,255,255));
		add(label7);

		textf2 = new JTextField();
		textf2.setBounds(40,300,130,30);
		textf2.setFont(new Font("Andale Mono",1,13));
		textf2.setForeground(new Color(255,0,0));
		add(textf2);

        comb2 = new JComboBox();
		//(der-izq,abj-arri,largo,ancho)
		comb2.setBounds(220,300,250,30);
		comb2.addItem("");
		comb2.addItem("1 año de servicio");
		comb2.addItem("2 a 6 años de servicio");
		comb2.addItem("7 años o mas de servicio");
		add(comb2);

		label8 = new JLabel("Apellido Materno");
		label8.setBounds(40,340,300,30);
		label8.setFont(new Font("Andale Mono",1,13));
		label8.setForeground(new Color(255,255,255));
		add(label8);

		label9 = new JLabel("Resultado del calculo: ");
		label9.setBounds(220,340,300,30);
		label9.setFont(new Font("Andale Mono",1,13));
		label9.setForeground(new Color(255,255,255));
		add(label9);

		textf3 = new JTextField();
		textf3.setBounds(40,370,130,30);
		textf3.setFont(new Font("Andale Mono",1,13));
		textf3.setForeground(new Color(255,0,0));
		add(textf3);

		textarea1 = new JTextArea(texto1);
		textarea1.setFont(new Font("Andale Mono",1,11));
		textarea1.setForeground(new Color(255,0,0));
		scrollp1 = new JScrollPane(textarea1);
		scrollp1.setBounds(220,370,380,80);
		textarea1.setEditable(false);
		add(scrollp1);

		label10 = new JLabel("©2021 The Coca-Cola Company | Todos los derechos reservados");
		label10.setBounds(120,460,500,30);
		label10.setFont(new Font("Andale Mono",1,11));
		label10.setForeground(new Color(255,255,255));
		add(label10);

	}

	public void stateChanged(ChangeEvent e)
	{

	}
	public void actionPerformed(ActionEvent e)
	{
		Container fondo = this.getContentPane();

		if(e.getSource() == sm1)
		{   //rojo
			fondo.setBackground(new Color(255,0,0));
		}
		if(e.getSource() == sm2)
		{   //rojo
			fondo.setBackground(new Color(155,155,155));
		}
	    if(e.getSource() == sm3)
		{   //rojo
			fondo.setBackground(new Color(0,0,0));
		}
		if(e.getSource() == m3)
		{
			Bienvenida bienvenido = new Bienvenida();
    	    bienvenido.setBounds(0,0,350,450);
		    bienvenido.setVisible(true);
	        bienvenido.setResizable(false);
	        bienvenido.setLocationRelativeTo(null);	
			this.setVisible(false);
			des.dispose();//cierra la venta que se abrio
		}
		//Vacaciones
		if(e.getSource() == m4)
		{
			String nc = textf1.getText().trim();//Metodo trim: elimina los espacios y guardarlo dentro de la variable
			String ap = textf2.getText().trim();
			String am = textf3.getText().trim();
			String depa = comb1.getSelectedItem().toString();//revisa que item esta seleccionado y lo convierte a string 
			String anti = comb2.getSelectedItem().toString();
			
			if(nc.equals("") || ap.equals("")|| am.equals("") || depa.equals("") || anti.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
			}
			else
			{
				if(depa == "Atencion a Clientes")
				{
					if(anti == "1 año de servicio")
					{
						texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 6 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
					if(anti == "2 a 6 años de servicio")
					{
						texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 14 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
					if(anti == "7 años o mas de servicio")
					{
						texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 20 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
				}
				if(depa == "Departamento de Logistica")
				{
					if(anti == "1 año de servicio")
					{
                        texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 7 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
					if(anti == "2 a 6 años de servicio")
					{
						texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 15 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
					if(anti == "7 años o mas de servicio")
					{
                        texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 22 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
				}
				if(depa == "Departamento de Gerencia")
				{
					if(anti == "1 año de servicio")
					{
                        texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 10 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
					if(anti == "2 a 6 años de servicio")
					{
						texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 20 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
					if(anti == "7 años o mas de servicio")
					{
						texto1 ="\n   El trabajador "+nc+" "+ap+" "+am+" \n"+
						"   quien labora en "+depa+" \n"+
						"   recibe 30 dias de vacaciones"; 
						textarea1.setText(texto1);
					}
				}
			}
		}
		//nuevo
		if(e.getSource() == m2)
		{
			texto1 = "\n\n"+
	        "        Aquí aparece el resultado del cálculo de tus vacaciones.\n";
			textf1.setText("");
			textf2.setText("");
			textf3.setText("");
			comb1.setSelectedIndex(0);
			comb2.setSelectedIndex(0);
			textarea1.setText(texto1);
		}
		//el creador
		if(e.getSource() == m5)
		{
		    des.setBounds(0,0,250,270);
		    des.setVisible(true);
		    des.setResizable(false);
		    des.setLocationRelativeTo(null);
		    /*JOptionPane.showMessageDialog(null,"Programa Programado y diseñado por Gustavo Robles Portillo");*/
		}
	}


	public static void main(String[] args) 
	{
		Principal principal = new Principal();
    	principal.setBounds(0,0,650,550);
		principal.setVisible(true);
	    principal.setResizable(false);
	    principal.setLocationRelativeTo(null);		
	}
}