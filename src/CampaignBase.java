
public class CampaignBase {
	private String campaignName;
	private double discount;
	
		
	public  CampaignBase(String campaignName, double discount) {
		super();
		this.campaignName = campaignName;
		this.discount = discount;
	}

	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
