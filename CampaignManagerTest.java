package Fundraiser;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CampaignManagerTest {

    private CampaignManager campaignManager;

    @BeforeEach
    public void setUp() {
        campaignManager = new CampaignManager();
    }

    @Test
    public void testCreateCampaign() {
        campaignManager.createCampaign("001", "Test Campaign", "A test campaign", 1000.00);
        Campaign campaign = campaignManager.getCampaign("001");
        assertNotNull(campaign);
        assertEquals("Test Campaign", campaign.getName());
    }

    @Test
    public void testUpdateCampaign() {
        campaignManager.createCampaign("001", "Test Campaign", "A test campaign", 1000.00);
        campaignManager.updateCampaign("001", "Updated Campaign", "An updated description", 2000.00);
        Campaign campaign = campaignManager.getCampaign("001");
        assertNotNull(campaign);
        assertEquals("Updated Campaign", campaign.getName());
        assertEquals("An updated description", campaign.getDescription());
        assertEquals(2000.00, campaign.getGoalAmount(), 0.01);
    }

    @Test
    public void testGetNonExistingCampaign() {
        Campaign campaign = campaignManager.getCampaign("999");
        assertNull(campaign);
    }
}
