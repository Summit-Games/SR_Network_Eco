package com.willfp.eco.core.packet;

import com.willfp.eco.core.Eco;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a packet.
 */
public class Packet {
    private @NotNull Object handle;

    /**
     * @param handle The NMS handle.
     */
    public Packet(@NotNull Object handle) {
        this.handle = handle;
    }

    /**
     * Send to a player.
     *
     * @param player The player.
     */
    void send(@NotNull final Player player) {
        Eco.get().sendPacket(player, this);
    }

    /**
     * Get the NMS handle of this packet.
     * @return The NMS handle.
     */
    public @NotNull Object getHandle() {
        return handle;
    }

    /**
     * Set the NMS handle of this packet.
     * @param handle The NMS handle.
     */
    public void setHandle(@NotNull final Object handle) {
        this.handle = handle;
    }
}
