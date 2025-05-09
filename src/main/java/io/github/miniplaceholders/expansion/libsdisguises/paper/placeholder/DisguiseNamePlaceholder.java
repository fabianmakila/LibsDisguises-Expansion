package io.github.miniplaceholders.expansion.libsdisguises.paper.placeholder;

import io.github.miniplaceholders.api.placeholder.AudiencePlaceholder;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.Disguise;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.minimessage.Context;
import net.kyori.adventure.text.minimessage.tag.Tag;
import net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DisguiseNamePlaceholder implements AudiencePlaceholder {
	@Override
	public @Nullable Tag tag(@NotNull Audience audience, @NotNull ArgumentQueue argumentQueue, @NotNull Context context) {
		Player player = (Player) audience;
		Disguise disguise = DisguiseAPI.getDisguise(player);
		if (disguise == null) {
			return null;
		}

		return Tag.preProcessParsed(disguise.getDisguiseName());
	}
}
