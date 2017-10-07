package com.github.williamhgough.scrapey;

import com.github.williamhgough.scrapey.model.Item;
import com.github.williamhgough.scrapey.service.Scraper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        Scraper scraper = new Scraper(args[0]);
        items = scraper.fetchAllItems();
    }
}
