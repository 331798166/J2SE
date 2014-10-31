package com.somnus.instanceofTest;

public class Test
{
	public static void compare(Animal animal)
	{
		if(animal instanceof Dog)
		{
			System.out.println("传进来的对象是狗的实例");
			Dog dog = (Dog)animal;
			dog.say();
		}
		else if(animal instanceof Cat)
		{
			System.out.println("传进来的对象是猫的实例");
			Cat cat = (Cat)animal;
			cat.eat();
		}
	}
	@SuppressWarnings("unchecked")
	public static <T> T isAssignableFrom(Class<T> clazz)
	{
		T value = null;
		try {
			/*
			 * 判定此 Class 对象所表示的类或接口与指定的 Class 参数所表示的类或接口是否相同，
			 * 或是否是其超类或超接口。如果是则返回 true；否则返回 false。
			 */
			if(Animal.class.isAssignableFrom(clazz))
			{
				Animal animal = (Animal) clazz.newInstance();
				value = clazz.isInstance(animal) ? (T) animal : null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void main(String[] args) throws Exception
	{
		
		Dog dog = new Dog();
		
		Animal dog2 = new Dog();
		
		Test.compare(dog);
		System.out.println("**************************");
		Test.compare(dog2);
		
		Dog d = Test.isAssignableFrom(Dog.class);
		d.run();
		Cat c = Test.isAssignableFrom(Cat.class);
		c.run();
	}

}
class Animal
{
	public Animal()
	{
		System.out.println("Animal is instance");
	}
	public void run()
	{
		System.out.println("动物都会跑");
	}
}
class Dog extends Animal
{
	public Dog()
	{
		System.out.println("Dog is instance");
	}
	public void say()
	{
		System.out.println("狗很听话");
	}
	public void run()
	{
		System.out.println("狗还会跳");
	}
}
class Cat extends Animal
{
	public Cat()
	{
		System.out.println("Cat is instance");
	}
	public void eat()
	{
		System.out.println("猫要吃东西");
	}
	public void run()
	{
		System.out.println("猫还会爬树");
	}
}