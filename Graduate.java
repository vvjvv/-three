package pack3;

public class Graduate implements Student,Teacher{
	String name,sex;
	int age;
	double fee,pay;
	public Graduate(String name,String sex,int age,double fee,double pay){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.fee = fee;
		this.pay = pay;
	}
	public void setPay(double pay){
		this.pay = pay;
	}
	public double getPay(){
		return this.pay;
	}
	public void setFee(double fee){
		this.fee = fee;
	}
	public double getFee(){
		return this.fee;
	}

}