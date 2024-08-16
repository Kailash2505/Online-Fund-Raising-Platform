package Fundraiser;
import java.util.*;

public class CampaignManager {
	private Map<String, Campaign> campaigns = new HashMap<>();

    public void createCampaign(String id, String name, String description, double goalAmount) {
        Campaign campaign = new Campaign(id, name, description, goalAmount);
        campaigns.put(id, campaign);
        System.out.println("Campaign created: " + campaign);
    }

    public void updateCampaign(String id, String name, String description, double goalAmount) {
        Campaign campaign = campaigns.get(id);
        if (campaign != null) {
            campaign = new Campaign(id, name, description, goalAmount);
            campaigns.put(id, campaign);
            System.out.println("Campaign updated: " + campaign);
        } else {
            System.out.println("Campaign not found with ID: " + id);
        }
    }

    public Campaign getCampaign(String id) {
        return campaigns.get(id);
    }
}
