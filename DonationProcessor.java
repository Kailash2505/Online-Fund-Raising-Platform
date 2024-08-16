package Fundraiser;

public class DonationProcessor {
	public void processDonation(String campaignId, double amount, CampaignManager campaignManager) {
        Campaign campaign = campaignManager.getCampaign(campaignId);
        if (campaign != null) {
            campaign.addDonation(amount);
            System.out.println("Donation of $" + amount + " processed for campaign: " + campaign.getName());
            System.out.println("Updated Campaign Details: " + campaign);
        } else {
            System.out.println("Campaign not found with ID: " + campaignId);
        }
	}
}
