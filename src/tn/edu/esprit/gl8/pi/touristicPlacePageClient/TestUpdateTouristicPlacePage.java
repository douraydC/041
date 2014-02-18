package tn.edu.esprit.gl8.pi.touristicPlacePageClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.gl8.pi.touristicPlacePage.domain.TouristicPlacePage;
import tn.edu.esprit.gl8.pi.touristicPlacePage.services.interfaces.TouristicPlacePageServicesRemote;

public class TestUpdateTouristicPlacePage {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			TouristicPlacePageServicesRemote touristicPlacePageServicesRemote = (TouristicPlacePageServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.pi.touristicPlacePage/TouristicPlacePageServices!tn.edu.esprit.gl8.pi.touristicPlacePage.services.interfaces.TouristicPlacePageServicesRemote");
			TouristicPlacePage touristicPlacePage = touristicPlacePageServicesRemote
					.getTouristicPlacePageById(1);
			touristicPlacePage.setDescription("passable");
			touristicPlacePage.setDestination("hamam sousse");
			touristicPlacePageServicesRemote
					.updateTouristicPlacePage(touristicPlacePage);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
