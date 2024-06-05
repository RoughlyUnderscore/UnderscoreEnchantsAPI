// Copyright 2024 RoughlyUnderscore
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.roughlyunderscore.data

import com.roughlyunderscore.annotations.Since

/**
 * This class serves the purpose of storing all messages used by the plugin.
 * They are loaded from the respective message file. Everything but the locale
 * identifier is nullable, because the plugin will not crash if a message is
 * missing.
 * @property localeIdentifier An identifier for the locale (e.g. en_US).
 */

// The fields are in fact used by the plugin and 100+ pointless warnings is annoying to look at
@Suppress("unused")
@Since("2.2")
class UELocale(val localeIdentifier: String) {
  val mapping = mutableMapOf<String, String>()

  /**
   * The word "yes".
   */
  @Since("2.2")
  lateinit var yes: String

  /**
   * The word "no".
   */
  @Since("2.2")
  lateinit var no: String

  /**
   * When the plugin could not connect to a database.
   */
  @Since("2.2")
  lateinit var invalidConnection: String

  /**
   * When a player attempts to execute an action that requires
   * higher permissions than they have.
   */
  @Since("2.2")
  lateinit var noPermissions: String

  /**
   * When a command that requires a player is executed via the console.
   */
  @Since("2.2")
  lateinit var notForConsole: String

  /**
   * The "next" button for a paginated UI.
   */
  @Since("2.2")
  lateinit var uiNext: String

  /**
   * The "previous" button for a paginated UI.
   */
  @Since("2.2")
  lateinit var uiPrevious: String

  /**
   * The "back" button for a UI.
   */
  @Since("2.2")
  lateinit var uiBack: String

  /**
   * The "close" button for a UI.
   */
  @Since("2.2")
  lateinit var uiClose: String

  /**
   * The prompt to sort a browsing UI by downloads.
   */
  @Since("2.2")
  lateinit var uiBrowsingSortByDownloads: String

  /**
   * The prompt to sort a browsing UI by name.
   */
  @Since("2.2")
  lateinit var uiBrowsingSortByName: String

  /**
   * The prompt to sort a browsing UI by author.
   */
  @Since("2.2")
  lateinit var uiBrowsingSortByAuthor: String

  /**
   * The prompt to sort a browsing UI by amount.
   */
  @Since("2.2")
  lateinit var uiBrowsingSortByAmount: String

  /**
   * The amount of times a browsable entry has been downloaded.
   *
   * Placeholders:
   * - **amount**: The amount of times.
   */
  @Since("2.2")
  lateinit var uiBrowsingDownloaded: String

  /**
   * The prompt to toggle something in a UI.
   */
  @Since("2.2")
  lateinit var uiBrowsingClickToToggle: String

  /**
   * The "ON" state for a toggleable UI element.
   */
  @Since("2.2")
  lateinit var uiStateOn: String

  /**
   * The "OFF" state for a toggleable UI element.
   */
  @Since("2.2")
  lateinit var uiStateOff: String

  /**
   * The title of the pack browsing UI.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingTitle: String

  /**
   * The prompt to click on an item in a browsing UI.
   */
  @Since("2.2")
  lateinit var uiBrowsingClick: String

  /**
   * The prompt to shift-click on an item in a browsing UI.
   */
  @Since("2.2")
  lateinit var uiBrowsingShiftClick: String

  /**
   * The prompt to right-click on an item in a browsing UI.
   */
  @Since("2.2")
  lateinit var uiBrowsingRightClick: String

  /**
   * The prompt to download an item in a preview UI.
   */
  @Since("2.2")
  lateinit var uiBrowsingDownload: String

  /**
   * The prompt to load an item in a preview UI.
   */
  @Since("2.2")
  lateinit var uiBrowsingLoad: String

