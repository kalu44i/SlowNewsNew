package com.github.kalu44i.slownews.beans;


import com.github.kalu44i.slownews.jaxbModels.RssType;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

/**
 * Created by NickVeremeichyk on 7/20/15.
 */
public class Main {
    public static void main(String[] args) throws JAXBException {
//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target("https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5");
//        Response response = target.request().get();
//        Exchangerates s = response.readEntity(Exchangerates.class);
//        List<Row> list = s.getRows();
//        for (Row r : list) {
//            System.out.println(r.getBuy());
//        }
//        System.out.println(s);
//        JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        StringReader sr = new StringReader(s);
//        StreamSource ss = new StreamSource(sr);
//        Rss rss = (Rss) unmarshaller.unmarshal(ss);
//        List<Item> list = rss.getChannel().getItems();
//        for (Item i : list) {
//            System.out.println(i.getTitle());

       Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://www.forbes.com/most-popular/feed/");
        Response resp = target.request().get();
        RssType rss = resp.readEntity(RssType.class);
        System.out.println(rss);
        System.out.println(rss.getVersion());
        System.out.println(rss.getChannel().getItem().get(0).getTitle());
        System.out.println(rss.getChannel().getItem().get(0).getDescription());
        System.out.println(rss.getChannel().getImage().getLink());
//        }
    }
}
