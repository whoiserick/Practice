package rip.crystal.practice;

import rip.crystal.practice.utilities.file.language.Lang;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public enum Locale {

	PLAYER_NOT_FOUND("COMMON_ERRORS.PLAYER_NOT_FOUND"),

	ARENA_REACHED_MAXIMUM("ARENA.REACHED_MAXIMUM"),
	ARENA_BUILD_OUTSIDE("ARENA.BUILD_OUTSIDE"),

	KIT_EDITOR_START_RENAMING("KIT_EDITOR.START_RENAMING"),
	KIT_EDITOR_RENAMED("KIT_EDITOR.RENAMED"),
	KIT_EDITOR_NAME_TOO_LONG("KIT_EDITOR.NAME_TOO_LONG"),

	DUEL_SENT("DUEL.SENT"),
	DUEL_SENT_PARTY("DUEL.SENT_PARTY"),
	DUEL_RECEIVED("DUEL.RECEIVED"),
	DUEL_RECEIVED_PARTY("DUEL.RECEIVED_PARTY"),
	DUEL_RECEIVED_HOVER("DUEL.RECEIVED_HOVER"),
	DUEL_RECEIVED_CLICKABLE("DUEL.RECEIVED_CLICKABLE"),
	DUEL_SENDER_EXPIRED("DUEL.SENDER_EXPIRE"),
	DUEL_TARGET_EXPIRED("DUEL.TARGET_EXPIRE"),
	DUEL_HAS_EXPIRED("DUEL.HAS_EXPIRED"),
	DUEL_PLAYER_NOT_FOUND("DUEL.PLAYER_NOT_FOUND"),
	DUEL_CANNOT_YOURSELF("DUEL.CANNOT_DUEL_YOURSELF"),
	DUEL_CANNOT_DUEL_RIGHT_NOW("DUEL.CANNOT_DUEL_RIGHT_NOW"),
	DUEL_IS_BUSY("DUEL.IS_BUSY"),
	DUEL_DONT_RECEIVE_DUELS("DUEL.DONT_RECEIVE_DUELS"),
	DUEL_ALREADY_SENT("DUEL.ALREADY_SENT"),
	DUEL_CANNOT_SEND_PARTY_DUEL("DUEL.CANNOT_SEND_PARTY_DUEL"),
	DUEL_REQUEST_NO_PARTY("DUEL.NO_PLAYER_PARTY"),
	DUEL_REQUEST_EQUALS_PARTY("DUEL.REQUEST_EQUALS_PARTY"),
	DUEL_NO_PLAYERS_ON_LOBBY_PARTY("DUEL.NO_PLAYERS_ON_LOBBY_PARTY"),
	DUEL_NOT_HAVE_PARTY("DUEL.NOT_HAVE_PARTY"),
	DUEL_OTHER_NOT_HAVE_PARTY("DUEL.OTHER_NOT_HAVE_PARTY"),
	DUEL_IF_PARTY("DUEL.IF_PARTY"),
	DUEL_IF_TARGET_IN_PARTY("DUEL.IF_TARGET_IN_PARTY"),
	DUEL_NO_ARENAS_AVAILABLE("DUEL.NO_ARENAS_AVAILABLE"),
	DUEL_DONT_HAVE_DUEL_REQUEST("DUEL.DONT_HAVE_DUEL_REQUEST_PLAYER"),

	CLEAR_CHAT_BROADCAST("CHAT.CLEAR_CHAT_BROADCAST"),
	MUTE_CHAT_BROADCAST("CHAT.MUTE_CHAT_BROADCAST"),
	DELAY_CHAT_ENABLED_BROADCAST("CHAT.DELAY_CHAT_ENABLED_BROADCAST"),
	DELAY_CHAT_DISABLED_BROADCAST("CHAT.DELAY_CHAT_DISABLED_BROADCAST"),
	CHAT_DELAYED("CHAT.CHAT_DELAYED"),

	CONVERSATION_SEND_MESSAGE("CONVERSATION.SEND_MESSAGE"),
	CONVERSATION_RECEIVE_MESSAGE("CONVERSATION.RECEIVE_MESSAGE"),

	OPTIONS_PRIVATE_MESSAGES_ENABLED("OPTIONS.PRIVATE_MESSAGES_ENABLED"),
	OPTIONS_PRIVATE_MESSAGES_DISABLED("OPTIONS.PRIVATE_MESSAGES_DISABLED"),

	OPTIONS_PRIVATE_MESSAGE_SOUND_ENABLED("OPTIONS.PRIVATE_MESSAGE_SOUNDS_ENABLED"),
	OPTIONS_PRIVATE_MESSAGE_SOUND_DISABLED("OPTIONS.PRIVATE_MESSAGE_SOUNDS_DISABLED"),

	OPTIONS_GLOBAL_CHAT_ENABLED("OPTIONS.GLOBAL_CHAT_ENABLED"),
	OPTIONS_GLOBAL_CHAT_DISABLED("OPTIONS.GLOBAL_CHAT_DISABLED"),

	PARTY_HELP("PARTY.HELP"),
	PARTY_INFORMATION("PARTY.INFO"),
	PARTY_JOIN_BROADCAST("PARTY.JOIN_BROADCAST"),
	PARTY_JOIN_HOVER("PARTY.JOIN_HOVER"),
	PARTY_CREATE("PARTY.CREATE"),
	PARTY_DISBAND("PARTY.DISBAND"),
	PARTY_INVITE("PARTY.INVITE"),
	PARTY_INVITE_HOVER("PARTY.INVITE_HOVER"),
	PARTY_INVITE_BROADCAST("PARTY.INVITE_BROADCAST"),
	PARTY_JOIN("PARTY.JOIN"),
	PARTY_LEAVE("PARTY.LEAVE"),
	PARTY_PRIVACY_CHANGE("PARTY.PRIVACY_CHANGE"),
	PARTY_CHAT_PREFIX("PARTY.CHAT_PREFIX"),
	PARTY_CONTEXT_KICK("PARTY.CONTEXT.KICK"),
	PARTY_CONTEXT_QUIT("PARTY.CONTEXT.QUIT"),

	QUEUE_JOIN_UNRANKED("QUEUE.JOIN_UNRANKED"),
	QUEUE_LEAVE_UNRANKED("QUEUE.LEAVE_UNRANKED"),
	QUEUE_JOIN_RANKED("QUEUE.JOIN_RANKED"),
	QUEUE_LEAVE_RANKED("QUEUE.LEAVE_RANKED"),
	QUEUE_RANGE_INCREMENT("QUEUE.RANGE_INCREMENT"),
	QUEUE_NO_ARENAS_AVAILABLE("QUEUE.NO_ARENAS"),
	QUEUE_FOUND_RANKED_MATCH("QUEUE.FOUND_RANKED_MATCH"),
	QUEUE_FOUND_UNRANKED_MATCH("QUEUE.FOUND_UNRANKED_MATCH"),

	MATCH_GIVE_KIT("MATCH.GIVE_KIT"),
	MATCH_ENDERPEARL_COOLDOWN("MATCH.ENDERPEARL_COOLDOWN"),
	MATCH_ENDERPEARL_COOLDOWN_EXPIRED("MATCH.ENDERPEARL_COOLDOWN_EXPIRED"),
	MATCH_START_SPECTATING("MATCH.START_SPECTATING"),
	MATCH_START_SPECTATING_RANKED("MATCH.START_SPECTATING_RANKED"),
	MATCH_START_SPECTATING_FFA("MATCH.START_SPECTATING_FFA"),
	MATCH_NOW_SPECTATING("MATCH.NOW_SPECTATING"),
	MATCH_NO_LONGER_SPECTATING("MATCH.NO_LONGER_SPECTATING"),
	MATCH_PLAYING_ARENA_AUTHOR("MATCH.PLAYING_ARENA_AUTHOR"),
	MATCH_PLAYING_ARENA_NO_AUTHOR("MATCH.PLAYING_ARENA_NO_AUTHOR"),
	MATCH_START_TIMER("MATCH.START_TIMER"),
	MATCH_STARTED("MATCH.STARTED"),
	MATCH_END_DETAILS("MATCH.END_DETAILS"),
	MATCH_END_WINNER_INVENTORY("MATCH.END_WINNER_INVENTORY"),
	MATCH_END_LOSER_INVENTORY("MATCH.END_LOSER_INVENTORY"),
	MATCH_CLICK_TO_VIEW_NAME("MATCH.CLICK_TO_VIEW_NAME"),
	MATCH_CLICK_TO_VIEW_HOVER("MATCH.CLICK_TO_VIEW_HOVER"),
	MATCH_ELO_CHANGES("MATCH.ELO_CHANGES"),
	MATCH_PLAYER_KILLED("MATCH.PLAYER_KILLED"),
	MATCH_PLAYER_DIED("MATCH.PLAYER_DIED"),
	MATCH_BRIDGE_SCORED("MATCH.BRIDGE_SCORED"),

	MATCH_WINNER_TITLE("MATCH.END_WINNER_TITLE"),
	MATCH_WINNER_SUBTITLE("MATCH.END_WINNER_SUBTITLE"),

	MATCH_LOSER_TITLE("MATCH.END_LOSER_TITLE"),
	MATCH_LOSER_SUBTITLE("MATCH.END_LOSER_SUBTITLE"),

	REMATCH_SENT_REQUEST("REMATCH.SENT_REQUEST"),
	REMATCH_RECEIVED_REQUEST("REMATCH.RECEIVED_REQUEST"),
	REMATCH_RECEIVED_REQUEST_HOVER("REMATCH.RECEIVED_REQUEST_HOVER"),
	REMATCH_DO_NOT_HAVE_ANYONE("REMATCH.DO_NOT_HAVE_ANYONE"),
	REMATCH_CANCELLED("REMATCH.CANCELLED"),
	REMATCH_IS_SENT("REMATCH.IS_SENT"),

	ARROW_DAMAGE_INDICATOR("ARROW_DAMAGE_INDICATOR"),
	FISH_DAMAGE_INDICATOR("FISH_DAMAGE_INDICATOR"),

	VIEWING_INVENTORY("VIEWING_INVENTORY"),

	EVENT_CANT_HOST("EVENT.CANT_HOST"),
	EVENT_HELP("EVENT.HELP"),
	EVENT_JOIN_BROADCAST("EVENT.JOIN_BROADCAST"),
	EVENT_JOIN_HOVER("EVENT.JOIN_HOVER"),
	EVENT_PLAYER_JOIN("EVENT.PLAYER_JOIN"),
	EVENT_PLAYER_LEAVE("EVENT.PLAYER_LEAVE"),
	EVENT_PLAYER_VOTE("EVENT.PLAYER_VOTE"),
	EVENT_ROUND_START("EVENT.ROUND_START"),
	EVENT_ROUND_START_TIMER("EVENT.ROUND_START_TIMER"),
	EVENT_ROUND_ELIMINATION("EVENT.ROUND_ELIMINATION"),
	EVENT_ROUND_OPPONENT("EVENT.ROUND_OPPONENT"),
	EVENT_START("EVENT.STARTED"),
	EVENT_FINISH("EVENT.FINISHED"),
	EVENT_MATCH_REMAINING("EVENT.MATCH_REMAINING"),
	EVENT_ITS_THE_BOMB("EVENT.MATCH_ITS_THE_BOMB"),

	JOIN_MESSAGES("JOIN_MESSAGES"),

	OPTIONS_SCOREBOARD_ENABLED("OPTIONS.SCOREBOARD_ENABLED"),
	OPTIONS_SCOREBOARD_DISABLED("OPTIONS.SCOREBOARD_DISABLED"),
	OPTIONS_RECEIVE_DUEL_REQUESTS_ENABLED("OPTIONS.RECEIVE_DUEL_REQUESTS_ENABLED"),
	OPTIONS_RECEIVE_DUEL_REQUESTS_DISABLED("OPTIONS.RECEIVE_DUEL_REQUESTS_DISABLED"),
	OPTIONS_SPECTATORS_ENABLED("OPTIONS.SPECTATORS_ENABLED"),
	OPTIONS_SPECTATORS_DISABLED("OPTIONS.SPECTATORS_DISABLED"),

	CLAN_CREATE("CLAN.CREATE"),
	CLAN_INVITE_SENDER("CLAN.INVITE.SENDER"),
	CLAN_INVITE_RECEIVER("CLAN.INVITE.RECEIVER"),
	CLAN_SHOW("CLAN.SHOW"),
	CLAN_HELP("CLAN.HELP"),
	CLAN_DISBAND("CLAN.DISBAND"),
	CLAN_LEAVE_PLAYER("CLAN.LEAVE.PLAYER"),
	CLAN_LEAVE_BROADCAST("CLAN.LEAVE.BROADCAST"),
	CLAN_RENAME_BROADCAST("CLAN.RENAME_BROADCAST"),
	CLAN_JOIN_BROADCAST("CLAN.JOIN_BROADCAST"),
	CLAN_JOIN("CLAN.JOIN"),
	CLAN_SET_COLOR_BROADCAST("CLAN.SET_COLOR_BROADCAST"),
	CLAN_KICKED_BROADCAST("CLAN.KICKED.BROADCAST"),
	CLAN_KICKED_PLAYER("CLAN.KICKED.PLAYER"),
	CLAN_ERROR_NOT_FOUND("CLAN.ERROR.NOT_FOUND"),
	CLAN_ERROR_PLAYER_NOT_FOUND("CLAN.ERROR.PLAYER.NOT_FOUND"),
	CLAN_ERROR_PLAYER_ALREADY_IN_CLAN("CLAN.ERROR.PLAYER.ALREADY_IN_CLAN"),
	CLAN_ERROR_PLAYER_ALREADY_IN_CLAN_OTHER("CLAN.ERROR.PLAYER.ALREADY_IN_CLAN"),
	CLAN_ERROR_PLAYER_NOT_IN_YOUR_CLAN("CLAN.ERROR.PLAYER.NOT_IN_YOUR_CLAN"),
	CLAN_ERROR_ALREADY_EXIST("CLAN.ERROR.ALREADY_EXIST"),
	CLAN_ERROR_MAX_LENGTH_NAME("CLAN.ERROR.MAX_LENGTH_NAME"),
	CLAN_ERROR_MEMBERS_LIMIT("CLAN.ERROR.MEMBERS_LIMIT"),
	CLAN_ERROR_ONLY_OWNER("CLAN.ERROR.ONLY_OWNER"),
	CLAN_ERROR_NOT_INVITATION("CLAN.ERROR.NOT_INVITATION"),
	CLAN_ERROR_INVITATION_EXPIRED("CLAN.ERROR.INVITATION_EXPIRED"),
	CLAN_ERROR_OWNER_LEAVE("CLAN.ERROR.OWNER_LEAVE"),
	CLAN_DO_NOT_HAVE("CLAN.DO_NOT_HAVE_A_CLAN"),
	CLAN_CHAT_REFIX("CLAN.CHAT_PREFIX"),

	CLASS_CANNOT_USE_ITEM("CLASS.CANNOT_USE"),
	CLASS_CUSTOM_ITEM_USE("CLASS.ON_ITEM_EFFECT_USE"),
	CLASS_USE_BACKSTAB("CLASS.USE_BACKSTAB"),
	CLASS_FAILED_BACKSTAB("CLASS.FAILED_BACKSTAB"),
	CLASS_BARD_ENOUGH_ENERGY("CLASS.BARD_ENOUGH_ENERGY"),

	TOURNAMENT_ALREADY_CREATED("TOURNAMENT.ALREADY_CREATED"),

	STAFF_MODE_JOIN_STAFF("STAFF_MODE.JOIN_STAFF"),
	STAFF_MODE_LEAVE_STAFF("STAFF_MODE.LEAVE_STAFF"),
	STAFF_MODE_NO_PLAYERS_SPEC("STAFF_MODE.NO_PLAYERS_SPEC"),
	STAFF_MODE_NOW_SHOW_ALL_PLAYERS("STAFF_MODE.NOW_SHOW_ALL_PLAYERS"),
	STAFF_MODE_NOW_IN_SPAWN("STAFF_MODE.NOW_IN_SPAWN");

	private final String path;

	public Object format(Lang locale) {
		if (cPractice.get().getLang().get(path, locale) instanceof List)
			return cPractice.get().getLang().getStringList(path, locale);
		return cPractice.get().getLang().getString(path, locale);
	}

	public String getString(Lang locale) {
		return cPractice.get().getLang().getString(path, locale);
	}

	public List<String> getStringList(Lang locale) {
		return cPractice.get().getLang().getStringList(path, locale);
	}
}
