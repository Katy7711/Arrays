public class Main {
    public static void main(String[] args) {
        tusk_1_2();
        tusk_3();
        tusk_4();
    }

    public static void tusk_1_2() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0] + "," + weight[1] + "," + weight[2]);
        float[] numbers = {1.57f, 7.654f, 9.986f};
        System.out.println(numbers[0] + " , " + numbers[1] + " , " + numbers[2]);
        int[] cat = new int[5];
        cat[0] = 2;
        cat[1] = 6;
        cat[2] = 7;
        cat[3] = 2;
        cat[4] = 9;
        System.out.println(cat[0] + "," + cat[1] + "," + cat[2] + "," + cat[3] + "," + cat[4]);
    }

    public static void tusk_3() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[2] + "," + weight[1] + "," + weight[0]);
        float[] numbers = {1.57f, 7.654f, 9.986f};
        System.out.println(numbers[2] + " , " + numbers[1] + " , " + numbers[0]);
        int[] cat = new int[5];
        cat[0] = 2;
        cat[1] = 6;
        cat[2] = 7;
        cat[3] = 2;
        cat[4] = 9;
        System.out.println(cat[4] + "," + cat[3] + "," + cat[2] + "," + cat[1] + "," + cat[0]);
    }

    public static void tusk_4() {
        int[] weight = {1, 2, 3};
        for (int j : weight) {
            if (j % 2 != 0) {
                System.out.println(j + 1);
            } else {
                System.out.println(j);
            }
        }
    }
}





        


