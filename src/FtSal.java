
public class FtSal {

	SalaryCal base;
	SalaryCal add;
	SalaryCal deduct;
	FulltimeInfoNum labor;

	Grade percent;

	double total;
	double tax;
	double sum;

	public FtSal() {
		base = new SalaryCal();
		add = new SalaryCal();
		deduct = new SalaryCal();
		percent = new Grade();
		labor = new FulltimeInfoNum();
	}

	public FtSal(SalaryCal base, SalaryCal add, SalaryCal deduct, Grade percent) {
		this.base = base;
		this.add = add;
		this.deduct = deduct;
		this.percent = percent;

	}

	public int getBase() {
		return base.getSalaryCal();
	}

	public void setBase(int base) {
		this.base.setSalaryCal(base);
	}

	public double getAdd() {
		return getBase()*percent.getPercent();
	}

	public void setAdd(int add) {
		this.add.setSalaryCal(add);
	}

	public double getTax() {
		return getSum() *0.154;
	}

	public void setLabor(int labor) {
		this.labor.setFulltimeInfoNum(labor);
	}

	public int getDeduct() {
		int labor = 0;
		if (labor == 1) {
			return 50000;
		}

		else
			return 0;
	}

	public void setDeduct(int deduct) {
		this.deduct.setSalaryCal(deduct);
	}

	public double getPercent() {
		return percent.percent;
	}

	public void setPercent(Grade percent) {
		this.percent = percent;
	}

	public double getSum() {
		return getBase() + getAdd() - getDeduct();
	}

	public double getTotal() {
		return getSum() - (int) getTax();
	}

}
