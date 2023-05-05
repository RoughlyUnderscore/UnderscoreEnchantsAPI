package com.roughlyunderscore.enchantsapi.events;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when an enchantment is procced.
 */
public class EnchantmentActivateEvent extends PlayerEvent implements Cancellable {
  private boolean cancelled = false;
  private final NamespacedKey enchantmentKey;
  private final Entity target;


  private static final HandlerList HANDLERS = new HandlerList();

  public EnchantmentActivateEvent(@NotNull Player who, NamespacedKey enchantmentKey, Entity target) {
    super(who);
    this.enchantmentKey = enchantmentKey;
    this.target = target;
  }

  public EnchantmentActivateEvent(@NotNull Player who, boolean cancelled, NamespacedKey enchantmentKey, Entity target) {
    this(who, enchantmentKey, target);
    this.cancelled = cancelled;
  }

  @Override
  public @NotNull HandlerList getHandlers() {
    return HANDLERS;
  }

  public static HandlerList getHandlerList() {
    return HANDLERS;
  }

  @Override
  public boolean isCancelled() {
    return cancelled;
  }

  @Override
  public void setCancelled(boolean cancel) {
    this.cancelled = cancel;
  }
}
