public class ArrayEx6 {
    public static void main(String[] args) {
        int[] number = new int[10];
        int[] counter = new int[10];

        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i] = (int) (Math.random() * 10));
        }
        System.out.println(number);
        System.out.println();

        for (int i : number) {
            counter[i]++; // 각 배열의 0~9까지 숫자의 반복하는 수를 카운트
        }

        for(int i = 0; i < number.length; i++) {
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    }
}
