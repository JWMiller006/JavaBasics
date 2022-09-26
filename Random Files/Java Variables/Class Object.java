// To define a class, typically you must put it in a namespace
// IN THIS demo, I am not including that, since I don't have a 
// Pre-defined namespace, but all you have to do is to start a line
// with 'namespace' and follow it with your namespace, and then brackets

import java.lang.Override;

public class demoModelClass() 
{
    private String demoString;

    public Event(String demoString)
    {
        this.demoString = demoString;
    }
    public String getString() {
        return demoString;
    }
    public void setString(String demoString){
        this.demoString = demoString;
    }

    @Override
    public String toString()
    {
        return demoString();
    }
}

public class Event {

   private String name;
   private String description;

   public Event(String name, String description) {
      this.name = name;
      this.description = description;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   @Override
   public String toString() {
      return name;
   }
}