package com.syntax.class27;


//2. hw create food class that will have 3 undefined methods and it will have 4 subclasses;
//create a collection of food and using 3 ways execute methods
public abstract class Food {
	
	public String item;
	
	public Food (String item){
		this.item=item;
	}
	
	public abstract void mt1();
	
	public abstract void mt2();
	
	public abstract void mt3();
}	
	class Bread extends Food{

		public Bread(String item) {
			super(item);
		}
		@Override
		public void mt1() {
			System.out.println(item+" organig food");	
		}
		@Override
		public void mt2() {
			System.out.println(item+" can buy in store");	
		}
		@Override
		public void mt3() {
			System.out.println(item+" good for you health");	
		}
	 }
		class Apple extends Food {
			Apple(String item) {
				super(item);		
			}
			@Override
			public void mt1() {
			System.out.println(item+" natural food");	
			}
			@Override
			public void mt2() {
				System.out.println(item+" can buy in bazar");	
			}
			@Override
			public void mt3() {
				System.out.println(item+" have a lot vitamins");	
			}
		}
		class Potato extends Food {
			
			Potato(String item){
				super(item);
			}
			public void mt1() {
				System.out.println(item+" best food");
			}
			public void mt2() {
				System.out.println(item+" you can grow you self");
			}
			public void mt3() {
				System.out.println(item+" best for diner and lunch");
			}
		}
		class Ham extends Food {
			
			Ham(String item){
				super(item);
			}
			public void mt1() {
				System.out.println(item+" meet food");
			}
			public void mt2() {
				System.out.println(item+" you can buy in meet store");
			}
			public void mt3() {
				System.out.println(item+" not good for healthi");
			}
		}
	

