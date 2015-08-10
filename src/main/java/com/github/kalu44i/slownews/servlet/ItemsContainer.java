package com.github.kalu44i.slownews.servlet;

import com.github.kalu44i.slownews.jaxbModels.ItemType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NickVeremeichyk on 7/29/15.
 */
public class ItemsContainer {
    private static List<ItemType> items;
    private static List<ItemType> achievedItems;

    ItemsContainer() {}

    public static List<ItemType> getItems() {
        return items;
    }

    public static List<ItemType> getAchievedItems() {
        return achievedItems;
    }

    public static void setItems(List<ItemType> items) {
        ItemsContainer.items = items;
    }

    public static void setAchievedItems(List<ItemType> achievedItems) {
        ItemsContainer.achievedItems = achievedItems;
    }
}
