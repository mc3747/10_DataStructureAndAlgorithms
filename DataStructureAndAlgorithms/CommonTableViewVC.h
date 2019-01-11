//
//  BorrowMoneyContractVC.h
//  GjFax
//
//  Created by gjfax on 2017/11/22.
//  Copyright © 2017年 GjFax. All rights reserved.
//

#import <UIKit/UIKit.h>

typedef NS_ENUM(NSInteger,ClassType) {
    ClassTypeDataSouceC = 0,
    ClassTypeDataSouceOC,
    ClassTypeAlgorithemC,
    ClassTypeAlgorithemOC
    
};
@interface CommonTableViewVC : UIViewController
@property (nonatomic, assign) ClassType classType;
@property (nonatomic, copy) NSString *titleString;
@property (nonatomic, strong) NSArray *subtitleArray;

@end
