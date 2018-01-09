package utils;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

public class JFrameWindow extends javax.swing.JFrame implements ActionListener{
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

	public JFrameWindow() {
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

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
		btnGuardar.setBounds(470, 437, 89, 23);
		getContentPane().add(btnGuardar);
		btnGuardar.setActionCommand("guardar");
		btnGuardar.addActionListener(this);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(776, 437, 108, 23);
		getContentPane().add(btnCancelar);
		btnCancelar.setActionCommand("cancelar");
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
			java.util.logging.Logger.getLogger(JFrameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(JFrameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(JFrameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(JFrameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrameWindow().setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
		if(accion.equals("abrir"))
		{
			String aux="";   
			String texto="";
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
					jtfPathOA.setText(archivoSeleccionado.getAbsolutePath().replace('\\', '/'));
					cargarHTMLFile("file:///"+archivoSeleccionado.getAbsolutePath().replace('\\', '/'));
					File metadatos=new File(archivoSeleccionado.getParent()+"/index.sgoa");
					FileReader f = new FileReader(metadatos);
			        BufferedReader b = new BufferedReader(f);
			        jtfNombreOA.setText(b.readLine());
			        jtaDescripcion.setText(b.readLine());
			        jtfAutor.setText(b.readLine());
			        jtfInstitucion.setText(b.readLine());
			        jtfFechaDeCreacion.setText(b.readLine());
			        jtaPalabrasClave.setText(b.readLine());
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
			System.out.println("guardar");
		}
		
		if(accion.equals("cancelar"))
		{
			System.out.println("cancelar");
		}

	}
}