  /**
   * The author of the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **author**: The author of the pack.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingPackAuthor: String

  /**
   * The amount of enchantments in the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **amount**: The amount of enchantments in the pack.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingPackAmount: String


  /**
   * The website of the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **website**: The website of the pack.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingPackWebsite: String

  /**
   * The website of the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **website**: The website of the pack.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingHasConflictsFirstLine: String

  /**
   * The website of the pack in the pack browsing UI.
   *
   * Placeholders:
   * - **website**: The website of the pack.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingHasConflictsSecondLine: String

  /**
   * Whether to show downloaded packs in the pack browsing UI.
   *
   * Placeholders:
   * - **state**: The state of the setting.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingShowDownloaded: String

  /**
   * The header line for the pack description in the pack browsing UI.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingPackDescription: String

  /**
   * The first line informing the player that the pack
   * contains blacklisted/whitelisted worlds.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingPackWhitelistsFirstLine: String

  /**
   * The second line informing the player that the pack
   * contains blacklisted/whitelisted worlds.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingPackWhitelistsSecondLine: String

  /**
   * The line indicating all enchantments of a pack.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingPackEnchantments: String

  /**
   * The line following the enchantments line for when
   * the list of enchantments is too long (truncation).
   *
   * Placeholders:
   * - **amount**: The amount of enchantments not listed.
   */
  @Since("2.2")
  lateinit var uiPackBrowsingPackTruncated: String

  /**
   * The title of the enchantment browsing UI.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingTitle: String

  /**
   * The author of the enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **author**: The author of the enchantment.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingEnchantmentAuthor: String

  /**
   * Whether to show downloaded enchantments in the enchantment browsing UI.
   *
   * Placeholders:
   * - **state**: The state of the setting.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingShowDownloaded: String

  /**
   * The header line for the enchantment description in the enchantment browsing UI.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingDescription: String

  /**
   * The activation chance for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **chance**: The activation chance.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingChance: String

  /**
   * The trigger for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **trigger**: The trigger.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingTrigger: String

  /**
   * The conflicts for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **conflicts**: The conflicts.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingConflicts: String

  /**
   * The cooldown for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **cooldown**: The cooldown.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingCooldown: String

  /**
   * The forbidden materials for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **forbidden**: The forbidden materials.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingForbidden: String

  /**
   * Whether the enchantment is unique in the enchantment browsing UI.
   *
   * Placeholders:
   * - **unique**: The state of the setting.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingUnique: String

  /**
   * The seekers for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **seekers**: The seekers.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingSeekers: String

  /**
   * The names of the required enchantments for an enchantment in the enchantment browsing UI.
   *
   * Placeholders:
   * - **required**: The required enchantments.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingRequired: String

  /**
   * A word token for "seconds" (sec).
   */
  @Since("2.2")
  lateinit var uiEnchantmentPreviewSeconds: String

  /**
   * A word token for "minutes" (min).
   */
  @Since("2.2")
  lateinit var uiEnchantmentPreviewMinutes: String

  /**
   * A word token for "hours" (hr).
   */
  @Since("2.2")
  lateinit var uiEnchantmentPreviewHours: String

  /**
   * A word token for "day" (day).
   */
  @Since("2.2")
  lateinit var uiEnchantmentPreviewDay: String

  /**
   * The header line for the required plugins in the enchantment browsing UI.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingRequiredPlugins: String

  /**
   * The syntax for a required plugin in the enchantment browsing UI.
   *
   * Placeholders:
   * - **plugin**: The name of the plugin.
   * - **installed**: Whether the plugin is installed.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingRequiredPlugin: String

  /**
   * The state of being installed for a required plugin in the enchantment browsing UI.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingRequiredPluginInstalled: String

  /**
   * The state of not being installed for a required plugin in the enchantment browsing UI.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingRequiredPluginNotInstalled: String

  /**
   * The prompt to click on a required plugin in the enchantment browsing UI.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingRequiredPluginClick: String

  /**
   * The first line of the disclaimer for a required plugin in the enchantment browsing UI.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingRequiredPluginDisclaimerFirstLine: String

  /**
   * The second line of the disclaimer for a required plugin in the enchantment browsing UI.
   */
  @Since("2.2")
  lateinit var uiEnchantmentBrowsingRequiredPluginDisclaimerSecondLine: String

  /**
   * The syntax for a chat message sent for an operator to download plugins.
   *
   * Placeholders:
   * - **plugin**: The name of the plugin.
   * - **link**: The link to the plugin download page.
   *
   */
  @Since("2.2")
  lateinit var uiEnchantmentRequiredPluginChatSyntax: String
    

  /**
   * When a log is being created.
   */
  @Since("2.2")
  lateinit var creatingLog: String

