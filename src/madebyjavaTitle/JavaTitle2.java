package madebyjavaTitle;
import java.util.Scanner;
public class JavaTitle2 {

	
		// TODO Auto-generated method stub
		

			public static String input2 = null;
			public static int input3;
			public static Scanner vs= new Scanner(System.in);
		
		
			
			public void Explain() {
				
				System.out.println("������ �� �Է��Ͻÿ�");
				System.out.println("1.java");
				System.out.println("2.c���");
				System.out.println("3.html");
				
			
			}
			
			public static void Java(String n){
				if(n.equals("��¹�")) {
					System.out.println("��¹��� System.out.println(\"\");�̶�� ���ϴ�.");
					System.out.println("��� html�� ���� ������ ����? �׷� 1�� �Է����ּ���. �ƴ϶�� 2�� �����ּ���");
					input3=vs.nextInt();
					ConorExt(input3);
					
				}
				
				
			}
			public void Clg(String n){
				if(n.equals("c��¹�")) {
					System.out.println("��¹��� printf(\"\");�̶�� ���ϴ�.");
				}
				
				
				
			}
			public void Html(String n){
				if(n.equals("div")) {
					System.out.println("div �� inline�̰� <div>���� ���� ��</div> ��� ���ϴ�.");
				}
				if(n.equals("span")) {
					System.out.println("div �� inline�̰� <span>���� ���� ��</span> ��� ���ϴ�.");
				}
				
				
			}
			void Num(int b) {
				if(b==1) {
					System.out.println("�ڹٸ� �����ϼ˽��ϴ�.�� ���� �����Ű���?");
					System.out.println("���� �Է��ϼ���: ex)��¹�, equals");
					input2=vs.nextLine();
					Java(input2);
					
				}
				else if(b==2) {
					System.out.println("c�� �����ϼ˽��ϴ�.�� ���� �����Ű���?");
					System.out.println("���� �Է��ϼ���: ex)c��¹�, �ݺ���");
					input2=vs.nextLine();
					Clg(input2);
					
				}
				else if(b==3) {
					System.out.println("html�� �����ϼ˽��ϴ�.�� ���� �����Ű���?");
					System.out.println("���� �Է��ϼ���: ex)div, span");
					input2=vs.nextLine();
					Html(input2);
				}else {
				System.out.println("�̻��� ���� �Է��ϼ˽��ϴ�.");
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


