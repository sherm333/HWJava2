package HW2Java;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class task4 {
	public static void main(String[] args) throws java.io.IOException
	{
		Logger logger = Logger.getLogger(task4.class.getName());
        FileHandler fh = new FileHandler("log_04.txt", true);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);



		try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print(
            	"Введите первое и второе число - ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.print(
            	"Выберите нужную операцию и нажмите Enter (+, -, *, /, %) - ");
            char op = sc.next().charAt(0);
            solve(a, b, op);
        }
	}
	public static int solve(int a, int b, char op)
	{
		int ans = 0;
		if (op == '+') {
			ans = a + b;
		}
		else if (op == '-') {
			ans = a - b;
		}
		else if (op == '*') {
			ans = a * b;
		}
		else if (op == '%') {
			ans = a % b;
		}
		else if (op == '/') {
			ans = a / b;
		}

		System.out.println("Ваш ответ - " + ans);
		return ans;
	}
}
