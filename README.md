# is-dream
dream service 

---- 该项目主要是做点播视频网站 

一 功能介绍

1. 目前完成 登录 注册(目前仅支持了 账号 邮箱验证码的方式 后续扩张) 发布视频 观看视频 评论 点赞 历史记录

2. 兼容各种手机 由于 前端播放器采用的 dplay 在 ie 9 以下的版本 会出现不兼容的情况.

3. 目前是基于一键上传 生成视频播放地址 视频前端 ui 的图片展示 由后端做配置生成

4. 后续开发弹幕系统 以及观影室 模块.

5. 准备接入 elk  以及 jenkens 

二. 模块介绍

gate 是路由网关 用于请求的控制转发 以及校验

dao  是操作数据库的模块 本项目接入的是 mysql 采用的 mybaties 注解的方式

common 是公共模块 比如公共基础异常 公共的工具方法 公共的常量信息等

cache  是缓存模块 接入redis 做的缓存 主要存储的前端页面的 ui 以及 video 相关信息

auth   是鉴权模块 由于本项目是点播视频 对鉴权 目前只停留在部分 用户界面的层次 故对对数api 是没有进行鉴权

media  是视频处理模块 包括 上传视频 生成ui 图片 生成用户头像 评论 点赞 等等视频相关的操作.

后续添加 barrage 弹幕模块 整合 netty 

三. 目标 做一个自己的点播网站 专门做正能量的视频部分 例如 名人堂 科技 宇宙  世界难题猜想介绍 以及物理 演讲 励志等视频为核心部分 


