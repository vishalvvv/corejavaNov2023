
public class LikesDemo {
	
	static int likes=0;
	
	static void likeThePost() {
		LikesDemo.likes++;
	}
	static void unlikeThePost() {
		LikesDemo.likes--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LikesDemo.likeThePost();
		LikesDemo.likeThePost();
		LikesDemo.likeThePost();
		LikesDemo.likeThePost();
		LikesDemo.unlikeThePost();
	//	LikesDemo.likes=25;
		// if you want likes to display 1000 times
	//	for(int i=0;i<1000;i++) {
	//		LikesDemo.likeThePost();
	//	}
		System.out.println(LikesDemo.likes);
	}

}