  /**
   * When a log has been created successfully.
   *
   * Placeholders:
   * - **location**: The location of the log file.
   */
  @Since("2.2")
  lateinit var logCreated: String

  /**
   * When a log could not be created.
   */
  @Since("2.2")
  lateinit var logNotCreated: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenAuthors: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenCreated: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorlds: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldName: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldUuid: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldEnv: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldSeed: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldDifficulty: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldSpawn: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldTime: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldRain: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldThunder: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenWorldSpawnLimit: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistry: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryActionSingular: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryActionPlural: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryApplicableSingular: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryApplicablePlural: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryConditionSingular: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryConditionPlural: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryIndicatorSingular: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryIndicatorPlural: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryPlaceholderSingular: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryPlaceholderPlural: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistrySeekerSingular: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistrySeekerPlural: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryTriggerSingular: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryTriggerPlural: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryLoaded: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenRegistryProvider: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenEnchantments: String

  /**
   * A word token used for logging.
   */
  @Since("2.2")
  lateinit var logTokenEnchantmentsLoaded: String

  /**
   * When a string is attempted to be parsed into an enchantment
   * name, but the enchantment with that name does not exist.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2")
  lateinit var invalidEnchantmentName: String

  /**
   * When a string is attempted to be parsed into an integer,
   * but the string is not a valid integer.
   *
   * Placeholders:
   * - **level** The string that was attempted to be parsed.
   */
  @Since("2.2")
  lateinit var invalidEnchantmentLevel: String

  /**
   * When a parameter passed to a command is invalid and does not
   * have a concrete message.
   *
   * Placeholders:
   * - **parameter**: The name of the parameter.
   */
  @Since("2.2")
  lateinit var invalidParameter: String

  /**
   * When the provided string is not a valid URL or is not a direct
   * download URL.
   *
   * Placeholders:
   * - **url**: The URL that was invalid.
   */
  @Since("2.2")
  lateinit var invalidUrl: String

  /**
   * When an enchantment level is out of bounds.
   *
   * Placeholders:
   * - **level**: The level that was out of bounds.
   * - **min**: The minimum level.
   * - **max**: The maximum level.
   */
  @Since("2.2")
  lateinit var enchantmentLevelOutOfBounds: String

  /**
   * When an enchantment is attempted to be applied to an item, but the item
   * has the maximum number of enchantments.
   *
   * Placeholders:
   * - **limit**: The maximum number of enchantments.
   */
  @Since("2.2")
  lateinit var overTheLimit: String

  /**
   * When an enchantment is attempted to be applied to an item, but the item
   * contains enchantments that conflict with the given one.
   */
  @Since("2.2")
  lateinit var enchantmentConflicts: String

  /**
   * When a unique enchantment is attempted to be applied to an item that
   * contains enchantments.
   */
  @Since("2.2")
  lateinit var enchantmentUnique: String

  /**
   * When an enchantment is attempted to be applied to an item that contains
   * a unique enchantment.
   */
  @Since("2.2")
  lateinit var hasUniqueEnchantment: String

  /**
   * When the plugin is unable to check for updates.
   */
  @Since("2.2")
  lateinit var badUpdate: String

  /**
   * When a player cannot be found.
   *
   * Placeholders:
   * - **player**: The name of the player.
   */
  @Since("2.2")
  lateinit var playerNotFound: String

  /**
   * When a registrable being registered conflicts with
   * some other registrable's aliases.
   *
   * Placeholders:
   * - **new**: The aliases of the new registrable.
   * - **old**: The aliases of the old registrable.
   * - **plugin**: The plugin that's registered the old registrable.
   */
  @Since("2.2")
  lateinit var alreadyRegistered: String

  /**
   * When a player enchanted an item with a command.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **level**: The level of the enchantment.
   */
  @Since("2.2")
  lateinit var enchantedItem: String

  /**
   * When a player enchanted someone else's item with a command.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **level**: The level of the enchantment.
   * - **player**: The name of the player whose item was enchanted.
   */
  @Since("2.2")
  lateinit var enchantedItemOther: String

