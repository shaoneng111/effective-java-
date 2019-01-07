package ch2.entry2;

public class NutritionConstruct {

    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public NutritionConstruct(int servingSize, int servings){
        this(servingSize, servings, 0);
    }

    public NutritionConstruct(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionConstruct(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionConstruct(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }


    public NutritionConstruct(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
