package com.github.williamhgough.scrapey.service;

import com.github.williamhgough.scrapey.model.Item;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class Scraper implements DataStore {
    private String url;
    private List<Item> items;

    public Scraper(String url) {
        this.url = url;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public List<Item> fetchAllItems() {
        try {
            Document document = Jsoup.connect(this.url).get();
            Elements itemNodes = document.getElementsByClass("gridItem");

            for (Element itemNode : itemNodes) {
                try {
                    Item item = this.extractItem(itemNode);
                    if(item != null) {
                        this.items.add(item);
                    }
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return this.items;
    }

    private Item extractItem(Element itemNode) {
        Item item = new Item();
        System.out.println(itemNode.getElementsByTag("a").text());
        return item;
    }
}
