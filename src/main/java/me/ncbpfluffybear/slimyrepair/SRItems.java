package me.ncbpfluffybear.slimyrepair;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class SRItems {

    // Category
    public static final ItemGroup slimy_repair = new ItemGroup(
        new NamespacedKey(SlimyRepair.getInstance(), "slimy_repair"),
        new CustomItemStack(Material.ANVIL, "&a粘液科技物品修复"));

    public static final SlimefunItemStack SLIMY_ANVIL = new SlimefunItemStack("SLIMY_ANVIL",
        Material.SLIME_BLOCK,
        "&a&l粘液科技铁砧",
        "",
        "&7用来修复粘液科技物品"
    );
}
