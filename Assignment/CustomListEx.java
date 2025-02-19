import java.util.ArrayList;

class CustomList<T>
{
    private ArrayList<T> list;
    public CustomList()
    {
        list = new ArrayList<>();
    }
    public void add(T elment)
    {
        list.add(elment);
    }
    public T get(int index)
    {
        if(index < 0 || index == list.size())
        {
            throw new IndexOutOfBoundsException("index out of range");
        }
        else
        return list.get(index);
    }
    public void displayAll()
    {
        System.out.println(list);
    }
}
public class CustomListEx {
    public static void main(String[] args) {
        CustomList<String> stringList = new CustomList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.displayAll();
        
        System.out.println("Element at index 1: " + stringList.get(1));
    }       
}
