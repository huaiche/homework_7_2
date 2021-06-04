package competition;


public class Competition {
	
	
	private int coach;
	private int student;
	private double s_time;
	private double e_time;
	private String w_time;
	private int all;
	
	public Competition(int coach,int student,double s_time,double e_time,String w_time) {
		this.coach = coach;
		this.student = student;
		this.s_time = s_time;
		this.e_time = e_time;
		this.w_time = w_time;
		all = coach + student;
	}
	
	public String rent(){
		int money;
		
		if(coach<1) {
			return "project:normal";
		}
		else if(all < 10) {
			if(s_time < 8 || (s_time >= 10 && s_time < 10.3) || (s_time >= 12.3 && s_time < 14) || (s_time >= 16 && s_time < 16.3) || (s_time >= 18.3 && s_time < 19) || s_time >= 21 || e_time < 8 || (e_time > 10 && e_time < 10.3) || (e_time > 12.3 && e_time < 14) || (e_time > 16 && e_time < 16.3) || (e_time > 18.3 && e_time < 19) || e_time > 21)
			{
				return "wrong time";
			}
			else if(s_time + 1 != e_time && s_time + 2 != e_time) {
				return "plz rent 1 or 2 hours";
			}
			else {
				if(e_time-s_time == 2) {
					return "project:one lane $6000";
				}
				else{
					return "project:one lane $3000";
				}
			}	
		}
		else {
			if(w_time.notEquals("A") && w_time.notEquals("B") && w_time.notEquals("C") && w_time.notEquals("D") && w_time.notEquals("E")) {
				return "wrong time label";
			}
			else {
				money = coach * 120 + student * 70;
				
				return "project:time rent $" + Integer.toString(money);
			}
		}
		
	}
}
