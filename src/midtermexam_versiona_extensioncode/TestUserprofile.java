/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Hillary
 */
public class TestUserprofile 
{
    private final String userID;

    public String getUserID() {
        return userID;
    }

    public String getGenre() {
        return genre;
    }
    private final String genre;
    
    public TestUserprofile(String givenID, String givenGenre) 
    {
         userID = givenID;
        genre = givenGenre;
    }
        @Override
        
     public String toString() 
     {
            StringBuilder sb = new StringBuilder();
            sb.append("TestUserprofile{");
            sb.append('}');
            return sb.toString();
        }
     
      

    
}