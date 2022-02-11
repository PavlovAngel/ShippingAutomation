package Web;

import Frame.TextFieldPanel;
import org.jsoup.nodes.Document;


public class WebSite {

    private static String htmlElementOrderQuantity;
    public static String deliveryNoteUrl = "https://en.wikipedia.org/wiki/";
    private String detailInfoUrl;
    public String htmlElementLine;
    private Document document;


    WebSite() {

      /* htmlElementLine = "mdc-layout-grid__cell mdc-layout-grid__cell--span-6-tab" +
                "let mdc-layout-grid__cell--span-8-desktop";
         htmlElementOrderQuantity = "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet" +
               " mdc-layout-grid__cell--span-2-desktop mdc-layout-grid--align-right";
          */

    }

    public static String getHtmlElementOrderQuantity() {
        return htmlElementOrderQuantity;
    }

    public String getUrl(String url) {

        return deliveryNoteUrl + url;
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




