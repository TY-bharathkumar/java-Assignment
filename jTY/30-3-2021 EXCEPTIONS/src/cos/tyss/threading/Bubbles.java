package cos.tyss.threading;

public class Bubbles extends Thread {

public void run(){
	int a[]={2,6,9,0,58,6,9,-3};
	int temp=0;
	for(int h:a){
		System.out.print(h+" ");
	}
	System.out.println();
	for(int i=0;i<a.length-1;i++){
		for(int j=1;j<a.length;j++){
			if(a[j-1]>a[j])
			temp=a[j-1];
			a[j-1]=a[j];
			a[j]=temp;
		}
	}
	System.out.println("bubble sorted");
	for(int k:a){
		System.out.print(k+" ");
	}
	System.out.println(Thread.currentThread().getName());
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
}
}
