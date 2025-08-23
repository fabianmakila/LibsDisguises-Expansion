package io.github.miniplaceholders.expansion.libsdisguises.paper.placeholder;

import io.github.miniplaceholders.api.resolver.AudienceTagResolver;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.Disguise;
import net.kyori.adventure.text.minimessage.Context;
import net.kyori.adventure.text.minimessage.tag.Tag;
import net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DisguiseTypePlaceholder implements AudienceTagResolver<@NotNull Player> {
	@Override
	public @Nullable Tag tag(@NotNull Player player, @NotNull ArgumentQueue queue, @NotNull Context context) {
		Disguise disguise = DisguiseAPI.getDisguise(player);
		if (disguise == null) {
			return null;
		}

		return Tag.preProcessParsed(disguise.getType().toReadable());
	}
}
