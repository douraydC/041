package tn.edu.esprit.gl8.pi.touristicPlacePageClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.gl8.pi.touristicPlacePage.domain.TouristicPlacePage;
import tn.edu.esprit.gl8.pi.touristicPlacePage.services.interfaces.TouristicPlacePageServicesRemote;

public class TestAddTouristicPlacePage {

	public static void main(String[] args) {

		try {
			Context context = new InitialContext();
			TouristicPlacePageServicesRemote touristicPlacePageServicesRemote = (TouristicPlacePageServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.pi.touristicPlacePage/TouristicPlacePageServices!tn.edu.esprit.gl8.pi.touristicPlacePage.services.interfaces.TouristicPlacePageServicesRemote");
			TouristicPlacePage touristicPlacePage = new TouristicPlacePage(
					"kantaoui", "sousse", "jamila");
			TouristicPlacePage touristicPlacePage2 = new TouristicPlacePage(
					"yasmine hamamet", "nabeul", "lux");
			touristicPlacePageServicesRemote
					.addTouristicPlacePage(touristicPlacePage);
			touristicPlacePageServicesRemote
					.addTouristicPlacePage(touristicPlacePage2);

		} catch (NamingException e) {

			e.printStackTrace();
		}

	}

}
