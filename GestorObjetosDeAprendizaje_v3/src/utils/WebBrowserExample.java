package utils;
public class WebBrowserExample {
    public static void main(String[] args) {
        GuiImportarYCatalogar window = new GuiImportarYCatalogar();
        window.cargarHTMLFile("file:///C:/wamp/www/shadowplay_1/index.html");
        window.setVisible(true);
    }
}
