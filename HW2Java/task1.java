package HW2Java;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class task1 {
  
  public static void main(String[] args) {
    Scanner str = new Scanner(System.in);
    str.close();
  }

  public static void task1() {
    /*
     * 1.Дана строка sql-запроса "select * from students where ".
     * Сформируйте часть WHERE этого запроса, используя StringBuilder.
     * Данные для фильтрации приведены ниже в виде json строки.
     * Если значение null, то параметр не должен попадать в запрос.
     * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
     * "city":"Moscow", "age":"null"}
     */

    String inputParametrs = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    StringBuilder query = new StringBuilder("SELECT *\nFROM students\nWHERE ");

    String replacementChars = "[\"{},]";
    String[] parsedString = inputParametrs.replaceAll(replacementChars, "").split(" ");

    String[] parametrs = new String[2];
    for (int i = 0; i < parsedString.length; i++) {
      parametrs = parsedString[i].split(":");

      if (!parametrs[1].equals("null")) {
        if (i != 0)
          query.append(" AND ");
        query.append(parametrs[0] + " = \"" + parametrs[1] + "\"");
      }
    }

    System.out.println("Итоговый запрос:\n" + query);

  }
}
