

	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.reflect.Method;
	 
	@Retention(RetentionPolicy.RUNTIME)
	@interface MyAnnotn{
	     
	    String value();
	}
	 
	public class MySingleMembAnnotation {
	 
	    @MyAnnotn("java2novice.com")
	    public void myAnnotationTestMethod(){
	         
	        try {
	            Class<? extends MySingleMembAnnotation> cls = this.getClass();
	            Method mth = cls.getMethod("myAnnotationTestMethod");
	            MyAnnotn myAnno = mth.getAnnotation(MyAnnotn.class);
	            System.out.println("value: "+myAnno.value());
	        } catch (SecurityException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (NoSuchMethodException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	     
	    public static void main(String a[]){
	         
	        MySingleMembAnnotation mat = new MySingleMembAnnotation();
	        mat.myAnnotationTestMethod();
	    }
	}



