
public abstract class SportsTeam {

	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	//empty-argument constructor 
	public SportsTeam() {
		
		teamName ="";
		teamMascot ="";
		headCoach ="";
		wins = 0;
		losses =0;
				
	}//end empty-argument constructor
	
	//Preferred Constructor
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		wins = 0;
		losses = 0;
		
	}//end Preferred Constructor
	
	//
	public double getWinPercentage() {
		
		double winPer= wins/(wins + losses); 
		
		return winPer;
		
	}//end getWinPercentage
	
	public abstract double[] getStats();
		
	
}//end class