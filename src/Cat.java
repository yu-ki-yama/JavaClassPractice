
public class Cat extends Animal{

	public Cat(int life) {
		super(life);
	}

	@Override
	public void bark(String howSqueal) {
		console("猫は鳴かない");
	}
}
