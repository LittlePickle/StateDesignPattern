
public class NintendoState implements State {

    private GameConsole gameConsole;

    // constructor
    public NintendoState(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    @Override
    public void pressHomeButton() {
        gameConsole.setState(gameConsole.getHomeState());
        System.out.println("Display Home Screen...");
    }

    @Override
    public void pressNintendoButton() {
        gameConsole.setState(gameConsole.getNintendoState());
        System.out.println("You are already viewing Nintendo");
    }

    @Override
    public void pressXBoxButton() {
        gameConsole.setState(gameConsole.getXBoxState());
        System.out.println("Starting XBox.");
    }

    @Override
    public void pressGameButton() {
        System.out.println("You have the following games:");
        System.out.println("The Legends of Zelda");
        System.out.println("Super Smash Bros");
        System.out.println("Super Mario");
        System.out.println("Mario Kart");
        System.out.println("Animal Crossing");
        System.out.println("Pokemon");
        System.out.println("");

    }
}
