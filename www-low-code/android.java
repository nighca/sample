//初始化
QLive.init(this, QSdkConfig()
) { callback ->
    //业务方如何获取token  在token过期和登陆时候会回调该方法
    getLoginToken(callback)
}
//登陆 登陆成功后才能使用qlive
QLive.auth(object : QLiveCallBack<Void> {
    override fun onError(code: Int, msg: String?) {
    }
    override fun onSuccess(data: Void?) {
    }
})
//可选 绑定用户资料 
val ext =  HashMap()
//扩展字段，可以自定义同步的内容
ext.put("vip","1")
//跟新/绑定 业务端的用户信息
QLive.setUser(QUserInfo( "your avatar","your nickname", ext) ,object :  QLiveCallBack<Void>{})
val liveUIKit = QLive.getLiveUIKit()
//跳转到直播列表页面
liveUIKit.launch(context)
