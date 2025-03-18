public class YogurDesnatado extends Yogur {
    
    public YogurDesnatado() {
        super(); 
        this.calorias = this.calorias / 2;  
    }


    @Override
    public double consulCal() {
        return calorias;  
}
}