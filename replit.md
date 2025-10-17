# Announcement - Minecraft Plugin

## Overview

Announcement is a simple Minecraft Spigot/Paper plugin that allows server administrators to broadcast announcements to all online players. The announcement displays as a title on every player's screen.

**Last Updated:** October 17, 2025 - Created new announcement plugin

## User Preferences

Preferred communication style: Simple, everyday language.

## System Architecture

### Plugin Type
- **Platform:** Minecraft Spigot/Paper Plugin
- **Language:** Java 8
- **Build Tool:** Maven
- **API Version:** 1.21 (compatible with all 1.21.x versions)
- **Spigot API:** 1.21.4-R0.1-SNAPSHOT

### Core Components

1. **AnnouncementPlugin** - Main plugin class that registers the command
2. **AnnouncementCommand** - Handles the announcement command execution

### Features
- Single command with 4 aliases: /announcements, /announce, /brodcast, /broadcast
- Displays title "Announcement" with custom message to all online players
- Supports Minecraft color codes using & symbol (e.g., &c for red, &a for green)
- Permission-based access (announcement.use)
- Confirmation message to command sender

### Command Usage
```
/announcements <message>
/announce <message>
/brodcast <message>
/broadcast <message>
```

Examples:
- `/announcements Welcome to the server!`
- `/announcements &cRed text &aand green text`
- `/broadcast &l&6Bold orange message`

This will display on all players' screens:
- **Title:** ᴀɴɴᴏᴜɴᴄᴇᴍᴇɴᴛ (in gold/bold with small caps Unicode font)
- **Subtitle:** Your custom message with color code support

### Color Codes
You can use Minecraft color codes in your announcements:
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
- `&l` - Bold
- `&m` - Strikethrough
- `&n` - Underline
- `&o` - Italic
- `&r` - Reset

## External Dependencies

### Build Dependencies
- **Spigot API** (1.21.4-R0.1-SNAPSHOT) - Minecraft server API

### Development Tools
- **Maven** - Build and dependency management
- **Maven Compiler Plugin** - Java 8 compilation

## Recent Changes

### October 17, 2025
- Deleted old SpySimpleBan plugin
- Created new Announcement plugin from scratch
- Implemented single command with 4 aliases
- Successfully built plugin
