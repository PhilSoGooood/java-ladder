package controller;

import model.Ladder;

public class LadderController {
    private static LadderController controller;

    private LadderController() {}

    public static LadderController getInstance() {
        if (controller == null) {
            controller = new LadderController();
        }
        return controller;
    }

    public Ladder getLadder(int height, int width) {
        return new Ladder(height, width);
    }
}