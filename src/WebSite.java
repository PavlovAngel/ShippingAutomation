import org.jsoup.nodes.Document;


public class WebSite {

    private static String htmlElementOrderQuantity;
    private final String url;
    public String htmlElementLine;
    private Document document;

    WebSite() {
        url = "https://en.wikipedia.org/wiki/" + TextFieldPanel.getUrlFromTextField();
      /* htmlElementLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-6-tab" +
                "let mdc-layout-grid__cell--span-8-desktop";
         htmlElementLine = "toctext";
         htmlElementOrderQuantity = "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet" +
               " mdc-layout-grid__cell--span-2-desktop mdc-layout-grid--align-right";
          */

    }

    public static String getHtmlElementOrderQuantity() {
        return htmlElementOrderQuantity;
    }

    public String getUrl() {

        return url;
    }

    public String getHtmlElementMaterialNumber() {
        return htmlElementLine;
    }

    private void setHtmlElementMaterialNumber(String htmlElementLine) {
        this.htmlElementLine = htmlElementLine;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

}




