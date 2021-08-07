package trenRezervasyon.Model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class RezervasyonBilgi {
	
	private Tren Tren;
	private int RezervasyonYapilacakKisiSayisi;
	private boolean KisilerFarkliVagonlaraYerlestirilebilir;
	
	public Tren getTren() {
		return Tren;
	}
	
	public void setTren(Tren tren) {
		Tren = tren;
	}
	
	public int getRezervasyonYapilacakKisiSayisi() {
		return RezervasyonYapilacakKisiSayisi;
	}
	
	public void setRezervasyonYapilacakKisiSayisi(int rezervasyonYapilacakKisiSayisi) {
		RezervasyonYapilacakKisiSayisi = rezervasyonYapilacakKisiSayisi;
	}
	
	public boolean getKisilerFarkliVagonlaraYerlestirilebilir() {
		return KisilerFarkliVagonlaraYerlestirilebilir;
	}
	
	public void setKisilerFarkliVagonlaraYerlestirilebilir(boolean kisilerFarkliVagonlaraYerlestirilebilir) {
		KisilerFarkliVagonlaraYerlestirilebilir = kisilerFarkliVagonlaraYerlestirilebilir;
	}

	@Override
	public String toString() {
		return "RezervasyonBilgi [Tren=" + Tren + ", RezervasyonYapilacakKisiSayisi=" + RezervasyonYapilacakKisiSayisi
				+ ", KisilerFarkliVagonlaraYerlestirilebilir=" + KisilerFarkliVagonlaraYerlestirilebilir + "]";
	}

}
