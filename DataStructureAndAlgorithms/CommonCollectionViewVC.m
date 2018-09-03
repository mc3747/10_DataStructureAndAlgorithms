//
//  CommonCollectionViewVC.m
//  DataStructureAndAlgorithms
//
//  Created by gjfax on 2018/5/22.
//  Copyright © 2018年 macheng. All rights reserved.
//

#import "CommonCollectionViewVC.h"
#import "CommonTableViewVC.h"
#import "DataStructureViewController.h"


@interface CommonCollectionViewVC ()<UICollectionViewDelegate, UICollectionViewDataSource,UICollectionViewDelegateFlowLayout>
@property (nonatomic, strong) UICollectionView *collectionView;
@end

@implementation CommonCollectionViewVC
static NSString * const reuseIdentifier = @"CommonCollectionViewCell";

- (void)viewDidLoad {
    [super viewDidLoad];
    self.title = @"数据结构和算法";
    [self.view addSubview:self.collectionView];
}

- (UIColor *)getRandomColor {
    NSArray *colorArray = @[MCColorLightGray,MCColorLightBlack,MCColorLightYellow,MCColorLightBlue,MCColorLightOrange,MCColorLightGreen,MCColorLightRed];
    int i = arc4random() % (colorArray.count);
    return colorArray[i];
}

#pragma mark <UICollectionViewDataSource>

- (NSInteger)collectionView:(UICollectionView *)collectionView numberOfItemsInSection:(NSInteger)section {
    
    return _titleArray.count;
}

- (UICollectionViewCell *)collectionView:(UICollectionView *)collectionView cellForItemAtIndexPath:(NSIndexPath *)indexPath {
    
    UICollectionViewCell *cell = [collectionView dequeueReusableCellWithReuseIdentifier:reuseIdentifier forIndexPath:indexPath];
    cell.backgroundColor = [self getRandomColor];
    
//    UILabel *textLabel = [[UILabel alloc] initWithFrame:CGRectMake(cell.frame.origin.x, cell.frame.origin.y, cell.frame.size.width, cell.frame.size.height)];
     UILabel *textLabel = [[UILabel alloc] initWithFrame:CGRectMake(10,10,100,50)];
    textLabel.text = _titleArray[indexPath.row];
    textLabel.textColor = COMMON_BLACK_COLOR;
    
    [cell addSubview:textLabel];
    
    return cell;
}

#pragma mark - UICollectionViewDelegateFlowLayout
//返回每个cell的大小
- (CGSize)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout sizeForItemAtIndexPath:(NSIndexPath *)indexPath{
    
    return CGSizeMake(self.view.frame.size.width/2 - 20, self.view.frame.size.height/3 - 10);
}
//设置每一个Cell的垂直和水平间距
-(UIEdgeInsets)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout *)collectionViewLayout insetForSectionAtIndex:(NSInteger)section{
    return UIEdgeInsetsMake(10, 5, 10, 5);
}

#pragma mark <UICollectionViewDelegate>

- (void)collectionView:(UICollectionView *)collectionView didSelectItemAtIndexPath:(NSIndexPath *)indexPath {
    
    if (indexPath.row == 0) {
        DataStructureViewController *vc = [[DataStructureViewController alloc] init];
         [self.navigationController pushViewController:vc animated:YES];
        
    }else if (indexPath.row == 1) {
        
        CommonTableViewVC *vc = [[CommonTableViewVC alloc] init];
        vc.titleString = _titleArray[indexPath.row];
        vc.subtitleArray = @[@"1_冒泡排序",@"2_选择排序",@"3_快速排序",@"4_插入排序",@"5_希尔排序",@"6_归并排序",@"7_基数排序",@"8_堆排序"];
        [self.navigationController pushViewController:vc animated:YES];
    };
    
}
#pragma mark -  懒加载
- (UICollectionView *)collectionView
{
    if (!_collectionView) {
        UICollectionViewFlowLayout *layout = [[UICollectionViewFlowLayout alloc] init];
        layout.minimumInteritemSpacing = 10;
        layout.minimumLineSpacing = 10;
        layout.itemSize = CGSizeMake((self.view.frame.size.width - 20)/3.0, 100);
        _collectionView = [[UICollectionView alloc] initWithFrame:CGRectMake(0, 64, MAIN_SCREEN_WIDTH, MAIN_SCREEN_HEIGHT - 64 - IPHONE_X_Bottom_SafeArea_Height) collectionViewLayout:layout];
        _collectionView.delegate = self;
        _collectionView.dataSource = self;
        _collectionView.backgroundColor = COMMON_GREY_WHITE_COLOR;
        [_collectionView registerClass:[UICollectionViewCell class] forCellWithReuseIdentifier:reuseIdentifier];
    }
    
    return _collectionView;
}

@end
