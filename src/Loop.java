
/* 반복문
 * :조건
 * 
 * for문
 * while문
 * for,while은 무조건 체크
 * 
 * do ~ while문 무조건 1번은 수행하고 다음에 반복할지 여부를 체크
 * 
 * for each문 : 배열을 사용할때 사용.
 * 
 *  for(초기문; 조건문; 증감문){
 *  
 *  }
 *  
 */
/*public class Loop {

	public static void main(String []args) {
	
		for(int i = 0;i<10;i++) {
			System.out.println(i);
		}
		
		for(int i = 0;i<10;i++) {
			for(int j = 0;j<3;j++) {
				System.out.println(i*j);
			}
			System.out.println();
		}
	}
}
*/

// 사각형 개수가 500개가 넘었을때 몇번 접어서 몇개 나오는지  9번 512개 접은개수, 사각형개수

/*public class Loop {

	public static void main(String []args) {
	
		int rect = 1;
		int count = 0;
		
		for(count = 0;rect<500;count++) {
			rect*=2;

		}
		System.out.println(count);
		System.out.println(rect);
		
	}
}
*
*/


/*public class Loop {

	public static void main(String []args) {
		
		for(int i = 2;i<10;i++) {
			for(int j = 1;j<10;j++) {
				System.out.print(i+"*"+j+"="+(i*j) + "\t");
			}
			System.out.println();
		}
	}
}
*/
 //ccc
public class Loop {

	public static void main(String []args) {
	
		int i = 2;
		while(i<10) {
			int j = 1;
			while(j<10) {
				System.out.print(j+"*"+i+"="+(i*j) + "\t");
				j++;
			}
			System.out.println();
			i++;
		}	
	}
}




