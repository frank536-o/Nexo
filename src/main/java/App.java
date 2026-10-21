import app.configuration.Config;
import app.userInterface.UserInterface;

public class App {
    public static void main(String[] args) {

            UserInterface userInterface = Config.createUserInterface();
        assert userInterface != null;
        userInterface.menuApp();
    }
}
