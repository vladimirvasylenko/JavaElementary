package com.hillel.lesson04.homework.entities;

public class Client {

    private String clientIdentifier;
    private String surname;
    private String accountIdentifier;
    private float sum;

    public Client(String clientIdentifier, String surname, String accountIdentifier, float sum) {
        this.clientIdentifier = clientIdentifier;
        this.surname = surname;
        this.accountIdentifier = accountIdentifier;
        this.sum = sum;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public void setClientIdentifier(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "clientIdentifier='" + clientIdentifier + '\'' +
                ", surname='" + surname + '\'' +
                ", accountIdentifier='" + accountIdentifier + '\'' +
                ", sum=" + sum +
                '}';
    }
}