  /**
   * When a player activated an enchantment. If the enchantment
   * uses a custom activation indicator, its message will be used instead.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2")
  lateinit var defaultActivationIndicator: String

  /**
   * When an enchantment is downloaded successfully.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2")
  lateinit var downloadedEnchantment: String

  /**
   * When an enchantment pack is downloaded successfully.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   */
  @Since("2.2")
  lateinit var downloadedPack: String

  /**
   * When an enchantment could not be downloaded successfully.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2")
  lateinit var failedToDownloadEnchantment: String

  /**
   * When an enchantment pack could not be downloaded successfully.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   */
  @Since("2.2")
  lateinit var failedToDownloadPack: String

  /**
   * When an enchantment is loaded from a file.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2")
  lateinit var loadedEnchantment: String

  /**
   * When an enchantment pack is loaded from a file.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   * - **amount**: The amount of enchantments in the pack.
   */
  @Since("2.2")
  lateinit var loadedPack: String

  /**
   * When an enchantment could not be loaded from a file.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2")
  lateinit var failedToLoadEnchantment: String

  /**
   * When an enchantment pack could not be loaded from a file.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   */
  @Since("2.2")
  lateinit var failedToLoadPack: String

  /**
   * When an enchantment is unloaded.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   */
  @Since("2.2")
  lateinit var unloadedEnchantment: String

  /**
   * When an enchantment pack is unloaded.
   *
   * Placeholders:
   * - **pack**: The name of the pack.
   */
  @Since("2.2")
  lateinit var unloadedPack: String

  /**
   * When a player toggles an enchantment on/off.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **state**: The state of the enchantment.
   */
  @Since("2.2")
  lateinit var toggledEnchantment: String

  /**
   * When a player toggles another player's enchantment on/off.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **state**: The state of the enchantment.
   * - **player**: The player whose enchantment was toggled.
   */
  @Since("2.2")
  lateinit var toggledEnchantmentOther: String

  /**
   * When a player's enchantment gets toggled on/off externally.
   *
   * Placeholders:
   * - **enchantment**: The name of the enchantment.
   * - **state**: The state of the enchantment.
   */
  @Since("2.2")
  lateinit var toggledEnchantmentExternally: String

  /**
   * A filler for when an enchantment is toggled on ([toggledEnchantment]).
   */
  @Since("2.2")
  lateinit var stateOn: String

  /**
   * A filler for when an enchantment is toggled off ([toggledEnchantment]).
   */
  @Since("2.2")
  lateinit var stateOff: String

  /**
   * A message for when a player is trying to toggle an enchantment that is vanilla.
   */
  @Since("2.2")
  lateinit var cantToggleVanilla: String

  /**
   * When a player changes their locale.
   */
  @Since("2.2")
  lateinit var changedLocale: String

  /**
   * When a player's locale is changed externally.
   */
  @Since("2.2")
  lateinit var changedLocaleExternally: String

  /**
   * When a player changes an other player's locale.
   *
   * Placeholders:
   * - **player**: the player whose locale was changed.
   */
  @Since("2.2")
  lateinit var changedLocaleOther: String

  /**
   * When a player attempts to change their locale, but the functionality is disabled.
   */
  @Since("2.2")
  lateinit var cantChangeLocale: String

  /**
   * When a player attempts to change their locale to an unidentified one.
   *
   * Placeholders:
   * - **locale**: the locale argument.
   */
  @Since("2.2")
  lateinit var noSuchLocale: String

  /**
   * When the player's data has not been loaded yet.
   */
  @Since("2.2")
  lateinit var loading: String

  /**
   * When the player's data has been loaded successfully.
   */
  @Since("2.2")
  lateinit var loaded: String

  /**
   * When a plugin is reloaded.
   *
   * Placeholders:
   * - **ms**: The time it took to reload the plugin in milliseconds.
   */
  @Since("2.2")
  lateinit var reloaded: String

  /**
   * When a player hovers over a command in the help command.
   */
  @Since("2.2")
  lateinit var commandHover: String

  /**
   * The message hinting the player to click on a command to write it into the chat.
   */
  @Since("2.2")
  lateinit var commandHoverHint: String

  /**
   * The title of the help command.
   */
  @Since("2.2")
  lateinit var commandHelpTitle: String

