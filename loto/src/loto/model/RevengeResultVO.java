package loto.model;

public class RevengeResultVO {

	private int id;
	private int r1;
	private int r2;
	private int r3;
	private int r4;
	private int r5;
	private int r6;
	private int r7;
	private int r8;
	private String date;
	private int sum;

	public RevengeResultVO(int id, int r1, int r2, int r3, int r4, int r5,
			int r6, int r7, int r8, String date) {
		super();
		this.id = id;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
		this.r5 = r5;
		this.r6 = r6;
		this.r7 = r7;
		this.r8 = r8;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getR1() {
		return r1;
	}

	public void setR1(int r1) {
		this.r1 = r1;
	}

	public int getR2() {
		return r2;
	}

	public void setR2(int r2) {
		this.r2 = r2;
	}

	public int getR3() {
		return r3;
	}

	public void setR3(int r3) {
		this.r3 = r3;
	}

	public int getR4() {
		return r4;
	}

	public void setR4(int r4) {
		this.r4 = r4;
	}

	public int getR5() {
		return r5;
	}

	public void setR5(int r5) {
		this.r5 = r5;
	}

	public int getR6() {
		return r6;
	}

	public void setR6(int r6) {
		this.r6 = r6;
	}

	public int getR7() {
		return r7;
	}

	public void setR7(int r7) {
		this.r7 = r7;
	}

	public int getR8() {
		return r8;
	}

	public void setR8(int r8) {
		this.r8 = r8;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
