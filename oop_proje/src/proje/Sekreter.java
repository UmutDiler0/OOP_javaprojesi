package proje;

public class Sekreter extends Personel {
	
	private String blok;

	public Sekreter(String ad, String soyad, int sicilNo,int maas,String blok) {
		super(ad, soyad, sicilNo,maas);
		this.blok = blok;
	}
	
	public void setBlok(String blok)
	{
		this.blok = blok;
	}
	public String getBlok()
	{
		return blok;
	}

}
