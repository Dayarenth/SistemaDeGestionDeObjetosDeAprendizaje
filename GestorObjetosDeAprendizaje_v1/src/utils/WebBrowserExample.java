package utils;
public class WebBrowserExample {
    public static void main(String[] args) {
        JFrameWindow window = new JFrameWindow();
        window.cargarHTMLFile("file:///C:/wamp/www/shadowplay_1/index.html");
        window.setVisible(true);
    }
}
