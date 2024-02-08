package proje;

public abstract class Personel {
	
	private String ad;
	private String soyad;
	private int sicilNo;
	private int maas;
	
	
	public Personel(String ad,String soyad,int sicilNo,int maas)
	{
		this.ad = ad;
		this.soyad = soyad;
		this.sicilNo = sicilNo;
		this.maas = maas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	@Override
	public String toString() {
		return "Personel [ad=" + ad + ", soyad=" + soyad + ", sicilNo=" + sicilNo + ", maas=" + maas + "]";
	}
	
	
	
	

}
