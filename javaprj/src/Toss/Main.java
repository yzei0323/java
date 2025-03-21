package Toss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<User> users = new ArrayList<>();
	static ArrayList<Account> accounts = new ArrayList<>();
	static ArrayList<History> histories = new ArrayList<>();
	static User LoggedInUser = null; // 유저가 로그인한 상태를 반환
	public static Account AccountIn = null; // 계좌에 들어가 있는 상태를 반환

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountManager o = new AccountManager();
		StockAccount sa = new StockAccount();
		EventManage E = new EventManage();

		while (true) {
			try {
				if (LoggedInUser == null) {
					System.out.println("1. 회원가입 2. 로그인 3. 종료");
					int choice = Integer.parseInt(sc.nextLine());
					switch (choice) {
					case 1:
						signUp(sc);
						break;
					case 2:
						login(sc);
						break;
					case 3:
						System.out.println("프로그램 종료");
						System.exit(0);
					default:
						System.out.println("잘못된 입력입니다");
					}
				} else {
					if (AccountIn == null) {
						System.out.println("1.계좌개설 2.계좌연결 3.계좌해지 4.계좌조회 5.계좌정보변경 6.사용자로그아웃");
						int menuchoice = Integer.parseInt(sc.nextLine());
						switch (menuchoice) {
						case 1:
							o.OpenedAccount(sc);
							break;
						case 2:
							o.ConnectAccount(sc);
							break;
						case 3:
							o.CancelAccount(sc);
							break;
						case 4:
							o.CheckAccount(sc);
							break;
						case 5:
							o.UpdateAccount(sc);
							break;
						case 6:
							logout(sc);
							break;
						default:
							System.out.println("잘못된 입력입니다");
						}
					} else {
						if (Main.AccountIn.getAccountType().equals("입출금 계좌")) {
							System.out.println("1. 송금 2. 송금 및 인출 내역 3. 이벤트 4. 계좌 로그아웃");
							int accountchoice = Integer.parseInt(sc.nextLine());
							switch (accountchoice) {
							case 1:
								dewiaccount(sc);
								break;
							case 2:
								o.AccountHistory(sc);
								break;
							case 3:
								E.Event();
								break;
							case 4:
								accountlogout(sc);
								break;
							default:
								System.out.println("잘못된 입력입니다");
							}
						} else if (Main.AccountIn.getAccountType().equals("주식 계좌")) {
							System.out.println("1. 주식 구매 2. 주식 판매 3. 주식 조회 4. 이벤트  5. 계좌 로그아웃");
							int choice = Integer.parseInt(sc.nextLine());
							switch (choice) {
							case 1:
								sa.buyStock();
								break;
							case 2:
								sa.sellStock();
								break;
							case 3:
								sa.stockCheck();
								break;
							case 4:
								E.Event();
								break;
							case 5:
								accountlogout(sc);
								break;
							default:
								System.out.println("잘못된 입력입니다");
							}
						}
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("잘못된 접근입니다.");
				continue;
			}
		}

	}

	static void signUp(Scanner sc) {
		System.out.println("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String password = sc.nextLine();

		for (User User : users) {
			if (User.id.equals(id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				return;
			}
		}
		users.add(new User(name, id, password));
		saveUsersToFile();
		System.out.println("회원가입 성공!");
	}

	static void saveUsersToFile() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("res/user.txt"))) {
			for (User user : users) {
				writer.write(user.name + "," + user.id + "," + user.password);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
		}
	}

	static void loadUsersFromFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader("res/user.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length == 3) {
					users.add(new User(data[0], data[1], data[2]));
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다. 새로운 파일을 생성합니다.");
			saveUsersToFile(); // 파일이 없으면 새로 생성
		} catch (IOException e) {
			System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
		}
	}

	static void login(Scanner sc) {
		loadUsersFromFile();
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String password = sc.nextLine();

		boolean loginSuccess = false;

		try (BufferedReader reader = new BufferedReader(new FileReader("res/user.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length == 3) {
					if (data[1].equals(id) && data[2].equals(password)) {
						LoggedInUser = new User(data[0], data[1], data[2]);
						System.out.println(LoggedInUser.name + "님 반갑습니다!");
						loginSuccess = true;
						break;
					}
				}
			}
		} catch (IOException e) {
			System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
		}

		if (!loginSuccess) {
			System.out.println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}

	static void logout(Scanner sc) {
		System.out.println("사용자 로그아웃");
		LoggedInUser = null;
	}

	static void accountlogout(Scanner sc) {
		System.out.println("계좌 로그아웃");
		AccountIn = null;
	}

	static void dewiaccount(Scanner sc) {
		if (!(AccountIn instanceof BankAccount)) {
			System.out.println("입출금이 가능한 계좌가 없습니다.");
			return;
		}

		System.out.println("1. 입금 2. 출금");
		int choice = Integer.parseInt(sc.nextLine());

		if (choice == 1) { // 입금
			System.out.println("받는 사람 이름:");
			String receiverName = sc.nextLine();
			System.out.println("받는 사람 계좌번호:");
			long receiverAccountNum = Long.parseLong(sc.nextLine());
			System.out.println("입금 금액:");
			int amount = Integer.parseInt(sc.nextLine());

			((BankAccount) AccountIn).deposit(receiverName, receiverAccountNum, amount);

		} else if (choice == 2) { // 출금
			System.out.println("출금 금액:");
			int amount = Integer.parseInt(sc.nextLine());

			((BankAccount) AccountIn).withdraw(amount);
		}
	}

	static void saveAccountsToFile() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("res/Account.txt"))) {
			for (Account account : accounts) {
				writer.write(account.getAccountnum() + "," + account.getUsername() + "," + account.getBankname() + ","
						+ account.getBalance() + "," + account.getAccountType());
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("계좌 정보 저장 중 오류 발생: " + e.getMessage());
		}
	}

	static void loadAccountsFromFile() {
		accounts.clear();

		try (BufferedReader reader = new BufferedReader(new FileReader("res/Account.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length == 5) {
					long accountNum = Long.parseLong(data[0]);
					String username = data[1];
					String bankname = data[2];
					int balance = Integer.parseInt(data[3]);
					String accountType = data[4];

					Account account;
					if (accountType.equals("입출금 계좌")) {
						account = new BankAccount(accountNum, username, bankname, balance);
					} else {
						account = new StockAccount((int) accountNum, username, bankname, balance);
					}

					accounts.add(account);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("계좌 파일이 존재하지 않습니다. 새로운 파일을 생성합니다.");
			saveAccountsToFile();
		} catch (IOException e) {
			System.out.println("계좌 정보 읽기 중 오류 발생: " + e.getMessage());
		}
	}

}
