package trenRezervasyon.Model;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class RezervasyonSonuc {

	private boolean RezervasyonYapilabilir;
	private List<YerlesimAyrinti> YerlesimAyrinti;
	
	public boolean isRezervasyonYapilabilir() {
		return RezervasyonYapilabilir;
	}
	
	public void setRezervasyonYapilabilir(boolean rezervasyonYapilabilir) {
		RezervasyonYapilabilir = rezervasyonYapilabilir;
	}
	
	public List<YerlesimAyrinti> getYerlesimAyrinti() {
		return YerlesimAyrinti;
	}
	
	public void setYerlesimAyrinti(List<YerlesimAyrinti> yerlesimAyrinti) {
		YerlesimAyrinti = yerlesimAyrinti;
	}

	@Override
	public String toString() {
		return "RezervasyonSonuc [RezervasyonYapilabilir=" + RezervasyonYapilabilir + ", YerlesimAyrinti="
				+ YerlesimAyrinti + "]";
	}
	

}