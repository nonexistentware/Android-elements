package com.nonexistentware.firebaserecycler;

public class PlayerModel {
    private String playerEmail;
    private String playerName;
    private String imgUrl;

    public PlayerModel() {
    }

    public PlayerModel(String playerEmail, String playerName, String imgUrl) {
        this.playerEmail = playerEmail;
        this.playerName = playerName;
        this.imgUrl = imgUrl;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerEmail(String playerEmail) {
        this.playerEmail = playerEmail;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
