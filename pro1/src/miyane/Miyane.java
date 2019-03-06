package miyane;
public class Miyane {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 9,10};
        int L;
        int miyane;
        L = numbers.length;
        if (L % 2 == 0) {
            miyane = (numbers[L / 2] + numbers[((L / 2) - 1)]) / 2;

        }else{
                miyane =  numbers[((L-1) / 2) ];
        }
        System.out.println(miyane);
        }
    }
