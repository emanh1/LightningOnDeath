package com.ezyro.emanhmc;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;

public class LightningOnDeath {
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		Player p = (Player)e.getEntity().getPlayer();
		p.getWorld().strikeLightningEffect(p.getLocation());
	}

}
