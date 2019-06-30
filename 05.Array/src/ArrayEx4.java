// 로또 번호를 생성하는 예제
public class ArrayEx4 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for(int i = 0; i < ball.length; i++) {
            ball[i] = i + 1; // 1~46 까지 값 저장
        }

        // 임의의 위치에 있는 값과 배열의 첫번째 값의 자리를 바꾸는 것을 100번 반복
        for(int i = 0; i < 100; i++) {
            int j = (int) (Math.random() * 45);
            int temp = ball[0];
            ball[0] = ball[j];
            ball[j] = temp;
        }

        // 배열에서 맨 앞 6개의 값을 출력
        for(int i = 0; i < 6; i++) {
            System.out.print(ball[i] + " ");
        }
    }
}
