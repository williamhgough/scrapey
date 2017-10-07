package com.github.williamhgough.scrapey.service;

import com.github.williamhgough.scrapey.model.Item;

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
        return null;
    }
}
