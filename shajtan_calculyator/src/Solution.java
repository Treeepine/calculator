class Solution {
    int a;
    int b;

    float solve(String oper) {
        float answer = 0.0f;
        switch (oper) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            case "/":
                answer = a / b;
                break;

        }
        return answer;
    }

    String romeSolve(String oper) {
        int answer = 0;
        switch (oper) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            case "/":
                answer = a / b;
                break;

        }

        String s = "";
        while (answer >= 1000) {
            s += "M";
            answer -= 1000;        }
        while (answer >= 900) {
            s += "CM";
            answer -= 900;
        }
        while (answer >= 500) {
            s += "D";
            answer -= 500;
        }
        while (answer >= 400) {
            s += "CD";
            answer -= 400;
        }
        while (answer >= 100) {
            s += "C";
            answer -= 100;
        }
        while (answer >= 90) {
            s += "XC";
            answer -= 90;
        }
        while (answer >= 50) {
            s += "L";
            answer -= 50;
        }
        while (answer >= 40) {
            s += "XL";
            answer -= 40;
        }
        while (answer >= 10) {
            s += "X";
            answer -= 10;
        }
        while (answer >= 9) {
            s += "IX";
            answer -= 9;
        }
        while (answer >= 5) {
            s += "V";
            answer -= 5;
        }
        while (answer >= 4) {
            s += "IV";
            answer -= 4;
        }
        while (answer >= 1) {
            s += "I";
            answer -= 1;
        }
        return s;
    }

}
