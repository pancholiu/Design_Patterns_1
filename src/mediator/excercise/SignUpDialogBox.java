package mediator.excercise;

public class SignUpDialogBox {
    private Button saveButton = new Button();
    private CheckBox checkBox = new CheckBox();
    private TextBox username = new TextBox();
    private TextBox password = new TextBox();

    public SignUpDialogBox() {
        checkBox.addEventHandler(this::hasChanged);
        username.addEventHandler(this::hasChanged);
        password.addEventHandler(this::hasChanged);
    }

    public void simulateUserInteraction() {
        checkBox.setChecked(true);
        username.setContent("kk");
        password.setContent("ll");
        System.out.println("Button: " + saveButton.isEnabled());
        System.out.println("checkbox: " + checkBox.isChecked());
        System.out.println("username: " + username.getContent());
        System.out.println("Password: " + password.getContent());
    }

    private void hasChanged() {
        var user = username.getContent();
        var pass = password.getContent();
        var check = checkBox.isChecked();

        var isEnabled = (user != null && user != "" &&
                            pass != null && pass != "" && check);
        saveButton.setEnabled(isEnabled);
    }


}
