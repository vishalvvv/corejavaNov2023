package oop;

class Post{
	String description;
	String mediaType;
	public Post(String description, String mediaType) {
		super();
		this.description = description;
		this.mediaType = mediaType;
	}
	void getPostDetails() {
		System.out.println(this.description+"\t"+this.mediaType);
	}
	
}
 class User{
	 String username;
	 String email;
	 long mobileno;
	public User(String username, String email, long mobileno) {
		super();
		this.username = username;
		this.email = email;
		this.mobileno = mobileno;
	}
	
	public Post addPost(String desc,String mediaType) {
		Post post = new Post(desc,mediaType);
		return post;
	}
	
	
	 
 }

public class OOPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        User user1=new User("camila","cabello@gmail.com",4567891L);
        User user2=new User("selena","gomez@gmail.com",198754L);
        
        Post post=user1.addPost("good morning", "goodmorning.gif");
        
        post.getPostDetails();
      
        
	}

}
