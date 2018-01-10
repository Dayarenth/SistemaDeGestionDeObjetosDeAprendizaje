package utils;

import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import db.operacionesSobreDB;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class GuiBuscar extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane,panel ;
	private JTextField jtfCampo;
	private JTable jtblObjetos;
	private DefaultTableModel modelo; 
	private operacionesSobreDB opDB = new operacionesSobreDB();
	private operacionesSobreGUI opGUI=new operacionesSobreGUI();
	private JButton btnCancelar,btnBuscar;

	public GuiBuscar() {
		initComponentes();
	}


	public void cargarHTML(String strUrl)
	{
		SwingBrowser browser = new SwingBrowser();
		browser.loadURL(strUrl);
		JScrollPane scroll=new JScrollPane(browser);
		scroll.setBounds(1, 1, panel.getWidth() - 1, panel.getHeight() - 1);
		panel.add(scroll);

	}

	public void llenarJtable(String query)
	{
		opDB.llenarJtable(jtblObjetos, modelo, query);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiBuscar frame = new GuiBuscar();
					frame.setVisible(true);
					//frame.cargarHTML("file:///C:/wamp/www/shadowplay_1/index.html");
					frame.llenarJtable("select * from objeto_de_aprendizaje");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void initComponentes() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPalabraClave = new JLabel("Palabra clave: ");
		lblPalabraClave.setBounds(10, 11, 97, 14);
		contentPane.add(lblPalabraClave);

		jtfCampo = new JTextField();
		jtfCampo.setBounds(106, 8, 169, 20);
		contentPane.add(jtfCampo);
		jtfCampo.setColumns(10);

		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(295, 7, 89, 23);
		contentPane.add(btnBuscar);
		btnBuscar.setActionCommand("buscar");
		btnBuscar.addActionListener(this);

		jtblObjetos = new JTable();
		jtblObjetos.setBounds(10, 43, 373, 386);
		modelo=new DefaultTableModel();
		modelo.addColumn("idOA");
		modelo.addColumn("nombre");
		modelo.addColumn("descripcion");
		modelo.addColumn("autor");
		modelo.addColumn("institucion");
		modelo.addColumn("fecha de creacion");
		modelo.addColumn("palabras clave");
		modelo.addColumn("path");
		jtblObjetos.setModel(modelo);
		//--------
		jtblObjetos.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e)
			{
				JTable table =(JTable) e.getSource();
				Point point =e.getPoint();
				int row = table.rowAtPoint(point);//row devolvera -1 si se ha clicado fuera de la fila pero dentro de la tabla, si no devolvera el indice de la fila en la que se ha clicado. 
				if (e.getClickCount() == 2) 
				{
					cargarHTML("file:///"+jtblObjetos.getValueAt(row, 7).toString()+"index.html");
					//System.out.println(jtblObjetos.getValueAt(row, 7).toString());
				}
			}
		});

		//--------
		JScrollPane scroll=new JScrollPane(jtblObjetos);
		scroll.setBounds(10, 43, 373, 355);
		contentPane.add(scroll);

		panel = new JPanel();
		panel.setBounds(394, 11, 477, 418);
		contentPane.add(panel);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(132, 409, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
		if(accion.equals("buscar"))
		{
			opGUI.reiniciarJTable(modelo);
			llenarJtable("select * from objeto_de_aprendizaje where palabras_clavesOA like \"%"+jtfCampo.getText()+"%\"");
			jtfCampo.setText("");
		}
		
		if(accion.equals("cancelar"))
		{
			this.setVisible(false);
		}
		
		

	}
}
