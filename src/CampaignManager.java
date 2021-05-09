import java.util.ArrayList;

public class CampaignManager implements CampaignManagerDao{
	
	ArrayList<CampaignBase> campaigns= new ArrayList<CampaignBase>();
	
	
	@Override
	public void campaingCreat(CampaignBase campaign) {
		this.campaigns.add(campaign);
		System.err.println(campaign.getCampaignName()+" kampanyas� olu�turuldu");
		System.out.print("Mevcut Kampanyalar :  ");
		for(CampaignBase campaign1:this.campaigns) {
			System.out.print(campaign1.getCampaignName()+" "+campaign1.getDiscount()+"    ");
		}
		System.out.println("");
	}

	
	
	@Override
	public void campaignUpgrade(String oldName, String newName,double newDiscount) {
		for(CampaignBase campaign : campaigns)
			if(campaign.getCampaignName()==oldName) {
				campaign.setCampaignName(newName);
				campaign.setDiscount(newDiscount);
			}
		System.err.println("Kampanya g�ncellendi");
		System.out.print("Mevcut Kampanyalar :  ");
		for(CampaignBase campaign1:this.campaigns) {
			System.out.print(campaign1.getCampaignName()+" "+campaign1.getDiscount()+"    ");
		}
		System.out.println("");
	}
	
	
	
	@Override
	public void campaignUpgrade(String name,double newDiscount) {
		for(CampaignBase campaign : campaigns)
			if(campaign.getCampaignName()==name) {
				campaign.setDiscount(newDiscount);
			}
		System.err.println("Kampanya g�ncellendi");
		System.out.print("Mevcut Kampanyalar :  ");
		for(CampaignBase campaign1:this.campaigns) {
			System.out.print(campaign1.getCampaignName()+" "+campaign1.getDiscount()+"    ");
		}
		System.out.println("");
		
	}

	
	
	@Override
	public void campaignDelete(String name) {
		CampaignBase campaignClone;
		for(int i=0;i<this.campaigns.size();i++) { // bize gelen ismi bulna kadar liste i�inde geziyoruz.
			campaignClone=campaigns.get(i);
			if(campaignClone.getCampaignName()==name) {// liste i�inde varsa bu ismi siliyoruz.
				campaigns.remove(i);
			}
		}
		System.err.println(name+" Kampanyas� silindi");
	}
	
	
	
	@Override
	public void activeCampaign(Game game,int campaignName) {
		CampaignBase campaign=this.campaigns.get(0);
		double discount =campaign.getDiscount();
		game.setPrice(discount);
	}



}
