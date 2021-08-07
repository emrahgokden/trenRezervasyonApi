package trenRezervasyon.Model;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Tren {
	
	private String Ad;
	private List<Vagon> Vagonlar;
	
	public String getAd() {
		return Ad;
	}
	
	public void setAd(String ad) {
		Ad = ad;
	}
	
	public List<Vagon> getVagonlar() {
		return Vagonlar;
	}
	
	public void setVagonlar(List<Vagon> vagonlar) {
		Vagonlar = vagonlar;
	}

}
