package classEx;

public class StudentScore {
    public static void main(String[] args) {
        int scores[][] = {
                {90, 38, 93, 39},
                {38, 76, 54, 65},
                {47, 24, 36, 45}
        };

        for(int i = 0; i < scores.length; i++){
            int sum = 0;
            for(int j = 0; j < scores[i].length; j++){
                sum += scores[i][j];
            }
            double avg = (double) sum / scores[i].length;
            System.out.println( (i+1) + "번 학생의 평균 점수 : " + avg);
        }
    }
}
