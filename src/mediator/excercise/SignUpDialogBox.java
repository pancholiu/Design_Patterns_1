package mediator.excercise;

public class SignUpDialogBox {
    private Button saveButton = new Button();
    private CheckBox checkBox = new CheckBox();
    private TextBox username = new TextBox();
    private TextBox password = new TextBox();

    private void hasChanged() {
        var user = username.getContent();
        var pass = password.getContent();
        var check = checkBox.isChecked();

        var isEnabled = (user != null && pass != null && check);
        saveButton.setEnabled(isEnabled);
    }

    //Keep repliacating ArticlesDialogBox
}
