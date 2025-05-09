package io.github.miniplaceholders.expansion.libsdisguises.paper;

import io.github.miniplaceholders.api.Expansion;
import io.github.miniplaceholders.expansion.libsdisguises.paper.placeholder.DisguiseNamePlaceholder;
import io.github.miniplaceholders.expansion.libsdisguises.paper.placeholder.DisguiseTypePlaceholder;
import io.github.miniplaceholders.expansion.libsdisguises.paper.placeholder.PlayerDisguiseNamePlaceholder;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class PaperPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		this.getSLF4JLogger().info("Starting Lib's Disguises Expansion for Paper");

		Expansion.builder("libsdisguises")
				.filter(Player.class)
				.audiencePlaceholder("disguise_name", new DisguiseNamePlaceholder())
				.audiencePlaceholder("disguise_type", new DisguiseTypePlaceholder())
				.audiencePlaceholder("player_disguise_name", new PlayerDisguiseNamePlaceholder())
				.build()
				.register();
	}
}
