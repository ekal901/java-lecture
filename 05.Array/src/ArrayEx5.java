// 버블정렬 알고리즘
public class ArrayEx5 {
    public static void main(String[] args) {
        int[] number = new int[10];

        for(int i = 0; i < number.length; i++) {
            // 0~9 중의 랜덤한 값을 i번째 배열에 대입
            System.out.print(number[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for(int i = 0; i < number.length; i++) {
            boolean changed = false;
            for(int j = 0; j < number.length - 1 - i; j++) {
                if(number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                    changed = true;
                }
            }
            // 자리 바꿈이 없으면 break 수행
            if(!changed) {
                break;
            }
            for(int k = 0; k < number.length; k++) {
                System.out.print(number[k]);
            }
            System.out.println();
        }
    }
}
