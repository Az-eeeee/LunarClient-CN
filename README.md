# LunarClient-CN | LunarClient for Chinese players

> Write in Chinese

## 下载

> Leave a star pls, I really need it

[点击此处](https://github.com/chenmy1903/LunarClient-CN/releases)

## 这是什么

> 中文修复感谢[sduoduo233](https://github.com/sduoduo233/LunarInputFix)的代码, 感谢LunarClient-QT的全饰品解锁jar, 感谢[lunarclient.com](https://lunarclient.com)的LC启动器

因为低版本的Minecraft无法输入中文, 这是一个Lunar Client的修改版, 可以解决中文修复问题

## 快捷方式教程

创建快捷方式不要把主程序`Lunar Client.exe`做成快捷方式, 这样做会使程序出现bug

----------------↓正确方法↓---------------------

1. 将`launchlc.bat`弄成快捷方式
2. 右键->属性->自定义->更改图标->选择LC的主程序-> 选择第一个图标->点击确定

## 部分错误以及解决办法

> 先下载新版本试试

1. [Java启动错误](help/java-launch-failed.md)
2. [启动器卡住](help/launcher-failed.md)

## FAQ

### 会ban吗

不会, 除非你注入了或被staff神权了.

### 有后门吗

没有, 开放源代码, 可以去看, 一切说LC-CN有后门的均为乐子.

## 乐子封禁

1. 封禁LuckyInLove_因为跑路/实名/MoreThanLucky are banned
2. 封禁Evecat114514
3. 封禁LianBeans因为MoreThanLucky are banned
4. 封禁LolQiQi_因为跑路/开外挂boosting CubeWhy(幸好用小号玩的,要不我大号没了L)
5. 封禁Alyars因为MoreThanLucky are banned
6. 封禁cmy_love_lan因为实名/跑路/辱骂他人/开安全黑客

## 封禁更新

1. 增加原因
2. 增加PlayerNick和PlayerUUID

## 更新日志

> 全饰品版本不会受到支持

## v2.11.2-fix13

> 感谢加速源`gh.api.99988866.xyz`, 此版本为最后一个LC-CN版本!

1. 增加彩蛋
2. 修改首次启动提示, 改成判断版本
3. 增加自动更新, 防止乐子破解LC-CN

## v2.11.2-fix12-pre1

1. 增加java助理参数
2. 删掉一条MOTD

## v2.11.2-fix12

1. 可以增加自定义助理(省的天天上传全饰品, 不需要iq就可以增加)
2. 移除启动报错自动报告, 防止LunarClient-CN死的太快
3. 将启动处理交给client.py而不是LunarClient启动器
4. 把启动交给lccnlauncher而不是lunarlauncher

### v2.11.2-fix11

1. 修复了中文修复的bug
2. 完善了封禁系统 (具体更新见[此处](#封禁更新))
3. 增加了修改窗口标题

### v2.11.2-fix10

> 请查看源代码以了解此版本更新内容

1. 中文修复修复因为文件夹空格导致无法启动的bug
2. 优化fps

### v2.11.2-fix9

1. 修复反向优化

### v2.11.2-fix8

1. 跳过下载JRE, 提升启动速度

### v2.11.2-fix7

> 不想更新到v2.12.8 qwq, 因为更新这个东西会废掉我一天的时间

1. 中文修复兼容Windows 7

### v2.11.2-fix6

> 应该是最后几个版本了...毕竟已经出官方中文修复了...(选择Forge然后装mod)

1. 修复未选择过版本中文修复报错的bug

### v2.11.2-fix5

> 此版本可以大幅提升性能

1. 汉化Settings中未汉化的部分
2. 进程优先级修复
3. 隐藏中文修复黑窗口

### v2.11.2-fix4

1. 修复未定义的函数导致中文修复注入失败的错误

### v2.11.2-fix3

> 请下载2.11.2-fix4版本, 本版本在修复1.19无法启动的bug的同时出现了无法注入中文修复的特性

1. 修复1.19无法启动的bug [严重]
2. 汉化部分错误报告

### v2.11.2-fix2

> 直接双击`Lunar Client.exe`就可以打开, 不要再去问咋弄了, 连安装python都没了

1. 1.9+版本不会启动中文修复
2. 游戏关闭后中文修复会自动关闭

### 2.11.2-fix1

> 部分玩家收到了dev版本, 这个是正式版。

1. 增加自定义JVM启动参数, [教程点这里](help/how-to-edit-launch-args.md)
2. `-server`启动参数可以去除
3. 优化inputfix-log, 未开启log的时候不创建log文件
4. 此版本起自带python运行环境(主要是不会安装环境的人太多了, txt写了看不懂)

### v2.11.2

1. 升级到2.11.2版本

### v2.10.1-fix2

1. 修改不是人话的汉化
2. 汉化部分错误报告

### v2.10.1-fix1

1. 修复因为依赖库错误而导致中文输入无法启动的bug

### v2.10.1

> 此版本起开始开源

1. 加入中文修复
2. 汉化启动器(没汉化的地方就是改不了的地方)

### v2.10.1-old1

> bug贼多的版本, 本版本并没有开源

1. 汉化About界面
