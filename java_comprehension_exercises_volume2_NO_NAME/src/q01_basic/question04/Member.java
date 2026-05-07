package q01_basic.question04;

class Member {
	//TODO ここから実装する
	private int id;
	private String passward;
	private String name;
	private int age;
	private int rank;

	public void rankUp() {
		System.out.println(">>>RANK UP>>> ");
		rank++;
	}

	public void showMember() {
		System.out.println("***MEMBER DATA*** ");
		System.out.println("id:" + id);
		System.out.println("password" + passward);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}

	public Member() {
		name = null;
		age = 0;
		rank = 0;
	}

	public Member(int id, String passward, String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.id = id;
		this.passward = passward;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return passward
	 */
	public String getPassword() {
		return passward;
	}

	/**
	 * @param passward セットする passward
	 */
	public void setPassword(String passward) {
		this.passward = passward;
	}

}
