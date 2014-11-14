package com.vianet.bento.vo;

import java.util.ArrayList;

public class Metadata{
	public int MTVN_NAMESPACE = 3;

	public String videoId = "NO_VID";
	public String videoUrl = "NO_VID_URL";
	public String videoTitle = "NO_VID_TITLE";
	public String artistId = "NO_ARTIST_ID";
	public String label = "NO_LABEL";
	public String mediaCategory = "NO_MEDIA_CATEGORY";
	public String mtvnOwner = "OWNER_UNSET";
	public String playlistTitle = "PLAYLIST_TITLE_UNSET";
	public String playlistRepTitle;
	public String pageName = "NO_PAGE_NAME";
	public String guid = "NO_GUID";
	public String playerMode = "normal";
	public String mediaPlayerName = "";

	public Boolean isAd = false;
	public Boolean reportable;
	public Boolean isLiveEvent = false;
	public Boolean isFullEpisode = false;
	public Boolean hasPlayList = false;

	public String artistName;
	public String franchise;
	public String uriNamespace;
	public String thumbnailUrl;
	public String contentType;
	public String businessUnit;
	public String description;
	public String lineupId;
	public String playlistType;
	public String showTitle;
	public String playerSize;
	public String adUrl;
	public String adUrlRedirect;
	public String playerUrl;
	public String clipType;
	public String segmentName;
	public String mediaTitle;
	public String events;
	public String products;

	public int duration;
	//public int itemDuration;
	public int itemIndex;
	public int playlistLength;
	public int playlistDuration;
	public int playItemCount = 0;

	public ArrayList<String> playlistMetadataItems;
	public ArrayList<String> beacons;

	public String mediaDescription;
	public String playlistURI;
	public String playlistId = "NO_PLAYLIST_ID";
	public String eventType;

	public int bandwidth;
	public String location;
	public String subBrand;
	public String userSegment;
	public String vmnUUID;

	public double bufferingTime;
	
	public String appName;
	public String section;
}
