package fromMars;

public abstract class Tee {

		  String teaType;
		  Tee(String teaType){
		    this.teaType=teaType;
		  }
		  public abstract void addSugar();
		}
		class LemonTee extends Tee{
		  LemonTee(String teaType){
		    super(teaType);
		  }
		    public void  addSugar(){
		      System.out.println("For "+teaType+" Tea we need 2 spoons of sugar" ); 
		  }
		}
		class ChiaTee extends Tee {
		  ChiaTee(String teaType){
		    super(teaType);
		  }
		  public void addSugar(){
		    System.out.println("For "+teaType+" Tea we need 1 spoon of sugar");
		}
		}
