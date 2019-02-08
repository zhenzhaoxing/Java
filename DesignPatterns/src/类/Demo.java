package 类;

import java.util.ArrayList;
import java.util.List;



public class Demo {

	
	
public List<Integer> inorderTraversal(TreeNode root) {
       
	  List<Integer> list= new ArrayList<>();
    	
    	inorderTraversal(root.left);
       list.add(root.val);
    	 inorderTraversal(root.right);
    	return list;
    }
	
	
	
	
	
	int age;
	Student student;
	
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.age=18;
		Student stu = new Student();
		stu.age=777;
		stu.name="炸死你刚才";
		
		d.student=stu;
	
	
		System.out.println(d.student.name);
		
	}

}
