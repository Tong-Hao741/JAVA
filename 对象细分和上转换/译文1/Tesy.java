
public class Tesy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyee H[] = new Emplyee[30];
		Emplyee A[] = new YearWorker[10];
		Emplyee B[] = new MonthWorker[10];
		Emplyee C[] = new WeekWorker[10];
		int j = 0;
		for(int i = 0;i<10;i++){
			A[i]=new YearWorker();
			H[j] = A[i];j++;
			B[i]=new MonthWorker();
			H[j] = B[i];j++;
			C[i]=new WeekWorker();
			H[j] = C[i];j++;
		}
		Company HUAWEI = new Company(H);
		System.out.println(HUAWEI.salariesPay());
	}

}
