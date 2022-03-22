import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Terminos extends JFrame implements ActionListener,ChangeListener
{
	private JCheckBox check1;
	private JButton boton1,boton2;
	private JLabel label1,logo1,nombre;
	private JTextArea textarea1;
	private JScrollPane scrollp1;
	String name1 = "";
	private String text1 = 

	" LICENCIA \n\n"+
	" Coca-Cola Company a traves de su sitio web concede una licencia para que los usuarios utilicen \n"+
    " los productos que son vendidos en este sitio web de acuerdo a los Terminos y Condiciones que se \n"+
    " describen en este documento.\n\n"+
    " USO NO AUTORIZADO \n\n"+
    " En caso de que aplique (para venta de software, templetes, u otro producto de disenio y programacion) \n"+
    " usted no puede colocar uno de nuestros productos, modificado o sin modificar, en un CD, sitio web o ningun \n"+
    " otro medio y ofrecerlos para la redistribucion o la reventa de ningun tipo \n\n"+
    " PROPIEDAD \n\n"+
    " Usted no puede declarar propiedad intelectual o exclusiva a ninguno de nuestros productos, modificado o sin modificar. \n"+
    " Todos los productos son propiedad  de los proveedores del contenido. En caso de que no se especifique lo contrario, nuestros \n"+
    " productos se proporcionan  sin ningun tipo de garantia, expresa o implicita. En ningún esta compania será  responsables de ningun \n"+
    " daño incluyendo, pero no limitado a, daños directos, indirectos, especiales, fortuitos o consecuentes u otras pérdidas resultantes del \n"+
    " uso o de la imposibilidad de utilizar nuestros productos ";


	public Terminos()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		//getContentPane().setBackground(new Color(190,189,191));//color rogo dentro de la interfaz
		setIconImage(new ImageIcon(getClass().getResource("image/icon.png")).getImage());//icono en la parte superior de la ventana
        
        //recuperar el valor de otro archivo Java
        Bienvenida getName = new Bienvenida();
        name1 = getName.nombre1;

		//informacion dentro de la ventana.
		label1 = new JLabel("Terminos y Condiciones de Uso");
		label1.setBounds(170,10,300,30);
		label1.setFont(new Font("Andale Mono",3,18));
		label1.setForeground(new Color(0,0,0));
		add(label1);

		textarea1 = new JTextArea(text1);
		scrollp1 = new JScrollPane(textarea1);//agrega un scroll para subir y bajar, derecha y izq.
		scrollp1.setBounds(45,40,500,200);
		textarea1.setEditable(false);
		//textarea1.setEnabled(false);//lo desabilita
		add(scrollp1);

		check1 = new JCheckBox("Yo "+name1+" Acepto los terminos");
		check1.setBounds(45,250,250,30);
		check1.setFont(new Font("Andale Mono",3,12));
		check1.addChangeListener(this);
    	add(check1);

    	nombre = new JLabel("Yo "+name1+" ");//cambiar por la variable nombre
    	nombre.setBounds(45,250,100,30);
    	nombre.setFont(new Font("Andale Mono",3,14));
		nombre.setForeground(new Color(255,255,255));
		//add(nombre);


    	boton1 = new JButton("Continuar");
    	boton1.setBounds(45,290,125,30);
    	//boton1.setBackground(new Color(224,224,224));
		boton1.setFont(new Font("Andale Mono",1,14));
		//boton1.setForeground(new Color(255,0,0));
    	add(boton1);
    	boton1.addActionListener(this);
    	boton1.setEnabled(false);

    	boton2 = new JButton("No acepto");
    	boton2.setBounds(175,290,125,30);
    	//boton2.setBackground(new Color(224,224,224));
		boton2.setFont(new Font("Andale Mono",1,14));
		//boton2.setForeground(new Color(255,0,0));
    	add(boton2);
    	boton2.addActionListener(this);
    	boton2.setEnabled(true);

    	logo1 = new JLabel("");
    	logo1.setIcon(new ImageIcon("image/coca-cola.png"));
    	logo1.setBounds(300,240,300,100);
    	add(logo1);

	}

	public void stateChanged(ChangeEvent e)
	{
		if(check1.isSelected() == true)
		{
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		}
		else
		{
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == boton1)
		{
			Principal principal = new Principal();
         	principal.setBounds(0,0,650,550);
	    	principal.setVisible(true);
	        principal.setResizable(false);
	        principal.setLocationRelativeTo(null);	
	        this.setVisible(false);//esto cierra la ventana principal
		}
		if(e.getSource() == boton2)
		{
			System.exit(0);
		}
	}

	public static void main(String[] args) 
	{
		Terminos form1 = new Terminos();
    	form1.setBounds(0,0,600,400);/*0 es igual a todo al izquierda
          , 0 lo mas alto de la pantalla,ancho en px y alto en px*/
		form1.setVisible(true);//hace visible o no la ventana
	    form1.setResizable(false);//esta linea de codigo hace que la venta se coloque al centro de la pantalla
	    form1.setLocationRelativeTo(null);	/*Esta linea setResizable permito o no, que el usuario cambie el tamaño de la pantalla*/
	}
}