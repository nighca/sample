//初始化SDK  errorBack错误回调，可在此处更新过期的token
[QLive initWithToken:token serverURL:@"liveKit域名" errorBack:nil];
//绑定自己服务器的头像和昵称 extension为扩展字段，可以自定义同步的内容
[QLive setUser:user.avatar nick:user.nickname extension:nil];

Tips:如果需要使用内置美颜，在初始化后调用[QLive setBeauty:YES]; 
    
//直播列表页：
QLiveListController *listVc = [QLiveListController new];
[self.navigationController pushViewController:listVc animated:YES];
       
//观众观看页面：
QNAudienceController *vc = [QNAudienceController new];
vc.roomInfo = roomInfo;
vc.modalPresentationStyle = UIModalPresentationFullScreen;
[self presentViewController:vc animated:YES completion:nil];
