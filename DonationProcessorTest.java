package Fundraiser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DonationProcessorTest {

    private CampaignManager campaignManager;
    private DonationProcessor donationProcessor;

    @BeforeEach
    public void setUp() {
        campaignManager = new CampaignManager();
        donationProcessor = new DonationProcessor();
        campaignManager.createCampaign("001", "Test Campaign", "A test campaign", 1000.00);
    }

    @Test
    public void testProcessDonation() {
        donationProcessor.processDonation("001", 100.00, campaignManager);
        Campaign campaign = campaignManager.getCampaign("001");
        assertEquals(100.00, campaign.getCollectedAmount(), 0.01);
    }

    @Test
    public void testProcessDonationForNonExistingCampaign() {
        donationProcessor.processDonation("999", 100.00, campaignManager);
        Campaign campaign = campaignManager.getCampaign("999");
        assertNull(campaign);
    }
}
