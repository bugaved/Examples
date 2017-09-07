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
        }
        Sorter sort = new Sorter();
        values = sort.Sorting(values);


        pyramidCounter pc = new pyramidCounter();
        try {
        int floors = pc.countFloors(spl.length);
        PyramidBuilder pb = new PyramidBuilder();
        pb.buildPyramid(values, floors);
        } catch (CannotBuildPyramideException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
