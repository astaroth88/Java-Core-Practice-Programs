class F{
	F(){
		this(4);
		System.out.println("Default cons");
		}
	F(int P){
		this(4.4f);
		System.out.println("Integer cons");
		}
	F(float p){
		this("yo");
		System.out.println("Float cons");
	}
	F(String p){
		System.out.println("String cons");
	}
}

class G{
	public static void main(String args[]){
		F abs = new F();
	}
}