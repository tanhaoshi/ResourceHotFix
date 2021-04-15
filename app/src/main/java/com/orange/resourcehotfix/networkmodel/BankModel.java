package com.orange.resourcehotfix.networkmodel;

import java.util.List;

/**
 * create by ths on 2020/6/17
 */
public class BankModel {


    /**
     * cardType : DC
     * bank : PSBC
     * key : 6221506020009066385
     * messages : []
     * validated : true
     * stat : ok
     */

    private String cardType;
    private String bank;
    private String key;
    private boolean validated;
    private String stat;
    private List<?> messages;

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public List<?> getMessages() {
        return messages;
    }

    public void setMessages(List<?> messages) {
        this.messages = messages;
    }
}
