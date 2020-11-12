package Service;

public class TutorialService {
	
	public String getBestTutorialSite(String language) {
		
		if (language.equals("java")){
			return "Google";
		}
		
		else {
			
			return "lame";
		}
		
	}

}
