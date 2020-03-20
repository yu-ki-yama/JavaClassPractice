
public class Story {
	//スタートライン
	public static void main(String[] args) {
		Cat cat = new Cat(50);
		Human human = new Human(50, 30);
		human.hunting(cat);
		human.hunting(cat);

	}
	//コンソール表示用
	private static void mainConsole(Object mes) {
		System.out.println(mes);
	}

}
