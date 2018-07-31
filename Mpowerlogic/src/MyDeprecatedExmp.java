public class MyDeprecatedExmp 
{
	     
	    @Deprecated
	    public void showDeprecatedMessage(){
	        System.out.println("Deprecation");
	    }
	     
	    @SuppressWarnings("deprecation")
	    public static void main(String a[]){
	         
	        MyDeprecatedExmp a1 = new MyDeprecatedExmp();
	        a1.showDeprecatedMessage();
	    }
	}

