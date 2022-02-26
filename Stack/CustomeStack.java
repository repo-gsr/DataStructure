package Stack;

public class CustomeStack {

	int DefaultSize = 16;

	Object[] data = new Object[DefaultSize];

	int topPostion = 0;

	public void push(Object inputData) {
		if (data.length == 0) {
			data[topPostion] = inputData;
		} else {
			data[topPostion++] = inputData;
		}
	}

	public Object pop() {
		return data[topPostion - 1];
	}

	public void display() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
