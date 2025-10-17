# Announcement Plugin - Full Description

## Overview

**Announcement** is a simple yet powerful Minecraft plugin designed for Spigot and Paper servers running Minecraft 1.21.x (including 1.21.10). This plugin allows server administrators and authorized players to broadcast important messages directly to all online players' screens in the form of eye-catching titles.

## What Makes This Plugin Special

Unlike chat-based announcement systems that can be easily missed in busy server chats, this plugin displays messages as **bold titles** in the center of every player's screen, ensuring maximum visibility and attention. The announcement title uses a unique small caps Unicode font (ᴀɴɴᴏᴜɴᴄᴇᴍᴇɴᴛ) that stands out beautifully.

## Key Features

### Multiple Command Aliases
The plugin offers flexibility with **4 different command aliases**, all performing the same function:
- `/announcements <message>`
- `/announce <message>`
- `/brodcast <message>` (intentional alternative spelling)
- `/broadcast <message>`

Use whichever feels most natural to you!

### Full Minecraft Color Code Support
Make your announcements visually stunning with Minecraft's color and formatting codes:

**Available Colors:**
- `&0` - Black
- `&1` - Dark Blue
- `&2` - Dark Green
- `&3` - Dark Aqua
- `&4` - Dark Red
- `&5` - Dark Purple
- `&6` - Gold
- `&7` - Gray
- `&8` - Dark Gray
- `&9` - Blue
- `&a` - Green
- `&b` - Aqua
- `&c` - Red
- `&d` - Light Purple
- `&e` - Yellow
- `&f` - White

**Formatting Options:**
- `&l` - Bold
- `&m` - Strikethrough
- `&n` - Underline
- `&o` - Italic
- `&r` - Reset (removes all formatting)

### Visual Display

When you send an announcement, all online players see:
- **Title:** ᴀɴɴᴏᴜɴᴄᴇᴍᴇɴᴛ (displayed in gold and bold)
- **Subtitle:** Your custom message with color codes applied
- **Duration:** The title stays on screen for several seconds, ensuring it's seen

### Permission System

The plugin uses a simple permission-based system:
- **Permission:** `announcement.use`
- **Default:** Granted to server operators (OP)
- Can be customized through your permission plugin (LuckPerms, PermissionsEx, etc.)

## Usage Examples

### Basic Announcement
```
/announcements Welcome to our server!
```

### Colored Text
```
/announce &cImportant: &eServer restart in 5 minutes!
```
This displays "Important:" in red and "Server restart in 5 minutes!" in yellow.

### Bold and Colored
```
/broadcast &l&6DOUBLE XP WEEKEND STARTS NOW!
```
This displays the message in bold, gold text.

### Multiple Colors
```
/announcements &aEvent starting! &bHead to spawn &enow!
```
Creates a multi-colored announcement mixing green, aqua, and yellow.

## Perfect Use Cases

- **Server Events:** Announce when events start, end, or important milestones occur
- **Server Restarts:** Warn players about upcoming restarts or maintenance
- **Rule Reminders:** Display important server rules or reminders
- **Celebrations:** Announce birthdays, milestones, or special occasions
- **Emergencies:** Quick alerts that need immediate player attention
- **Promotions:** Advertise sales, store updates, or special offers
- **Welcome Messages:** Greet new players joining the server
- **Contests:** Announce contest winners or new competitions

## Technical Specifications

- **Platform:** Spigot / Paper
- **Minecraft Version:** 1.21.x (tested on 1.21.10)
- **API Version:** 1.21
- **Java Version:** Java 8+
- **Dependencies:** None (standalone plugin)
- **File Size:** ~4 KB (extremely lightweight)

## Installation

1. Download the `announcement-1.0.0.jar` file
2. Place it in your server's `plugins` folder
3. Restart your server (or use `/reload` if you must)
4. The plugin is ready to use immediately!

## Configuration

This plugin requires **no configuration files**. It works out of the box with sensible defaults. Simply install and start using it!

## Permissions Setup

If you want to give announcement permissions to specific players or groups, use your permission plugin:

**Example with LuckPerms:**
```
/lp group moderator permission set announcement.use true
```

**Example with PermissionsEx:**
```
/pex group moderator add announcement.use
```

## Compatibility

- ✅ Spigot 1.21.x
- ✅ Paper 1.21.x
- ✅ Purpur 1.21.x
- ✅ All Spigot-based server software running 1.21.x

## Support & Feedback

This plugin was created with simplicity and reliability in mind. It has:
- No database requirements
- No configuration files to manage
- No external dependencies
- Minimal resource usage

Perfect for servers of any size, from small private servers to large public networks!

## Author

Created by: **spy**

---

**Version:** 1.0.0  
**Last Updated:** October 17, 2025
