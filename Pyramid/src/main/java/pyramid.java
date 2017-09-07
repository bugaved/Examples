import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Created by bugav on 07.09.2017.
 */
public class pyramid {
    public static void main(String[] args) throws CannotBuildPyramideException {
        InputReader x;
        x = new InputReader();
        String s = x.readInput();
        System.out.println(s);
        String[] spl = s.split(",");
        int[] values = new int[spl.length];
        for (int i = 0; i < spl.length; i++) {
            values[i] = parseInt(spl[i]);
            System.out.println(values[i]);
        }
        Sorter sort = new Sorter();
        values = sort.Sorting(values);
        for (int i = 0; i < spl.length; i++) {
            System.out.println(values[i]);
        }
        pyramidCounter pc = new pyramidCounter();
        int floors = pc.countFloors(spl.length);

        PyramidBuilder pb = new PyramidBuilder();
        pb.buildPyramid(values, floors);

    }
}
