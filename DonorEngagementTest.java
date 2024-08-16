package Fundraiser;


import org.junit.jupiter.api.Test;


public class DonorEngagementTest {

    @Test
    public void testSendThankYouMessage() {
        DonorEngagement donorEngagement = new DonorEngagement();
        donorEngagement.sendThankYouMessage("donor@example.com", "Test Campaign", 100.00);
        // Since this just prints to the console, we're verifying the method runs without errors.
    }
}

