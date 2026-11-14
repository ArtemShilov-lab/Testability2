public class BmiService {
    /**
     * Рассчитывает индекс массы тела.
     * @param heightInMeters рост в метрах (например, 1.87)
     * @param weightInKg вес в килограммах (например, 98)
     * @return BMI как целое число (дробная часть отбрасывается)
     */
    public int calculate(double heightInMeters, double weightInKg) {
        double index = weightInKg / (heightInMeters * heightInMeters);
        return (int) index;
    }
}
