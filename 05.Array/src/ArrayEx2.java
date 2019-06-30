public class ArrayEx2 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0]; // 배열의 첫번째 값으로 최대값 초기화
        int min = score[0]; // 배열의 첫번째 값으로 최소값 초기화

        // 배열의 두번째 요소부터 비교
        for(int i = 1; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            }
            if(score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("max : " +max);
        System.out.println("min: " + min);
    }
}
