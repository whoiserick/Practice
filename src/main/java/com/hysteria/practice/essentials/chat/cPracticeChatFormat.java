package com.hysteria.practice.essentials.chat;

import com.hysteria.practice.cPractice;
import com.hysteria.practice.essentials.chat.impl.ChatFormat;
import com.hysteria.practice.player.clan.Clan;
import com.hysteria.practice.player.profile.Profile;
import com.hysteria.practice.utilities.chat.CC;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.entity.Player;

public class cPracticeChatFormat implements ChatFormat {
    @Override
    public String format(Player sender, Player receiver, String message) {
        Profile senderProfile = Profile.get(sender.getUniqueId());
        if (Clan.getByPlayer(sender) != null) {
            if (cPractice.get().isPlaceholderAPI())
                return PlaceholderAPI.setPlaceholders(sender, CC.translate(cPractice.get().getMainConfig().getString("CHAT.CLAN_FORMAT")
                        .replace("{prefix}", cPractice.get().getRankManager().getRank().getPrefix(sender.getUniqueId()))
                        .replace("{suffix}", cPractice.get().getRankManager().getRank().getSuffix(sender.getUniqueId()))
                        .replace("{tag}", cPractice.get().getRankManager().getRank().getTag(sender))
                        .replace("{color}", senderProfile.getColor())
                        .replace("{player}", sender.getName())
                        .replace("{real_name}", cPractice.get().getRankManager().getRank().getRealName(sender))
                        .replace("{message}", (sender.hasPermission("cpractice.chat.color") ? CC.translate(message) : CC.strip(message)))
                        .replace("{clan}", Clan.getByPlayer(sender).getColoredName())));
            return CC.translate(cPractice.get().getMainConfig().getString("CHAT.CLAN_FORMAT")
                    .replace("{prefix}", cPractice.get().getRankManager().getRank().getPrefix(sender.getUniqueId()))
                    .replace("{suffix}", cPractice.get().getRankManager().getRank().getSuffix(sender.getUniqueId()))
                    .replace("{tag}", cPractice.get().getRankManager().getRank().getTag(sender))
                    .replace("{color}", senderProfile.getColor())
                    .replace("{player}", sender.getName())
                    .replace("{real_name}", cPractice.get().getRankManager().getRank().getRealName(sender))
                    .replace("{message}", (sender.hasPermission("cpractice.chat.color") ? CC.translate(message) : CC.strip(message)))
                    .replace("{clan}", Clan.getByPlayer(sender).getColoredName()));
        }
        if (cPractice.get().isPlaceholderAPI())
            return PlaceholderAPI.setPlaceholders(sender, CC.translate(cPractice.get().getMainConfig().getString("CHAT.DEFAULT_FORMAT")
                    .replace("{prefix}", cPractice.get().getRankManager().getRank().getPrefix(sender.getUniqueId()))
                    .replace("{suffix}", cPractice.get().getRankManager().getRank().getSuffix(sender.getUniqueId()))
                    .replace("{tag}", cPractice.get().getRankManager().getRank().getTag(sender))
                    .replace("{color}", senderProfile.getColor())
                    .replace("{player}", sender.getName())
                    .replace("{real_name}", cPractice.get().getRankManager().getRank().getRealName(sender))
                    .replace("{message}", (sender.hasPermission("cpractice.chat.color") ? CC.translate(message) : CC.strip(message)))));
        return CC.translate(cPractice.get().getMainConfig().getString("CHAT.DEFAULT_FORMAT")
                .replace("{prefix}", cPractice.get().getRankManager().getRank().getPrefix(sender.getUniqueId()))
                .replace("{suffix}", cPractice.get().getRankManager().getRank().getSuffix(sender.getUniqueId()))
                .replace("{tag}", cPractice.get().getRankManager().getRank().getTag(sender))
                .replace("{color}", senderProfile.getColor())
                .replace("{player}", sender.getName())
                .replace("{real_name}", cPractice.get().getRankManager().getRank().getRealName(sender))
                .replace("{message}", (sender.hasPermission("cpractice.chat.color") ? CC.translate(message) : CC.strip(message))));
    }
}
