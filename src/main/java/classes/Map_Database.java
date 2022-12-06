package classes;

import java.util.concurrent.ThreadLocalRandom;

public final class Map_Database {
	public Map_Database() {}
	FoodType[] list = new FoodType[] {FoodType.KETCHUP, FoodType.TOFU, FoodType.BUN, FoodType.TOMATO};
	public static Food[] tutorialFood = new Food[] { new Food(FoodType.BUN, 1), 
			new Food(FoodType.KETCHUP, 5),
			new Food(FoodType.TOFU, 9),
			new Food(FoodType.TOMATO, 30)};
	public static Food[] food1 = new Food[] { 
			new Food(FoodType.BUN, 1), 
			new Food(FoodType.KETCHUP, 5), 
			new Food(FoodType.TOFU, 9), 
			new Food(FoodType.TOMATO, 13)}; 
	public static int getRandomValue(int Min, int Max)
    {
  
        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom
            .current()
            .nextInt(Min, Max + 1);
    }
/* 
 * 
 * int start1 = 9000 
 * ArrayList<Food> food1 = new ArrayList<Food> ();
 * for (int i = 0; i < 30; i++){
 * 	food.add(list[getRandomValue(0, 4)], start1);
 * 	start += 5000;
 * 		
 * }
 * 
 * 
 */
	
	
/* 
 * 
 * int start2 = 14000 
 * ArrayList<Food> food2 = new ArrayList<Food> ();
 * for (int i = 0; i < 30; i++){
 * 	food.add(list[getRandomValue(0, 4)], start1);
 * 	start += getRandomValue(3000, 5000);
 * 		
 * }
 * 
 * 
 */
	
/* 
 * 
 * int start3 = 0 
 * ArrayList<Food> food2 = new ArrayList<Food> ();
 * for (int i = 0; i < 30; i++){
 * 	food.add(list[getRandomValue(0, 4)], start1);
 * 	start += getRandomValue(300, 400);
 * 		
 * }
 * 
 * 
 */
	

	
	public static Food[] food2; //nate needs to complete initialization
	public static Food[] food3; //nate needs to complete initialization ifweo
	
	public static Conductor conductor1 = new Conductor(109, Song.getInstance(), 3, food1);
	public static Conductor conductor2 = new Conductor(118, Song.getInstance(), 2, food2); 
	public static Conductor conductor3 = new Conductor(160, Song.getInstance(), 1, food3);
	
	public static Conveyor conveyor1 = new Conveyor(false);
	public static Conveyor conveyor2 = new Conveyor(false);
	public static Conveyor conveyor3 = new Conveyor(true);
	
	public Song song1 = Song.getInstance(); 
	public Song song2 = Song.getInstance(); 
	public Song song3 = Song.getInstance(); 
	
	public static HitCircle circle1 = new HitCircle(1); 
	public static HitCircle circle2 = new HitCircle(1); 
	public static HitCircle circle3 = new HitCircle(2);
	
	public static Spawner spawner1 = new Spawner(-100, 500);  
	public static Spawner spawner2 = new Spawner(-100, 500);; 
	public static Spawner spawner3 = new Spawner(-100, 500);; 
	
	// add a level called tutorial
	public static Level level1 = new Level("tutorial.mp3",conductor1, conveyor1, food1, circle1, spawner1);
	public static Level level2 = new Level("level2.mp3",conductor2, conveyor2, food2, circle2, spawner2);
	public static Level level3 = new Level("level3.mp3", conductor3, conveyor3, food3, circle3, spawner3);


	// get hitcircles
	
	 
	
	//get level function
	Level get_level1() {
		return level1;
	}
	Level get_level2() {
		return level2;
	}
	Level get_level3() {
		return level3;
	}
	
	
}
