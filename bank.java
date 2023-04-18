import java.util.*;
import java.util.HashSet;
class User {
	private String username;
	private String bankname;
	
    public User(){
	}

	public User(String username, String bankname) {
		super();
		this.username = username;
		this.bankname = bankname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

    public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

    public static void add(String username2) {
    }
}
public class bank {
    public static void main(String[] args) {
        HashSet<User> userSet = new HashSet<User>();
        ArrayList<User> userList = new ArrayList<User>(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of users:");
        int num_user = sc.nextInt();
        sc.nextLine();
        for(int i =0; i<num_user; i++){
            System.out.println("Enter details of user"+(i+1));
            System.out.println("Username:");
            String username = sc.nextLine();
            String bankname = sc.nextLine();
            User user = new User(username,bankname);
            userSet.add(user);
            userList.add(user);
        }
        System.out.println("Enter username(Expire in one month) seperated by comma");
        String usernames[] = sc.nextLine().split(",");
        List<User> inactiveUsers = new ArrayList<>();
        for (User user : userList) {
            if (!Arrays.asList(usernames).contains(user.getUsername())) {
                inactiveUsers.add(user);
            }
        }
        userSet.removeAll(inactiveUsers);
        System.out.println("Users going to expire within a month");
        int count = 1;
        for (User user : inactiveUsers) {
            System.out.println("User " + count);
            System.out.println("User Name = " + user.getUsername());
            System.out.println("Bank Name = " + user.getBankname());
            count++;
        }
        }
    }
    

