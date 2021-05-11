package madebyjavaTitle;
import java.util.Scanner;
public class JavaTitle2 {

	
		// TODO Auto-generated method stub
		

			public static String input2 = null;
			public static int input3;
			public static Scanner vs= new Scanner(System.in);
		
		
			
			public void Explain() {
				
				System.out.println("공부할 언어를 입력하시오");
				System.out.println("1.java");
				System.out.println("2.c언어");
				System.out.println("3.html");
				
			
			}
			
			public static void Java(String n){
				if(n.equals("출력문")) {
					System.out.println("출력문은 System.out.println(\"\");이라고 씁니다.");
					System.out.println("계속 html을 배우고 싶으신 가요? 그럼 1을 입력해주세요. 아니라면 2를 눌러주세요");
					input3=vs.nextInt();
					ConorExt(input3);
					
				}
				
				
			}
			public void Clg(String n){
				if(n.equals("c출력문")) {
					System.out.println("출력문은 printf(\"\");이라고 씁니다.");
				}
				
				
				
			}
			public void Html(String n){
				if(n.equals("div")) {
					System.out.println("div 는 inline이고 <div>쓰고 싶은 말</div> 라고 씁니다.");
				}
				if(n.equals("span")) {
					System.out.println("div 는 inline이고 <span>쓰고 싶은 말</span> 라고 씁니다.");
				}
				
				
			}
			void Num(int b) {
				if(b==1) {
					System.out.println("자바를 선택하셧습니다.뭘 배우고 싶으신가요?");
					System.out.println("값을 입력하세요: ex)출력문, equals");
					input2=vs.nextLine();
					Java(input2);
					
				}
				else if(b==2) {
					System.out.println("c언어를 선택하셧습니다.뭘 배우고 싶으신가요?");
					System.out.println("값을 입력하세요: ex)c출력문, 반복문");
					input2=vs.nextLine();
					Clg(input2);
					
				}
				else if(b==3) {
					System.out.println("html를 선택하셧습니다.뭘 배우고 싶으신가요?");
					System.out.println("값을 입력하세요: ex)div, span");
					input2=vs.nextLine();
					Html(input2);
				}else {
				System.out.println("이상한 값을 입력하셧습니다.");
			}
		}
			
			static void ConorExt(int i) {
				if(i==1) {
				
				}
				
			}
			
			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int input1;
				//String input2 = null;
				
				Scanner chs = new Scanner(System.in);
				Scanner chs2 = new Scanner(System.in);
				JavaTitle2 vl= new JavaTitle2(); 
				
Hyeonjun:		while(true) {
				vl.Explain();
				input1=chs.nextInt();
				vl.Num(input1);	
				
						break Hyeonjun;
				}
				
				
			}
			

	}


