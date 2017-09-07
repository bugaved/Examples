
public class PyramidBuilder {
    int width;
    int height;

    public int[][] buildPyramid(int[] x, int floors )throws CannotBuildPyramideException {
        height = floors;
        System.out.println(floors);
        width = floors * 2 - 1;
        int k = 0;
        int counter = 2;
        int[][] intArray = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int z = 0; z < width; z++) {
                if ((z == (width / 2) - y) || (z == (width / 2) + y) || ((y >= counter) && ((z == width / 2 - y + counter) || z == width / 2 + y - counter))) {
                    intArray[y][z] = x[k];
                    k++;
                    if (y == counter + 2) {
                        counter = counter + 2;
                    }
                }
                System.out.print(intArray[y][z]);
            }
            System.out.println();
        }

        return intArray;
    }
}
