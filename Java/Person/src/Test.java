
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-2222-3333";
		taro.address = "千葉県";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "080-3333-1111";
		jiro.address = "東京都";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "090-2223-1111";
		hanako.address = "埼玉県";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		

		Person yusuke = new Person();
		yusuke.name = "太田祐亮";
		yusuke.age = 24;
		yusuke.phoneNumber = "090-1111-4444";
		yusuke.address = "千葉県";
		System.out.println(yusuke.name);
		System.out.println(yusuke.age);
		System.out.println(yusuke.phoneNumber);
		System.out.println(yusuke.address);
		yusuke.talk();
		yusuke.walk();
		yusuke.run();
		

		Robot aibo = new Robot();
		aibo.name = "AIBO";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name = "ASIMO";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name = "PEPPER";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon = new Robot();
		doraemon.name = "DORAEMON";
		System.out.println(doraemon.name);
		doraemon.talk();
		doraemon.walk();
		doraemon.run();

	}

}
