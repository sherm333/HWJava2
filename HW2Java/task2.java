package HW2Java;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.Arrays;

public class task2 {
	public static void main(String args[]) throws Exception {
		Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log_02.txt", true);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
		
		
		
		int arr[] = new int[10];
		try (Scanner c = new Scanner(System.in)) {
			System.out.println("Введите 10 чисел для сортировки");
			for (int i = 0; i < 10; i++) {
				arr[i] = c.nextInt();
			}
		}
		String str = Arrays.toString(arr);
		System.out.println("Массив");
		System.out.println(str);
		System.out.println("Сортировка шаг за шагом");
		int tmp, i = 0, size = arr.length - 1;
		boolean swap = true;
		while (swap) {
			swap = false;
			i = 0;
			while (i < size) {
				if (arr[i] > arr[i + 1]) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					swap = true;
				}
				i++;
			}
			str = Arrays.toString(arr);
			System.out.println(str);
			System.out.println("Сортировка");
			size--;
		}
		str = Arrays.toString(arr);
		System.out.println(str);
		System.out.println("Отсортировано пузырьком");
	
	}


}