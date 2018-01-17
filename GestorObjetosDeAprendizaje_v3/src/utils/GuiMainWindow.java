package utils;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GuiMainWindow implements ActionListener{

	private JFrame jfVentanaPrincipal;
	private JMenuBar jmbMenuPrincipal;
	private JMenu jmCrear,jmRepositorioOA,jmGestionDeUsuarios;
	private JMenuItem jmiImportarYCatalogarOA,jmiBuscarOA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMainWindow window = new GuiMainWindow();
					window.jfVentanaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiMainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jfVentanaPrincipal = new JFrame();
		jfVentanaPrincipal.setTitle("SISTEMA DE GESTI\u00D3N DE OBJETOS DE APRENDIZAJE");
		jfVentanaPrincipal.setBounds(100, 100, 799, 484);
		jfVentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jmbMenuPrincipal = new JMenuBar();
		jfVentanaPrincipal.setJMenuBar(jmbMenuPrincipal);
		
		jmCrear = new JMenu("Crear OA");
		jmCrear.setEnabled(false);
		jmbMenuPrincipal.add(jmCrear);
		
		jmRepositorioOA = new JMenu("Repositorio OA");
		jmbMenuPrincipal.add(jmRepositorioOA);
		
		jmiImportarYCatalogarOA = new JMenuItem("Importar y catalogar OA");
		jmRepositorioOA.add(jmiImportarYCatalogarOA);
		jmiImportarYCatalogarOA.setActionCommand("importarYCatalogarOA");
		jmiImportarYCatalogarOA.addActionListener(this);
		
		jmiBuscarOA = new JMenuItem("Buscar OA");
		jmRepositorioOA.add(jmiBuscarOA);
		jmiBuscarOA.setActionCommand("buscarOA");
		jmiBuscarOA.addActionListener(this);
		
		jmGestionDeUsuarios = new JMenu("Gestion de Usuarios");
		jmGestionDeUsuarios.setEnabled(false);
		jmbMenuPrincipal.add(jmGestionDeUsuarios);
		jfVentanaPrincipal.getContentPane().setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action=e.getActionCommand();
		if(action.equals("importarYCatalogarOA"))
		{
			GuiImportarYCatalogar iyc =new GuiImportarYCatalogar();
			iyc.setVisible(true);
		}
		
		if(action.equals("buscarOA"))
		{
			GuiBuscar bus=new GuiBuscar();
			bus.setVisible(true);
		}
		
		
	}

}
