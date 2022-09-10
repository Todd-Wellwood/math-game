import java.util.Random;

public class Question {
    int a;
    int b;
    String operand;

    public Question(String operand) {
        this.operand = operand;
        generateQuestion(operand);
    }

    public Question() {
        if (new Random().nextBoolean()) {
            if (new Random().nextBoolean()) {
                this.operand = "+";
            }
            else {
                this.operand = "-";
            }
        }
        else {
            if (new Random().nextBoolean()) {
                this.operand = "*";
            }
            else {
                this.operand = "/";
            }
        }

        generateQuestion(operand);
    }

    private void generateQuestion(String operand) {
        switch (operand) {
            case ("+"):
                generatePlusQuestion();
                break;
            case "-":
                generateMinusQuestion();
                break;
            case "*":
                generateTimesQuestion();
                break;
            case "/":
                generateDivideQuestion();
                break;
            default:
                throw new IllegalArgumentException("Unknown operand " + operand);
        }
    }

    private void generatePlusQuestion() {
        this.a = (int) (Math.random() * (11 - 1) + 1);
        this.b = (int) (Math.random() * (11 - 1) + 1);
    }

    private void generateMinusQuestion() {
        this.a = (int) (Math.random() * (11 - 1) + 1);
        this.b = (int) (Math.random() * (11 - 1) + 1);
    }

    private void generateTimesQuestion() {
        this.a = (int) (Math.random() * (13 - 1) + 1);
        this.b = (int) (Math.random() * (13 - 1) + 1);
    }

    private void generateDivideQuestion() {
        int firstNum = (int) (Math.random() * (13 - 1) + 1);
        int secondNum = (int) (Math.random() * (13 - 1) + 1);
        int answer = firstNum * secondNum;

        this.a = answer;
        if (new Random().nextBoolean())
            this.b = firstNum;
        else
            this.b = secondNum;
    }

    public int solve() {
        if (operand.equals("+")) {
            return a + b;
        }
        if (operand.equals("-")) {
            return a - b;
        }
        if (operand.equals("*")) {
            return a * b;
        }
        if (operand.equals("/")) {
            return a / b;
        }
        throw new IllegalArgumentException("Invalid operand type");
    }

    public String getQuestionAsText() {
        return a + " " + operand + " " + b;
    }
}
