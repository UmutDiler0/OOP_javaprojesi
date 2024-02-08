package proje;

public class Main {
	
	public static void maasAl(Personel personel)
	{
		System.out.println(personel.getMaas());
	}

	public static void main(String[] args) {
		
		
		Muhendis muhendis1 = new Muhendis("Umut","Diler",145,30000,"Bigisayar");
		Sekreter sekreter1 = new Sekreter("Hazal","Kaba",513,13000,"A");
		Hizmetli hizmetli1 = new Hizmetli("Mahmut","Sevinc",311,11000,4);
		/*
		Personel[] personeller = new Personel[3];
		personeller[0] = muhendis1;
		personeller[1] = sekreter1;
		personeller[2] = hizmetli1;
		*/
		Personel[] personeller = {muhendis1,sekreter1,hizmetli1};
		Sube teknikSube = new Sube(personeller);
		
		teknikSube.subedekiPersonelleriListele();
		
		Muhendis muhendis2 = new Muhendis("Sufi","Sofu",146,30000,"Bilgisayar");
		teknikSube.subeyePersonelEkle(muhendis2);
		
		teknikSube.personelAra(513);
		
		for(int i=0;i<personeller.length;i++)
		{
			maasAl(personeller[i]);
		}
		

	}

}
