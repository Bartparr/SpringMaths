package fr.springmaths.matt;

public class MattImpl implements Matt {

	@Override
	public String sayGreeting(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int factorielle(int n) {
		int factoNb;		
		if (n == 1){
			return 1;
		}
		else{		
			factoNb = n * factorielle(n-1);
			return factoNb;
		}
	}

	@Override
	public int lapin(int nb) {
        int a,b,c;
        c=1;
        for (int i=3; i<=(nb+1) ; i++) {
            a=i-1;
            b=i-2;
            c=c+a+b;            }
        return c;
	}

	@Override
	public boolean prime(int n) {
		boolean prime = true;		    
		//prime loop   
		if (n%2==0){prime = (n==2);	}
		else{
			for (int i = 3; i*i <= n; i+=2){
				if (n%i==0){
					prime = false;
				}
			}
		}				
		return prime;
	}

}
