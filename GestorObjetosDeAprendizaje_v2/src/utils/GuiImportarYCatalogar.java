package utils;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

import org.apache.commons.io.FileUtils;

import db.operacionesSobreDB;

public class GuiImportarYCatalogar extends javax.swing.JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private javax.swing.JPanel jPanel1;
	private JTextField jtfPathOA;
	private JButton jbtnAbrir;
	private JTextField jtfNombreOA;
	private JTextField jtfAutor;
	private JTextField jtfInstitucion;
	private JTextField jtfFechaDeCreacion;
	private JButton btnGuardar,btnCancelar;
	private JTextArea jtaDescripcion,jtaPalabrasClave;
	private operacionesSobreDB opDB=new operacionesSobreDB();
	private JTextField jtfPath;

	public GuiImportarYCatalogar() {
		setResizable(false);
		initComponents();
		/*SwingBrowser browser = new SwingBrowser();
		browser.loadURL("file:///C:/wamp/www/shadowplay_1/index.html");
		browser.setBounds(1, 1, jPanel1.getWidth() - 1, jPanel1.getHeight() - 1);
		jPanel1.add(browser);*/
	}

	public void cargarHTMLFile(String strUrl){
		//initComponents();
		SwingBrowser browser = new SwingBrowser();
		browser.loadURL(strUrl);
		browser.setBounds(1, 1, jPanel1.getWidth() - 1, jPanel1.getHeight() - 1);
		jPanel1.add(browser);
	}


	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBounds(10, 11, 450, 449);

		//setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Importar y catalogar");
		setPreferredSize(new Dimension(900, 500));
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

		jtfPathOA = new JTextField();
		jtfPathOA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfPathOA.setEditable(false);
		jtfPathOA.setBounds(470, 11, 296, 20);
		getContentPane().add(jtfPathOA);
		jtfPathOA.setColumns(10);

		jbtnAbrir = new JButton("ABRIR");
		jbtnAbrir.setBounds(776, 10, 108, 23);
		jbtnAbrir.setActionCommand("abrir");
		jbtnAbrir.addActionListener(this);
		getContentPane().add(jbtnAbrir);
		
		JLabel lblNombreoa = new JLabel("NombreOA:");
		lblNombreoa.setBounds(470, 45, 71, 14);
		getContentPane().add(lblNombreoa);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n: ");
		lblDescripcin.setBounds(470, 67, 91, 14);
		getContentPane().add(lblDescripcin);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(470, 203, 46, 14);
		getContentPane().add(lblAutor);
		
		JLabel lblInstitucin = new JLabel("Instituci\u00F3n:");
		lblInstitucin.setBounds(470, 231, 71, 14);
		getContentPane().add(lblInstitucin);
		
		JLabel lblFechaDeCreacin = new JLabel("Fecha de creaci\u00F3n:");
		lblFechaDeCreacin.setBounds(470, 256, 108, 14);
		getContentPane().add(lblFechaDeCreacin);
		
		JLabel lblPalabrasClave = new JLabel("Palabras claves:");
		lblPalabrasClave.setBounds(470, 292, 91, 14);
		getContentPane().add(lblPalabrasClave);
		
		jtfNombreOA = new JTextField();
		jtfNombreOA.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfNombreOA.setBounds(559, 42, 325, 20);
		getContentPane().add(jtfNombreOA);
		jtfNombreOA.setColumns(10);
		
		jtfAutor = new JTextField();
		jtfAutor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfAutor.setBounds(559, 200, 325, 20);
		getContentPane().add(jtfAutor);
		jtfAutor.setColumns(10);
		
		jtaDescripcion = new JTextArea();
		jtaDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtaDescripcion.setBounds(559, 70, 325, 119);
		getContentPane().add(jtaDescripcion);
		
		jtfInstitucion = new JTextField();
		jtfInstitucion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfInstitucion.setBounds(559, 228, 325, 20);
		getContentPane().add(jtfInstitucion);
		jtfInstitucion.setColumns(10);
		
		jtfFechaDeCreacion = new JTextField();
		jtfFechaDeCreacion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtfFechaDeCreacion.setBounds(578, 253, 219, 20);
		getContentPane().add(jtfFechaDeCreacion);
		jtfFechaDeCreacion.setColumns(10);
		
		jtaPalabrasClave = new JTextArea();
		jtaPalabrasClave.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jtaPalabrasClave.setBounds(571, 292, 313, 120);
		getContentPane().add(jtaPalabrasClave);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(470, 437, 108, 23);
		getContentPane().add(btnGuardar);
		btnGuardar.setActionCommand("guardar");
		btnGuardar.addActionListener(this);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(776, 437, 108, 23);
		getContentPane().add(btnCancelar);
		btnCancelar.setActionCommand("cancelar");
		
		jtfPath = new JTextField();
		jtfPath.setVisible(false);
		jtfPath.setBounds(470, 92, 32, 20);
		getContentPane().add(jtfPath);
		jtfPath.setColumns(10);
		btnCancelar.addActionListener(this);

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
			java.util.logging.Logger.getLogger(GuiImportarYCatalogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GuiImportarYCatalogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GuiImportarYCatalogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GuiImportarYCatalogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GuiImportarYCatalogar().setVisible(true);
			}
		});
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
					jtfPathOA.setText(archivoSeleccionado.getAbsolutePath().replace('\\', '/'));
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
				if(opDB.insertarDatosDB("objeto_de_aprendizaje", opDB.obtnerColumNames("objeto_de_aprendizaje"),
						new String[]{jtfNombreOA.getText(), jtaDescripcion.getText(),
								jtfAutor.getText(), jtfInstitucion.getText(), 
								jtfFechaDeCreacion.getText(), jtaPalabrasClave.getText(), 
								jtfPath.getText()
						}))
				{
					JOptionPane.showMessageDialog(this, "Registro ingresado exitosamente!!");
					jtfAutor.setText("");
					jtfFechaDeCreacion.setText("");
					jtfInstitucion.setText("");
					jtfNombreOA.setText("");
					jtfPath.setText("");
					jtfPathOA.setText("");
					jtaDescripcion.setText("");
					jtaPalabrasClave.setText("");
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

	}
}
