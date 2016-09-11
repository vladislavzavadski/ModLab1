package sample;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void execute() throws InvalidParameterException {
        model.setValues(new LemarService().getRandomNumbersQue(model));
    }
}
