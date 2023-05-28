package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * This interface is used to register activation indicators. Implement this interface to create a new activation indicator and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see UEAPIRegistry
 * @since 2.2
 * @author Roughly_
 */
public interface RegistrableActivationIndicator extends Registrable {

  /**
   * This method indicates to the player that the enchantment has been activated.
   * @param text the text to display
   * @param player the player
   */
  default void indicateAboutActivation(final @NotNull String text, final @NotNull Player player) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