  /**
   * The message about the debug command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpDebug: String

  /**
   * The message about the enchant command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpEnchant: String

  /**
   * The message about the toggle command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpToggle: String

  /**
   * The message about the download command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpDownload: String

  /**
   * The message about the locale command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpLocale: String

  /**
   * The message about the help command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpHelp: String

  /**
   * The message about the load command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpLoad: String

  /**
   * The message about the reload command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpReload: String

  /**
   * The message about the browsepacks command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpBrowsePacks: String

  /**
   * The message about the browseenchs command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpBrowseEnchs: String

  /**
   * The message about the browse command, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpBrowse: String

  /**
   * The message about the commands' syntax details, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpSyntaxDetails: String

  /**
   * The message about the commands' syntax details, used in the help command.
   */
  @Since("2.2")
  lateinit var commandHelpSyntaxExceptions: String

  /**
   * The title of the debug help command.
   */
  @Since("2.2")
  lateinit var debugHelpTitle: String

  /**
   * The message about the debug-registry command, used in the debug help command.
   */
  @Since("2.2")
  lateinit var debugHelpRegistry: String

  /**
   * The message about the debug-log command, used in the debug help command.
   */
  @Since("2.2")
  lateinit var debugHelpLog: String

  /**
   * The message about the debug-enchantment command, used in the debug help command.
   */
  @Since("2.2")
  lateinit var debugHelpEnchantment: String

  /**
   * The message indicating that a feature is not yet implemented and will
   * be available in the future.
   */
  @Since("2.2")
  lateinit var featureDelayed: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantment: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentChance: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentIndicator: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentApplicables: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentAuthor: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentConditions: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentConflicts: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentCooldown: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentDescription: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentForbidden: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentUnique: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentLevels: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentNegated: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentActions: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentRestrictions: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentRequired: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentSeekers: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentTrigger: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentWhitelist: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentBlacklist: String

  /**
   * A word token used for enchantment debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentRequiredPluginLink: String

  /**
   * A word token used for enchantment pack debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantmentBy: String

  /**
   * A word token used for enchantment pack debugging.
   */
  @Since("2.2")
  lateinit var tokenEnchantments: String

  /**
   * The title of the debug-registry command.
   */
  @Since("2.2")
  lateinit var registryDebugTitle: String

  /**
   * The message used by the registry debug command, showing how many
   * actions are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of actions loaded.
   */
  @Since("2.2")
  lateinit var registryDebugActionsLoaded: String

  /**
   * The message used by the registry debug command, showing how many
   * applicables are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of applicables loaded.
   */
  @Since("2.2")
  lateinit var registryDebugApplicablesLoaded: String

  /**
   * The message used by the registry debug command, showing how many
   * conditions are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of conditions loaded.
   */
  @Since("2.2")
  lateinit var registryDebugConditionsLoaded: String

  /**
   * The message used by the registry debug command, showing how many
   * indicators are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of indicators loaded.
   */
  @Since("2.2")
  lateinit var registryDebugIndicatorsLoaded: String

  /**
   * The message used by the registry debug command, showing how many
   * placeholders are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of placeholders loaded.
   */
  @Since("2.2")
  lateinit var registryDebugPlaceholdersLoaded: String

  /**
   * The message used by the registry debug command, showing how many
   * seekers are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of seekers loaded.
   */
  @Since("2.2")
  lateinit var registryDebugSeekersLoaded: String

  /**
   * The message used by the registry debug command, showing how many
   * triggers are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of triggers loaded.
   */
  @Since("2.2")
  lateinit var registryDebugTriggersLoaded: String

  /**
   * The message used by the registry debug command, showing how many
   * built-in registrable items of a certain type are loaded at the moment.
   *
   * Placeholders:
   * - **amount**: The amount of items loaded.
   */
  @Since("2.2")
  lateinit var registryDebugBuiltInAmount: String

  /**
   * The helper message used by the registry debug command, showing how to
   * use the command for a certain registrable item type.
   */
  @Since("2.2")
  lateinit var registryDebugMoreInfo: String

  /**
   * The message used by the registry debug command, indicating that the
   * player did not specify a valid registrable item type.
   */
  @Since("2.2")
  lateinit var registryDebugInvalidType: String

  /**
   * The title of the registry debug command's output for actions.
   */
  @Since("2.2")
  lateinit var registryDebugActionsTitle: String

