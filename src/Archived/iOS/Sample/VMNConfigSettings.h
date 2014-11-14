//
//  VMNConfigSettings.h
//  Bento
//
//  Created by rgr-myrg on 02/22/13.
//  Copyright (c) 2013 rgr-myrg. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface VMNConfigSettings : NSObject

@property (nonatomic, assign) BOOL nielsenID3Enabled;
@property (nonatomic, assign) BOOL nielsenID3EnableTransfer;
@property (nonatomic, assign) BOOL nielsenID3InAppRecruitmentEnabled;

@property (nonatomic, retain) NSString * nielsenID3ChannelName;
@property (nonatomic, retain) NSString * nielsenID3AppID;
@property (nonatomic, retain) NSString * nielsenID3AppName;
@property (nonatomic, retain) NSString * nielsenID3Mode;
@property (nonatomic, retain) NSString * nielsenID3AboutURL;

@property (nonatomic, assign) BOOL admsMeasureEnabled;
@property (nonatomic, assign) BOOL admsSslEnabled;
@property (nonatomic, assign) BOOL admsDebugLoggingEnabled;
@property (nonatomic, assign) BOOL admsTimeSpentTrackingEnabled;
@property( nonatomic, assign) BOOL admsOfflineTrackingEnabled;
@property (nonatomic, assign) BOOL audienceManagerEnabled;

@property (nonatomic, assign) NSInteger admsLifecycleSessionTimeout;
@property( nonatomic, assign) NSInteger admsOfflineHitLimit;

@property (nonatomic, retain) NSString * admsReportSuiteIDs;
@property (nonatomic, retain) NSString * admsTrackingServer;
@property (nonatomic, retain) NSString * admsVisitorID;
@property (nonatomic, retain) NSString * admsCharacterSet;
@property (nonatomic, retain) NSString * admsCurrencyCode;

@property( nonatomic, retain ) NSMutableDictionary* admsContextData;

@property (nonatomic,assign) BOOL comScoreEnabled;
@property (nonatomic,assign) NSString * comScoreAppName;

@property( nonatomic ) BOOL demdexEnabled;

@property( nonatomic ) BOOL ariaEnabled;
@property( nonatomic, retain ) NSString* keychainAccessGroup;

@property( nonatomic ) BOOL loggingEnabled;

@property( nonatomic ) BOOL tveEnabled;

@property( nonatomic, retain ) UIViewController* tveAuthComponent;

@property (nonatomic,assign) BOOL isCoppaCompliant;

@end
