//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class Shopping {
//	static ArrayList<String> shoppingName = new ArrayList<>();
//	static ArrayList<String> purchaseList = new ArrayList<>();
//	static ArrayList<String> items = new ArrayList<>();
//	static ArrayList<Integer> counter = new ArrayList<>();
//	static ArrayList<Double> doubles = new ArrayList<>();
//	static ArrayList<Double> sum = new ArrayList<>();
//	static Scanner sc = new Scanner(System.in);
//
//	static int deskInt = 0;
//	static int whiteBoardInt = 0;
//	static int pcInt = 0;
//	static int cameraInt = 0;
//	static int chairInt = 0;
//	static int projectorInt = 0;
//
//	static double deskDouble = 9.74;
//	static double whiteBoardDouble = 23.82;
//	static double pcDouble = 102.83;
//	static double cameraDouble = 87.34;
//	static double chairDouble = 12.23;
//	static double projectorDouble = 52.36;
//
//	static String desk = "Classroom Desk: $9.74";
//	static String whiteBoard = "Classroom Whiteboard: $23.82";
//	static String pc = "Instructor PC: $102.83";
//	static String camera = "Instructor Document Camera: $87.34";
//	static String chair = "Instructor Chair: $12.23";
//	static String projector = "Overhead Projector: $52.36";
//
//	static String deskWord = "desk";
//	static String whiteBoardWord = "whiteBoard";
//	static String pcword = "pc";
//	static String cameraWord = "camera";
//	static String chairWord = "chair";
//	static String projectorWord = "projector";
//
//	public static void main(String[] args) {
//
//		shoppingName.add(desk);
//		shoppingName.add(whiteBoard);
//		shoppingName.add(pc);
//		shoppingName.add(camera);
//		shoppingName.add(chair);
//		shoppingName.add(projector);
//
//
//		print(shoppingName);
//
//		String yes = "yes";
//		while(yes.equals("yes")) {
//			System.out.println("\nWhat item would you like to add to your purchase list(If you are done, just type 0)?");
//			int input = sc.nextInt();
//			add(input, deskDouble, deskInt);
//
//			else if(input == 2) {
//				doubles.add(whiteBoardDouble);
//				items.add("whiteBoard");
//				System.out.println("How many(note:there is only 2 item in stock for this)?");
//				int itemQTY = sc.nextInt();
//				if(itemQTY <= 2 && whiteBoardInt == 0) {
//					for(int i = 0;i < itemQTY; i++) {
//						purchaseList.add(whiteBoard);
//						whiteBoardInt = whiteBoardInt + 1;
//					}
//					counter.add(whiteBoardInt);
//				}
//				else {
//					System.out.println("Not enough items!!!");
//					break;
//				}
//			}
//			else if(input == 3) {
//				doubles.add(pcDouble);
//				items.add("pc");
//				System.out.println("How many(note:there is only 10 item in stock for this)?");
//				int itemQTY = sc.nextInt();
//				if(itemQTY <= 10 && pcInt == 0) {
//					for(int i = 0;i < itemQTY; i++) {
//						purchaseList.add(pc);
//						pcInt = pcInt + 1;
//					}
//					counter.add(pcInt);
//				}
//				else {
//					System.out.println("Not enough items!!!");
//					break;
//				}
//			}
//
//			else if(input == 4) {
//				doubles.add(cameraDouble);
//				items.add("camera");
//				System.out.println("How many(note:there is only 4 item in stock for this)?");
//				int itemQTY = sc.nextInt();
//				if(itemQTY <= 4 && cameraInt == 0) {
//					for(int i = 0;i < itemQTY; i++) {
//						purchaseList.add(camera);
//						cameraInt = cameraInt + 1;
//					}
//					counter.add(cameraInt);
//				}
//				else {
//					System.out.println("Not enough items!!!");
//					break;
//				}
//			}
//
//			if(input == 5) {
//				doubles.add(chairDouble);
//				items.add("chair");
//				System.out.println("How many(note:there is only 7 item in stock for this)?");
//				int itemQTY = sc.nextInt();
//				if(itemQTY <= 7 && chairInt == 0) {
//					for(int i = 0;i < itemQTY; i++) {
//						purchaseList.add(chair);
//						chairInt = chairInt + 1;
//					}
//					counter.add(chairInt);
//				}
//				else {
//					System.out.println("Not enough items!!!");
//					break;
//				}
//			}
//			else if(input == 6) {
//				doubles.add(projectorDouble);
//				items.add("projector");
//				System.out.println("How many(note:there is only 1 item in stock for this)?");
//				int itemQTY = sc.nextInt();
//				if(itemQTY <= 1 && projectorInt == 0) {
//					for(int i = 0;i < itemQTY; i++) {
//						purchaseList.add(projector);
//						projectorInt = projectorInt +1;
//					}
//					counter.add(projectorInt);
//				}
//				else {
//					System.out.println("Not enough items!!!");
//					break;
//				}
//			}
//			else if (input >= 7) {
//				System.out.println("ERROR");
//				break;
//			}
//			else if(input == 0) {
//				if(purchaseList.isEmpty()) {
//					System.out.println("List is empty!");
//					break;
//				}
//				else {
//					print(purchaseList);
//					while(true) {
//						yes = "no";
//						System.out.println("\nWhat would you like to remove all of(If you are done, then type 0)?");
//						print(items);
//						input = sc.nextInt();
//							if(input == 1) {
//								items.remove(0);
//								counter.remove(0);
//								String remove = purchaseList.get(0);
//								while(purchaseList.contains(remove)) {
//									purchaseList.remove(remove);
//
//								}
//								if(purchaseList.isEmpty()) {
//									System.out.println("List is empty!");
//									break;
//								}
//							}
//							else if(input == 2) {
//								items.remove(1);
//								counter.remove(1);
//								String remove = purchaseList.get(1);
//								while(purchaseList.contains(remove)) {
//									purchaseList.remove(remove);
//								}
//								if(purchaseList.isEmpty()) {
//									System.out.println("List is empty!");
//									break;
//								}
//							}
//							else if(input == 3) {
//								items.remove(2);
//								counter.remove(2);
//								String remove = purchaseList.get(2);
//								while(purchaseList.contains(remove)) {
//									purchaseList.remove(remove);
//								}
//								if(purchaseList.isEmpty()) {
//									System.out.println("List is empty!");
//									break;
//								}
//							}
//							else if(input == 4) {
//								items.remove(3);
//								counter.remove(3);
//								String remove = purchaseList.get(3);
//								while(purchaseList.contains(remove)) {
//									purchaseList.remove(remove);
//								}
//								if(purchaseList.isEmpty()) {
//									System.out.println("List is empty!");
//									break;
//								}
//							}
//							else if(input == 5) {
//								String remove = purchaseList.get(4);
//								counter.remove(4);
//								items.remove(4);
//								while(purchaseList.contains(remove)) {
//									purchaseList.remove(remove);
//								}
//								if(purchaseList.isEmpty()) {
//									System.out.println("List is empty!");
//									break;
//								}
//							}
//							else if(input == 6) {
//								String remove = purchaseList.get(5);
//								counter.remove(5);
//								items.remove(5);
//								while(purchaseList.contains(remove)) {
//									purchaseList.remove(remove);
//								}
//								if(purchaseList.isEmpty()) {
//									System.out.println("List is empty!");
//									break;
//								}
//							}
//							else if(input == 0) {
//								for (int i = 0; i < items.size(); i++) {
//									System.out.println(items.get(i) + " " + "$" + doubles.get(i) + " QTY:" + counter.get(i) + " Total:" + (counter.get(i) * doubles.get(i)));
//								}
//								System.out.println("\nDo you want to cancel purchase?");
//								String yesNo = sc.next();
//								if(yesNo.equals("no")) {
//									for(int i = 0; i < items.size(); i++) {
//										sum.add(counter.get(i) * doubles.get(i));
//									}
//									double total = 0;
//									for(int i = 0; i < sum.size(); i++) {
//										total = total + sum.get(i);
//									}
//									System.out.println("The total amount is " + total);
//									break;
//								}
//								else if(yesNo.equals("yes")) {
//									for(int i = 0; i < purchaseList.size(); i++) {
//										purchaseList.remove(i);
//									}
//									System.out.println("Canceled!");
//									break;
//								}
//								else {
//									System.out.println("ERROR");
//									break;
//								}
//							}
//							else {
//								System.out.println("Not a Thing!!!");
//								break;
//							}
//					}
//				}
//			}
//		}
//	}
//
//	private static void add(int input, double itemDouble, int itemInt, String itemWord, String item) {
//		doubles.add(itemDouble);
//		items.add(itemWord);
//		System.out.println("How many(note:there is only 2 item in stock for this)?");
//		int itemQTY = sc.nextInt();
//		if(itemQTY <= 2 && itemInt == 0) {
//			for(int i = 0;i < itemQTY; i++) {
//				purchaseList.add(item);
//				itemInt = itemInt + 1;
//			}
//			counter.add(itemInt);
//		}
//		else {
//			System.out.println("Not enough items!!!");
//			break;
//		}
//		}
//
//	private static void print(ArrayList<String> ArrayList) {
//		for(int i = 0; i < ArrayList.size();i++) {
//			System.out.print((i + 1 + "."));
//			System.out.println(ArrayList.get(i));
//		}
//	}
//}
