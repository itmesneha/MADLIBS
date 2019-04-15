import java.util.Scanner;
import java.util.Random;

public class mad_libs
{
  Scanner sc = new Scanner(System.in);
  String story;
  String name;
  String adjective1;
  String adjective2;
  String noun1;
  String noun2;
  String noun3;
  String adverb;
  String randomNums;
  Random rand = new Random();

  //getters!

  public String getStory()
  {
    return story;
  }
  public String getName()
  {
    return name;
  }
  public String getAdjective1()
  {
    return adjective1;
  }
  public String getAdjective2()
  {
    return adjective2;
  }
  public String getNoun1()
  {
    return noun1;
  }
  public String getNoun2()
  {
    return noun2;
  }
  public String getNoun3()
  {
    return noun3;
  }
  public String getAdverb()
  {
    return adverb;
  }
  public String getRandomNums()
  {
    return randomNums;
  }

  //setters!

  public void setStory(String newStory)
  {
    this.story = newStory;
  }
  public void setName(String newName)
  {
    this.name = newName;
  }
  public void setAdjective1(String newAdj1)
  {
    this.adjective1 = newAdj1;
  }
  public void setAdjective2(String newAdj2)
  {
    this.adjective2 = newAdj2;
  }
  public void setNoun1(String newNoun1)
  {
    this.noun1 = newNoun1;
  }
  public void setNoun2(String newNoun2)
  {
    this.noun2 = newNoun2;
  }
  public void setNoun3(String newNoun3)
  {
    this.noun3 = newNoun3;
  }
  public void setAdverb(String newAdverb)
  {
    this.adverb = newAdverb;
  }
  public void setRandomNums()
  {
    int num = Math.abs(rand.nextInt()) % 100;
    int index = 0;
    int[] numberHolder = new int[3];
    while(index<numberHolder.length)
    {
      numberHolder[index] = num + index;
      index++;
    }
    randomNums = "not "+numberHolder[0]+", not "+numberHolder[1]+", but "+numberHolder[2];
  }
//print instructions
  public void printInstructions()
  {
    System.out.println("Welcome to the madlibs game! If you type in words we will give you a funny story. Start by typing in a name:");
  }

  //get data from player
  public void enterName()
  {
    setName(sc.nextLine());
  }

  public void enterNoun1()
  {
    System.out.println("give me a noun");
    setNoun1(sc.nextLine());
  }
  public void enterNoun2()
  {
    System.out.println("give me another noun");
    setNoun2(sc.nextLine());
  }
  public void enterNoun3()
  {
    System.out.println("give me the last noun!!");
    setNoun3(sc.nextLine());
  }

  public void enterAdjective1()
  {
    System.out.println("give me a adjective");
    setAdjective1(sc.nextLine());
  }
  public void enterAdjective2()
  {
    System.out.println("give me a adjective por favor");
    setAdjective2(sc.nextLine());
  }
  public void enterAdverb()
  {
    System.out.println("give me a adverb please mademoiselle!");
    setAdverb(sc.nextLine());
  }
  public void putTogetherTheStory()
  {
    String story;
    int num = Math.abs(rand.nextInt())%2;
    if(num == 0)
    {
      story = "Jessie and her best friend "+getName()+" went to disney world today!\n"
      +"They saw a "+getNoun1()+" in a show at the magic kingdom"
      +" and ate a "+getAdjective1()+" feast for dinner.\n The next day I ran "
      +getAdverb()+" to meet mickey in his "+getNoun2()
      +" and then that night i gazed at the "+getRandomNums()+" "
      +getAdjective2()+" fireworks shooting from the "+getNoun3()+".\n";
      setStory(story);

    }
    else
    {
      story = "Amanda and her frenemy "+getName()+" went to the zoo.\n"+
      " They saw a huge "+getNoun1()+" and a tiny little "+getNoun2()+".\n That night"+
      " they decided to climb "+getAdverb()+" into the "+getNoun3()+" to get a closer look.\n "
      +"The zoo was "+getAdjective1()+" at night, but they didn't care....\n"
      +"until"+getRandomNums()+" "+getAdjective2()+" apes yelled in their faces,making "
      +"Amanda and "+getName()+" sprint all the way back home!\n";
      setStory(story);

    }
  }

  public void play()
  {
    enterName();
    enterNoun1();
    enterAdjective1();
    enterAdjective2();
    enterNoun2();
    enterAdverb();
    enterNoun3();
    setRandomNums();
    putTogetherTheStory();
    System.out.println(getStory());
  }

  public static void main(String args[])
  {
    //todo code
    mad_libs game = new mad_libs();
    game.printInstructions();
    game.play();
  }
}
