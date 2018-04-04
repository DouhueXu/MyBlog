package annotation;

public class Persion {

	String name;
	int age;
	String job;
	String addr;

	@MyAnnotation(addr = "xxx公寓", job = "xx", name = "王五")
	private int num = 0;

	@MyAnnotation(addr = "xxx小区", job = "保安", name = "张三")
	public void fun1() {
		String name = "fanbingbing";
	};

	@MyAnnotation(addr = "xxx办公楼", job = "程序员", name = "李四")
	public void fun3() {
		
	};

	public Persion() {
		super();
	}

	public Persion(String name, int age, String job, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
