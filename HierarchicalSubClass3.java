package classassignmentpackage;

public class HierarchicalSubClass3 extends HierarchicalParent{

	public static void main(String[] args) {
		//System.out.println("I am 3rd child class");
		HierarchicalSubClass3 sub3=new HierarchicalSubClass3();
		HierarchicalSubClass2 sub2=new HierarchicalSubClass2();
		sub2.add(5, 7);
		HierarchicalSubClass1 sub1=new HierarchicalSubClass1();
		sub1.mul(3, 3);;
	}
}
