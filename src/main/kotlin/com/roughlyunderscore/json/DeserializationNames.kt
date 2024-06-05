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

package com.roughlyunderscore.json

/**
 * This object contains lists of names that are used for deserialization of JSON objects.
 */
object DeserializationNames {
  object Enchantment {
    val NAME = listOf("name", "key", "nmae", "enchantment", "enchant")
    val ITEM = listOf("item", "material", "guiitem", "gui-item", "guiItem", "gui_item")
    val AUTHOR = listOf("author", "creator", "madeBy", "made", "author", "made-by", "made_by", "madeby")
    val TRIGGER_NAME = listOf("trigger", "triggerName", "trigger-name", "triggerType", "trigger-type", "triggertype", "trigger_name", "trigger_type")
    val CHANCE = listOf("chance", "activationChance", "activation-chance", "activationchance", "activation_chance")
    val COOLDOWN = listOf("cooldown", "cooldownTicks", "cooldown-ticks", "cooldownticks", "cooldown_ticks")
    val ACTIVATION = listOf("activation", "activationIndicator", "activation-indicator", "activationindicator", "activation_indicator", "indicator")
    val DESCRIPTION = listOf("description", "desc", "details", "info", "information")
    val APPLICABLES = listOf("applicables", "applicable")
    val FORBIDDEN = listOf("forbidden", "forbiddenMaterials", "forbidden-materials", "forbiddenmaterials", "forbidden_materials")
    val SEEKERS = listOf("seekers", "seeker", "enchantmentSeekers", "enchantment-seekers", "enchantmentseekers", "enchantment_seekers")
    val CONFLICTS = listOf("conflicts", "conflictsWith", "conflicts-with", "conflictswith", "conflicts_with")
    val UNIQUE = listOf("unique", "isUnique", "is-unique", "isunique", "is_unique")
    val CONDITIONS = listOf("conditions", "conds")
    val LEVELS = listOf("levels", "lvls")
    val OBTAINMENT = listOf("obtainment", "obtainmentRestrictions", "obtainment-restrictions", "obtainmentrestrictions", "obtainment_restrictions")
    val REQUIRED_ENCHANTMENTS = listOf("requiredEnchantments", "requiredEnchantments", "required-enchantments", "requiredenchantments", "required_enchantments")
    val REQUIRED_PLUGINS = listOf("requiredPlugins", "requiredPlugins", "required-plugins", "requiredplugins", "required_plugins")
    val WORLD_WHITELIST = listOf("worldWhitelist", "world-whitelist", "worldwhitelist", "world_whitelist")
    val WORLD_BLACKLIST = listOf("worldBlacklist", "world-blacklist", "worldblacklist", "world_blacklist")
  }

  object Condition {
    val CONDITION = listOf("condition", "cond", "name", "key", "nmae", "conditionName", "condition-name", "conditionname")
    val NEGATE = listOf("negate", "not", "invert", "negated", "inverted")
    val TARGET = listOf("target", "targets", "targetType", "target-type", "targettype", "player", "target-player", "target_player", "targetPlayer")
  }

  object Level {
    val INDEX = listOf("index", "lvl", "level", "levelIndex", "level-index", "levelindex")
    val CHANCE = listOf("chance", "activationChance", "activation-chance", "activationchance", "activation_chance")
    val COOLDOWN = listOf("cooldown", "cooldownTicks", "cooldown-ticks", "cooldownticks", "cooldown_ticks")
    val ACTIONS = listOf("actions", "effects")
    val CONDITIONS = listOf("conditions", "conds")
  }

  object Action {
    val SINGLE_ACTION = listOf("action", "singleAction", "single-action", "singleaction")
    val MULTIPLE_ACTIONS = listOf("actions", "multipleActions", "multiple-actions", "multipleactions")
    val DELAY = listOf("delay", "delayTicks", "delay-ticks", "delayticks", "delay_ticks")
    val CHANCE = listOf("chance", "activationChance", "activation-chance", "activationchance", "activation_chance")
    val TARGET = listOf("target", "targets", "targetType", "target-type", "targettype", "player", "target-player", "target_player", "targetPlayer")
    val CONDITIONS = listOf("conditions", "conds")
  }

  object Obtainment {
    val TYPE = listOf("type", "obtainmentType", "obtainment-type", "obtainmenttype")
    val LEVELS = listOf("levels", "lvls")
  }

  object RequiredEnchantment {
    val KEY = listOf("key", "namespacedKey", "namespaced-key", "namespacedkey", "namespaced_key")
    val SEEKERS = listOf("seekers", "seeker", "enchantmentSeekers", "enchantment-seekers", "enchantmentseekers", "enchantment_seekers")
    val LEVELS = listOf("levels", "lvls")
  }

