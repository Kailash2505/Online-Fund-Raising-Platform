package Fundraiser;
import java.util.*;

public class FundRaisingPlatform {
    public static void main(String[] args) {
        CampaignManager campaignManager = new CampaignManager();
        DonationProcessor donationProcessor = new DonationProcessor();
        DonorEngagement donorEngagement = new DonorEngagement();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Campaign ID:");
        String campaignId = scanner.nextLine();

        System.out.println("Enter Campaign Name:");
        String campaignName = scanner.nextLine();

        System.out.println("Enter Campaign Description:");
        String campaignDescription = scanner.nextLine();

        System.out.println("Enter Campaign Goal Amount:");
        double goalAmount = scanner.nextDouble();

        campaignManager.createCampaign(campaignId, campaignName, campaignDescription, goalAmount);

        while (true) {
            System.out.println("Enter Donation Amount:");
            double donationAmount = scanner.nextDouble();

            donationProcessor.processDonation(campaignId, donationAmount, campaignManager);

            Campaign campaign = campaignManager.getCampaign(campaignId);
            if (campaign.getCollectedAmount() >= campaign.getGoalAmount()) {
                System.out.println("Congratulations! The campaign has reached its goal.");
                break;
            }

            scanner.nextLine();
            
            System.out.println("Enter Donor Email:");
            String donorEmail = scanner.nextLine();

            donorEngagement.sendThankYouMessage(donorEmail, campaignName, donationAmount);
        }

        scanner.close();
    }
}
