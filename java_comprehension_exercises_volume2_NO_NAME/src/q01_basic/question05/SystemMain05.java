package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember member1 = new NonMember("Sato Kensuke");
		Member member2 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		members[0] = member1;
		members[1] = member2;
		System.out.println("---SHOW MEMBERS---");
		MemberManager.showAllMembers(members);
		System.out.println("---BUY ITEM---");
		member1.buyItem();
		member2.buyItem();
	}

}
