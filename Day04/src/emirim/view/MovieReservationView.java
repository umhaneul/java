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
				System.out.println("�ݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢ�");
				System.out.printf("* movieId: %s\n", movieVO.getMoiveId());
				System.out.printf("* ��ȭ����: %s",movieVO.getMovieTitle());
				System.out.printf("* ��ȭ�帣: %s", movieVO.getGenre());
				System.out.printf("* ���ѿ���: %d",movieVO.getOverAge());
				System.out.printf("* ���Ű���: %d��", movieVO.getPrice());
				System.out.println("�ݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢ�");
				System.out.println();
			}
		}
		public void userInputInfo(UserDTO user, Scanner s) {
			System.out.println("============ ����� ��ȭ ���� ============");
			System.out.println("    * ��ȭ ����(movieId �Է�):");
			int selsectedMovieId = s.nextInt();
			user.setSelectedMovieId(selsectedMovieId);
			
		}
		
		public void payCard(MoiveVO movie) {
			System.out.printf("�� %s ��ȭ�� ���Ű� ����˴ϴ�. %d���� ī��� �����Ǿ����ϴ�.\n", movie.getMoiveId(), movie.getPrice());
		}
		
		public void displayTicket(MoiveVO movie) {
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� TICKEY �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
			System.out.println();
			System.out.printf("* ����: %s",movie.getMovieTitle());
			System.out.printf("* ����: %d\n", movie.getPrice());
			System.out.printf("* ��������: %d\n",movie.getOverAge());
			System.out.printf("* �帣: %s\n", movie.getGenre());
			System.out.printf("* %d�� 11:50 AM \n ",7);
			System.out.printf("�� �¼�: %s\n", "A15");
			System.out.println();
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		}
		
	}

