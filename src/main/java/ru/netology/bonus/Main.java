//package ru.netology.bonus;
//
//import ru.netology.bonus.BonusService;
//
//public class Main {
//    public static void main(String[] args){
//        BonusService service = new BonusService();
//
////          Подготавливаем данные
//
//            long amount = 1000_60;
//            boolean registered = true;
//            long expected = 30;
//
////          Вызываем целевой метод
//            long actual = service.calculate(amount, registered);
//
////      Производим проверку (сравниваем ожидаемый и фактический)
////      Если true - то PASS
////      Если false - то FAIL
//
//            boolean passed = expected == actual;
//
////      Выводим результат
//
//        System.out.println(passed);
//
//
//
//
//
//
//
//
//
////        long bonusBelowLimitForRegistered = service.calculate(1000_60, true);
////        System.out.println(bonusBelowLimitForRegistered);
////
////        long bonusOverLimitForRegistered = service.calculate(1_000_000_60, true);
////        System.out.println(bonusOverLimitForRegistered);
////
////        long bonusBelowLimitForUnRegistered = service.calculate(1000_60, false);
////        System.out.println(bonusBelowLimitForUnRegistered);
////
////        long bonusOverLimitForUnRegistered = service.calculate(1_000_000_60, false);
////        System.out.println(bonusOverLimitForUnRegistered);
//    }
//}