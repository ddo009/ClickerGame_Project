package com.choinisae.nisaechoi.clickergame_project.modelpackage;

/**
 * Created by donghaechoi on 2016. 4. 14..
 */
public class ShopItem {

    private int shopItemImageRes;
    private String shopTextView;
    private String buttonText;

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public int getShopItemImageRes() {
        return shopItemImageRes;
    }

    public void setShopItemImageRes(int shopItemImageRes) {
        this.shopItemImageRes = shopItemImageRes;
    }

    public String getShopTextView() {
        return shopTextView;
    }

    public void setShopTextView(String shopTextView) {
        this.shopTextView = shopTextView;
    }
}
