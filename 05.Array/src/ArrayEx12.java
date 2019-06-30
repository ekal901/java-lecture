// System 클래스의 arraycopy를 이용한 배열 복사
public class ArrayEx12 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        // 두 배열의 크기를 합친 result 배열을 만들고
        // result 배열에 두 배열을 차곡차곡 담음
        char[] result = new char[abc.length + number.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(number, 0, result, abc.length, number.length);
        System.out.println(new String(result)); // ABCD0123456789

        System.arraycopy(abc, 0, number, 0, abc.length);
        System.out.println(new String(number)); //ABCD456789

        System.arraycopy(abc, 0, number, 6, 3);
        System.out.println(new String(number)); //ABCD45ABC9
    }
}
