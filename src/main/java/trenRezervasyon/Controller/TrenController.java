package trenRezervasyon.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trenRezervasyon.Model.RezervasyonBilgi;
import trenRezervasyon.Model.RezervasyonSonuc;
import trenRezervasyon.Model.Vagon;
import trenRezervasyon.Model.YerlesimAyrinti;

@RestController
public class TrenController {

	@RequestMapping(value = "/trenRezervasyonuHesapla",
			method = RequestMethod.POST,
			produces = { MediaType.APPLICATION_JSON_VALUE },
			consumes = { MediaType.APPLICATION_JSON_VALUE })
	public RezervasyonSonuc trenRezervasyonuHesapla(@RequestBody RezervasyonBilgi rezervasyonBilgi)
	{
		List<YerlesimAyrinti> yerlesimAyrintiList = new ArrayList<YerlesimAyrinti>();
		
		for(int i=0;i<rezervasyonBilgi.getRezervasyonYapilacakKisiSayisi();i++) {
			for(Vagon vagon : rezervasyonBilgi.getTren().getVagonlar()){
				
				float dolulukOrani = (float)vagon.getDoluKoltukAdet() / vagon.getKapasite();
				if((float)(dolulukOrani * 100) < 70) {
					boolean vagonEklenmis = false;
					if(yerlesimAyrintiList != null) {
	
						for(int j=0; j<yerlesimAyrintiList.size(); j++) {
							if(yerlesimAyrintiList.get(j).getVagonAdi().equals(vagon.getAd())) {
								yerlesimAyrintiList.get(j).setKisiSayisi(yerlesimAyrintiList.get(j).getKisiSayisi() + 1);
								vagonEklenmis = true;
								break;
							}
						}
					}
					
					if(vagonEklenmis == false) {
						yerlesimAyrintiList.add(new YerlesimAyrinti(vagon.getAd(), 1));
					}
				
					vagon.setDoluKoltukAdet(vagon.getDoluKoltukAdet() + 1);
					break;
					
				}
			}
		}
		
		if(rezervasyonBilgi.getKisilerFarkliVagonlaraYerlestirilebilir() == false && yerlesimAyrintiList.size() > 1) {
			yerlesimAyrintiList = new ArrayList<YerlesimAyrinti>();
		}
		
		RezervasyonSonuc rezervasyonSonuc = new RezervasyonSonuc();
		
		if(yerlesimAyrintiList.size() > 0)
			rezervasyonSonuc.setRezervasyonYapilabilir(true);
		else
			rezervasyonSonuc.setRezervasyonYapilabilir(false);
		
		rezervasyonSonuc.setYerlesimAyrinti(yerlesimAyrintiList);
		
		return rezervasyonSonuc;
	}
	
	@RequestMapping(value = "/merhaba",
			method = RequestMethod.GET)
	public String merhaba()
	{
		return "Merhaba";
	}
}
