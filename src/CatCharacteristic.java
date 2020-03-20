
public interface CatCharacteristic {
	//メンバ
	String mes = "しっぽを振る";
	//メソッド
	default public void ShakeTail() {
		System.out.println(mes);
	}
}
