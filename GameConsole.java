// represent the game console
public class GameConsole {

    private State HomeState;
    private State NintendoState;
    private State XBoxState;
    private State state;

    public GameConsole() {

        HomeState = new HomeState(this);
        NintendoState = new NintendoState(this);
        XBoxState = new XBoxState(this);

        setState(HomeState);

        System.out.println("Starting up the Game Console");
    }

    // calls press home button on the state variable
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    // calls press nintendo button on the state variable
    public void pressNintendoButton() {
        state.pressNintendoButton();
    }

    // calls press xBox button on the state variable
    public void pressXBoxButton() {
        state.pressXBoxButton();
    }

    // calls press game button on the state variable
    public void pressGameButton() {
        state.pressGameButton();
    }

    /**
     * @return the HomeState
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * @return the NintendoState
     */
    public State getNintendoState() {
        return NintendoState;
    }

    /**
     * @return the xBoxState
     */
    public State getXBoxState() {
        return XBoxState;
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }

}
