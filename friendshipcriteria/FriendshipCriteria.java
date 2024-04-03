package friendshipcriteria;

public class FriendshipCriteria <T extends Comparable<T>, S extends Comparable<S>> {

		private T name;
		private S str;
		
		public FriendshipCriteria(T name, S str) {
			super();
			this.name = name;
			this.str = str;
		}
		public T getName() {
			return name;
		}
		public void setName(T name) {
			this.name = name;
		}
		public S getStr() {
			return str;
		}
		public void setStr(S str) {
			this.str = str;
		}
		
		
}
