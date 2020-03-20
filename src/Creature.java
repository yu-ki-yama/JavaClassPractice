
public class Creature extends God {
	//	メンバ
	private int life;
	//	コンストラクタ
	public Creature(int life) {
		this.life = life;
	}
	//	メソッド
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
}
