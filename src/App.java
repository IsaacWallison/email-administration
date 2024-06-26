public class App {
    public static void main(String[] args) throws Exception {
        Email email = new Email("harry", "potter");
        var info = email.showInfo();
        System.out.println(info);
    }
}
