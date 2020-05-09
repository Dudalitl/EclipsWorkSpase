package com.syntax.class27;

public abstract class Drink {
	
	String drinkName;
	
	public Drink(String drinkName) {
		this.drinkName=drinkName;
	}
	public abstract void method1();
	abstract void method2();
	protected abstract void method3();
}

class Tee extends Drink{
	Tee(String drinkName){
		super(drinkName);
	}

	@Override
	public void method1() {
		System.out.println(drinkName+" can be cold");
	}

	@Override
	void method2() {
		System.out.println(drinkName+" can be hot");
	}

	@Override
	protected void method3() {
		System.out.println(drinkName+" can be with milk");
	}
	class Coffee extends Drink{
		 
		Coffee (String drinkName){
			super(drinkName);
		}
		public void method1() {
			System.out.println(drinkName+" can be cold");
		}
		void method2() {
			System.out.println(drinkName+" can be hot");
		}
		protected void method3() {
			System.out.println(drinkName+" can be with milk");
		}
	}
	class Soda extends Drink{

		public Soda(String drinkName) {
			super(drinkName);
		}

		@Override
		public void method1() {
			System.out.println(drinkName);
		}

		@Override
		void method2() {
			System.out.println(drinkName);
		}

		@Override
		protected void method3() {
			System.out.println(drinkName);
		}
		
	}
}
