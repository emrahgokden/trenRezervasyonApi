package trenRezervasyon.Model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class YerlesimAyrinti {
	
	private String VagonAdi;
	private int KisiSayisi;
	
	
	public YerlesimAyrinti(String vagonAdi, int kisiSayisi) {
		VagonAdi = vagonAdi;
		KisiSayisi = kisiSayisi;
	}

	public String getVagonAdi() {
		return VagonAdi;
	}
	
	public void setVagonAdi(String vagonAdi) {
		VagonAdi = vagonAdi;
	}
	
	public int getKisiSayisi() {
		return KisiSayisi;
	}
	
	public void setKisiSayisi(int kisiSayisi) {
		KisiSayisi = kisiSayisi;
	}

	@Override
	public String toString() {
		return "YerlesimAyrinti [VagonAdi=" + VagonAdi + ", KisiSayisi=" + KisiSayisi + "]";
	}
	
	
}
