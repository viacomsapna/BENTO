[
	{
		"config" : {
			"isCoppaCompliant" : false,
                         "audienceManagerEnabled": true,
                         "comScoreEnabled" : true

		},
		"adData" : {
			"x" : 0,
			"y"   : 0,
			"width" : 300,
			"height" : 250,
			"appName" : "btg_test_app",
			"sections" : "",
			"isDFP" : true,
			"enableCloseButton" : true,
			"closeButtonInterval" : 5,
			"isRefreshable" : true,
			"refreshInterval" : 10,
			"enableDefaultBumper" : true,
			"enableCoppaAdBanner" : true,
			"alternativeSizes" : [
					{
					"adWidth" : 300,
					"adHeight" : 50
					},
										{
					"adWidth" : 200,
					"adHeight" : 100
					}
			],
			"keyValues" : {
				"!category" : "v1.2.3",
				"ver"   : "v1.2.3",
				"testmodePrefix" : "medialets_mraid"
			},
			"keychainKeyValues" : {
				"aamSegments" : ""
			},
			"dfpData" : {
				"metadata" : {
					  "property": "mtv",
					  "hub": "shows",
					  "franchise": "Teen Mom 2",
        				  "section": "full-episodes",
					  "title": "a-teen-mom-gets-pregnant.",
        				  "is_main": true,
					  "season": 2,
        				  "episode": "202"
				},
				"mappings" : {
					"ad-unit" : {
						"1" : "@property",
						"2" : "@hub"
					},
					"key-values": {
            					"sea": "@season",
            					"ep": "@episode",
        					 "foo": "bar"
						 }
				}		        	
			}
		}
	}
]
