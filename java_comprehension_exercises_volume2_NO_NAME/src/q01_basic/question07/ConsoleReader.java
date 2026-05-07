package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String num = reader.readLine();
		int input_num = Integer.parseInt(num);
		return input_num;

	}

}
