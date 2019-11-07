//父类
public abstract class Emplyee {
	abstract double earnings();
}
//年薪子类
class YearWorker extends Emplyee{
	double earnings(){
		return 200000;
	}
}
//月薪子类
class MonthWorker extends Emplyee{
	double earnings(){
		return 8000*12;
	}
}
//周薪子类
class WeekWorker extends Emplyee{
	double earnings(){
		return 3000*52;
	}
}
//公司类
class Company{
	Emplyee emplyee[] = new Emplyee[30];
	public Company(Emplyee emplyee[]) {
		// TODO Auto-generated constructor stub
		this.emplyee = emplyee;
	}

	
	
	double salariesPay(){
		double sum = 0;
		for(int i = 0;i<30;i++){
			sum+=emplyee[i].earnings();
		}
		return sum;
	}
}
//测试类






