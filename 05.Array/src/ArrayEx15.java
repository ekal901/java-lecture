public class ArrayEx15 {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("usage: java ArrayEx15 NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]); // 문자열을 숫자로 변환
        char op = args[1].charAt(0); // 문자열을 문자(char)로 변환
        int num2 = Integer.parseInt(args[2]);

        int result = 0;
        switch(op) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
            default :
                System.out.println("This operator is not supported");
        }
        System.out.println("Result: " + result);
    }
}
