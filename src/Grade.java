
public class Grade {

	String grade = "";
	
	double percent;
	
	public String Percent (String grade) {
		switch (grade) {
		case "사원":
			grade = "사원";
			percent = 0.1;
			break;
			
		case "주임":
			grade = "주임";
			percent = 0.1;
			break;
			
		case "계장":
			grade = "계장";
			percent = 0.1;
			break;
			
		case "대리":
			grade = "대리";
			percent = 0.1;
			break;
			
		case "과장":
			grade = "과장";
			percent = 0.1;
			break;
			
		case "차장":
			grade = "차장";
			percent = 0.1;
			break;
			
		case "수석차장":
			grade = "수석차장";
			percent = 0.1;
			break;
			
		case "부장":
			grade = "부장";
			percent = 0.1;
			break;
			
		case "본부장":
			grade = "본부장";
			percent = 0.1;
			break;
			
		case "사장":
			grade = "사장";
			percent = 0.1;
			break;
			
		default :
			grade = "알 수 없음";
			break;	
		
			
		}
		return grade;
		
	
	}
	
	
	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getGrade() {
		return grade;
	}
	
	public double getPercent() {
		return percent;
	}
}