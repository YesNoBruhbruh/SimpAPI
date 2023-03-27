package me.kodysimpson.simpapi.colors;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

import static me.kodysimpson.simpapi.colors.ColorTranslator.translateColorCodes;

public class MessageUtils {

    public static void msgPlayer(Player player, String... strings) {
        for (String string : strings) {
            player.sendMessage(translateColorCodes(string));
        }
    }

    public static void titlePlayer(Player player, String title, String subtitle, int fadeIn, int stay, int fadeOut) {
        player.sendTitle(translateColorCodes(title), translateColorCodes(subtitle), fadeIn, stay, fadeOut);
    }

    public static void soundPlayer(Player player, Sound sound, float volume, float pitch) {
        player.playSound(player.getLocation(), sound, volume, pitch);
    }
}
