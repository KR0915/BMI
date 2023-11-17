import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double height;        
        double weight;        
        System.out.println("身長を入力してください");
		height=scanner.nextInt();
		System.out.println("体重を入力してください");
		weight=scanner.nextInt();
        System.out.println("身長：" + height + "（cm）");
        System.out.println("体重：" + weight + "（kg）");
        
        
        double bmi = weight / ((height / 100) * (height / 100));
        
        System.out.println("あなたのBMI値は" + bmi + "です");
        
        if(bmi >= 26.5) {
            System.out.println("肥満です");
        } else if(bmi < 26.5 && bmi >= 24) {
               System.out.println("太り気味です");
        } else if(bmi < 24 && bmi >= 20) {
               System.out.println("普通です");
        } else if(bmi < 20 && bmi >= 0) {
               System.out.println("スリムです");
        } else {
               System.out.println("エラーです");
        }
    }
}