abstract class Animal {
    int MAX_RUN_LENGTH = 0;
    int MAX_SWIM_LENGTH = 0;
    double MAX_JUMP_HEIGHT = 0;

    abstract void run(int length);
    abstract void swim(int length);
    abstract void jump(double height);
}

class Cat extends Animal {
	
	public Cat() {
		MAX_RUN_LENGTH = 200;
		MAX_JUMP_HEIGHT = 2;
	}
	
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
			System.out.println("Кошка может бегать");
		} else {
			System.out.println("Кошка не хочет бегать");
		}
    }

    @Override
    void swim(int length) {
        System.out.println("Кошка боится воды");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGHT)) {
			System.out.println("Кошка любит прыгать");
		} else {
			System.out.println("Кошка не хочет прыгать");
		}
    }
}

class Dog extends Animal {
	
	public Dog() {
		MAX_RUN_LENGTH = 500;
		MAX_SWIM_LENGTH = 10;
		MAX_JUMP_HEIGHT = 0.5;
	}

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
			System.out.println("Собакен бегает");
		}
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) {
			System.out.println("Сабакен плавает");
		} else {
			System.out.println("Сабакен ленится плавать");
		}
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGHT)) {
			System.out.println("Сабакен попрыгунчик");
		} else {
			System.out.println("Сабакен не хочет прыгать");
		}
    }
}

public class HW6_to4 {
	
    public static void main(String[] args) {
        Cat cat = new Cat(); 
        cat.run(201);
        cat.swim(1);
        cat.jump(1.9);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);
        dog.jump(0.4);
    }
}
