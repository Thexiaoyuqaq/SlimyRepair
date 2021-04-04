package me.ncbpfluffybear.slimyrepair;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class SRItems {

    // Category
    public static final Category slimy_repair = new Category(
        new NamespacedKey(SlimyRepair.getInstance(), "slimy_repair"),
        new CustomItem(Material.ANVIL, "&a粘液科技物品修复"));

    public static final SlimefunItemStack SLIMY_ANVIL = new SlimefunItemStack("SLIMY_ANVIL",
        Material.SLIME_BLOCK,
        "&a&l粘液科技铁砧",
        "",
        "&7用来修复粘液科技物品"
    );
}
