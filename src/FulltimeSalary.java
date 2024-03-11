
public class FulltimeSalary {

	FulltimeInfo name;
	FulltimeInfo address;
	FulltimeInfo bank;
	FulltimeInfoNum labor;

	FulltimeInfoNum age;
	FulltimeInfoNum birthinfo;
	FulltimeInfoNum id;
	FulltimeInfoNum phone;
	FulltimeInfoNum account;


	Grade grade;

//	SalaryCal base;
//	SalaryCal add;
//	SalaryCal tax;
//	SalaryCal deduct;
//	
//	int total;
//	
	public FulltimeSalary() {

		name = new FulltimeInfo();
		address = new FulltimeInfo();
		bank = new FulltimeInfo();

		age = new FulltimeInfoNum();
		birthinfo = new FulltimeInfoNum();
		id = new FulltimeInfoNum();
		phone = new FulltimeInfoNum();
		account = new FulltimeInfoNum();
		labor = new FulltimeInfoNum();

		grade = new Grade();

//		base = new SalaryCal();
//		add = new SalaryCal();
//		tax = new SalaryCal();
//		deduct = new SalaryCal();

	}

	public FulltimeSalary(FulltimeInfo name, FulltimeInfo address, FulltimeInfo bank, FulltimeInfoNum age,
			FulltimeInfoNum birthinfo, FulltimeInfoNum id, FulltimeInfoNum phone, FulltimeInfoNum account, FulltimeInfoNum labor,
			Grade grade) {
		this.name = name;
		this.address = address;
		this.bank = bank;
		this.age = age;
		this.birthinfo = birthinfo;
		this.id = id;
		this.phone = phone;
		this.account = account;
		this.labor = labor;
		this.grade = grade;

	}
	//set
	public void setName(String name) {
		this.name.setFulltimeInfo(name);
	}
	
	public void setAddress(String address) {
		this.address.setFulltimeInfo(address);
	}

	public void setBank(String bank) {
		this.bank.setFulltimeInfo(bank);
	}
	
	public void setAge(int age) {
		this.age.setFulltimeInfoNum(age);
	}
	
	public void setBirthinfo(int birthinfo) {
		this.birthinfo.setFulltimeInfoNum(birthinfo);
	}
	
	public void setId(int id) {
		this.id.setFulltimeInfoNum(id);
	}
	
	
	public void setPhone(int phone) {
		this.phone.setFulltimeInfoNum(phone);
	}
	
	public void setAccount(int account) {
		this.account.setFulltimeInfoNum(account);
	}
	
	public void setLabor(int labor) {
		this.labor.setFulltimeInfoNum(labor);
	}
	
	public void setGrade(String grade) {
		this.grade.setGrade(grade);
	}

	
	//get

	public String getName() {
		return name.getFulltimeInfo();
	}

	public String getAddress() {
		return address.getFulltimeInfo();
	}

	public String getBank() {
		return bank.getFulltimeInfo();
	}

	public int getAge() {
		return age.getFulltimeInfoNum();
	}

	public int getBirthinfo() {
		return birthinfo.getFulltimeInfoNum();
	}
	
	public int getId() {
		return id.getFulltimeInfoNum();
	}

	public int getPhone() {
		return phone.getFulltimeInfoNum();
	}

	public int getAccount() {
		return account.getFulltimeInfoNum();
	}

	public int getLabor() {
		return labor.getFulltimeInfoNum();
	}

	public String getGrade() {
		return grade.getGrade();
	}
	
	
	
}
