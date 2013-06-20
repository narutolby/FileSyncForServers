FileSyncForServers
==================
提供多服务器间文件同步，主配置文件为config.properties
本工程采用java 的 jnotify监控文件变化，并将变化的文件通过linux rsync 命令同步到config.properties配置中配置的服务器
