package arpgia.map;

import arpgia.object.entities.Enemy;
import arpgia.object.entities.Entity;
import arpgia.object.entities.Player;

import java.util.ArrayList;
import java.util.Random;

public class DynamicMapManager {
    ArrayList<Entity> map = new ArrayList<>();          //Map
    protected int scale;

    public void createMap(int scale){           //Map scale initialize and creating map
        for(int i = 0; i < scale*scale; i++) {
        map.add(i, null);
        }
        this.scale = scale;
    }
    public void summonEntities(int scale){          // randomly summon entities
        Random random = new Random();
        int playerStartCoordinates = random.nextInt(scale+1);
        Player player = new Player();
        map.set(playerStartCoordinates, player);    //put player to random location between 0 and scale

        Enemy enemy = new Enemy();
        
    }
    public void move(){

    }
    public void writeMap(){

    }
}