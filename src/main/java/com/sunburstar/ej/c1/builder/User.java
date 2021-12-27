package com.sunburstar.ej.c1.builder;

import java.time.LocalDateTime;

/**
 * User builder
 *
 * @author yh s
 * @date 2021/12/27 13:01
 */

public class User {

    private String userName;
    private String passwd;
    private String phone;
    private LocalDateTime createTime;

    public static class Builder{

        //Required attributes
        private String userName;
        private String passwd;
        private String phone;

        //Auto arch
        private LocalDateTime createTime = LocalDateTime.now();

        public Builder( String userName,String passwd,String phone){
            this.userName = userName;
            this.passwd = passwd;
            this.phone = phone;

        }
        public Builder(){

        }


        public Builder userName(String userName){
            userName = userName;
            return this;
        }

        public Builder passwd(String passwd){
            passwd = passwd;
            return this;
        }

        public Builder phone(String phone){
            phone = phone;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    private User(Builder builder){
        userName = builder.userName;
        passwd = builder.passwd;
        phone = builder.phone;
        createTime = builder.createTime;
    }

}
