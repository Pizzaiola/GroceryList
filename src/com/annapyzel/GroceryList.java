package com.annapyzel;

import java.util.ArrayList;

//second comment

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
    public void printGroceryList(){
        System.out.println("You have " + (groceryList.size()) + " items in your grocery list.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void modifyGroceryItem (String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position>=0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem (int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    public void removeGroceryItem (String item){
        int position = findItem(item);
        if (position>=0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    private int findItem(String name){
        return groceryList.indexOf(name);
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }

}
