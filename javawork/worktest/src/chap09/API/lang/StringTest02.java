package chap09.API.lang;
//String 클래스의 기본 메소드
public class StringTest02 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		//index=1에 어떤 문자가 있는가?
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		//두 개의 문자열을 합친다
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		//'a'문자열이 어디에 있는가.
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합'));
		//결과값 -1 : 문자열이 없을 때.
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		//오른쪽부터 찾는다. 뒤쪽에 있는 a (index 순서는 바뀌지 않는다)
		System.out.println("str1.length()=>"+str1.length());
		
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming"));
		//str1.equals()는 대소문자도 구분한다.
		System.out.println("str1.equals(\"Java programming\")=>"+str1.equals("Java programming"));
		
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"+str1.equalsIgnoreCase("java programming"));
		//대소문자 구분안한다.
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"+str1.equalsIgnoreCase("Java programming"));
		
		
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		//문자열 비교 -prefix " 이런 문자열로 시작하는지"
		System.out.println("str1.startsWith(\"Java\")=>"+str1.startsWith("Java"));
		
		
		System.out.println("str1.endsWith(\"ming\")=>"+str1.endsWith("ming"));
		//문자열 비교 -suffix "이런 문자열로 끝나는지"
		
		
	}

}
