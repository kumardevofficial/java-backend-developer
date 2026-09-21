class Main {
	public static void main(String args[]){
	int n = Integer.parseInt(args[0]);
	System.out.println(n);
	}
}

class StringToInt {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println(number);
    }
}


class AddTenToNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println(number + 10);
    }
}


class SubtractFive {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println(number - 5);
    }
}


class MultiplyByTwo {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println(number * 2);
    }
}


class DivideByTwo {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println(number / 2);
    }
}


class AddTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println(firstNumber + secondNumber);
    }
}


class SubtractTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println(firstNumber - secondNumber);
    }
}


class MultiplyTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println(firstNumber * secondNumber);
    }
}


class DivideTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println(firstNumber / secondNumber);
    }
}


class MaximumOfTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}


class CheckEvenOdd {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}


class CheckPositiveNegative {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}


class CheckGreaterThanTen {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number > 10) {
            System.out.println("Greater than 10");
        } else {
            System.out.println("Not greater than 10");
        }
    }
}


class CheckAgeEligibility {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}


class CheckMarksGrade {
    public static void main(String[] args) {
        int marks = Integer.parseInt(args[0]);

        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Good");
        } else if (marks >= 50) {
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }
    }
}


class AddThreeNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        System.out.println(firstNumber + secondNumber + thirdNumber);
    }
}


class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        int maximum = firstNumber;

        if (secondNumber > maximum) {
            maximum = secondNumber;
        }

        if (thirdNumber > maximum) {
            maximum = thirdNumber;
        }

        System.out.println(maximum);
    }
}


class FindSquareAndCube {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println("Square = " + (number * number));
        System.out.println("Cube = " + (number * number * number));
    }
}


class CalculateTotalPrice {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        int quantity = Integer.parseInt(args[1]);

        System.out.println("Total = " + (price * quantity));
    }
}


class SimpleCalculator {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println("Addition = " + (firstNumber + secondNumber));
        System.out.println("Subtraction = " + (firstNumber - secondNumber));
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        System.out.println("Division = " + (firstNumber / secondNumber));
        System.out.println("Modulus = " + (firstNumber % secondNumber));
    }
}

class FindAbsoluteValue {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number < 0) {
            number = -number;
        }

        System.out.println(number);
    }
}


class CheckDivisibleByFive {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
    }
}


class CheckMultipleOfThree {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number % 3 == 0) {
            System.out.println("Multiple of 3");
        } else {
            System.out.println("Not a multiple of 3");
        }
    }
}


class FindLastDigit {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println(number % 10);
    }
}


class RemoveLastDigit {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        System.out.println(number / 10);
    }
}


class CheckTwoDigitNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number >= 10 && number <= 99) {
            System.out.println("Two digit number");
        } else {
            System.out.println("Not a two digit number");
        }
    }
}


class CheckThreeDigitNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number >= 100 && number <= 999) {
            System.out.println("Three digit number");
        } else {
            System.out.println("Not a three digit number");
        }
    }
}


class FindSmallestOfTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        if (firstNumber < secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}


class FindAverageOfTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        double average = (firstNumber + secondNumber) / 2.0;

        System.out.println(average);
    }
}


class FindRemainder {
    public static void main(String[] args) {
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);

        System.out.println(dividend % divisor);
    }
}


class CheckEqualNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        if (firstNumber == secondNumber) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}


class FindDifferenceAbsolute {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        int difference = firstNumber - secondNumber;

        if (difference < 0) {
            difference = -difference;
        }

        System.out.println(difference);
    }
}


class FindSumOfThreeNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        int sum = firstNumber + secondNumber + thirdNumber;

        System.out.println(sum);
    }
}


class FindAverageOfThreeNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;

        System.out.println(average);
    }
}


class CheckAllPositive {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        if (firstNumber > 0 && secondNumber > 0 && thirdNumber > 0) {
            System.out.println("All Positive");
        } else {
            System.out.println("Not All Positive");
        }
    }
}


class CountPositiveNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        int count = 0;

        if (firstNumber > 0) {
            count++;
        }

        if (secondNumber > 0) {
            count++;
        }

        if (thirdNumber > 0) {
            count++;
        }

        System.out.println(count);
    }
}


class FindMiddleOfThreeNumbers {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        int middle;

        if ((firstNumber >= secondNumber && firstNumber <= thirdNumber) ||
            (firstNumber >= thirdNumber && firstNumber <= secondNumber)) {
            middle = firstNumber;
        } else if ((secondNumber >= firstNumber && secondNumber <= thirdNumber) ||
                   (secondNumber >= thirdNumber && secondNumber <= firstNumber)) {
            middle = secondNumber;
        } else {
            middle = thirdNumber;
        }

        System.out.println(middle);
    }
}


class CalculateSimpleInterest {
    public static void main(String[] args) {
        int principal = Integer.parseInt(args[0]);
        int rate = Integer.parseInt(args[1]);
        int time = Integer.parseInt(args[2]);

        int interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + interest);
    }
}


class CalculateProfit {
    public static void main(String[] args) {
        int costPrice = Integer.parseInt(args[0]);
        int sellingPrice = Integer.parseInt(args[1]);

        if (sellingPrice > costPrice) {
            System.out.println("Profit = " + (sellingPrice - costPrice));
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss = " + (costPrice - sellingPrice));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}


class CalculateTotalWithDiscount {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        int quantity = Integer.parseInt(args[1]);
        int discount = Integer.parseInt(args[2]);

        int total = price * quantity;
        int discountAmount = (total * discount) / 100;
        int finalAmount = total - discountAmount;

        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);
    }
}