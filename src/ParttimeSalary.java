
public class ParttimeSalary {

	ParttimeInfo name;
	ParttimeInfo address;
	ParttimeInfo bank;

	ParttimeInfoNum age;
	ParttimeInfoNum birthinfo;
	ParttimeInfoNum id;
	ParttimeInfoNum phone;
	ParttimeInfoNum account;
	ParttimeInfoNum term;
	ParttimeInfoNum lastdate;

	public ParttimeSalary() {

		name = new ParttimeInfo();
		address = new ParttimeInfo();
		bank = new ParttimeInfo();

		age = new ParttimeInfoNum();
		birthinfo = new ParttimeInfoNum();
		id = new ParttimeInfoNum();
		phone = new ParttimeInfoNum();
		account = new ParttimeInfoNum();
		term = new ParttimeInfoNum();
		lastdate = new ParttimeInfoNum();
	}

	public ParttimeSalary(ParttimeInfo name, ParttimeInfo address, ParttimeInfo bank, ParttimeInfoNum age,
			ParttimeInfoNum birthinfo, ParttimeInfoNum id, ParttimeInfoNum phone, ParttimeInfoNum account,
			ParttimeInfoNum term, ParttimeInfoNum lastdate) {
		this.name = name;
		this.address = address;
		this.bank = bank;
		this.age = age;
		this.birthinfo = birthinfo;
		this.id = id;
		this.phone = phone;
		this.account = account;

		this.term = term;
		this.lastdate = lastdate;

	}

	// set
	public void setName(String name) {
		this.name.setParttimeInfo(name);
	}

	public void setAddress(String address) {
		this.address.setParttimeInfo(address);
	}

	public void setBank(String bank) {
		this.bank.setParttimeInfo(bank);
	}

	public void setAge(int age) {
		this.age.setParttimeInfoNum(age);
	}

	public void setBirthinfo(int birthinfo) {
		this.birthinfo.setParttimeInfoNum(birthinfo);
	}
	
	public void setId(int id) {
		this.id.setParttimeInfoNum(id);
	}

	public void setPhone(int phone) {
		this.phone.setParttimeInfoNum(phone);
	}

	public void setAccount(int account) {
		this.account.setParttimeInfoNum(account);
	}

	
	public void setTerm(int term) {
		this.term.setParttimeInfoNum(term);
	}
	
	public void setLastdate(int lastdate) {
		this.lastdate.setParttimeInfoNum(lastdate);
	}
	

	public String getName() {
		return name.getParttimeInfo();
	}

	public String getAddress() {
		return address.getParttimeInfo();
	}

	public String getBank() {
		return bank.getParttimeInfo();
	}

	public int getAge() {
		return age.getParttimeInfoNum();
	}

	public int getBirthinfo() {
		return birthinfo.getParttimeInfoNum();
	}
	
	public int getId() {
		return id.getParttimeInfoNum();
	}

	public int getPhone() {
		return phone.getParttimeInfoNum();
	}

	public int getAccount() {
		return account.getParttimeInfoNum();
	}

	public int getTerm() {
		return term.getParttimeInfoNum();
	}
	public int getLastdate() {
		return lastdate.getParttimeInfoNum();
	}
}
