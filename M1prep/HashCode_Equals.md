    public int hashCode(){
        return Integer.hashCode(Id);
    }
Id.hashCode() will be wrong
Integer.hashCode(Id); -> because Id is int, only Integer Class have hashCode method
--

public int hashCode(){
        return name.hashCode();
    }
here name was String, String class has hashCode method, thats why its diffrent