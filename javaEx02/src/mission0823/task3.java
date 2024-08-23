package mission0823;

public class task3 {
    static double avgList(int[] list){
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double avg = (double) sum / list.length;
        return avg;
    }
    static void changeElement(int[] list, int i){
        list[i] = 99;
    }
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("배열의 평균은 : " + avgList(list));

        changeElement(list, 0);

        System.out.print("바뀐 배열 출력 : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
