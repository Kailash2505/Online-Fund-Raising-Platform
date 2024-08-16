package Fundraiser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CampaignTest {

    @Test
    public void testCampaignCreation() {
        Campaign campaign = new Campaign("001", "Test Campaign", "A test campaign", 1000.00);
        assertEquals("001", campaign.getId());
        assertEquals("Test Campaign", campaign.getName());
        assertEquals("A test campaign", campaign.getDescription());
        assertEquals(1000.00, campaign.getGoalAmount(), 0.01);
        assertEquals(0.00, campaign.getCollectedAmount(), 0.01);
    }

    @Test
    public void testAddDonation() {
        Campaign campaign = new Campaign("001", "Test Campaign", "A test campaign", 1000.00);
        campaign.addDonation(100.00);
        assertEquals(100.00, campaign.getCollectedAmount(), 0.01);
        campaign.addDonation(50.00);
        assertEquals(150.00, campaign.getCollectedAmount(), 0.01);
    }

    @Test
    public void testToString() {
        Campaign campaign = new Campaign("001", "Test Campaign", "A test campaign", 1000.00);
        String expectedOutput = "Campaign: Test Campaign, Goal: $1000.00, Collected: $0.00";
        assertEquals(expectedOutput, campaign.toString());
    }
}
