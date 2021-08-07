package trenRezervasyon.Model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Vagon {
	
	private String Ad;
	private int Kapasite;
	private int DoluKoltukAdet;
	
	public String getAd() {
		return Ad;
	}
	
	public void setAd(String ad) {
		Ad = ad;
	}
	
	public int getKapasite() {
		return Kapasite;
	}
	
	public void setKapasite(int kapasite) {
		Kapasite = kapasite;
	}
	
	public int getDoluKoltukAdet() {
		return DoluKoltukAdet;
	}
	
	public void setDoluKoltukAdet(int doluKoltukAdet) {
		DoluKoltukAdet = doluKoltukAdet;
	}
	

}
