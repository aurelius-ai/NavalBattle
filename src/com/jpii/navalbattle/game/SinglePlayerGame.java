/*
 * Copyright (C) 2012 JPII and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.jpii.navalbattle.game;

import javax.swing.*;


import com.jpii.navalbattle.NavalBattle;
import com.jpii.navalbattle.gui.BaseWindow;
import com.jpii.navalbattle.pavo.Game;

public class SinglePlayerGame extends BaseWindow {
	private static final long serialVersionUID = 1L;
	
	StageManager sm;
	GameComponent game;
	
	public SinglePlayerGame(){
		myHandler.registerWhiteList(this);
		sm = new StageManager();
		GameComponent.frame = this;
		game = sm.getGameComponent();
	}
	
	public void setGameVars() {
		game.setLocation(0,40);
		setContentPane(game);
		this.getContentPane().setLayout(null);
		setSize(Game.Settings.currentWidth,Game.Settings.currentHeight-40);
		setLocation(0,0);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public void setNewGame(){
		game = sm.getGameComponent();
		setGameVars();
	}
	
	public void setVisible(boolean visible){
		super.setVisible(visible);
		if(isVisible()){
			NavalBattle.getWindowHandler().disposeContained();
		}
	}
	
	public void toggleFullscreen(){
		game.toggleFullscreen();
	}
}
