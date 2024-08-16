package Fundraiser;

public class DonorEngagement {
	public void sendThankYouMessage(String donorEmail, String campaignName, double donationAmount) {
        System.out.println("Sending thank you message to " + donorEmail);
        String message = String.format("Dear Donor,\n\nThank you for your generous donation of $%.2f to our campaign '%s'.\n\nBest regards,\nFundraising Team",
                                        donationAmount, campaignName);
        System.out.println("Message Sent:\n" + message);
    }
}
