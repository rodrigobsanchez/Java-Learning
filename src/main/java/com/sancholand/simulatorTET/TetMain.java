package simulatorTET;

public class TetMain {
	
	private double porcentage;
	private int numeberTries;
	private int failStackBegin;
	private boolean result;
	private static int sucsessCont;
	private static int overAllTries;

	public TetMain(int numeberTries, int failStackBegin) {
		
		if(numeberTries > 0) {
		this.numeberTries = numeberTries;
		}
		this.failStackBegin = failStackBegin;
		this.porcentage = 2.0;
	}

   public double FStoPercentage(int fs) {
	   double result = 2.0;
	   result = result + (0.2 * fs);
	   setPorcentage(result);
	   return result;
   }
   
   // good method for random number> (1, 10), (0,99)
   public double randDouble(double bound1, double bound2) {
       //make sure bound2> bound1
       double min = Math.min(bound1, bound2);
       double max = Math.max(bound1, bound2);
       //math.random gives random number from 0 to 1
       return min + (Math.random() * (max - min));
   }
   
   public boolean enhancingMethod() {
	   double simulation;
	   double currentPorcentage;
	   for(int i = 1; i <= numeberTries; i++) {
		 simulation = randDouble(1,100);
	
		 if(simulation <= getPorcentage()) {
			 setResult(true);
			 setPorcentage(14);
			 sucsessCont++;
			 overAllTries++;
			 return result;
		 }
		 else {
			 setResult(false);
			 currentPorcentage = getPorcentage();
			 currentPorcentage++;
			 overAllTries++;
			 setPorcentage(currentPorcentage);
		 }
		 
	   }
	   
	   return result;
   }
   
	public static void main(String[] args) {
		
		TetMain tm = new TetMain(7,60);
		tm.FStoPercentage(60);
		
		while( overAllTries < 10000) {
		tm.enhancingMethod();
		
		}
		
		System.out.println(" Sucesso:  "  +  sucsessCont);
		System.out.println(" How many tries -->  "  +  overAllTries);
		
	}
	
	
	
	
	
	
// GETTERS SETTERS
	
	public int getSucsessCont() {
		return sucsessCont;
	}

	public void setSucsessCont(int sucsessCont) {
		this.sucsessCont = sucsessCont;
	}

	public double getPorcentage() {
		return porcentage;
	}


	public void setPorcentage(double porcentage) {
		this.porcentage = porcentage;
	}


	public int getNumeberTries() {
		return numeberTries;
	}


	public void setNumeberTries(int numeberTries) {
		this.numeberTries = numeberTries;
	}


	public int getFailStackBegin() {
		return failStackBegin;
	}


	public void setFailStackBegin(int failStackBegin) {
		this.failStackBegin = failStackBegin;
	}


	public boolean isResult() {
		return result;
	}


	public void setResult(boolean result) {
		this.result = result;
	}

	


}