  object RequiredPlugin {
    val PLUGIN_NAME = listOf("pluginName", "plugin-name", "pluginname", "pluginame", "name", "nmae", "naem")
    val DISPLAY_NAME = listOf("displayName", "display-name", "displayname")
    val LINK = listOf("link", "url", "uri", "website", "site", "web", "linkUrl", "link-url", "linkurl")
  }

  object Configuration {
    val SETTINGS = listOf("settings", "config", "configuration", "settingsNode", "configNode", "configurationNode")
    val MISC = listOf("misc", "miscellaneous", "miscNode", "miscellaneousNode")
    val GENERATION = listOf("generation", "gen", "genNode", "generationNode")
    val UI = listOf("ui", "gui", "inv", "uiNode", "guiNode", "invNode")
    val ENCHANTMENTS = listOf("enchantments", "enchants", "enchantmentsNode", "enchantsNode")
  }

  object Settings {
    val GENERATE_README = listOf("generateReadme", "generate-readme", "generate_readme")
    val LOCALE = listOf("locale", "language", "lang")
    val PLAYERS_CAN_CHANGE_LOCALES = listOf("playersCanChangeLocales", "players-can-change-locales", "players_can_change_locales")
    val INCLUDE_DEFAULT_LOCALES = listOf("includeDefaultLocales", "include-default-locales", "include_default_locales")
    val STORAGE_MEDIUM = listOf("storageMedium", "storage-medium", "storage_medium")
    val STORAGE_SAVING_PERIOD_TICKS = listOf("storageSavingPeriodTicks", "storage-saving-period-ticks", "storage_saving_period_ticks")
    val NOTIFY_PLAYERS_OF_DATA_LOADING = listOf("notifyPlayersOfDataLoading", "notify-players-of-data-loading", "notify_players_of_data_loading")
    val REPOSITORY_URL = listOf("repositoryUrl", "repository-url", "repository_url")
    val STRIP_SERVER_METADATA = listOf("stripServerMetadata", "strip-server-metadata", "strip_server_metadata")
  }

  object Misc {
    val TO_RUN_METRICS = listOf("toRunMetrics", "to-run-metrics", "to_run_metrics")
    val UPDATE_FREQUENCY = listOf("updateFrequency", "update-frequency", "update_frequency", "updateFrequencyHours", "update-frequency-hours", "update_frequency_hours")
    val NOTIFY_OPS_ON_JOIN_ABOUT_UPDATES = listOf("notifyOpsOnJoinAboutUpdates", "notify-ops-on-join-about-updates", "notify_ops_on_join_about_updates")
  }

  object Generation {
    val POPULATE_CHESTS_CHANCE = listOf("populateChestsChance", "populate-chests-chance", "populate_chests_chance")
    val POPULATE_FISHING_CHANCE = listOf("populateFishingChance", "populate-fishing-chance", "populate_fishing_chance")
    val POPULATE_VILLAGERS_CHANCE = listOf("populateVillagersChance", "populate-villagers-chance", "populate_villagers_chance")
  }

  object UI {
    val truncatePackDataAfterXEnchantments = listOf("truncatePackDataAfterXEnchantments", "truncate-pack-data-after-x-enchantments", "truncate_pack_data_after_x_enchantments")
  }

  object Enchantments {
    val LIMIT = listOf("limit")
  }

  object Locale {
    val IDENTIFIER = listOf("identifier", "id", "localeId", "locale-id", "localeid", "locale", "language", "lang")
    val MESSAGES = listOf("messages", "message", "msg", "localeMessages", "locale-messages", "localemessages")
  }

  object PackMetadata {
    val NAME = listOf("name", "packName", "pack-name", "packname")
    val VERSION = listOf("version", "packVersion", "pack-version", "packversion")
    val AUTHORS = listOf("authors", "author", "creator", "madeBy", "made", "author", "made-by", "made_by", "madeby")
    val DESCRIPTION = listOf("description", "desc", "details", "info", "information")
    val WEBSITE = listOf("website", "site", "web", "link", "url", "uri")
    val WORLD_WHITELIST = listOf("worldWhitelist", "world-whitelist", "worldwhitelist", "world_whitelist")
    val WORLD_BLACKLIST = listOf("worldBlacklist", "world-blacklist", "worldblacklist", "world_blacklist")
    val ITEM = listOf("item", "material", "guiitem", "gui-item", "guiItem", "gui_item")
  }

  object PlayerData {
    val UUID = listOf("uuid", "player", "playerUuid", "player-uuid", "playeruuid")
    val LOCALE = listOf("locale", "language", "lang")
    val TOGGLED_ENCHANTS = listOf("disabled", "toggledEnchants", "toggled-enchants", "toggledenchants")
    val COOLDOWNS = listOf("cooldowns", "cooldown", "cds", "cd")
  }
}