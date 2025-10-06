package methodoverloading;

public class MaxAndMin {

	public int max(int a,int b,int c) {
		return a>b && a>c ? a : b>c ? b: c;
	}
	public float max(float a,float b,float c) {
		return a>b && a>c ? a : b>c ? b: c;
	}
	public long max(long a,long b,long c) {
		return a>b && a>c ? a : b>c ? b: c;
	}
	public double max(double a,double b,double c) {
		return a>b && a>c ? a : b>c ? b: c;
	}
	public int min(int a,int b,int c) {
		return a<b && a<c ? a : b<c ? b: c;
	}
	public float min(float a,float b,float c) {
		return a<b && a<c ? a : b<c ? b: c;
	}
	public long min(long a,long b,long c) {
		return a<b && a<c ? a : b<c ? b: c;
	}
	public double min(double a,double b,double c) {
		return a<b && a<c ? a : b<c ? b: c;
	}
}
