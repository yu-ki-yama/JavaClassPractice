
public interface HumanCharacteristic {
	//メンバ
	String mes = "言葉を喋った";
	//メソッド
	default public void talk() {
		System.out.println(mes);
	}
}
