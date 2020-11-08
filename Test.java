package pack3;
import java.util.Scanner;
public class Test {
	public static void Devide(String n,Graduate a) throws ErrorException{
		if (n.equals("1")){System.out.println("缴费成功");
		System.out.println("姓名：张三 性别：女 年龄：22岁，每月薪水：10000 每学期学费：5000 应缴纳金额："+(0.03*(a.getPay()-a.getFee()-3000))); }
		else{throw new ErrorException();
		}
	}
	public static void Devid(String ni,Graduate b) throws ErrorException{
		if (ni.equals("1")){System.out.println("缴费成功");
		System.out.println("姓名：李四 性别：男 年龄：24岁，每月薪水：10000 每学期学费：5000 应缴纳金额："+(0.03*(b.getPay()-b.getFee()-3000))); }
		else{throw new ErrorException();
		}
	}
	public static void main(String[] args){
		Graduate zhang = new Graduate("张三","女",22,5000,10000);
		Graduate li = new Graduate("李四","男",24,5000,10000);
		try{
			System.out.println("张三 女 22岁");
			System.out.println("应缴纳学费："+li.getFee()+"（缴费完成后请输入1）");
			Scanner i = new Scanner(System.in);
			String n = i.nextLine();
			Devide(n,li);
			System.out.println("李四 男 24岁");
			System.out.println("应缴纳学费："+zhang.getFee()+"（缴费完成后请输入1）");
			Scanner ip = new Scanner(System.in);
			String ni = ip.nextLine();
			Devid(ni,zhang);
			}
		catch(ErrorException e){
			System.out.println(e.getErrorEx());
		}
	}
	}