  /**
   * The brief description used by the registry debug command for actions.
   *
   * Placeholders:
   * - **amount**: The amount of actions loaded.
   */
  @Since("2.2")
  lateinit var registryDebugActionsInfo: String

  /**
   * The description of an action provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the action.
   */
  @Since("2.2")
  lateinit var registryDebugActionsBuiltIn: String

  /**
   * The description of an custom action. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the action.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2")
  lateinit var registryDebugActionsCustom: String

  /**
   * The title of the registry debug command's output for applicables.
   *
   * Placeholders:
   * - **amount**: The amount of applicables loaded.
   */
  @Since("2.2")
  lateinit var registryDebugApplicablesTitle: String

  /**
   * The brief description used by the registry debug command for applicables.
   */
  @Since("2.2")
  lateinit var registryDebugApplicablesInfo: String

  /**
   * The description of an applicable provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the applicable.
   */
  @Since("2.2")
  lateinit var registryDebugApplicablesBuiltIn: String

  /**
   * The description of an custom applicable. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the applicable.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2")
  lateinit var registryDebugApplicablesCustom: String

  /**
   * The title of the registry debug command's output for conditions.
   *
   * Placeholders:
   * - **amount**: The amount of conditions loaded.
   */
  @Since("2.2")
  lateinit var registryDebugConditionsTitle: String

  /**
   * The brief description used by the registry debug command for conditions.
   */
  @Since("2.2")
  lateinit var registryDebugConditionsInfo: String

  /**
   * The description of a condition provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the condition.
   */
  @Since("2.2")
  lateinit var registryDebugConditionsBuiltIn: String

  /**
   * The description of a custom condition. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the condition.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2")
  lateinit var registryDebugConditionsCustom: String

  /**
   * The title of the registry debug command's output for indicators.
   */
  @Since("2.2")
  lateinit var registryDebugIndicatorsTitle: String

  /**
   * The brief description used by the registry debug command for indicators.
   *
   * Placeholders:
   * - **amount**: The amount of indicators loaded.
   */
  @Since("2.2")
  lateinit var registryDebugIndicatorsInfo: String

  /**
   * The description of an indicator provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the indicator.
   */
  @Since("2.2")
  lateinit var registryDebugIndicatorsBuiltIn: String

  /**
   * The description of an custom indicator. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the indicator.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2")
  lateinit var registryDebugIndicatorsCustom: String

  /**
   * The title of the registry debug command's output for placeholders.
   */
  @Since("2.2")
  lateinit var registryDebugPlaceholdersTitle: String

  /**
   * The brief description used by the registry debug command for placeholders.
   *
   * Placeholders:
   * - **amount**: The amount of placeholders loaded.
   */
  @Since("2.2")
  lateinit var registryDebugPlaceholdersInfo: String

  /**
   * The description of a placeholder provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the placeholder.
   */
  @Since("2.2")
  lateinit var registryDebugPlaceholdersBuiltIn: String

  /**
   * The description of a custom placeholder. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the placeholder.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2")
  lateinit var registryDebugPlaceholdersCustom: String

  /**
   * The title of the registry debug command's output for seekers.
   */
  @Since("2.2")
  lateinit var registryDebugSeekersTitle: String

  /**
   * The brief description used by the registry debug command for seekers.
   *
   * Placeholders:
   * - **amount**: The amount of seekers loaded.
   */
  @Since("2.2")
  lateinit var registryDebugSeekersInfo: String

  /**
   * The description of a seeker provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the seeker.
   */
  @Since("2.2")
  lateinit var registryDebugSeekersBuiltIn: String

  /**
   * The description of a custom seeker. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the seeker.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2")
  lateinit var registryDebugSeekersCustom: String

  /**
   * The title of the registry debug command's output for triggers.
   *
   * Placeholders:
   * - **amount**: The amount of triggers loaded.
   */
  @Since("2.2")
  lateinit var registryDebugTriggersTitle: String

  /**
   * The brief description used by the registry debug command for triggers.
   *
   * Placeholders:
   * - **amount**: The amount of triggers loaded.
   */
  @Since("2.2")
  lateinit var registryDebugTriggersInfo: String

  /**
   * The description of a trigger provided by UnderscoreEnchants. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the trigger.
   */
  @Since("2.2")
  lateinit var registryDebugTriggersBuiltIn: String

