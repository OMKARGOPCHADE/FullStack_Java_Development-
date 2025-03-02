import java.awt.*;

public class Awt_ex extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("Hello, World (AWT)");
        Label label = new Label("Hello, World!");
        frame.add(label);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
