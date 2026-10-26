package lab3.Book;

public class author {
    private String name;
    private String email;
    private char gender;

    public author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName (){
        return name;
    }
    @Override
    public String toString(){
        return "Author[name=" + name +
                ",email=" + email +
                ",gender=" + gender + "]";
    }
}
