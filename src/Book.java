import java.time.LocalDate;

public class Book {
    //Atributos
    private String title;
    private String author;
    private Integer pages;
    private LocalDate publishDate;
    private String editor;
    private String category;

    //Constructor --> Inicializar el objeto
    public Book(){
        title = "Las aventuras de Cesar";
        author = "Cesar Diaz";
        pages = 100;
        publishDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Action";
     }

     public Book(String title, String author, Integer pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
        publishDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Action";
     }

     public Book(String title, String author, Integer pages, LocalDate publishDate, String editor, String category) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publishDate = publishDate;
        this.editor = editor;
        this.category = category;
     }

     

    //Metodos: Acciones que quiero que haga la clase
    public String givemeYourTitle(){
        return this.title;
    }

    //Metodo Getter: Obtener los valores de los atributos get<Atributos>()
    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPages() {
        return pages;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getEditor() {
        return editor;
    }

    public String getCategory() {
        return category;
    }

  
    //Metodos Setter: Sirven para cambiar de manera directa el valor de un atributo --> set<Atributo>(TD par)
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    @Override
    public String toString() {
        return String.format("Libro: titulo=%s, autor=%s, paginas=%s, publicacion=%s, editorial=%s, categoria=%s",
            getTitle(), getAuthor(), 
            getPages().toString(), getPublishDate().toString(), 
            getEditor(), getCategory());

        //return "Libro[ Titulo: " +title+ ", Autor: " +author+ ", Paginas: " +pages+ "]";
    }


}