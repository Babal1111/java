 interface Resizeable{
void resizeWidth(int w);
void resizeHeight(int h);

}
class  Rectangle implements  Resizeable{

        private int w,h;
        public Rectangle(int w, int h){
            this.w = w;
            this.h = h;

    }

    public int getWidth(){
        return w;
    }
    public int getHeight(){
        return h;
    }
    @Override
    public void resizeHeight(int h){
        this.h = h;
    }
    public void  resizeWidth(int w){
        this.w = w;

    }
    public String toPrint(){
        return ("The Width is: "+w+"and the height is: "+h);
    }
}
class P1{
    
    
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(10,20);
        System.out.println("\n"+r1.toPrint());
        r1.resizeHeight(100);
        r1.resizeWidth(200);
        System.out.println("\n"+r1.toPrint());


    }
}