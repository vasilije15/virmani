package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import model.Uplatnica;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class DodajVirman extends JFrame {

	private JPanel contentPane;
	private JLabel lblNazivPlatioca;
	private JLabel lblSvrhaPlacanja;
	private JSeparator separator;
	private JTextField textFieldNazivPlatioca;
	private JTextField textFieldSvrhaPlacanja;
	private JLabel lblNazivPrimaoca;
	private JTextField textFieldNazivPrimaocaPlacanja;
	private JLabel lblTransakcioniRacunPlatioca;
	private JTextField textFieldTransakcioniRacunPlatioca;
	private JTextField textFieldPozivNaBrojZaduzenja;
	private JLabel lblPozivNaBrojZaduzenja;
	private JTextField textFieldModelGornji;
	private JLabel lblModelGornji;
	private JTextField textFieldModelDonji;
	private JLabel lblModelDonji;
	private JTextField textFieldPozivNaBrojOdobrenja;
	private JLabel lblPozivNaBrojOdobrenja;
	private JTextField textFieldIznos;
	private JLabel lblIznos;
	private JLabel lblEur;
	private JTextField textFieldSifraPlacanja;
	private JLabel lblSifraPlacanja;
	private JTextField textFieldTransakcioniRacunPrimaocaPlacanja;
	private JLabel lblTransakcioniRacunPrimaocaPlacanja;
	private JSeparator separator_1;
	private JButton btnDodaj;
	private JButton btnPonisti;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajVirman frame = new DodajVirman();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DodajVirman() {
		setResizable(false);
		setLocationRelativeTo(null);
		setForeground(Color.WHITE);
		setFont(new Font("Consolas", Font.BOLD, 14));
		setTitle("Dodaj Virman");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 570);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNazivPlatioca());
		contentPane.add(getLblSvrhaPlacanja());
		contentPane.add(getSeparator());
		contentPane.add(getTextFieldNazivPlatioca());
		contentPane.add(getTextFieldSvrhaPlacanja());
		contentPane.add(getLblNazivPrimaoca());
		contentPane.add(getTextFieldNazivPrimaocaPlacanja());
		contentPane.add(getLblTransakcioniRacunPlatioca());
		contentPane.add(getTextFieldTransakcioniRacunPlatioca());
		contentPane.add(getTextFieldPozivNaBrojZaduzenja());
		contentPane.add(getLblPozivNaBrojZaduzenja());
		contentPane.add(getTextFieldModelGornji());
		contentPane.add(getLblModelGornji());
		contentPane.add(getTextFieldModelDonji());
		contentPane.add(getLblModelDonji());
		contentPane.add(getTextFieldPozivNaBrojOdobrenja());
		contentPane.add(getLblPozivNaBrojOdobrenja());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblIznos());
		contentPane.add(getLblEur());
		contentPane.add(getTextFieldSifraPlacanja());
		contentPane.add(getLblSifraPlacanja());
		contentPane.add(getTextFieldTransakcioniRacunPrimaocaPlacanja());
		contentPane.add(getLblTransakcioniRacunPrimaocaPlacanja());
		contentPane.add(getSeparator_1());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnPonisti());
	}

	private JLabel getLblNazivPlatioca() {
		if (lblNazivPlatioca == null) {
			lblNazivPlatioca = new JLabel("Naziv platioca");
			lblNazivPlatioca.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblNazivPlatioca.setHorizontalAlignment(SwingConstants.CENTER);
			lblNazivPlatioca.setBounds(15, 158, 350, 30);
		}
		return lblNazivPlatioca;
	}

	private JLabel getLblSvrhaPlacanja() {
		if (lblSvrhaPlacanja == null) {
			lblSvrhaPlacanja = new JLabel("Svrha placanja");
			lblSvrhaPlacanja.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblSvrhaPlacanja.setHorizontalAlignment(SwingConstants.CENTER);
			lblSvrhaPlacanja.setBounds(15, 277, 350, 30);
		}
		return lblSvrhaPlacanja;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBackground(Color.BLACK);
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setForeground(Color.BLACK);
			separator.setBounds(380, 16, 10, 408);
		}
		return separator;
	}

	private JTextField getTextFieldNazivPlatioca() {
		if (textFieldNazivPlatioca == null) {
			textFieldNazivPlatioca = new JTextField();
			textFieldNazivPlatioca.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldNazivPlatioca.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldNazivPlatioca.setBounds(15, 106, 350, 45);
			textFieldNazivPlatioca.setColumns(10);
			textFieldNazivPlatioca.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldNazivPlatioca;
	}

	private JTextField getTextFieldSvrhaPlacanja() {
		if (textFieldSvrhaPlacanja == null) {
			textFieldSvrhaPlacanja = new JTextField();
			textFieldSvrhaPlacanja.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldSvrhaPlacanja.setColumns(10);
			textFieldSvrhaPlacanja.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldSvrhaPlacanja.setBounds(15, 225, 350, 45);
			textFieldSvrhaPlacanja.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldSvrhaPlacanja;
	}

	private JLabel getLblNazivPrimaoca() {
		if (lblNazivPrimaoca == null) {
			lblNazivPrimaoca = new JLabel("Naziv primaoca placanja");
			lblNazivPrimaoca.setHorizontalAlignment(SwingConstants.CENTER);
			lblNazivPrimaoca.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblNazivPrimaoca.setBounds(15, 394, 350, 30);
		}
		return lblNazivPrimaoca;
	}

	private JTextField getTextFieldNazivPrimaocaPlacanja() {
		if (textFieldNazivPrimaocaPlacanja == null) {
			textFieldNazivPrimaocaPlacanja = new JTextField();
			textFieldNazivPrimaocaPlacanja.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldNazivPrimaocaPlacanja.setColumns(10);
			textFieldNazivPrimaocaPlacanja.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldNazivPrimaocaPlacanja.setBounds(15, 347, 350, 45);
			textFieldNazivPrimaocaPlacanja.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldNazivPrimaocaPlacanja;
	}

	private JLabel getLblTransakcioniRacunPlatioca() {
		if (lblTransakcioniRacunPlatioca == null) {
			lblTransakcioniRacunPlatioca = new JLabel("Transakcioni racun platioca");
			lblTransakcioniRacunPlatioca.setHorizontalAlignment(SwingConstants.CENTER);
			lblTransakcioniRacunPlatioca.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblTransakcioniRacunPlatioca.setBounds(395, 58, 350, 30);
		}
		return lblTransakcioniRacunPlatioca;
	}

	private JTextField getTextFieldTransakcioniRacunPlatioca() {
		if (textFieldTransakcioniRacunPlatioca == null) {
			textFieldTransakcioniRacunPlatioca = new JTextField();
			textFieldTransakcioniRacunPlatioca.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldTransakcioniRacunPlatioca.setColumns(10);
			textFieldTransakcioniRacunPlatioca.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldTransakcioniRacunPlatioca.setBounds(395, 16, 350, 40);
			textFieldTransakcioniRacunPlatioca.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldTransakcioniRacunPlatioca;
	}

	private JTextField getTextFieldPozivNaBrojZaduzenja() {
		if (textFieldPozivNaBrojZaduzenja == null) {
			textFieldPozivNaBrojZaduzenja = new JTextField();
			textFieldPozivNaBrojZaduzenja.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldPozivNaBrojZaduzenja.setColumns(10);
			textFieldPozivNaBrojZaduzenja.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldPozivNaBrojZaduzenja.setBounds(474, 112, 257, 40);
			textFieldPozivNaBrojZaduzenja.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldPozivNaBrojZaduzenja;
	}

	private JLabel getLblPozivNaBrojZaduzenja() {
		if (lblPozivNaBrojZaduzenja == null) {
			lblPozivNaBrojZaduzenja = new JLabel("Poziv na broj zaduzenja");
			lblPozivNaBrojZaduzenja.setHorizontalAlignment(SwingConstants.CENTER);
			lblPozivNaBrojZaduzenja.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblPozivNaBrojZaduzenja.setBounds(474, 158, 257, 30);
		}
		return lblPozivNaBrojZaduzenja;
	}

	private JTextField getTextFieldModelGornji() {
		if (textFieldModelGornji == null) {
			textFieldModelGornji = new JTextField();
			textFieldModelGornji.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldModelGornji.setColumns(10);
			textFieldModelGornji.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldModelGornji.setBounds(395, 112, 64, 40);
			textFieldModelGornji.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldModelGornji;
	}

	private JLabel getLblModelGornji() {
		if (lblModelGornji == null) {
			lblModelGornji = new JLabel("Model");
			lblModelGornji.setHorizontalAlignment(SwingConstants.CENTER);
			lblModelGornji.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblModelGornji.setBounds(395, 158, 64, 30);
		}
		return lblModelGornji;
	}

	private JTextField getTextFieldModelDonji() {
		if (textFieldModelDonji == null) {
			textFieldModelDonji = new JTextField();
			textFieldModelDonji.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldModelDonji.setColumns(10);
			textFieldModelDonji.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldModelDonji.setBounds(395, 349, 64, 40);
			textFieldModelDonji.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldModelDonji;
	}

	private JLabel getLblModelDonji() {
		if (lblModelDonji == null) {
			lblModelDonji = new JLabel("Model");
			lblModelDonji.setHorizontalAlignment(SwingConstants.CENTER);
			lblModelDonji.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblModelDonji.setBounds(395, 394, 64, 30);
		}
		return lblModelDonji;
	}

	private JTextField getTextFieldPozivNaBrojOdobrenja() {
		if (textFieldPozivNaBrojOdobrenja == null) {
			textFieldPozivNaBrojOdobrenja = new JTextField();
			textFieldPozivNaBrojOdobrenja.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldPozivNaBrojOdobrenja.setColumns(10);
			textFieldPozivNaBrojOdobrenja.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldPozivNaBrojOdobrenja.setBounds(483, 347, 262, 40);
			textFieldPozivNaBrojOdobrenja.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldPozivNaBrojOdobrenja;
	}

	private JLabel getLblPozivNaBrojOdobrenja() {
		if (lblPozivNaBrojOdobrenja == null) {
			lblPozivNaBrojOdobrenja = new JLabel("Poziv na broj odobrenja");
			lblPozivNaBrojOdobrenja.setHorizontalAlignment(SwingConstants.CENTER);
			lblPozivNaBrojOdobrenja.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblPozivNaBrojOdobrenja.setBounds(483, 394, 248, 30);
		}
		return lblPozivNaBrojOdobrenja;
	}

	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldIznos.setColumns(10);
			textFieldIznos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldIznos.setBounds(431, 192, 172, 40);
			textFieldIznos.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldIznos;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setHorizontalAlignment(SwingConstants.CENTER);
			lblIznos.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblIznos.setBounds(431, 231, 172, 30);
		}
		return lblIznos;
	}

	private JLabel getLblEur() {
		if (lblEur == null) {
			lblEur = new JLabel("EUR");
			lblEur.setHorizontalAlignment(SwingConstants.CENTER);
			lblEur.setFont(new Font("Consolas", Font.BOLD, 18));
			lblEur.setBounds(380, 197, 54, 30);
		}
		return lblEur;
	}

	private JTextField getTextFieldSifraPlacanja() {
		if (textFieldSifraPlacanja == null) {
			textFieldSifraPlacanja = new JTextField();
			textFieldSifraPlacanja.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldSifraPlacanja.setColumns(10);
			textFieldSifraPlacanja.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldSifraPlacanja.setBounds(618, 192, 115, 40);
			textFieldSifraPlacanja.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldSifraPlacanja;
	}

	private JLabel getLblSifraPlacanja() {
		if (lblSifraPlacanja == null) {
			lblSifraPlacanja = new JLabel("Sifra placanja");
			lblSifraPlacanja.setHorizontalAlignment(SwingConstants.RIGHT);
			lblSifraPlacanja.setFont(new Font("Consolas", Font.PLAIN, 14));
			lblSifraPlacanja.setBounds(615, 232, 118, 30);
		}
		return lblSifraPlacanja;
	}

	private JTextField getTextFieldTransakcioniRacunPrimaocaPlacanja() {
		if (textFieldTransakcioniRacunPrimaocaPlacanja == null) {
			textFieldTransakcioniRacunPrimaocaPlacanja = new JTextField();
			textFieldTransakcioniRacunPrimaocaPlacanja.setFont(new Font("Consolas", Font.PLAIN, 16));
			textFieldTransakcioniRacunPrimaocaPlacanja.setColumns(10);
			textFieldTransakcioniRacunPrimaocaPlacanja
					.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			textFieldTransakcioniRacunPrimaocaPlacanja.setBounds(404, 273, 341, 40);
			textFieldTransakcioniRacunPrimaocaPlacanja.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return textFieldTransakcioniRacunPrimaocaPlacanja;
	}

	private JLabel getLblTransakcioniRacunPrimaocaPlacanja() {
		if (lblTransakcioniRacunPrimaocaPlacanja == null) {
			lblTransakcioniRacunPrimaocaPlacanja = new JLabel("Transakcioni racun primaoca placanja");
			lblTransakcioniRacunPrimaocaPlacanja.setHorizontalAlignment(SwingConstants.CENTER);
			lblTransakcioniRacunPrimaocaPlacanja.setFont(new Font("Consolas", Font.PLAIN, 17));
			lblTransakcioniRacunPrimaocaPlacanja.setBounds(405, 316, 349, 30);
		}
		return lblTransakcioniRacunPrimaocaPlacanja;
	}

	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(Color.BLACK);
			separator_1.setBackground(Color.BLACK);
			separator_1.setBounds(15, 440, 730, 11);
		}
		return separator_1;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					String nazivPlatioca = textFieldNazivPlatioca.getText();
					String svrhaPlacanja = textFieldSvrhaPlacanja.getText();
					String nazivPrimaocaPlacanja = textFieldNazivPrimaocaPlacanja.getText();
					String transakcioniRacunPlatioca = textFieldTransakcioniRacunPlatioca.getText();
					String pozivNaBrojZaduzenja = textFieldPozivNaBrojZaduzenja.getText();
					String sifraPlacanja = textFieldSifraPlacanja.getText();
					String transakcioniRacunPrimaocaPlacanja = textFieldTransakcioniRacunPrimaocaPlacanja.getText();
					String pozivNaBrojOdobrenja = textFieldPozivNaBrojOdobrenja.getText();
					String modelGornji = textFieldModelGornji.getText();
					String modelDonji = textFieldModelDonji.getText();
					String iznos = textFieldIznos.getText();

					Uplatnica u = new Uplatnica(nazivPlatioca, svrhaPlacanja, nazivPrimaocaPlacanja, transakcioniRacunPlatioca, pozivNaBrojZaduzenja, sifraPlacanja, transakcioniRacunPrimaocaPlacanja, pozivNaBrojOdobrenja, modelGornji, modelDonji, iznos);
					
					System.out.println("uplatnicaaaa\n");
					System.out.println(u);
					
					
					try {
					
						JasperDesign design = JRXmlLoader.load(new File("").getAbsolutePath()+"/src/report/uplatnica.jrxml");
						
						HashMap data = new HashMap<>();
						data.put("nazivPlatioca", nazivPlatioca);
						data.put("svrhaPlacanja", svrhaPlacanja);
						data.put("nazivPrimaocaPlacanja", nazivPrimaocaPlacanja);
						data.put("transakcioniRacunPlatioca", transakcioniRacunPlatioca);
						data.put("pozivNaBrojZaduzenja", pozivNaBrojZaduzenja);
						data.put("modelGornji", modelGornji);
						data.put("iznos", iznos);
						data.put("sifraPlacanja", sifraPlacanja);
						data.put("transakcioniRacunPrimaocaPlacanja", transakcioniRacunPrimaocaPlacanja);
						data.put("modelDonji", modelDonji);
						data.put("pozivNaBrojOdobrenja", pozivNaBrojOdobrenja);
						
						JasperReport report = JasperCompileManager.compileReport(design);
						JasperPrint print = JasperFillManager.fillReport(report, data,new JREmptyDataSource());
						JasperViewer jv = new JasperViewer(print,false);
						jv.setVisible(true);
						
					} catch (JRException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					
				}
			});
			btnDodaj.setForeground(Color.WHITE);
			btnDodaj.setBackground(Color.GREEN);
			btnDodaj.setFont(new Font("Consolas", Font.BOLD, 18));
			btnDodaj.setBounds(595, 452, 150, 50);
		}
		return btnDodaj;
	}

	private JButton getBtnPonisti() {
		if (btnPonisti == null) {
			btnPonisti = new JButton("Ponisti");
			btnPonisti.setForeground(Color.WHITE);
			btnPonisti.setFont(new Font("Consolas", Font.BOLD, 18));
			btnPonisti.setBackground(Color.RED);
			btnPonisti.setBounds(25, 452, 150, 50);
		}
		return btnPonisti;
	}
}
