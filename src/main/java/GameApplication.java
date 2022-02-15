import domain.game.LadderGameService;
import domain.ladder.Ladder;
import view.input.InputView;
import view.output.OutputView;

public class GameApplication {

    private AppConfig ac;
    private InputView inputView;
    private OutputView outputView;
    private LadderGameService ladderGameService;

    public GameApplication() {
        init();
    }

    private void init() {
        ac = AppConfig.getInstance();
        inputView = ac.inputView();
        outputView = ac.outputView();
        ladderGameService = ac.ladderGameService();
    }

    public void run() {
        initLadderGame();
        Ladder ladder = ladderGameService.getLadder();
        outputView.printLadder(ladder);
        ac.close();
    }

    public void initLadderGame() {
        int entry = inputView.inputEntry();
        int height = inputView.inputHeight();
        ladderGameService.initLadderGame(entry,height);
    }
}