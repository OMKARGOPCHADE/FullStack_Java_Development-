import java.util.*;
class Contact{
    private String name;
    private long cnumber;
    private String email;
    public Contact(String name, long cnumber, String email)
    {
        this.name = name;
        this.cnumber = cnumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public long getCnumber() {
        return cnumber;
    }
    public String getEmail() {
        return email;
    }
    
}
class Handle_contact{
    public Contact addContact(Long cnumber)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Contact Name: ");
        String name = sc.nextLine();
        System.out.println("Enter EmailID: ");
        String emailId = sc.nextLine();
        while(emailId.contains("@gmail.com")!= true)
        {
             System.out.println("Warning: Please Enter Valid EmailID: ");
             emailId = sc.nextLine();
        }
        System.out.println("Contact Details Saved Success!");
        return new Contact(name, cnumber, emailId);
    }
    public void deleteContact()
    {
        System.out.println("Contact Deleted Successfully..");
    }
    public void viewContacts(HashMap<Long,Contact>hm)
    {
        hm.forEach((cnumber,contact)->System.out.println("Name: "+contact.getName()+"| Contact No.: "+contact.getCnumber()+"| EmailID: "+contact.getEmail()));
    }
    public void searchContact(HashMap<Long,Contact>hm,String sname)
    {
        hm.forEach((cnumber,contact)->{
            if(contact.getName().equals(sname))
            {
                System.out.println("Name: "+contact.getName()+"| Contact No.: "+cnumber+"| EmailID: "+contact.getEmail());
            }
        });
    }
}
public class Contact_Ex {
    public static void main(String[] args) {
        HashMap<Long,Contact>hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Handle_contact handle_contact = new Handle_contact();
        while (true) {
            System.out.println("|| Welcome To Contact App ||");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Long cnumber;
                    System.out.println("Enter Contact Number: ");
                    cnumber = Long.valueOf(sc.nextLine());
                    if(!hm.containsKey(cnumber))
                        hm.put(cnumber,handle_contact.addContact(cnumber));
                    else 
                        System.out.println("Warning: Contact Already Exist!");
                    break;
                    case 2:
                    if(!hm.isEmpty()) 
                        handle_contact.viewContacts(hm);
                    else 
                        System.out.println("Warning-Empty: No Contacts Available!");
                    break;
                    case 3:
                    System.out.println("Enter Contact Number: ");
                    cnumber = Long.valueOf(sc.nextLine());
                    if(!hm.containsKey(cnumber))
                        System.out.println("Warning: Contact Not Exist!");
                    else {
                        hm.remove(cnumber);
                        System.out.println("Success: Contact Deleted!");
                    } 
                    break;
                    case 4:
                        if(!hm.isEmpty())
                        {
                            String name;
                            System.out.println("Enter Contact Name to search: ");
                            name = sc.nextLine();
                            handle_contact.searchContact(hm, name);
                        }
                        else
                        {
                            System.out.println("Warning-Empty: No Contacts Available!");
                        }
                        break;
                    case 5:
                    System.out.println("Thank You...!");
                    System.exit(0);
                default:
                System.out.println("Invalid Option!");
                    break;
            }
        }
    }
}
