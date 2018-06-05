package com.kantapp.gsonwithkotlin.Java;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kantapp Inc. on 05-06-2018.
 */
public class Contact
{
    @SerializedName("id")
    @Expose
    String id;

    @SerializedName("name")
    @Expose
    String name;

    @SerializedName("email")
    @Expose
    String email;

    @SerializedName("address")
    @Expose
    String address;

    @SerializedName("gender")
    @Expose
    String gender;

    PhoneDetails phone;

    public Contact(String id, String name, String email, String address, String gender, PhoneDetails phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public Contact() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PhoneDetails getPhone() {
        return phone;
    }

    public void setPhone(PhoneDetails phone) {
        this.phone = phone;
    }

    private class PhoneDetails
    {
        @SerializedName("mobile")
        @Expose
        String id;

        @SerializedName("home")
        @Expose
        String home;

        @SerializedName("office")
        @Expose
        String office;

        public PhoneDetails(String id, String home, String office) {
            this.id = id;
            this.home = home;
            this.office = office;
        }

        public PhoneDetails() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getHome() {
            return home;
        }

        public void setHome(String home) {
            this.home = home;
        }

        public String getOffice() {
            return office;
        }

        public void setOffice(String office) {
            this.office = office;
        }
    }
}
