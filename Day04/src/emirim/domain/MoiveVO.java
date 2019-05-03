package emirim.domain;

public class MoiveVO {
	private int moiveId;
	private String movieTitle;
	private int overAge;
	private int price;
	private String genre;
	
	public MoiveVO() {
	
	}
	
	public MoiveVO(int moiveId, String movieTitle, int overAge, int price, String genre) {
		super();
		this.moiveId = moiveId;
		this.movieTitle = movieTitle;
		this.overAge = overAge;
		this.price = price;
		this.genre = genre;
	}

	public int getMoiveId() {
		return moiveId;
	}

	public void setMoiveId(int moiveId) {
		this.moiveId = moiveId;
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