  /**
   * The description of a custom trigger. This is used
   * by the registry debug command.
   *
   * Placeholders:
   * - **name**: The name (first alias) of the trigger.
   * - **plugin**: The name and version of the plugin that registered the action.
   */
  @Since("2.2")
  lateinit var registryDebugTriggersCustom: String

  /**
   * The header of the help message for the /ue download command.
   */
  @Since("2.2")
  lateinit var downloadHelpTitle: String

  /**
   * A message instructing the player to download an enchantment, a part
   * of the help message for the /ue download command.
   */
  @Since("2.2")
  lateinit var downloadHelpEnchantment: String

  /**
   * A message instructing the player to download an enchantment pack, a part
   * of the help message for the /ue download command.
   */
  @Since("2.2")
  lateinit var downloadHelpPack: String

  /**
   * An error message stating that the command sender has submitted an invalid
   * type of content to download.
   */
  @Since("2.2")
  lateinit var downloadInvalidType: String

  /**
   * An error message stating that the command sender has not submitted an
   * ID for the content to download.
   */
  @Since("2.2")
  lateinit var downloadNoId: String

  /**
   * A vague error message stating that the download failed.
   */
  @Since("2.2")
  lateinit var downloadUnsuccessful: String

  /**
   * A message indicating that the enchantment was downloaded successfully
   * and prompting the player to load it.
   */
  @Since("2.2")
  lateinit var downloadEnchantmentSuccessful: String

  /**
   * A message indicating that the enchantment was downloaded successfully.
   */
  @Since("2.2")
  lateinit var downloadEnchantmentSuccessfulNoPrompt: String

  /**
   * A message indicating that the enchantment was downloaded & loaded successfully.
   */
  @Since("2.2")
  lateinit var downloadAndLoadEnchantmentSuccessful: String

  /**
   * The hover message for the [downloadEnchantmentSuccessful] message.
   */
  @Since("2.2")
  lateinit var downloadEnchantmentClickToLoad: String

  /**
   * A message indicating that the enchantment pack was downloaded successfully
   * and prompting the player to load it.
   */
  @Since("2.2")
  lateinit var downloadPackSuccessful: String

  /**
   * A message indicating that the enchantment pack was downloaded successfully.
   */
  @Since("2.2")
  lateinit var downloadPackSuccessfulNoPrompt: String

  /**
   * A message indicating that the pack was downloaded & loaded successfully.
   */
  @Since("2.2")
  lateinit var downloadAndLoadPackSuccessful: String

  /**
   * The hover message for the [downloadPackSuccessful] message.
   */
  @Since("2.2")
  lateinit var downloadPackClickToLoad: String

  /**
   * The header of the help message for the /ue load command.
   */
  @Since("2.2")
  lateinit var loadHelpTitle: String

  /**
   * A message instructing the player to load an enchantment, a part
   * of the help message for the /ue load command.
   */
  @Since("2.2")
  lateinit var loadHelpEnchantment: String

  /**
   * A message instructing the player to load an enchantment pack, a part
   * of the help message for the /ue load command.
   */
  @Since("2.2")
  lateinit var loadHelpPack: String

  /**
   * An error message stating that the command sender has submitted an invalid
   * type of content to load.
   */
  @Since("2.2")
  lateinit var loadInvalidType: String

  /**
   * An error message stating that the command sender has not submitted an
   * ID for the content to load.
   */
  @Since("2.2")
  lateinit var loadNoId: String

  /**
   * A message indicating that the enchantment was loaded successfully.
   */
  @Since("2.2")
  lateinit var loadEnchantmentSuccessful: String

  /**
   * A message indicating that the enchantment was reloaded successfully.
   */
  @Since("2.2")
  lateinit var loadEnchantmentReloaded: String

  /**
   * An error message stating that the enchantment could not be found.
   */
  @Since("2.2")
  lateinit var loadEnchantmentNotFound: String

  /**
   * A message indicating that the enchantment pack was loaded successfully.
   */
  @Since("2.2")
  lateinit var loadPackSuccessful: String

  /**
   * A message indicating that the enchantment pack could not be found.
   */
  @Since("2.2")
  lateinit var loadPackNotFound: String

