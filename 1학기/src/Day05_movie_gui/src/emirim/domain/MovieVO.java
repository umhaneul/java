package emirim.domain;

public class MovieVO {
	private int movieId;
	private String movieTitle;
	private int overAge;
	private String genre;
	private int price;
	private String posterName;
	
	public MovieVO() {
	
	}

	public MovieVO(int movieId, String movieTitle, int overAge, String genre, int price, String posterName) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.overAge = overAge;
		this.genre = genre;
		this.price = price;
		this.posterName = posterName;
	}

	public String getPosterName() {
		return posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public int getMoiveId() {
		return movieId;
	}

	public void setMoiveId(int moiveId) {
		this.movieId = moiveId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getOverAge() {
		return overAge;
	}

	public void setOverAge(int overAge) {
		this.overAge = overAge;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
}
