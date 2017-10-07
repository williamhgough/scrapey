package com.github.williamhgough.scrapey.service;

import com.github.williamhgough.scrapey.model.Item;

import java.util.List;

public interface DataStore {
    List<Item> getAllItems();
}
