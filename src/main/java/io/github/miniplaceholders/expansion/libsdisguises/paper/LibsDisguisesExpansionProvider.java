package io.github.miniplaceholders.expansion.libsdisguises.paper;

import io.github.miniplaceholders.api.Expansion;
import io.github.miniplaceholders.api.provider.ExpansionProvider;
import io.github.miniplaceholders.api.provider.LoadRequirement;
import io.github.miniplaceholders.api.types.Platform;
import io.github.miniplaceholders.expansion.libsdisguises.paper.placeholder.DisguiseNamePlaceholder;
import io.github.miniplaceholders.expansion.libsdisguises.paper.placeholder.DisguiseTypePlaceholder;
import io.github.miniplaceholders.expansion.libsdisguises.paper.placeholder.PlayerDisguiseNamePlaceholder;
import org.bukkit.entity.Player;

public final class LibsDisguisesExpansionProvider implements ExpansionProvider {
	@Override
	public Expansion provideExpansion() {
		return Expansion.builder("libsdisguises")
				.author("FabianAdrian")
				.version("1.0.0-SNAPSHOT")
				.audiencePlaceholder(Player.class, "disguise_name", new DisguiseNamePlaceholder())
				.audiencePlaceholder(Player.class, "disguise_type", new DisguiseTypePlaceholder())
				.audiencePlaceholder(Player.class, "player_disguise_name", new PlayerDisguiseNamePlaceholder())
				.build();
	}

	@Override
	public LoadRequirement loadRequirement() {
		return LoadRequirement.allOf(
				LoadRequirement.platform(Platform.PAPER),
				LoadRequirement.requiredComplement("LibsDisguises")
		);
	}
}
