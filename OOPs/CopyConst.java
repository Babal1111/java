class CopyConst{
    int id;
    String name;
    public CopyConst(int id,String name){
        this.id =id;
        this.name = name;
    }
    public CopyConst(CopyConst obj){ // copy const
        this.id = obj.id;
        this.name = obj.name;
    }
    public static void main(String[] args) {
        System.out.println("Main start");
        CopyConst ref1 = new CopyConst(11,"Babal");
        System.out.println("Og name and id :- "+ref1.name+" : "+ref1.id);

        CopyConst ref2 = new CopyConst(ref1); // copy const
        System.out.println("Copied name and id :- "+ref2.name+" : "+ref2.id);


        }
}