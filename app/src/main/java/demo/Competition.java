package competition;


public class Competition {
	
	
	private int coach;
	private int student;
	private double sTime;
	private double eTime;
	private String wTime;
	private int all;
	
	public Competition(int coach,int student,double sTime,double eTime,String wTime) {
		this.coach = coach;
		this.student = student;
		this.sTime = sTime;
		this.eTime = eTime;
		this.wTime = wTime;
		all = coach + student;
	}
	
	public String rent(){
		int money;
		
		if(coach<1) {
			return "project:normal";
		}
		else if(all < 10) {
			if(sTime < 8 || (sTime >= 10 && sTime < 10.3) || (sTime >= 12.3 && sTime < 14) || (sTime >= 16 && sTime < 16.3) || (sTime >= 18.3 && sTime < 19) || sTime >= 21 || eTime < 8 || (eTime > 10 && eTime < 10.3) || (eTime > 12.3 && eTime < 14) || (eTime > 16 && eTime < 16.3) || (eTime > 18.3 && eTime < 19) || eTime > 21)
			{
				return "wrong time";
			}
			else if(sTime + 1 != eTime && sTime + 2 != eTime) {
				return "plz rent 1 or 2 hours";
			}
			else {
				if(eTime-sTime == 2) {
					return "project:one lane $6000";
				}
				else{
					return "project:one lane $3000";
				}
			}	
		}
		else {
			if(wTime.equals("A") || wTime.equals("B") || wTime.equals("C") || wTime.equals("D") || wTime.equals("E")) {
					
				money = coach * 120 + student * 70;
				
				return "project:time rent $" + Integer.toString(money);
			}
			else {
				
				return "wrong time label";
			}
		}
		
	}
}
