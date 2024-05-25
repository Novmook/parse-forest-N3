package N3;

public class Less3 {
    public static void main(String[] args) {
        String forest = " 20 10 11 12 13 14 15 17 17 19 5 1 5 2 2 4 1 4 5 1 5 3 2 4 4 4 5 1 3 4 2 2 1 2 4 4 4 5 4 3 5 4 4 5 5 1 4 1 5 3 1 4 5 3 3 4 2 2 4 4 5 5 1 1 1 4 5 5 4 4 2 4 3 1 3 3 1 1 3 1 3 4 4 3 2 2 1 3 4 4 2 3 4 2 4 4 1 4 4 4 2 1 2 4 1 5 2 2 5 4 2 2 3 1 5 5 3 5 3 1 4 5 4 2 1 3 1 2 1 4 1 3 4 2 2 5 2 3 1 1 2 3 3 4 4 2 4 1 2 2 2 5 1 5 1 2 2 1 3 3 4 3 5 3 5 1 2 1 3 3 2 4 1 4 3 5 1 2 1 2 3 2 1 3 2 2 4 3 2 1 5 1 4 5 4 4 5 5 4 2 3 5 1 3 4 3 2 4 5 2 5 2 4 1 4 5 2 3 3 4 4 3 5 2 2 3 5 1 2 4 3 4 4 3 2 2 1 4 5 5 1 5 2 4 5 5 4 2 2 1 5 1 3 4 2 4 2 2 4 3 5 2 2 4 4 4 5 5 2 5 5 2 5 1 1 5 5 4 1 2 4 1 2 2 5 4 5 1 5 4 4 5 5 5 3 3 4 3 3 5 3 2 2 2 2 2 1 2 5 2 3 4 3 5 5 2 4 5 3 4 3 1 3 2 1 1 5 4 4 2 3 1 3 4 2 4 1 3 5 1 5 3 5 2 3 4 4 1 3 1 5 5 1 2 2 1 3 1 5 1 2 2 1 5 1 3 3 2 1 3 2 5 1 1 2 3 5 5 4 3 1 3 3 1 5 4 2 3 4";
        int[] result = parseForest(forest);

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0)
                System.out.println(i + 1 + " - " + result[i]);
        }
    }

    public static int[] parseForest(String forest) {
        int ind = 0;
        String tmp = "";
        int[] result = new int[20];
        for (int i = 0; i < 20; i++)
            result[i] = 0;
        do {
            if (forest.charAt(ind) == ' ') {
                if (ind != 0) {
                    int tmpInt = Integer.parseInt(tmp);
                    result[tmpInt - 1]++;
                }
                tmp = "";
            } else {
                tmp += forest.charAt(ind);
                if (ind == forest.length() - 1) {
                    int tmpInt = Integer.parseInt(tmp);
                    result[tmpInt - 1]++;
                }
            }
            ind++;
        } while (ind < forest.length());
        return result;
    }
}
