package friendshipcriteria;

import java.util.ArrayList;
import java.util.List;

public class FriendFinder {

	public static void main(String[] args) {
		
		List<FriendshipCriteria<String,String>> friend = new ArrayList<>(); 
		friend.add(new FriendshipCriteria<>("Bob","Delhi"));
		friend.add(new FriendshipCriteria<>("Rob","Gujarat"));
		friend.add(new FriendshipCriteria<>("Sun","Hyderabad"));
		
		String target = "Gujarat";
		
		for(FriendshipCriteria<String,String> frnd: friend) {
			if(frnd.getStr().equalsIgnoreCase(target)) {
				System.out.println(frnd.getName() + " is a friend.");
			}
			
		}
	}

}
