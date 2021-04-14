package com.class26ENCAPSULATION.Task02;

public class Registration {

    private String email;
    private String  userName;
    private String password;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        if(email.contains("@outlook")){
            this.email=email;
        }else{
            System.out.println("Email has to be type @outlook");
        }
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        if(!userName.isEmpty()){
            if(userName.length()>6) {
                this.userName = userName;
            }else{
                System.out.println("User Name length must be more than 6 characters");
            }
        }else {
            System.out.println("User Name cannot be empty and length must be more than 6 characters");
        }
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        if(!password.isEmpty()){
            if(password.length()>6){
                if(!password.contains(userName)) {
                    this.password = password;
                }else{
                    System.out.println("password cannot contain user name");
                }
            }else{
                System.out.println("Password length must be more than 6 characters");
            }
        }else {
            System.out.println("Password cannot be empty");
        }
    }


}
