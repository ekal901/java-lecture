public class ArrayEx3 {
    public static void main(String[] args) {
        int[] number = new int[10];

        for(int i = 0; i < number.length; i++) {
            number[i] = i; // 배열에 0~9의 숫자로 초기화
            System.out.print(number[i]);
        }
        System.out.println();

        // 배열의 임의의 위치에 있는 값과 배열의 첫번째 값을 교환하는 일을 100번 반복
        for(int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10); // 0~9 중의 한 값을 임의로 얻는다
            // number[0]과 number[n]의 값을 서로 바꾼다.
            int temp = number[0];
            number[0] = number[n];
            number[n] = temp;
        }
        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
    }
}
