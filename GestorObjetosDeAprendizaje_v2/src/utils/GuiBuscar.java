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

	