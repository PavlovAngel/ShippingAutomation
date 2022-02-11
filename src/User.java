import org.apache.commons.codec.binary.Base64;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;


public class User {
    private static final String login = Account.getUserName() + ":" + Account.getPassword();
    private static final WebSite site = new WebSite();

    public static void loginToSite() throws IOException {
        String base64login = new String(Base64.encodeBase64(login.getBytes()));
        Connection.Response response = Jsoup
                .connect(site.getUrl())
                .timeout(30000)
                .method(Connection.Method.GET)
                .userAgent(
                        "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0")
                .header("Authorization", "Basic " + base64login)
                .execute();
        site.setDocument(response.parse());

    }


   /* public static String getOrderQuantity() throws IOException {

        int lines = impulse.getDocument()
                .body()
                .getElementsByClass(impulse.getHtmlElementMaterialNumber())
                .size();
        String quantity;
        int currentOrderQuantity;
        System.out.println(impulse.getDocument().body()
                .getElementsByClass(impulse.getHtmlElementMaterialNumber()).text());
        String line = impulse.getDocument().body()
                .getElementsByClass(impulse.getHtmlElementMaterialNumber())
                .eq(lines - 1)
                .text();
        System.out.println(line);
        String[] matNum = line.split(" ");
        String materialNumber = matNum[0].substring(1); // 1-9 (1)/ 10-99 (2)

        for (int i = 1; i < lines; i++) {
            String lastLine = impulse.getDocument().body()
                    .getElementsByClass(impulse.getHtmlElementMaterialNumber())
                    .eq(lines - i).text();
            String[] lastMatNum = lastLine.split(" ");
            String lastMaterialNumber = lastMatNum[0].substring(2);
            if (materialNumber.equals(lastMaterialNumber)) {
                quantity = impulse.getDocument()
                        .body()
                        .getElementsByClass(WebSite.getHtmlElementOrderQuantity())
                        .eq(lines - i)
                        .text();
                currentOrderQuantity = Integer.parseInt(quantity);
            }

        }

        return null;
    }*/
   static void printHtml(){
        System.out.println(site.getDocument());
    }
}

