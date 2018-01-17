package utils;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Point;

import org.apache.commons.io.FileUtils;

import db.operacionesSobreDB;

import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class GuiBuscar extends javax.swing.JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private javax.swing.JPanel jPanel1;
	private JTextField jtfCampo;
	private JButton jbtnBuscar;
	private JTextField jtfNombreOA;
	private JTextField jtfAutor;
	private JTextField jtfInstitucion;
	private JTextField jtfFechaDeCreacion;
	private JButton btnActualizar,btnCancelar;
	private JTextArea jtaDescripcion,jtaPalabrasClave;
	private operacionesSobreDB opDB=new operacionesSobreDB();
	private JTextField jtfPath;
	private JTable jtblObjetos;
	private DefaultTableModel modelo;
	private JRadioButton rdbtnPalabraClave,rdbtnAutor,rdbtnAnio;
	private JRadioButton rdbtnDescripcion;
	private JRadioButton rdbtnNombre;
	private JButton btnEliminar,jbtnHabilitarEdicion ;
	private ButtonGroup grupoBotones;
	private JTextField jtfID;
	private operacionesSobreGUI opGUI=new operacionesSobreGUI();

	public GuiBuscar() {
		setResizable(false);
		initComponents();
		/*SwingBrowser browser = new SwingBrowser();
		browser.loadURL("file:///C:/wamp/www/shadowplay_1/index.html");
		browser.setBounds(1, 1, jPanel1.getWidth() - 1, jPanel1.getHeight() - 1);
		jPanel1.add(browser);*/
	}

	public void cargarHTMLFile(String strUrl){
		jPanel1.removeAll();
		SwingBrowser browser = new SwingBrowser();
		browser.loadURL(strUrl);
		browser.setBounds(1, 1, jPanel1.getWidth() - 1, jPanel1.getHeight() - 1);
		jPanel1.add(browser);
	}


	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBounds(10, 11, 450, 649);

		//setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("B\u00FAsqueda y edicion");
		setPreferredSize(new Dimension(900, 700));
		getContentPane().setLayout(null);

		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 676, Short.MAX_VALUE)
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 474, Short.MAX_VALUE)
				);
		getContentPane().add(jPanel1);

		jtfCampo = new JTextField();
		jtfCampo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfCampo.setBounds(470, 63, 296, 23);
		getContentPane().add(jtfCampo);
		jtfCampo.setColumns(10);

		jbtnBuscar = new JButton("BUSCAR");
		jbtnBuscar.setBounds(776, 61, 108, 23);
		jbtnBuscar.setActionCommand("buscar");
		jbtnBuscar.addActionListener(this);
		getContentPane().add(jbtnBuscar);

		JLabel lblNombreoa = new JLabel("NombreOA:");
		lblNombreoa.setBounds(470, 352, 71, 14);
		getContentPane().add(lblNombreoa);

		JLabel lblDescripcin = new JLabel("Descripci\u00F3n: ");
		lblDescripcin.setBounds(470, 374, 91, 14);
		getContentPane().add(lblDescripcin);

		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(470, 449, 46, 14);
		getContentPane().add(lblAutor);

		JLabel lblInstitucin = new JLabel("Instituci\u00F3n:");
		lblInstitucin.setBounds(470, 477, 71, 14);
		getContentPane().add(lblInstitucin);

		JLabel lblFechaDeCreacin = new JLabel("Fecha de creaci\u00F3n:");
		lblFechaDeCreacin.setBounds(470, 502, 108, 14);
		getContentPane().add(lblFechaDeCreacin);

		JLabel lblPalabrasClave = new JLabel("Palabras claves:");
		lblPalabrasClave.setBounds(470, 530, 91, 14);
		getContentPane().add(lblPalabrasClave);

		jtfNombreOA = new JTextField();
		jtfNombreOA.setEditable(false);
		jtfNombreOA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfNombreOA.setBounds(559, 349, 325, 20);
		getContentPane().add(jtfNombreOA);
		jtfNombreOA.setColumns(10);

		jtfAutor = new JTextField();
		jtfAutor.setEditable(false);
		jtfAutor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfAutor.setBounds(559, 446, 325, 20);
		getContentPane().add(jtfAutor);
		jtfAutor.setColumns(10);

		jtaDescripcion = new JTextArea();
		jtaDescripcion.setEditable(false);
		jtaDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtaDescripcion.setBounds(559, 377, 325, 61);
		getContentPane().add(jtaDescripcion);

		jtfInstitucion = new JTextField();
		jtfInstitucion.setEditable(false);
		jtfInstitucion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfInstitucion.setBounds(559, 474, 325, 20);
		getContentPane().add(jtfInstitucion);
		jtfInstitucion.setColumns(10);

		jtfFechaDeCreacion = new JTextField();
		jtfFechaDeCreacion.setEditable(false);
		jtfFechaDeCreacion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfFechaDeCreacion.setBounds(578, 499, 219, 20);
		getContentPane().add(jtfFechaDeCreacion);
		jtfFechaDeCreacion.setColumns(10);

		jtaPalabrasClave = new JTextArea();
		jtaPalabrasClave.setEditable(false);
		jtaPalabrasClave.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtaPalabrasClave.setBounds(571, 529, 313, 97);
		getContentPane().add(jtaPalabrasClave);

		btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(470, 637, 108, 23);
		getContentPane().add(btnActualizar);
		btnActualizar.setActionCommand("guardar");
		btnActualizar.addActionListener(this);

		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(776, 637, 108, 23);
		getContentPane().add(btnCancelar);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.addActionListener(this);

		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(648, 637, 89, 23);
		getContentPane().add(btnEliminar);
		btnEliminar.setActionCommand("eliminar");
		btnEliminar.addActionListener(this);



		jbtnHabilitarEdicion = new JButton("<html><p>Habilitar</p><p>Edici\u00F3n</p></html>");
		jbtnHabilitarEdicion.setBounds(470, 565, 89, 61);
		getContentPane().add(jbtnHabilitarEdicion);
		jbtnHabilitarEdicion.setActionCommand("habilitar");
		jbtnHabilitarEdicion.addActionListener(this);

		jtfPath = new JTextField();
		jtfPath.setVisible(false);
		jtfPath.setBounds(470, 399, 52, 14);
		getContentPane().add(jtfPath);
		jtfPath.setColumns(10);

		jtblObjetos = new JTable();
		//jtblObjetos.setBounds(470, 94, 414, 247);
		//getContentPane().add(jtblObjetos);
		//---------------------------------------------
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

		//escuchador

		jtblObjetos.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e)
			{
				JTable table =(JTable) e.getSource();
				Point point =e.getPoint();
				int row = table.rowAtPoint(point);//row devolvera -1 si se ha clicado fuera de la fila pero dentro de la tabla, si no devolvera el indice de la fila en la que se ha clicado. 
				if (e.getClickCount() == 2) 
				{
					jtfID.setText(jtblObjetos.getValueAt(row, 0).toString());
					jtfNombreOA.setText(jtblObjetos.getValueAt(row, 1).toString());
					jtaDescripcion.setText(jtblObjetos.getValueAt(row, 2).toString());
					jtfAutor.setText(jtblObjetos.getValueAt(row, 3).toString());
					jtfInstitucion.setText(jtblObjetos.getValueAt(row, 4).toString());
					jtfFechaDeCreacion.setText(jtblObjetos.getValueAt(row, 5).toString());
					jtaPalabrasClave.setText(jtblObjetos.getValueAt(row, 6).toString());
					jtfPath.setText(jtblObjetos.getValueAt(row, 7).toString());
					cargarHTMLFile("file:///"+jtblObjetos.getValueAt(row, 7).toString()+"index.html");
					//System.out.println(jtblObjetos.getValueAt(row, 7).toString());
				}
			}
		});
		JScrollPane scroll= new JScrollPane(jtblObjetos);
		scroll.setBounds(470, 94, 414, 247);
		getContentPane().add(scroll);


		//---------------------------------------------
		JPanel jpnlCriterioBusqueda = new JPanel();
		jpnlCriterioBusqueda.setBounds(470, 11, 414, 41);
		getContentPane().add(jpnlCriterioBusqueda);
		jpnlCriterioBusqueda.setLayout(null);

		rdbtnAutor = new JRadioButton("Autor");
		rdbtnAutor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnAutor.setBounds(6, 7, 61, 23);
		jpnlCriterioBusqueda.add(rdbtnAutor);

		rdbtnAnio = new JRadioButton("A\u00F1o");
		rdbtnAnio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnAnio.setBounds(69, 7, 45, 23);
		jpnlCriterioBusqueda.add(rdbtnAnio);

		rdbtnPalabraClave = new JRadioButton("Palabra Clave");
		rdbtnPalabraClave.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnPalabraClave.setBounds(126, 7, 99, 23);
		jpnlCriterioBusqueda.add(rdbtnPalabraClave);

		rdbtnDescripcion = new JRadioButton("Descripci\u00F3n");
		rdbtnDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnDescripcion.setBounds(240, 7, 86, 23);
		jpnlCriterioBusqueda.add(rdbtnDescripcion);

		rdbtnNombre = new JRadioButton("Nombre");
		rdbtnNombre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnNombre.setBounds(339, 7, 75, 23);
		jpnlCriterioBusqueda.add(rdbtnNombre);

		grupoBotones=new ButtonGroup();
		grupoBotones.add(rdbtnAutor);
		grupoBotones.add(rdbtnAnio);
		grupoBotones.add(rdbtnPalabraClave);
		grupoBotones.add(rdbtnDescripcion);
		grupoBotones.add(rdbtnNombre);

		jtfID = new JTextField();
		jtfID.setBounds(470, 430, 52, 14);
		getContentPane().add(jtfID);
		jtfID.setColumns(10);
		jtfID.setVisible(false);
		pack();
	}// </editor-fold>//GEN-END:initComponents
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GuiBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GuiBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GuiBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GuiBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				//new GuiImportarYCatalogar2().setVisible(true);
				GuiBuscar app=new GuiBuscar();
				app.setVisible(true);
				app.llenarJtable("select * from objeto_de_aprendizaje");

			}
		});
	}

	public void llenarJtable(String query)
	{
		opDB.llenarJtable(jtblObjetos, modelo, query);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
		if(accion.equals("abrir"))
		{
			try
			{
				/**llamamos el metodo que permite cargar la ventana*/
				JFileChooser selector=new JFileChooser();
				selector.addChoosableFileFilter(new FileNameExtensionFilter("Archivos HTML", "html"));
				selector.showOpenDialog(this);

				/**abrimos el archivo seleccionado*/
				File archivoSeleccionado=selector.getSelectedFile();
				if(archivoSeleccionado!=null)
				{
					String directorioArchivoSeleccionado=archivoSeleccionado.getParent();
					jtfCampo.setText(archivoSeleccionado.getAbsolutePath().replace('\\', '/'));
					cargarHTMLFile("file:///"+archivoSeleccionado.getAbsolutePath().replace('\\', '/'));
					File metadatos=new File(directorioArchivoSeleccionado+"/index.sgoa");

					FileReader f = new FileReader(metadatos);
					BufferedReader b = new BufferedReader(f);
					jtfNombreOA.setText(b.readLine());
					jtaDescripcion.setText(b.readLine());
					jtfAutor.setText(b.readLine());
					jtfInstitucion.setText(b.readLine());
					jtfFechaDeCreacion.setText(b.readLine());
					jtaPalabrasClave.setText(b.readLine());
					//copia de directorios
					FileUtils.copyDirectoryToDirectory(new File(archivoSeleccionado.getParent()), new File(System.getProperty("user.dir")+"/temp"));
					jtfPath.setText(System.getProperty("user.dir").replace('\\','/')+"/temp/"+directorioArchivoSeleccionado.substring(directorioArchivoSeleccionado.lastIndexOf('\\')+1,directorioArchivoSeleccionado.length())+"/");
					b.close();
				}    
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null,ex+"" +
						"\nNo se ha encontrado el archivo",
						"ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
			}
		}

		if(accion.equals("guardar"))
		{
			String error="";
			if(jtfNombreOA.getText().length()==0 || jtfNombreOA.getText().length()>45)
			{
				error+="No se ha ingresado el nombre del objeto o si se ha ingresado es demasido largo. \n";
			}

			if(jtaDescripcion.getText().length()==0 || jtaDescripcion.getText().length()>150)
			{
				error+="No se ha ingresado la descripcion del OA o si se ha ingresado es demasiado larga. \n ";
			}

			if(jtfAutor.getText().length()==0 || jtfAutor.getText().length()>45)
			{
				error+="No se ha ingresado el autor o si se ha ingresado es demasiado largo. \n";
			}

			if(jtfInstitucion.getText().length()==0 || jtfInstitucion.getText().length()>45)
			{
				error+="No se ha ingresado la institucion o si se ha ingresado es demasiado largo. \n";
			}

			if(jtfFechaDeCreacion.getText().length()==0 || jtfFechaDeCreacion.getText().length()>45 )
			{
				error+="No se ha ingresado la fecha de creación o si se ingreso no esta en el formato adecuado. \n";
			}

			if(jtaPalabrasClave.getText().length()==0 || jtaPalabrasClave.getText().length()>150)
			{
				error+="No se ha ingresado las palabras claves o si se han ingresado estas superan el tamaño eprmitido";
			}
			if(jtfPath.getText().length()==0)
			{
				error+="Error inesperado en la ejecucion. \n";
			}

			if(error.length()==0)
			{
				if(opDB.actualizarDatosDB("objeto_de_aprendizaje", opDB.obtnerColumNames("objeto_de_aprendizaje"),
						new String[]{jtfNombreOA.getText(), jtaDescripcion.getText(),
								jtfAutor.getText(), jtfInstitucion.getText(), 
								jtfFechaDeCreacion.getText(), jtaPalabrasClave.getText(), 
								jtfPath.getText()
				},jtfID.getText()))
				{
					JOptionPane.showMessageDialog(this, "Registro actualizado exitosamente!!");
					jtfAutor.setText("");
					jtfFechaDeCreacion.setText("");
					jtfInstitucion.setText("");
					jtfNombreOA.setText("");
					jtfPath.setText("");
					jtfCampo.setText("");
					jtaDescripcion.setText("");
					jtaPalabrasClave.setText("");
					jtfID.setText("");
					opGUI.reiniciarJTable(modelo);
					llenarJtable("select * from objeto_de_aprendizaje");

				}
				else
				{
					JOptionPane.showMessageDialog(this, "Algo salio mal vuelva a intentarlo mas tarde");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, error, "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
			}
		}

		if(accion.equals("cancelar"))
		{
			this.setVisible(false);
		}

		if(accion.equals("buscar"))
		{
			//System.out.println("buscar");
			if(!rdbtnAnio.isSelected() && !rdbtnAutor.isSelected() && !rdbtnDescripcion.isSelected() 
					&& ! rdbtnNombre.isSelected() && !rdbtnPalabraClave.isSelected())
			{
				JOptionPane.showMessageDialog(this, "No se ha seleccionado criterio de busqueda","EROR", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				if(rdbtnAnio.isSelected())
				{
					opGUI.reiniciarJTable(modelo);
					llenarJtable("select * from objeto_de_aprendizaje where fecha_creacionOA like \"%"+jtfCampo.getText()+"%\"");
					jtfCampo.setText("");
				}

				if(rdbtnAutor.isSelected())
				{
					opGUI.reiniciarJTable(modelo);
					llenarJtable("select * from objeto_de_aprendizaje where autorOA like \"%"+jtfCampo.getText()+"%\"");
					jtfCampo.setText("");
				}

				if(rdbtnDescripcion.isSelected())
				{
					opGUI.reiniciarJTable(modelo);
					llenarJtable("select * from objeto_de_aprendizaje where descripcionOA like \"%"+jtfCampo.getText()+"%\"");
					jtfCampo.setText("");
				}

				if(rdbtnNombre.isSelected())
				{
					opGUI.reiniciarJTable(modelo);
					llenarJtable("select * from objeto_de_aprendizaje where nombreOA like \"%"+jtfCampo.getText()+"%\"");
					jtfCampo.setText("");
				}

				if(rdbtnPalabraClave.isSelected())
				{
					opGUI.reiniciarJTable(modelo);
					llenarJtable("select * from objeto_de_aprendizaje where palabras_clavesOA like \"%"+jtfCampo.getText()+"%\"");
					jtfCampo.setText("");
				}

			}
		}


		if(accion.equals("habilitar"))
		{
			jtfAutor.setEditable(true);
			jtfFechaDeCreacion.setEditable(true);
			jtfInstitucion.setEditable(true);
			jtfNombreOA.setEditable(true);
			jtfPath.setEditable(true);
			jtfCampo.setEditable(true);
			jtaDescripcion.setEditable(true);
			jtaPalabrasClave.setEditable(true);
			jtfID.setEditable(true);
			opGUI.reiniciarJTable(modelo);
			//llenarJtable("select * from objeto_de_aprendizaje");
		}

		if(accion.equals("eliminar"))
		{
			if(jtfID.getText().length()>0)
			{
				if(JOptionPane.showConfirmDialog(this, "Realmente desea eliminar el objeto seleccionado?")==0)
				{
					if(opDB.elimarDatosTabla("objeto_de_aprendizaje", "idOA", jtfID.getText()))
					{
						JOptionPane.showMessageDialog(this, "Objeto eliminado correctamente");
						opGUI.reiniciarJTable(modelo);
						llenarJtable("select * from objeto_de_aprendizaje");
							
					}
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "nO SE HA SELECCIONADO NINGUN OBJETO AUN", "ERROR", JOptionPane.ERROR_MESSAGE);
			}

		}



	}
}
