package proje;

public class Sube {
	
	Personel personeller[];
	
	public Sube(Personel[] personeller) {
	
		this.personeller = personeller;
	}

	public void subeyePersonelEkle(Personel personel)
	{
		Personel[] personellerTemp = new Personel[personeller.length+1];
		for(int i=0;i<personeller.length;i++)
		{
			personellerTemp[i] = personeller[i];
		}
		personellerTemp[personeller.length] = personel;
	}
	
	public void subedekiPersonelleriListele()
	{
		for(int i=0;i<personeller.length;i++)
		{
			System.out.println(personeller[i]);
		}
	}
	public void personelAra(int sicilNo)
	{
		for(Personel p : personeller)
		{
			if(p.getSicilNo() == sicilNo)
			{
				System.out.println(p);
				return;
			}
		}
		System.out.println("bu sicil noya ait biri bulunamadi");
	}
}
