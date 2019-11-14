import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		boolean x = true;
		Scanner scan = new Scanner(System.in);
		while(x) {
		ArrayList<Stage> list = new ArrayList<Stage>();
		System.out.println("Enter int for how many iterations of the function you'd like to do.");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i == 1) {
				list.add(new Stage(i));
			}else {
				newStage(list,i);
			}
		}
		int whole = 0;
		for (Stage stage : list) {
			System.out.println("Stage: " +stage.getN() + " has " + stage.getStageCount() + " discs Row: "+ stage.getRow() + " discs Col: " + stage.getCol());
			whole += stage.getStageCount();
		}
		System.out.println("total " + whole + " discs.");
		System.out.println("Run calculation again?(1 = yes, 2 = no");
		if(scan.nextInt() == 2 ){
			x = false;
		}
	}
		scan.close();
		
	}
	public static void newStage (ArrayList<Stage> list,int n) {
		if(n>1) {
			for (Stage stage : list) {
					stage.setRow(stage.getRow()+1);
				stage.setStageCount(stage.getRow() *stage.getCol());
			}
		list.add(new Stage(n));
		
			
		}
	}
	


}
