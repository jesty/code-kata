package org.alfresco.alfrescofizzbuzz;

import java.util.List;

public class FizzBuzz {

  public String execute(List<Integer> numbers) {
    StringBuilder stringBuilder = new StringBuilder();

    for (Integer number : numbers) {

      if (number % 15 == 0) {
        stringBuilder.append("fizzbuzz");
      } else if (number % 3 == 0) {
        stringBuilder.append("fizz");
      } else if (number % 5 == 0) {
        stringBuilder.append("buzz");
      } else {
        stringBuilder.append(number);
      }

      stringBuilder.append(" ");

    }

    return stringBuilder
        .toString()
        .trim();
  }

}
