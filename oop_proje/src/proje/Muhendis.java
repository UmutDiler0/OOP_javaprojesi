package proje;

public class Muhendis extends Personel {
	
	private String uzmanlik;

	public Muhendis(String ad, String soyad, int sicilNo, int maas,String uzmanlik) {
		super(ad, soyad, sicilNo, maas);
		this.uzmanlik = uzmanlik;
		
	}
	public void setUzmanlik(String uzmanlik)
	{
		this.uzmanlik = uzmanlik;
	}
	public String getUzmanlik()
	{
		return uzmanlik;
	}
	
	

}
