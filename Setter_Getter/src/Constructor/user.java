package Constructor;

public class user{
    public String username;
    public String password;

    public user(String username, String password) {
        this.username = username;
        this.password = password; 

    }
        public void setUsername(String username) {
            this.username = username;
        }
        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername(){
            return this.username;
        }
        public String getPassword(){
            return this.password;
        }
    }
        
    
