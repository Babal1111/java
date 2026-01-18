public class Solution{

    public static void main(String args[]){
        TextEditor s = new TextEditor();
        s.addText("Hello World");
        s.insertText(6,"Beautiful ");
        s.deleteText(0,6);
        s.replaceText(0,9,"Java ");
        System.out.println("Final Text:\n"+s.getContent());
    }
}

class TextEditor{
    StringBuilder content;
    public TextEditor(){
        content = new StringBuilder();

    }   

    public void addText(String txt){
        // this.content.append(txt);'
        content = new StringBuilder(txt);

 
    }
    public void insertText(int p,String txt){
        this.content.insert(p,txt);
    }
    public void deleteText(int s,int e){
        this.content.delete(s,e);
    }
    public void replaceText(int s,int p,String txt){
        this.content.replace(s,p,txt);
    }
    public String getContent(){
        return content.toString();
    }
}