
public class CB extends CA{

	protected int z;
	public int suma;
    
	public CB(int x, int y, int z_p){
	super(x,y);
	this.z = z_p;
    }
    public void setZ(int z_p){
    	this.z = z_p;
    }
    public int getZ(){
    	return this.z;
    }
    public void setSuma(int x, int y, int z, int sum){
    	this.suma = sum;
    	sum = this.x+=this.y+=this.z;
    }
     public int getSuma(){
    	return  this.suma=this.x += this.y += this.z;
    }


}