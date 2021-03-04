package intermediate.anonymous_practice;

import intermediate.animalpark.AbstractAnimal;
import intermediate.animalpark.Cat;
import intermediate.animalpark.Dog;
import intermediate.animalpark.Pig;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();

//        animals.add(new Cat("맥스"));
//        animals.add(new Dog("심바"));
//        animals.add(new Pig("품바"));
//
//        // 익명클래스 (Anonymous Class)
//        AbstractAnimal horse = new AbstractAnimal("말") {
//            @Override
//            public void cry() {
//                System.out.println("히이잉");
//            }
//        };
//
//        horse.cry();
//        System.out.println(horse.name);

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("동물원에 어떤 동물을 키울까요?");
            String name = s.next();
            System.out.println(name + "의 울음소리는 어떤가요?");
            String sound = s.next();

            // 사용자 입력으로 받은 동물 클래스 만들기
            animals.add(new AbstractAnimal(name) {
                @Override
                public void cry() {
                    System.out.println(sound);
                }
            });
        }

        // 동물 이름 출력
        System.out.println("코드잇 동물원 보유 동물들");
        for (AbstractAnimal animal : animals) {
            System.out.println(animal.name);
            animal.cry();
        }
    }
}
