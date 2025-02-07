package org.example.Login;

public class Users {
   public  String Username;
   public  String Password;
   public  String profileImage;
   public  String Cv;

  public Users(String username, String password, String profileImage, String cv) {
    Username = username;
    Password = password;
    this.profileImage = profileImage;
    Cv = cv;
  }

  public String getUsername() {
    return Username;
  }

  public String getPassword() {
    return Password;
  }

  public String getProfileImage() {
    return profileImage;
  }

  public String getCv() {
    return Cv;
  }
}
