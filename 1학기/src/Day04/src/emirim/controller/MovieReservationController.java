package emirim.controller;

import java.util.Scanner;

import emirim.domain.MoiveVO;
import emirim.domain.UserDTO;
import emirim.persistence.MovieDAO;
import emirim.view.MovieReservationView;

public class MovieReservationController {
	
	public static void main(String[] args) {
		int[] movieIds = {10, 11, 12, 13, 14, 15};
		String[] movieTitles = {"스윙키즈","말모이", "내안의 그놈", "뺑반", "그대 이름은 장미"};
		int[] overAges = {12, 12, 15, 15, 15};
		String[] genres = {"Comedy", "Drama", "Comedy", "Comedy", "Drama"};
		int[] prices = {9000, 10000, 8000, 9000, 10000};
		MovieDAO dao = new MovieDAO();
		for(int i=0; i<prices.length; i++) {
			dao.addMovie(new MoiveVO(movieIds[i], movieTitles[i], overAges[i], prices[i], genres[i]));
		}
		
		MovieReservationView view = new MovieReservationView();
		view.displayMovies(dao);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		UserDTO user=null;
		while (true) {
			user = new UserDTO();
			view.userInputInfo(user, s1);
			System.out.println("* 선택한 영화를 결제하시겠습니까?");
			String answer = s2.nextLine();
			if(answer.equals("y") || answer.equals("Y")) {
				MoiveVO movie = dao.selectedMovie(user);  
				System.out.println("***"+movie.getMoiveId());
				view.payCard(movie);
				view.displayTicket(movie);
				break;
				
			}
			
		}
		s1.close();
		s2.close();
		
	}
	
	
	
}
