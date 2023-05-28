package com.roughlyunderscore.enchantsapi.registry;

import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

/**
 * This interface is used to register registrables. Implement this interface to create a new registrable and
 * override each and every method. By default, each method has a default implementation that throws an exception.
 * @see UEAPIRegistry
 * @since 2.2
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrableTrigger
 * @author Roughly_
 */
public interface RegistrableApplicable extends Registrable {
  /**
   * This method returns whether the enchantment with this applicable
   * can be applied to the given material.
   * @param type the material
   * @return whether the material suits this applicable
   */
  default boolean canBeAppliedTo(final @NotNull Material type) {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
