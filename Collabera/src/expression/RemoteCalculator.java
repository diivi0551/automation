package expression;

public class RemoteCalculator implements Calculator{

	@Override
	public int add(int...arr) {
		int sum=0;
		for(int a :arr) {
			sum = sum+a;
		}
		return sum;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiple() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	}


