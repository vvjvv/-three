package pack3;
import java.util.Scanner;
public class Test {
	public static void Devide(String n,Graduate a) throws ErrorException{
		if (n.equals("1")){System.out.println("�ɷѳɹ�");
		System.out.println("���������� �Ա�Ů ���䣺22�꣬ÿ��нˮ��10000 ÿѧ��ѧ�ѣ�5000 Ӧ���ɽ�"+(0.03*(a.getPay()-a.getFee()-3000))); }
		else{throw new ErrorException();
		}
	}
	public static void Devid(String ni,Graduate b) throws ErrorException{
		if (ni.equals("1")){System.out.println("�ɷѳɹ�");
		System.out.println("���������� �Ա��� ���䣺24�꣬ÿ��нˮ��10000 ÿѧ��ѧ�ѣ�5000 Ӧ���ɽ�"+(0.03*(b.getPay()-b.getFee()-3000))); }
		else{throw new ErrorException();
		}
	}
	public static void main(String[] args){
		Graduate zhang = new Graduate("����","Ů",22,5000,10000);
		Graduate li = new Graduate("����","��",24,5000,10000);
		try{
			System.out.println("���� Ů 22��");
			System.out.println("Ӧ����ѧ�ѣ�"+li.getFee()+"���ɷ���ɺ�������1��");
			Scanner i = new Scanner(System.in);
			String n = i.nextLine();
			Devide(n,li);
			System.out.println("���� �� 24��");
			System.out.println("Ӧ����ѧ�ѣ�"+zhang.getFee()+"���ɷ���ɺ�������1��");
			Scanner ip = new Scanner(System.in);
			String ni = ip.nextLine();
			Devid(ni,zhang);
			}
		catch(ErrorException e){
			System.out.println(e.getErrorEx());
		}
	}
	}
