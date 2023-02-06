package animal;

public class Animal {
    //フィールド
    private String name;
    private int age;

    //コンストラクタ
    public Animal(String name,int age) {
       this.name = name;
       this.age = age;

    }

    public void say() {
        System.out.println(this.name + "です。"+ this.age + "歳です。");
    }

}
