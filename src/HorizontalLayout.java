import javax.swing.*;

public class HorizontalLayout extends JPanel {

    public HorizontalLayout() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        drawComponents();
    }

    private void drawComponents() {
        JTextField numberDisplay = new JTextField("0");
        add(numberDisplay);
    }
}
