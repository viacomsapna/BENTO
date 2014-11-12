[
	{
		"config" : {
			"isCoppaCompliant" : true,
			"audienceManagerEnabled": true
		},
		"adData" : {
			"x" : 0,
			"y"   : 0,
			"width" : 300,
			"height" : 50,
			"appName" : "btg_test_app",
			"sections" : "",
			"isDFP" : true,
			"enableCloseButton" : true,
			"closeButtonInterval" : 5,
			"isRefreshable" : true,
			"refreshInterval" : 10,
			"enableDefaultBumper" : true,
			"enableCoppaAdBanner" : true,
			"keyValues" : {
				"!category" : "v1.2.3",
				"ver"   : "v1.2.3",
				"testmode" : "celtra_mobile_300x50"
			},
			"keychainKeyValues" : {
				"aamSegments" : ""
			},
			"dfpData" : {
				"metadata" : {
					"property" : "mtv",
					"hub" : "shows",
					"is_main" : true,
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
