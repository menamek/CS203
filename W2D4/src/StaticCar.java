
public class StaticCar {
private int x;
	private int y;
	private String name;
	public String location;
	// public static String company = "BMW";
	StaticCar(int x, int y, String name, String location) {
		this(x, y, name);
		this.location = location;
	}
	StaticCar(int x, int y, String name) {
		this(x, y);
		this.name = name;
		this.location = location;
	}
	StaticCar(int x, int y) {
		this.x = x;
		this.y = y;
		this.name = name;
		this.location = location;
	}
	public static String getLocation(StaticCar This) {
		return This.location;
	}
	public static void setLocation(StaticCar This, String location) {
		This.location = location;
	}
	public static String getName(StaticCar This) {
		return This.name;
	}
	public static void setName(StaticCar This, String name) {
		This.name = name;
	}
	public static int getX(StaticCar This) {
		return This.x;
	}
	public static void setX(StaticCar This, int x) {
		This.x = x;
	}
	public static int getY(StaticCar This) {
		return This.y;
	}
	public static void setY(StaticCar This, int y) {
		This.y = y;
	}
	public static int moveUp(StaticCar This, int y) {
		This.y = This.y + y;
		return This.y;
	}
	public static int moveDown(StaticCar This, int y) {
		This.y = This.y - y;
		return This.y;
	}
	public static int moveRight(StaticCar This, int x) {
		This.x = This.x + x;
		return This.x;
	}
	public static int moveLeft(StaticCar This, int x) {
		This.x = This.x - x;
		return This.x;
	}
}