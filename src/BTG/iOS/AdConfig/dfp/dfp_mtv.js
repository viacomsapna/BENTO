[
	{
		"config" : {
			"isCoppaCompliant" : false,
                         "audienceManagerEnabled": true

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
			"isRefreshable" : false,
			"refreshInterval" : 12000,
			"enableDefaultBumper" : true,
			"enableCoppaAdBanner" : true,
			"keyValues" : {
				"!category" : "v1.2.3",
				"ver"   : "v1.2.3",
				"testmodePrefix" : "medialets_mraid"
			},
			"dfpData" : {
				"metadata" : {
					  "property": "mtv",
					  "hub": "shows",
					  "franchise": "Teen Mom 2",
        				  "section": "full-episodes",
					  "title": "A Teen Mom Gets Pregnant.",
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
