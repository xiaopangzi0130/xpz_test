public class Hero {
	String name;    //����
	float hp;      //Ѫ��
	float armor;    //����
	int moveSpeed;   //�ƶ��ٶ�
	int holdingAttack;  //����
	int kill;          //��ɱ
	int killed;       //����ɱ
	int money;        //��Ǯ
	int lastHit;      //����
	float attackSpeed;  //�����ٶ�
	String wordAfterkill;  //��ɱʱ˵�Ļ�
	String WordAfterkilled;  //����ɱʱ˵�Ļ�
	
	//��ȡ����ֵ
	float getArmor() {
		return armor;
	}
	
	//�Ӷ���
	void keng() {
		System.out.println("�Ӷ���");
	}
	
	//�����ƶ��ٶ�
	void addSpeed(int speed) {
		//��ԭ���Ļ����������ƶ��ٶ�
		moveSpeed = moveSpeed + speed;
	}
	
	//����
	void legendary() {
		System.out.println("������");
	}
	
	//��ȡ��ǰ��Ѫ��
	float getHp() {
		return hp;
	}
	
	//��Ѫ
	void recovery(float blood) {
		System.out.println("��Ѫ" + blood);
		hp = hp + blood;	
	}

	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		System.out.println(garen.name + "��ǰѪ����" + garen.hp);
		garen.recovery(100);
		System.out.println("���ڵ�Ѫ����" + garen.hp);
		garen.armor = 270536f;
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		garen.holdingAttack = 3;
		garen.kill = 5;
		garen.killed = 9;
		garen.money = 5000;
		garen.lastHit = 100;
		garen.attackSpeed = 0.5f;
		garen.wordAfterkill = "������ ��ĪС����";
		garen.WordAfterkilled = "������";
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		teemo.holdingAttack = 5;
		teemo.kill = 9;
		teemo.killed = 5;
		teemo.money = 6000;
		teemo.lastHit = 200;
		teemo.attackSpeed = 5.0f;
		teemo.wordAfterkill = "������";
		teemo.WordAfterkilled = "������";
		
	}
}
