import javax.swing.*;
public class ArrayEx16 {
    public static void main(String[] args) {
        int answer = (int) ((Math.random() * 100) + 1);
        int input = 0;
        String temp = "";
        int count = 0;

        do {
            count++;
            temp = JOptionPane.showInputDialog("type a number between 1 ~ 100." +
                    "type -1 to finish.");
            if(temp == null || temp.equals("-1")) {
                break;
            }

            System.out.println("input: " + temp);
            input = Integer.parseInt(temp); // String으로 받아오기 때문에 int로 변환

            if(answer > input) {
                System.out.println("please type larger number");
            } else if(answer < input) {
                System.out.println("please type smaller number");
            } else {
                System.out.println("Correct!");
                System.out.println("You've Tried " + count + " times");
                break;
            }
        } while (true);
    }
}
