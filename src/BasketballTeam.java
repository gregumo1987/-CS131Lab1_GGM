public class  BasketballTeam extends SportsTeam {

	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
		
		
	}//end empty-argument constructor
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		
		super(teamName, teamMascot, headCoach);
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
		
	}//end preferred constructor
	
	public double fieldGoalPercentage() {
		
		double FGP = fieldGoals/(fieldGoalsAttempted);
		
		return FGP;
		
	}//end fieldGoalPercentage
	
	public double freeThrowPercentage() {
		
	double FTP = freeThrows/freeThrowsAttempted;
	
	return FTP;
		
	}//end freeThrowPercentage
	
	public void setStats(int wins, int losses, int fieldGoals, int FieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		
		
		  this.wins = wins; 
		  this.losses = losses;
		  this.fieldGoals = fieldGoals;
		  this.fieldGoalsAttempted = FieldGoalsAttempted;
		  this.freeThrows = freeThrows;
		  this.freeThrowsAttempted = freeThrowsAttempted;
		 
		
	}//end setStats
	
	
	
	public  double[] getStats() {
		
		double[] stats = new double [3];
		
		stats[0]=this.getWinPercentage();
		stats[1]=this.fieldGoalPercentage();
		stats[2]=this.freeThrowPercentage();
		
		return stats;
		
	}//end getStats
	
	//public static void main(String[] args) {
		
		
		
		//System.out.println(stats[0]);
		//System.out.println(stats[1]);
		//System.out.println(stats[2]);
	
	
	//}
}//end class