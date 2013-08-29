FileSyncForServers
==================
##功能说明
* 提供多服务器间文件同步，主配置文件为config.properties
本工程采用java 的 jnotify监控文件变化，并将变化的文件通过linux rsync 命令同步到config.properties配置中配置的服务器

##文件结构说明
* src 为java源代码文件
* target 为项目编译文件输出目录
* pom.xml 为maven项目配置文件
* FileSync 是已经编译封装好的，拿来即用，只要启动该文件夹下start.sh就可以使用

##注
* 目前本工程暂不支持window系统，只支持linux系统，且依赖linux命令rsync，在没有安装rync的情况下，请先安装，在使用
