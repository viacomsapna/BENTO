package com.vianet.bento.vo;

import java.util.ArrayList;
import java.util.HashMap;

public class ConfigSettings{
	public Boolean debugMode;

	public String applicationOrigin = "ORIGIN_UNSET";
	public String applicationContext = "CONTEXT_UNSET";
	public String countryCode = "COUNTRY_XX";

	public Boolean omnitureEnabled;
	public Boolean omnitureMediaTrackingEnabled;
	public Boolean omnitureEndslateTracking;
	public Boolean omnitureHeartbeatsDisabled;
	public Boolean omnitureLiveEventHeartbeatsDisabled;
	public Boolean omnitureLiveEventTrackingEnabled;

	public String omnitureVisitorMigrationKey;
	public String omnitureVisitorMigrationServer;
	public String omniturePathContext;
	public String omnitureDataCenter;
	public String omnitureFirstPartyServer;

	public String omnitureSuite;
	public String omnitureTrackingServer;
	public String omnitureVisitorNamespace;
	public String omnitureCharSet = "ISO-8859-1";
	public String omnitureCurrencyCode = "USD";
	public String omnitureChannel = "NO_CHANNEL_PROVIDED";

	public int omnitureLifecycleSessionTimeout = 300; //5 minutes

	public Boolean omnitureSSL = false;
	public Boolean omnitureDebugLogging = false;

	public ArrayList<String> omnitureLiveEventData;
	public int omnitureLiveEventBeaconFreq = 180;

	public HashMap<String,String> omnitureCustomFields = new HashMap<String,String>();

	public Boolean demdexEnabled;
	public Boolean demdexEndCallEnabled;

	public String nielsenClientID; 
	public Boolean nielsenEnabled; 
	public String nielsenVideoCensusID;

	public Boolean comScoreEnabled;
	public String comScorePrimaryID;
	public String comScoreProducerID;
	public String comScoreLocationID;

	public int comScoreGenreID = 20000; 
	public Boolean comScoreAdTracking = true;

	public String referrer;
	public String playerURL;
	public String geo;
	public String group;
	public String device;
	public String applicationName;
	public String applicationType;

	public Boolean freewheelEnabled;
	public Boolean freewheelIsTest;
	public Boolean freewheelIsDomestic = true;

	public String freewheelSiteSection;
	public String freewheelNetworkId;
	public String freewheelProfileId;
	public String freewheelDisplayBase;
	public String freewheelAssetId;

	public Boolean freewheelDuration;
	public Boolean freewheelTimeSinceLastAd;
	public Boolean freewheelUseActualDuration;
	public Boolean freewheelSiteSectionPathParsing;

	public Boolean TVEEnabled;

	public String TVERequestorID;
	public String TVEChannelID;
	public String TVEBrand;
	public String TVEEnvironment = "development";
	public String TVEDevice = "mobile";
	
	public Boolean ariaEnabled = true;

	public Boolean doubleClickStaticAdEnabled;
	public Boolean doubleClickStaticAdUseExternalBrowser;
	public Boolean doubleClickStaticAdIsCoppaCompliant;

	public String doubleClickStaticAdDartSite;
	public String doubleClickStaticAdKeyValues = "";
}
