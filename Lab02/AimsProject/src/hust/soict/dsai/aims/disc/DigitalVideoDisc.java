package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    // Attributes
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    // accessors and mutators for the class DigitalVideoDisc
    public int getId() {
		return id;
	}
    
    public String getTitle() {
        return title;
    }


	public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Constructor
    public DigitalVideoDisc() {
    	nbDigitalVideoDiscs++;
    	this.id = nbDigitalVideoDiscs;
	}

    // Create a DVD object by title
    public DigitalVideoDisc(String title) {
    	this(); // gọi hàm khởi tạo mặc định để set ID
        this.title = title;
    }

    // Create a DVD object by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
    	this(); // gọi hàm khởi tạo mặc định để set ID
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Create a DVD object by director, category, title and cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
    	this();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    // Create a DVD object by all attributes: title, category, director, length and cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this();
    	this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
}