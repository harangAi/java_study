import java.util.Scanner;

public class TeamProject {

    static Scanner sc = new Scanner(System.in);
    // 도서 정보(DummyData)
    static String[] bookList = {"작별하지 않는다.", "인생은 실전이다.", "달러구트 꿈 백화점.2", "달러구트 꿈 백화점", "소크라테스 익스프레스",
            "오늘 밤, 세계에서 이 사랑이 사라진", "햇빛은 찬란하고 인생은 귀하니까", "럭키", "미드나잇 라이브러리", "백조와 박쥐"};
    static int[] bookStock = {0,1,2,3,3,2,1,3,3,2};




    // 화면 초기화
    public static void clearScreen() {
        for (int i = 0; i < 80; i++)
            System.out.println("");
    }

    public static void showBookList(int currentPage) {
        // 전체 페이지 출력
        int page = (int) Math.ceil(bookList.length / 3.0);
        // 표시할 목록 위치 선정
        int startNum = 3 * (currentPage - 1);
        int endNum = 3 *currentPage;
        if (currentPage == page) {
            endNum = bookList.length;
        }

        System.out.println("=========================================");
        System.out.println("============ 현재 도서 목록 ==============");
        System.out.println("=========================================");
        System.out.println("====== | 번호 | 도서명 | 현재 재고 | ======");
        System.out.println("=========================================");
        for (int i = startNum; i < endNum; i++) {
            System.out.printf("%d | %s | %2d권\n", i + 1, bookList[i], bookStock[i]);
        }
    }
    public static void manageBook() {
        int currentPage = 1;
        while (true) {
            clearScreen();
            showBookList(currentPage);
            System.out.println("");
            System.out.println("");
            System.out.println("++++++++++++++++도서 관리+++++++++++++++++");
            System.out.println("==|1.도서추가|2.도서제거|0.메인화면이동|==");
            System.out.println("==|7.이전페이지|#목록 이동|9.다음페이지|==");
            System.out.println("========================================");
            System.out.print(">>");
            int menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1:
                    System.out.println("도서 추가 화면입니다.");
                    addBook();
                    break;
                case 2:
                    System.out.println("도서 삭제 화면입니다.");
                    removeBook();
                    break;
                case 7:
                    if(currentPage == 1) {
                        break;
                    }
                    currentPage--;
                    break;
                case 9:
                    if(currentPage == (int) Math.ceil(bookList.length / 3.0)) {
                        break;
                    }
                    currentPage++;
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바르지 못한 메뉴 선택입니다.");
            }
        }
    }

    public static void addBook() {
        System.out.println("# 추가할 도서명을 입력하세요.");
        System.out.print(">>");
        String newBook = sc.nextLine();
        System.out.println("# 도서 권수를 입력하세요.");
        System.out.print(">>");
        int newBookStock = sc.nextInt();
        sc.nextLine();
        System.out.printf("# %s(%d권)를 등록하시겠습니가?\n", newBook, newBookStock);
        System.out.println("# Enter - 등록 | 0 - 취소");
        System.out.print(">>");
        if(sc.nextLine().equals("0")) return;

        String[] temp = new String[bookList.length +1];
        int[] temp1 = new int[bookStock.length +1];
        for (int i = 0; i < temp.length -1; i++) {
            temp[i] = bookList[i];
            temp1[i] = bookStock[i];
        }
        temp[temp.length - 1] = newBook;
        temp1[temp1.length - 1] = newBookStock;

        bookList = temp;
        bookStock = temp1;
    }

    public static int checkBookIdx(String searchBookName) {
        int idx = -1;
        for (int i = 0; i < bookList.length; i++) {
            if (searchBookName.equals(bookList[i])) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void removeBook() {
        while (true) {
            System.out.println("# 삭제할 도서명을 입력하세요!");
            System.out.print(">>");
            String removeBookName = sc.nextLine();

            int idx = checkBookIdx(removeBookName);

            if (idx == -1) {
                System.out.println("# 없는 도서입니다.");
            } else {
                System.out.println("# " + bookList[idx] + "을(를) 삭제하시겠습니까?");
                System.out.println("# Enter - 등록 | 0 - 취소 ");
                System.out.print(">>");
                if (sc.nextLine().equals("0")) return;

                for (int i = idx; i < bookList.length - 1; i++) {
                    bookList[i] = bookList[i + 1];
                    bookStock[i] = bookStock[i + 1];
                }

                String[] temp = new String[bookList.length - 1];
                int[] temp1 = new int[bookStock.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = bookList[i];
                    temp1[i] = bookStock[i];
                }
                bookList = temp;
                bookStock = temp1;
                return;
            }

        }
    }

    public static void rentalBook() {
        System.out.println("# 대여할 도서명을 입력하세요.");
        while (true) {
            System.out.print(">>");
            String rentalBook = sc.nextLine();
            int bookIdx = checkBookIdx(rentalBook);
            if (bookIdx == -1) {
                System.out.println("도서명을 확인해주세요.");
            } else {
                if (bookStock[bookIdx] <= 0) {
                    System.out.println("# 현재 대여 가능한 도서가 아닙니다.");
                    continue;
                }
                System.out.printf("# %s(을)를 대여하시겠습니까?\n",rentalBook);
                System.out.println("# Enter - 등록 | 0 - 취소 ");
                System.out.print(">>");
                if (sc.nextLine().equals("0")) return;

            }
        }
    }

    public  static  void mainMenu() {
        int menuStatus = 0;
        while (true) {
            clearScreen();
            System.out.println("=================================");
            System.out.println("+++++++++도서 관리 프로그램+++++++++");
            System.out.println("=================================");
            System.out.println("=|1.도서관리|2.도서검색|3.도서대여|=");
            System.out.println("=|4.회원등록|5.회원검색|6.회원삭제|=");
            System.out.println("=========|0.프로그램 종료|=========");
            System.out.print(">>");
            menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1:
                    System.out.println("현재 도서관리 메뉴입니다.");
                    manageBook();
                    break;
                case 2:
                    System.out.println("현재 도서검색 메뉴입니다.");
                    break;
                case 3:
                    System.out.println("현재 대여확인 메뉴입니다.");
                    break;
                case 4:
                    System.out.println("현재 회원등록 메뉴입니다.");
                    break;
                case 5:
                    System.out.println("현재 회원검색 메뉴입니다.");
                    break;
                case 6:
                    System.out.println("현재 회원삭제 메뉴입니다.");
                    break;
                case 0:
                    System.out.println("현재 프로그램 종료 메뉴입니다.");
                    return;
                default:
                    System.out.println("올바르지 못한 메뉴 선택입니다.");
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
