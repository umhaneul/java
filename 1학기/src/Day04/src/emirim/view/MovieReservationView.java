package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.MoiveVO;
import emirim.domain.UserDTO;
import emirim.persistence.MovieDAO;

public class MovieReservationView {
		
		private MoiveVO movie;

		public void displayMovies(MovieDAO dao) {
			ArrayList<MoiveVO> movieList = dao.getMovieList();
			for(MoiveVO movieVO : movieList) {
				System.out.println("********* MGV Reservation *********");
				System.out.println();
				System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
				System.out.printf("* movieId: %s\n", movieVO.getMoiveId());
				System.out.printf("* 영화제목: %s",movieVO.getMovieTitle());
				System.out.printf("* 영화장르: %s", movieVO.getGenre());
				System.out.printf("* 제한연령: %d",movieVO.getOverAge());
				System.out.printf("* 예매가격: %d원", movieVO.getPrice());
				System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
				System.out.println();
			}
		}
		public void userInputInfo(UserDTO user, Scanner s) {
			System.out.println("============ 사용자 영화 선택 ============");
			System.out.println("    * 영화 선택(movieId 입력):");
			int selsectedMovieId = s.nextInt();
			user.setSelectedMovieId(selsectedMovieId);
			
		}
		
		public void payCard(MoiveVO movie) {
			System.out.printf("★ %s 영화의 예매가 진행됩니다. %d원이 카드로 결제되었습니다.\n", movie.getMoiveId(), movie.getPrice());
		}
		
		public void displayTicket(MoiveVO movie) {
			System.out.println("★★★★★★★★★★★★★★★ TICKEY ★★★★★★★★★★★★★★★★");
			System.out.println();
			System.out.printf("* 제목: %s",movie.getMovieTitle());
			System.out.printf("* 가격: %d\n", movie.getPrice());
			System.out.printf("* 연령제한: %d\n",movie.getOverAge());
			System.out.printf("* 장르: %s\n", movie.getGenre());
			System.out.printf("* %d관 11:50 AM \n ",7);
			System.out.printf("★ 좌석: %s\n", "A15");
			System.out.println();
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		}
		
	}

