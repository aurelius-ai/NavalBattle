package com.jpii.navalbattle.turn;

import java.util.ArrayList;

import com.jpii.navalbattle.game.NavalManager;
import com.jpii.navalbattle.pavo.grid.Entity;
import com.jpii.navalbattle.pavo.grid.GridedEntityTileOrientation;
import com.jpii.navalbattle.game.entity.MoveableEntity;

public class AI extends Player{
	
	NavalManager nm;
	ArrayList<Entity> enemies;
	
	public AI(NavalManager nm,String name) {
		super(name);
		enemies = new ArrayList<Entity>();
		this.nm = nm;
	}
	
	public void addEntity(Entity e){
		enemies.add(e);
	}
	
	
	public void takeTurn(){
		for(int k = 0; k < getTotalEntities(); k++)
		{
			Entity ent = getEntity(k);
			MoveableEntity currentEntity;
			if(ent.getHandle()%10 == 1){
				currentEntity = (MoveableEntity)ent;
				if(currentEntity.getHandle()==21){
					//AC
				}
				if(currentEntity.getHandle()==11){
					//Sub
				}
				if(currentEntity.getHandle()==31){
					//BS
				}
			}
			
		}
		turnOver=true;
	}
	
	public void endTurn(){
		super.endTurn();
	}
}
