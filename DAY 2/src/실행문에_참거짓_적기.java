public class ���๮��_������_���� {
  public static void main(String[] args) {
	// ���� : ����Ǵ� ��¹����� �� �׷��� ������ ���� �̶�� �����ּ���.
	      if ( true ) {
	        System.out.println("��");
	      }
	      
	      if ( false ) {
	        System.out.println("����");
	      }
	      
	      int a = 10;
	      
	      // `==` => ����.
	      if ( a == 10 ) {
	        System.out.println("��");
	      }
	      
	      // `!=` => ���� �ʴ�.
	      if ( a != 10 ) {
	        System.out.println("����");
	      }
	      
	      if ( a > 10 ) {
	        System.out.println("����");
	      }
	      
	      if ( a >= 10 ) {
	        System.out.println("��");
	      }
	      int b = 10;
	      
	      if ( a == b ) {
	        System.out.println("��");
	      }
	      
	      // boolean c => c ���� ���� true/false �� ���� �� �ִ�.
	      boolean c = a != b;
	      if ( c ) {
	        System.out.println("����");
	      }
	      
	      if ( c == false ) {
	        System.out.println("��");
	      }
	      
	      // `!` => ����
	      if ( !c ) {
	        System.out.println("��");
	      }
	      
	      // `!` => ����
	      if ( !(!c) ) {
	        System.out.println("����");
	      }
	      
	      boolean d = true;
	      
	      if ( c != d ) {
	        System.out.println("");
	      }

	      if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
	  			System.out.println("");
	  		}

	  		if ( 10 != 10 || 10 < 2 ) {
	  			System.out.println("");
	  		}
	    }
    }