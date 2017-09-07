
public class pyramidCounter {
    int floors = 0;
    boolean canBuild = false;
    int numberOfBlocks = 0;
    int step = 1;

    public int countFloors(int numberOfValues) throws CannotBuildPyramideException {
        for (int x = 0; x <= numberOfValues; x++) {
            numberOfBlocks = numberOfBlocks + step;
            floors++;
            if (numberOfBlocks == numberOfValues) {
                canBuild = true;
                break;
            }
            step++;

        }
        if (canBuild == true) {
            return floors;
        } else {
            throw new CannotBuildPyramideException("cannot build pyramide");
        }
    }

}
