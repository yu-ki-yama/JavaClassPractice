
public class Human extends Creature implements HumanCharacteristic{
	//	メンバ
	int power;
	//	コンストラクタ
	public Human(int life,int power) {
		super(life);
		this.power = power;
	}
	//　メソッド
	public void hunting(Animal target) {
		target.setLife(target.getLife() - power);
		//三項演算子
		console(target.getLife() <= 0 ? "狩りに成功" : "逃げられました" );
	}
}
