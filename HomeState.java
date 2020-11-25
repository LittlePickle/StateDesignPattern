
public class HomeState implements State {

    private GameConsole gameConsole;

    // constructor
    public HomeState(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    @Override
    public void pressHomeButton() {
        gameConsole.setState(gameConsole.getHomeState());
        System.out.println("You are already on the home screen.");
    }

    @Override
    public void pressNintendoButton() {
        gameConsole.setState(gameConsole.getNintendoState());
        System.out.println("Starting Nintendo...");
    }

    @Override
    public void pressXBoxButton() {
        gameConsole.setState(gameConsole.getXBoxState());
        System.out.println("Starting XBox.");
    }

    @Override
    public void pressGameButton() {
        System.out.println("You have to pick a gaming system to play.");
    }
}
