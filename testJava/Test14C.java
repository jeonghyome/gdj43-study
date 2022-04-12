
public class Test14C extends Test14A implements ITest14 {
	// @ -> 어노테이션(Annotation) : 지시자
	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public void testB() {
		System.out.println("오버라이딩 메소드");
	}

}
