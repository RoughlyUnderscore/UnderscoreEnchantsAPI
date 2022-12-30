package com.roughlyunderscore.enchantsapi;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public interface UEnchantsAPI {

	/**
	 * Disenchants an ItemStack - removes an enchantment of this name
	 * @param item the item to disenchant
	 * @param name the name of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the item doesn't have the given enchantment
	 * @return the disenchanted item
	 */
	ItemStack disenchant(ItemStack item, String name) throws IllegalArgumentException;

	/**
	 * Disenchants an ItemStack - removes an enchantment, found by this namespaced key
	 * @param item the item to disenchant
	 * @param key the namespaced key of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the item doesn't have the given enchantment
	 * @return the disenchanted item
	 */
	ItemStack disenchant(ItemStack item, NamespacedKey key) throws IllegalArgumentException;

	/**
	 * Disenchants an ItemStack - removes a given enchantment
	 * @param item the item to disenchant
	 * @param ench the enchantment
	 * @throws IllegalArgumentException if the item doesn't have the given enchantment
	 * @return the disenchanted item
	 */
	ItemStack disenchant(ItemStack item, Enchantment ench) throws IllegalArgumentException;

	/**
	 * Fully disenchants an ItemStack
	 * @param item the item to disenchant
	 * @return the disenchanted item
	 */
	ItemStack fullyDisenchant(ItemStack item);

	/**
	 * Enchants an ItemStack with an enchantment of this name
	 * @param item the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the level exceeds the maximum or is lower than 1.
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	ItemStack enchant(ItemStack item, String name, int level) throws IllegalArgumentException;

	/**
	 * Enchants an ItemStack with an enchantment, found by this namespaced key
	 * @param item the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the level exceeds the maximum or is lower than 1.
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	ItemStack enchant(ItemStack item, NamespacedKey key, int level) throws IllegalArgumentException;

	/**
	 * Enchants an ItemStack with a given enchantment
	 * @param item the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the level exceeds the maximum or is lower than 1.
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	ItemStack enchant(ItemStack item, Enchantment ench, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with an enchantment of this name, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(Player player, EquipmentSlot slot, String name, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with an enchantment, found by this namespaced key, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found or if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(Player player, EquipmentSlot slot, NamespacedKey key, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with a given enchantment, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the level exceeds the maximum or is lower than 1.
	 */
	void enchant(Player player, EquipmentSlot slot, Enchantment ench, int level) throws IllegalArgumentException;



	/**
	 * Enchants an ItemStack with an enchantment of this name with no level restrictions
	 * @param item the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	ItemStack enchantUnrestricted(ItemStack item, String name, int level) throws IllegalArgumentException;

	/**
	 * Enchants an ItemStack with an enchantment, found by this namespaced key with no level restrictions
	 * @param item the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	ItemStack enchantUnrestricted(ItemStack item, NamespacedKey key, int level) throws IllegalArgumentException;

	/**
	 * Enchants an ItemStack with a given enchantment with no level restrictions
	 * @param item the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 * @return the enchanted item, or null if the amount of enchantments is at the limit
	 */
	ItemStack enchantUnrestricted(ItemStack item, Enchantment ench, int level);

	/**
	 * Enchants a player's item with an enchantment of this name with no level restrictions, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param name the name of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found
	 */
	void enchantUnrestricted(Player player, EquipmentSlot slot, String name, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with an enchantment, found by this namespaced key with no level restrictions, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param key the namespaced key of the enchantment
	 * @param level the level of the enchantment
	 * @throws IllegalArgumentException if the enchantment wasn't found
	 */
	void enchantUnrestricted(Player player, EquipmentSlot slot, NamespacedKey key, int level) throws IllegalArgumentException;

	/**
	 * Enchants a player's item with a given enchantment with no level restrictions, except for when the amount of enchantments is at the limit
	 * @param player the player to look for
	 * @param slot the item to enchant
	 * @param ench the enchantment
	 * @param level the level of the enchantment
	 */
	void enchantUnrestricted(Player player, EquipmentSlot slot, Enchantment ench, int level);

	/**
	 * Attempts to load an enchantment from a given name.
	 * @param enchantmentName the name of the enchantment
	 * @return LOADED if the enchantment was not loaded before, RELOADED if it was
	 */
	EnchantmentLoadResponse loadEnchantment(String enchantmentName);

	/**
	 * Attempts to unload an enchantment from a given name.
	 * @param enchantmentName the name of the enchantment
	 * @return UNLOADED if the enchantment was loaded before, NOT_FOUND if couldn't find the enchantment
	 */
	EnchantmentUnloadResponse unloadEnchantment(String enchantmentName);
}
