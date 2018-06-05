package com.kantapp.gsonwithkotlin.Java;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Kantapp Inc. on 05-06-2018.
 */
public class Contacts
{
    @SerializedName("contacts")
    @Expose
    ArrayList<Contact> contact;

    public Contacts(ArrayList<Contact> contact) {
        this.contact = contact;
    }

    public Contacts() {
    }

    public ArrayList<Contact> getContact() {
        return contact;
    }

    public void setContact(ArrayList<Contact> contact) {
        this.contact = contact;
    }


}

