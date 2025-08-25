package io.github.miniplaceholders.expansion.libsdisguises.placeholder;

import io.github.miniplaceholders.api.resolver.AudienceTagResolver;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.Disguise;
import me.libraryaddict.disguise.disguisetypes.PlayerDisguise;
import net.kyori.adventure.text.minimessage.Context;
import net.kyori.adventure.text.minimessage.tag.Tag;
import net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PlayerDisguiseNamePlaceholder implements AudienceTagResolver<@NotNull Player> {
	@Override
	public @Nullable Tag tag(@NotNull Player player, @NotNull ArgumentQueue queue, @NotNull Context context) {
		Disguise disguise = DisguiseAPI.getDisguise(player);
		if (disguise == null) {
			return null;
		}

		if (!(disguise instanceof PlayerDisguise playerDisguise)) {
			return null;
		}

		return Tag.preProcessParsed(playerDisguise.getName());
	}
}
