//import java.util.ArrayList;

public class Stage {
	private int n;
	private int row;
	private int col;
	private int stageCount;
	
	
	public Stage(int n) {
		this.setN(n);
		this.setCol(n);
		if(n==1) {
			this.setRow(3);
		}else {
			this.setRow(2);
		}
		setStageCount(this.getRow() * this.getCol());
	}

	
	
	
	
	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}
	/**
	 * @param n the n to set
	 */
	public void setN(int n) {
		this.n = n;
	}





	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}





	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}





	/**
	 * @return the col
	 */
	public int getCol() {
		return col;
	}





	/**
	 * @param col the col to set
	 */
	public void setCol(int col) {
		this.col = col;
	}





	/**
	 * @return the stageCount
	 */
	public int getStageCount() {
		return stageCount;
	}





	/**
	 * @param stageCount the stageCount to set
	 */
	public void setStageCount(int stageCount) {
		this.stageCount = stageCount;
	}

	
	
	
}
