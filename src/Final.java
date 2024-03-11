import java.util.Scanner;

public class Final {

	static Scanner sc = new Scanner(System.in);
	public static FulltimeSalary[] fs = new FulltimeSalary[100];
	public static FtSal[] fts = new FtSal[100];
	public static ParttimeSalary[] ps = new ParttimeSalary[100];
	public static PtSal[] pts = new PtSal[100];
	public static int num = 0;

	// 정규직 정보입력
	public static void ftinput() {
		fs[num] = new FulltimeSalary();
		fts[num] = new FtSal();

		System.out.println("직원정보입력");
		System.out.println("이름:");
		fs[num].setName(sc.next());
		System.out.println("주소:");
		fs[num].setAddress(sc.next());
		System.out.println("직급:");
		fs[num].setGrade(sc.next());
		System.out.println("은행:");
		fs[num].setBank(sc.next());
		System.out.println("나이:");
		fs[num].setAge(sc.nextInt());
		System.out.println("생일:");
		fs[num].setBirthinfo(sc.nextInt());
		System.out.println("직원번호:");
		fs[num].setId(sc.nextInt());
		System.out.println("전화번호:");
		fs[num].setPhone(sc.nextInt());
		System.out.println("계좌번호:");
		fs[num].setAccount(sc.nextInt());
		System.out.println("노동조합가입여부: 가입(1) 미가입(2)");
		fs[num].setLabor(sc.nextInt());

		System.out.println("급여정보입력");
		System.out.println("기본급:");
		fts[num].setBase(sc.nextInt());

		num++;

	}

	// 비정규직 정보입력
	public static void psinput() {
		ps[num] = new ParttimeSalary();

		System.out.println("이름:");
		ps[num].setName(sc.next());
		System.out.println("주소:");
		ps[num].setAddress(sc.next());
		System.out.println("은행:");
		ps[num].setBank(sc.next());
		System.out.println("나이:");
		ps[num].setAge(sc.nextInt());
		System.out.println("생일:");
		ps[num].setBirthinfo(sc.nextInt());
		System.out.println("직원번호:");
		ps[num].setId(sc.nextInt());
		System.out.println("전화번호:");
		ps[num].setPhone(sc.nextInt());
		System.out.println("계좌번호:");
		ps[num].setAccount(sc.nextInt());
		System.out.println("계약기간:");
		ps[num].setTerm(sc.nextInt());
		System.out.println("퇴사일자:");
		ps[num].setLastdate(sc.nextInt());

		System.out.println("급여정보입력");
		System.out.println("기본급:");
		pts[num].setBase(sc.nextInt());

		num++;

	}

	// 정규직 정보 출력
	public static void fsoutput() {
		for (int i = 0; i < num; i++) {
			System.out.println(fs[i].getName());
			System.out.println(fs[i].getAddress());
			System.out.println(fs[i].getBank());
			System.out.println(fs[i].getAge());
			System.out.println(fs[i].getBirthinfo());
			System.out.println(fs[i].getId());
			System.out.println(fs[i].getPhone());
			System.out.println(fs[i].getAccount());
			System.out.println(fs[i].getLabor());
			System.out.println(fs[i].getGrade());

			System.out.print("기본급 :");
			System.out.println(fts[i].getBase());
			System.out.print("직무급 :");
			System.out.println(fts[i].getAdd());
			System.out.print("세금 :");
			System.out.println(fts[i].getTax());
			System.out.print("세전총액 :");
			System.out.println(fts[i].getSum());
			System.out.print("세후총액 :");
			System.out.println(fts[i].getTotal());

		}
	}

	// 비정규직 정보 출력
	public static void psoutput() {
		for (int i = 0; i < num; i++) {
			System.out.println(ps[i].getName());
			System.out.println(ps[i].getAddress());
			System.out.println(ps[i].getBank());
			System.out.println(ps[i].getAge());
			System.out.println(ps[i].getBirthinfo());
			System.out.println(ps[i].getId());
			System.out.println(ps[i].getPhone());
			System.out.println(ps[i].getAccount());
			System.out.println(ps[i].getTerm());
			System.out.println(ps[i].getLastdate());

			System.out.print("기본급 :");
			System.out.println(pts[i].getBase());
			System.out.print("세금 :");
			System.out.println(pts[i].getTax());
			System.out.print("세전총액 :");
			System.out.println(pts[i].getSum());
			System.out.print("세후총액 :");
			System.out.println(pts[i].getTotal());

		}
	}
	// 정규직 정보 변경

	public static void fmodify() {
		int id;
		Boolean ret = false;
		int i;
		System.out.println("변경할 직원의 사원번호를 입력");
		id = sc.nextInt();

		for (i = 0; i < num; i++) {
			if (id == fs[i].getId()) {
				ret = true;
				break;
			}
		}

		if (ret == true) {
			System.out.println("수정할 내용을 입력하세요");
			System.out.println("이름:");
			fs[num].setName(sc.next());
			System.out.println("주소:");
			fs[num].setAddress(sc.next());
			System.out.println("은행:");
			fs[num].setGrade(sc.next());
			System.out.println("직급:");
			fs[num].setBank(sc.next());
			System.out.println("나이:");
			fs[num].setAge(sc.nextInt());
			System.out.println("생일:");
			fs[num].setBirthinfo(sc.nextInt());
			System.out.println("전화번호:");
			fs[num].setPhone(sc.nextInt());
			System.out.println("계좌번호:");
			fs[num].setAccount(sc.nextInt());
			System.out.println("노동조합가입여부: 가입(1) 미가입(2)");
			fs[num].setLabor(sc.nextInt());

		} else {
			System.out.print("해당 직원이 없습니다.");
		}

	}

	// 비정규직 정보 변경

