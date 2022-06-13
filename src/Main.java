import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        String ex1 = "т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";
        String ex2 = "т.к. строка не является математической операцией";
        String ex3 = "т.к. используются одновременно разные системы счисления";
        String ex4 = "т.к. в римской системе нет отрицательных чисел";

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] elements = str.split(" ");
        if (elements.length > 3) throw new ArrayIndexOutOfBoundsException(ex1);
        if (elements.length <= 1) throw new ArrayIndexOutOfBoundsException(ex2);
        if (isDigit(elements[0]) != isDigit(elements[2])) throw new Exception(ex3);

        Solution answer = new Solution();
        boolean flag = false;
        int operand;
        if (isDigit(elements[0]) && isDigit(elements[2])){
            flag = true;
        }

        for (int i = 0; i < 3; i += 2) {
            int indx = 0;

            if(!flag) {
                int[] romeOperand = new int[elements[i].length()];
                while (indx < elements[i].length()) {

                    char r = elements[i].charAt(indx);
                    String rome = String.valueOf(r);
                    RomeNumber letter = RomeNumber.valueOf(rome);
                    romeOperand[indx] = letter.getValue();
                    if (indx != 0) {
                        if (romeOperand[indx - 1] < romeOperand[indx]) {
                            romeOperand[indx - 1] *= -1;
                        }
                    }
                    indx++;
                }
                operand = 0;
                for (int x : romeOperand) {
                    operand += x;
                }
            }
            else {
                operand = Integer.parseInt(elements[i]);
            }
            if (i == 0){
                answer.a = operand;
            }
            else {
                answer.b = operand;
            }
        }
        if (flag){
            System.out.println(answer.solve(elements[1]));
        }
        else {
            if (answer.romeSolve(elements[1]) == "") throw new Exception(ex4);

            System.out.println(answer.romeSolve(elements[1]));
        }
        }
    public static boolean isDigit(String roa){
        for (int i = 0; i < roa.length(); i++){
            if (Character.isDigit(roa.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    }












