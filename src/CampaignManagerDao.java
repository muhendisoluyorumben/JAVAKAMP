
public interface CampaignManagerDao {
	public void campaingCreat( CampaignBase campaign);
	public void campaignUpgrade(String oldName,String newName,double newDiscount);
	public void campaignUpgrade(String name,double newDiscount);
	public void campaignDelete(String name);
	public void activeCampaign(Game game,int  campaignName);
}