  /**
   * The header of the help message for the /ue unload command.
   */
  @Since("2.2")
  lateinit var unloadHelpTitle: String

  /**
   * A message instructing the player to unload an enchantment, a part
   * of the help message for the /ue unload command.
   */
  @Since("2.2")
  lateinit var unloadHelpEnchantment: String

  /**
   * A message instructing the player to unload an enchantment pack, a part
   * of the help message for the /ue unload command.
   */
  @Since("2.2")
  lateinit var unloadHelpPack: String

  /**
   * An error message stating that the command sender has submitted an invalid
   * type of content to unload.
   */
  @Since("2.2")
  lateinit var unloadInvalidType: String

  /**
   * An error message stating that the command sender has not submitted an
   * ID for the content to unload.
   */
  @Since("2.2")
  lateinit var unloadNoId: String

  /**
   * A message indicating that the enchantment was unloaded successfully.
   */
  @Since("2.2")
  lateinit var unloadEnchantmentSuccessful: String

  /**
   * An error message stating that the enchantment could not be found.
   */
  @Since("2.2")
  lateinit var unloadEnchantmentNotFound: String

  /**
   * A message indicating that the enchantment pack was unloaded successfully.
   */
  @Since("2.2")
  lateinit var unloadPackSuccessful: String

  /**
   * An error message stating that the enchantment pack could not be found.
   */
  @Since("2.2")
  lateinit var unloadPackNotFound: String


  /**
   * The message used to indicate an action being started.
   *
   * Placeholders:
   * - **action**: The action in question
   */
  @Since("2.2")
  lateinit var started: String

  /**
   * The message used to indicate an action being finished.
   *
   * Placeholders:
   * - **action**: The action in question.
   * - **ms**: The time it took to finish the action in milliseconds.
   */
  @Since("2.2")
  lateinit var finished: String

  /**
   * The action of populating the registry.
   */
  @Since("2.2")
  lateinit var populatingRegistry: String

  /**
   * The action of initializing the connection data.
   */
  @Since("2.2")
  lateinit var initializingConnection: String

  /**
   * The action of initializing the data storage.
   */
  @Since("2.2")
  lateinit var initializingData: String

  /**
   * The action of preparing bStats.
   */
  @Since("2.2")
  lateinit var preparingMetrics: String

  /**
   * The action of checking for updates.
   */
  @Since("2.2")
  lateinit var checkingUpdates: String

  /**
   * The action of creating some runnable tasks.
   */
  @Since("2.2")
  lateinit var creatingTasks: String

  /**
   * The action of registering listeners.
   */
  @Since("2.2")
  lateinit var registeringListeners: String

  /**
   * The action of registering commands.
   */
  @Since("2.2")
  lateinit var initializingCommands: String

  /**
   * The action of initializing the economy.
   */
  @Since("2.2")
  lateinit var initializingEconomy: String

  /**
   * The action of registering enchantments.
   */
  @Since("2.2")
  lateinit var registeringEnchantments: String

  /**
   * The action of creating the README file (if necessary).
   */
  @Since("2.2")
  lateinit var addingReadme: String

  /**
   * The action of implementing the UnderscoreEnchants API.
   */
  @Since("2.2")
  lateinit var implementingApi: String

  /**
   * The action of starting Retrofit and initializing a repository.
   */
  @Since("2.2")
  lateinit var startingRetrofit: String

  /**
   * The message indicating about a successful plugin initialization.
   *
   * Placeholders:
   * - **plugin**: The plugin name and version.
   * - **ms**: The time it took to initialize the plugin in milliseconds.
   */
  @Since("2.2")
  lateinit var initialized: String

  /**
   * The message instructing the users to report bugs promptly.
   */
  @Since("2.2")
  lateinit var reportBugsHere: String

  /**
   * The message asking the users to review the plugin.
   *
   * Placeholders:
   * - **link**: The URL to the plugin's Spigot page.
   */
  @Since("2.2")
  lateinit var reviewRequest: String

  /**
   * The message expressing the gratitude for using UnderscoreEnchants. ❤️
   */
  @Since("2.2")
  lateinit var thanksForUsingUe: String


  /**
   * Finds a message by its configuration key.
   * @param key The key of the message.
   * @return The message, or null if not found.
   */
  fun byKey(key: String): String? = mapping[key]
}