	public static void pmodify() {
		int id;
		Boolean ret = false;
		int i;
		System.out.println("변경할 직원의 사원번호를 입력");
		id = sc.nextInt();

		for (i = 0; i < num; i++) {
			if (id == ps[i].getId()) {
				ret = true;
				break;
			}
		}

		if (ret == true) {
			System.out.println("수정할 내용을 입력하세요");
			System.out.println("이름:");
			ps[num].setName(sc.next());
			System.out.println("주소:");
			ps[num].setAddress(sc.next());
			System.out.println("은행:");
			ps[num].setBank(sc.next());
			System.out.println("나이:");
			ps[num].setAge(sc.nextInt());
			System.out.println("생일:");
			ps[num].setBirthinfo(sc.nextInt());
			System.out.println("전화번호:");
			ps[num].setPhone(sc.nextInt());
			System.out.println("계좌번호:");
			ps[num].setAccount(sc.nextInt());
			System.out.println("계약기간:");
			ps[num].setTerm(sc.nextInt());
			System.out.println("퇴사일자:");
			ps[num].setLastdate(sc.nextInt());

		} else {
			System.out.print("해당 직원이 없습니다.");
		}

	}

	// 정규직 전체 출력
	public void fprintAll() {
		for (int i = 0; i < num; i++) {
			fsoutput();
		}
	}

	// 비정규직 전체 출력
	public void pprintAll() {
		for (int i = 0; i < num; i++) {
			psoutput();
		}
	}

	// 정규직 검색
	public static void fsearch() {
		int menu;
		String name;
		int id;

		System.out.println("1. 사원번호 검색, 2. 이름검색");
		menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("검색할 직원의 사원번호를 입력하세요");
			id = sc.nextInt();

			for (int i = 0; i < num; i++) {
				if (id == fs[i].getId()) {
					fsoutput();
					return;
				}

			}
			System.out.println("해당 직원이 없습니다.");
		} else if (menu == 2) {
			System.out.println("직원 이름을 입력하세요");
			name = sc.next();

			for (int i = 0; i < num; i++) {
				if (name == fs[i].getName()) {
					fsoutput();
					return;
				}
			}

		} else {
			System.out.println("잘못된 검색 방법 입니다.");
		}

	}

	// 비정규직 검색
	public static void psearch() {
		int menu;
		String name;
		int id;

		System.out.println("1. 사원번호 검색, 2. 이름검색");
		menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("검색할 직원의 사원번호를 입력하세요");
			id = sc.nextInt();

			for (int i = 0; i < num; i++) {
				if (id == ps[i].getId()) {
					psoutput();
					return;
				}

			}
			System.out.println("해당 직원이 없습니다.");
		} else if (menu == 2) {
			System.out.println("직원 이름을 입력하세요");
			name = sc.next();

			for (int i = 0; i < num; i++) {
				if (name == ps[i].getName()) {
					psoutput();
					return;
				}
			}

		} else {
			System.out.println("잘못된 검색 방법 입니다.");
		}

	}

	// 정규직 삭제
	public static void fdelete() {
		if (num == 0) {
			System.out.println("삭제할 내역이 없습니다.");
		} else {
			System.out.print("삭제할 직원번호 검색");
			int id = sc.nextInt();
			for (int i = 0; i < num; i++) {
				if (id == fs[i].getId()) {
					for (int j = i; j < num - 1; j++) {
						fs[j] = fs[j + 1];
					}
					num--;
					break;
				}
			}
		}
	}

	// 비정규직 삭제
	public static void pdelete() {
		if (num == 0) {
			System.out.println("삭제할 내역이 없습니다.");
		} else {
			System.out.print("삭제할 직원번호 검색");
			int id = sc.nextInt();
			for (int i = 0; i < num; i++) {
				if (id == ps[i].getId()) {
					for (int j = i; j < num - 1; j++) {
						ps[j] = ps[j + 1];
					}
					num--;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int choose;
		int ftorpt;
		int button;
		int password;

		while (true) {
			System.out.println("1.직원용 2.관리자용");
			System.out.print("선택:");
			choose = sc.nextInt();

			switch (choose) {
			case 1:
				System.out.println("1.정규직 2.비정규직");
				ftorpt = sc.nextInt();
				if (ftorpt == 1) {
					fsearch();
				} else if (ftorpt == 2) {
					psearch();
				}
				break;
			case 2:
				System.out.println("관리자 비밀번호를 입력하세요");
				password = sc.nextInt();
				if (password == 0000) {
				System.out.println("1.정규직 2.비정규직");
				ftorpt = sc.nextInt();
				if (ftorpt == 1) {
					System.out.println("1.입력 2.수정 3.삭제 4.출력 5.검색 6.종료");
					button = sc.nextInt();
					if (button == 1) {
						ftinput();
					}

					if (button == 2) {
						fmodify();
					}

					if (button == 3) {
						fdelete();

					}
					if (button == 4) {
						fsoutput();
					}
					if (button == 5) {
						fsearch();
					}
					if (button == 6) {
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						System.exit(0);
					}
//					else {
//						System.out.println("잘못된 접근입니다.");
//					}
				}
				if (ftorpt == 2) {
					System.out.println("1.입력 2.수정 3.삭제 4.출력 5.검색 6.종료");
					button = sc.nextInt();
					if (button == 1) {
						psinput();
					}

					if (button == 2) {
						pmodify();
					}

					if (button == 3) {
						pdelete();

					}
					if (button == 4) {
						psoutput();
					}
					if (button == 5) {
						psearch();
					}
					if (button == 6) {
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						System.exit(0);
					} 
//						else {
//						System.out.println("잘못된 접근입니다.");
//					}
				} break;
			} else {
				System.out.println("잘못된 비밀번호입니다.");
			}
			}
		}
	}
}
