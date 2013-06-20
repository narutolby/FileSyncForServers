package com.jike.filesync;

/**
 * Created with IntelliJ IDEA.
 * User: naruto
 * Date: 13-6-19
 * Time: 上午11:01
 * To change this template use File | Settings | File Templates.
 */
public class Server {
    private String userName;
    private String passWord;
    private String alias;
    private String ip;
    private String watchPath;


    public Server(String userName, String passWord, String alias, String ip, String watchPath) {
        this(userName, passWord, alias, ip);
        this.watchPath = watchPath;
    }

    public Server(String userName, String passWord, String alias, String ip) {
        this(userName, passWord, alias);
        this.ip = ip;
    }

    public Server(String userName, String passWord, String alias) {
        this(userName, passWord);
        this.alias = alias;
    }

    public Server(String userName, String passWord) {
        this(userName);
        this.passWord = passWord;
    }

    public Server(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getWatchPath() {
        return watchPath;
    }

    public void setWatchPath(String watchPath) {
        this.watchPath = watchPath;
    }

    public Server() {

    }
}
