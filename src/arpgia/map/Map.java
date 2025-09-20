package arpgia.map;

import arpgia.object.Entity;

import java.util.ArrayList;

public class Map {
    ArrayList<Entity> map = new ArrayList<>();
    public void createMap(int scale){
        for(int i = 0; i < scale; i++) {
        map.add(i, null);
        }
    }
    public void summonEntities(){

    }
    public void move(){

    }
    public void writeMap(){

    }
}