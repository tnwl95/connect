
public class PtSal {

	SalaryCal base;
	SalaryCal add;
	SalaryCal deduct;

	int total;
	float tax;
	int sum;

	public PtSal() {
		base = new SalaryCal();
		add = new SalaryCal();
		deduct = new SalaryCal();
	}

	public PtSal(SalaryCal base, SalaryCal add, SalaryCal deduct) {
		this.base = base;
		this.add = add;
//		this.tax = tax;
		this.deduct = deduct;
	}

	public int getBase() {
		return base.getSalaryCal();
	}

	public void setBase(int base) {
		this.base.setSalaryCal(base);
	}

	public int getAdd() {
		return add.getSalaryCal();
	}

	public void setAdd(int add) {
		this.add.setSalaryCal(add);
	}

	public float getTax() {
		return getSum()*0.154f;
	}


	public void setDeduct(int deduct) {
		this.deduct.setSalaryCal(deduct);
	}

	public int getSum() {
		return getBase() + getAdd();
	}
	
	public int getTotal() {
		return getSum() - (int) getTax();
	}

}
