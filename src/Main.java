public class Main {
    public static void main(String[] args) {

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] numbers = {1.57f, 7.654f, 9.986f};
        int[] cat = {1, 2, 3, 4, 5};

        for (int i = 0; i < weight.length; i++) {
            if (i != weight.length - 1) {
                System.out.print(weight[i] + " ");
            } else {
                System.out.println(weight[i]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + " ");
            } else {
                System.out.println(numbers[i]);
            }
        }
        for (int i = 0; i < cat.length; i++) {
            if (i != cat.length - 1) {
                System.out.print(cat[i] + " ");
            } else {
                System.out.println(cat[i]);
            }
        }


        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weight[i] + " ");
            } else {
                System.out.println(weight[i]);
            }
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + " ");
            } else {
                System.out.println(numbers[i]);
            }
        }
        for (int i = cat.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(cat[i] + " ");
            } else {
                System.out.println(cat[i]);
            }
        }


        int[] weights = {1, 2, 3};
        for (int j : weights) {
            if (j % 2 != 0) {
                System.out.println(j + 1);
            } else {
                System.out.println(j);


            }
        }
    }
}