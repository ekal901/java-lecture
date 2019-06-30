// for문을 사용한 배열 복사
public class ArrayEx11 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        // 1. 더 큰 크기의 새로운 배열을 생성
        int[] newNumber = new int[10];

        // 2. for 문으로 배열 number 의 값을 newNumber 에 저장
        for(int i = 0; i < number.length; i++) {
            newNumber[i] = number[i];
        }
        for(int i = 0; i < newNumber.length; i++) {
            System.out.print(newNumber[i]);
        }
    }
}
