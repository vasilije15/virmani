package model;

public class Uplatnica {
	
	private String nazivPlatioca;
	private String svrhaPlacanja;
	private String nazivPrimaocaPlacanja;
	private String transakcioniRacunPlatioca;
	private String pozivNaBrojZaduzenja;
	private String sifraPlacanja;
	private String transakcioniRacunPrimaocaPlacanja;
	private String pozivNaBrojOdobrenja;
	private String modelGornji;
	private String modelDonji;
	private String iznos;
	
	
	
	public Uplatnica(String nazivPlatioca, String svrhaPlacanja, String nazivPrimaocaPlacanja,
			String transakcioniRacunPlatioca, String transakcioniRacunPrimaocaPlacanja, String iznos) {
		super();
		this.nazivPlatioca = nazivPlatioca;
		this.svrhaPlacanja = svrhaPlacanja;
		this.nazivPrimaocaPlacanja = nazivPrimaocaPlacanja;
		this.transakcioniRacunPlatioca = transakcioniRacunPlatioca;
		this.transakcioniRacunPrimaocaPlacanja = transakcioniRacunPrimaocaPlacanja;
		this.iznos = iznos;
	}
	public Uplatnica(String nazivPlatioca, String svrhaPlacanja, String nazivPrimaocaPlacanja,
			String transakcioniRacunPlatioca, String pozivNaBrojZaduzenja, String sifraPlacanja,
			String transakcioniRacunPrimaocaPlacanja, String pozivNaBrojOdobrenja, String modelGornji,
			String modelDonji, String iznos) {
		super();
		this.nazivPlatioca = nazivPlatioca;
		this.svrhaPlacanja = svrhaPlacanja;
		this.nazivPrimaocaPlacanja = nazivPrimaocaPlacanja;
		this.transakcioniRacunPlatioca = transakcioniRacunPlatioca;
		this.pozivNaBrojZaduzenja = pozivNaBrojZaduzenja;
		this.sifraPlacanja = sifraPlacanja;
		this.transakcioniRacunPrimaocaPlacanja = transakcioniRacunPrimaocaPlacanja;
		this.pozivNaBrojOdobrenja = pozivNaBrojOdobrenja;
		this.modelGornji = modelGornji;
		this.modelDonji = modelDonji;
		this.iznos = iznos;
	}
	public String getNazivPlatioca() {
		return nazivPlatioca;
	}
	public void setNazivPlatioca(String nazivPlatioca) {
		this.nazivPlatioca = nazivPlatioca;
	}
	public String getSvrhaPlacanja() {
		return svrhaPlacanja;
	}
	public void setSvrhaPlacanja(String svrhaPlacanja) {
		this.svrhaPlacanja = svrhaPlacanja;
	}
	public String getNazivPrimaocaPlacanja() {
		return nazivPrimaocaPlacanja;
	}
	public void setNazivPrimaocaPlacanja(String nazivPrimaocaPlacanja) {
		this.nazivPrimaocaPlacanja = nazivPrimaocaPlacanja;
	}
	public String getTransakcioniRacunPlatioca() {
		return transakcioniRacunPlatioca;
	}
	public void setTransakcioniRacunPlatioca(String transakcioniRacunPlatioca) {
		this.transakcioniRacunPlatioca = transakcioniRacunPlatioca;
	}
	public String getPozivNaBrojZaduzenja() {
		return pozivNaBrojZaduzenja;
	}
	public void setPozivNaBrojZaduzenja(String pozivNaBrojZaduzenja) {
		this.pozivNaBrojZaduzenja = pozivNaBrojZaduzenja;
	}
	public String getSifraPlacanja() {
		return sifraPlacanja;
	}
	public void setSifraPlacanja(String sifraPlacanja) {
		this.sifraPlacanja = sifraPlacanja;
	}
	public String getTransakcioniRacunPrimaocaPlacanja() {
		return transakcioniRacunPrimaocaPlacanja;
	}
	public void setTransakcioniRacunPrimaocaPlacanja(String transakcioniRacunPrimaocaPlacanja) {
		this.transakcioniRacunPrimaocaPlacanja = transakcioniRacunPrimaocaPlacanja;
	}
	public String getPozivNaBrojOdobrenja() {
		return pozivNaBrojOdobrenja;
	}
	public void setPozivNaBrojOdobrenja(String pozivNaBrojOdobrenja) {
		this.pozivNaBrojOdobrenja = pozivNaBrojOdobrenja;
	}
	public String getModelGornji() {
		return modelGornji;
	}
	public void setModelGornji(String modelGornji) {
		this.modelGornji = modelGornji;
	}
	public String getModelDonji() {
		return modelDonji;
	}
	public void setModelDonji(String modelDonji) {
		this.modelDonji = modelDonji;
	}
	public String getIznos() {
		return iznos;
	}
	public void setIznos(String iznos) {
		this.iznos = iznos;
	}
	@Override
	public String toString() {
		return "Uplatnica [nazivPlatioca=" + nazivPlatioca + ", svrhaPlacanja=" + svrhaPlacanja
				+ ", nazivPrimaocaPlacanja=" + nazivPrimaocaPlacanja + ", transakcioniRacunPlatioca="
				+ transakcioniRacunPlatioca + ", pozivNaBrojZaduzenja=" + pozivNaBrojZaduzenja + ", sifraPlacanja="
				+ sifraPlacanja + ", transakcioniRacunPrimaocaPlacanja=" + transakcioniRacunPrimaocaPlacanja
				+ ", pozivNaBrojOdobrenja=" + pozivNaBrojOdobrenja + ", modelGornji=" + modelGornji + ", modelDonji="
				+ modelDonji + ", iznos=" + iznos + "]";
	}
	
	
	
	
	
	
	

}
