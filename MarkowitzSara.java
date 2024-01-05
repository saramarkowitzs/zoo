/**
 * A BoopleSnoot is Mr. Jaffe's animal
 * 
 * @author Mr. Jaffe
 * @version 1.0 2017-07-14
 */
public class MarkowitzSara extends Animal
{
  public MarkowitzSara() {
    super("Markowitz Sara", "pink", 2);
  }
  @Override 
  public String getDisposition(){
      return ("outgoing and adventurous");
  }
  @Override 
    public String speak(){
      return ("hraaaaaaaa-hraaaaa");
  }
  @Override 
    public String getColor(){
      return ("pink");
  }
   @Override 
    public String getName(){
      return ("flamingo");
  }
  public String getType() {
    return "Flamingo";
  }
  
}