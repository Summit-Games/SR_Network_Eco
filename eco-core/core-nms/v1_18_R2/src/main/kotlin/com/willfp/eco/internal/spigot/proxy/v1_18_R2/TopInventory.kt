package com.willfp.eco.internal.spigot.proxy.v1_18_R2

import com.willfp.eco.internal.gui.menu.TopInventoryProxy
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory

class TopInventory: TopInventoryProxy {
    override fun getTopInventory(player: Player): Inventory {
        return player.openInventory.topInventory
    }
}
