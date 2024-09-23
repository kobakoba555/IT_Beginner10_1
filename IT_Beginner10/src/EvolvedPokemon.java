
public class EvolvedPokemon extends Pokemon {
	
	//オーバーライド
	public void attack() {	//2回攻撃
		super.attack();		//親クラスのメソッドを呼び出す
		super.attack();
	}
	
	//新メソッド
	public void heal() {
		System.out.println("回復した");
	}
}
