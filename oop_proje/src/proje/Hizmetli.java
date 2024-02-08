package proje;

public class Hizmetli extends Personel {
	
	private int kat;

	public Hizmetli(String ad, String soyad, int sicilNo, int maas,int kat) {
		super(ad, soyad, sicilNo, maas);
		this.kat = kat;
	}
	
	public void setKat(int kat)
	{
		this.kat = kat;
	}
	public int getKat()
	{
		return kat;
	}

}
