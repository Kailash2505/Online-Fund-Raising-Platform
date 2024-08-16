package Fundraiser;

public class Campaign {
	private String id;
    private String name;
    private String description;
    private double goalAmount;
    private double collectedAmount;

    public Campaign(String id, String name, String description, double goalAmount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.goalAmount = goalAmount;
        this.collectedAmount = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getGoalAmount() {
        return goalAmount;
    }

    public double getCollectedAmount() {
        return collectedAmount;
    }

    public void addDonation(double amount) {
        this.collectedAmount += amount;
    }

    @Override
    public String toString() {
        return String.format("Campaign: %s, Goal: $%.2f, Collected: $%.2f", name, goalAmount, collectedAmount);
    }
}
