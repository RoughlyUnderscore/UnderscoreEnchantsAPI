package com.roughlyunderscore.enchantsapi.registry;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * This is the main registrable interface. This interface is used to register triggers, placeholders, etc.
 * You should not be implementing this interface. Instead, you should be implementing one of its subinterfaces found
 * in this package.
 * @since 2.2
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrableTrigger
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrablePlaceholder
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrableCondition
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrableAction
 * @see com.roughlyunderscore.enchantsapi.registry.RegistrableApplicable
 * @author Roughly_
 */
public interface Registrable {
  /**
   * Returns the aliases of the registrable.
   * @return the aliases
   */
  default @NotNull List<String> getAliases() {
    throw new UnsupportedOperationException("This has not been implemented.");
  }
}
