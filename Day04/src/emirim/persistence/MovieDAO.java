package emirim.persistence;

import java.util.ArrayList;

import emirim.domain.MoiveVO;
import emirim.domain.UserDTO;



public class MovieDAO {
	ArrayList<MoiveVO> movieList = new ArrayList<MoiveVO>();
		
	public void addMovie(MoiveVO movie) {
		movieList.add(movie);
	}

	public MoiveVO selectedMovie(UserDTO user) {
		for(MoiveVO movieVO : movieList) {
		if(user.getSelectedMovieId()==movieVO.getMoiveId())
			return movieVO;
	}
	return null;
}

	public ArrayList<MoiveVO> getMovieList() {
		return movieList;
	}
	
	
}