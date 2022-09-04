public class Main {
    public static void main(String[] args) {
        int amount = 100; // Начальное количество на счете
        int replenishment = 1100; // сумма пополнения
        int preBonus = replenishment / 100;// расчет размера бонуса
        int totalBonus;
        if (replenishment > 1000) {
            totalBonus = preBonus;
        } else {
            totalBonus = 0;
        }
        int totalAmount = amount + replenishment + totalBonus; // итоговая сумма на счете

        System.out.println("При пополнении счета с начальной суммой " + amount +
                " р. на " + replenishment + " р., итоговая сумма на счете составит " +
                totalAmount + " р."+ ", начислено бонусов: " + totalBonus);
    }
}
