public class Hero {
	String name;    //姓名
	float hp;      //血量
	float armor;    //护甲
	int moveSpeed;   //移动速度
	int holdingAttack;  //助攻
	int kill;          //击杀
	int killed;       //被击杀
	int money;        //金钱
	int lastHit;      //补刀
	float attackSpeed;  //攻击速度
	String wordAfterkill;  //击杀时说的话
	String WordAfterkilled;  //被击杀时说的话
	
	//获取护甲值
	float getArmor() {
		return armor;
	}
	
	//坑队友
	void keng() {
		System.out.println("坑队友");
	}
	
	//增加移动速度
	void addSpeed(int speed) {
		//在原来的基础上增加移动速度
		moveSpeed = moveSpeed + speed;
	}
	
	//超神
	void legendary() {
		System.out.println("超神了");
	}
	
	//获取当前的血量
	float getHp() {
		return hp;
	}
	
	//回血
	void recovery(float blood) {
		System.out.println("回血" + blood);
		hp = hp + blood;	
	}

	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		System.out.println(garen.name + "当前血量是" + garen.hp);
		garen.recovery(100);
		System.out.println("现在的血量是" + garen.hp);
		garen.armor = 270536f;
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		garen.holdingAttack = 3;
		garen.kill = 5;
		garen.killed = 9;
		garen.money = 5000;
		garen.lastHit = 100;
		garen.attackSpeed = 0.5f;
		garen.wordAfterkill = "哈哈哈 提莫小辣鸡";
		garen.WordAfterkilled = "嘤嘤嘤";
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		teemo.holdingAttack = 5;
		teemo.kill = 9;
		teemo.killed = 5;
		teemo.money = 6000;
		teemo.lastHit = 200;
		teemo.attackSpeed = 5.0f;
		teemo.wordAfterkill = "气不气";
		teemo.WordAfterkilled = "呜呜呜";
		
	}
}
