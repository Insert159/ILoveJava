package JavaSecondHW;
/**
 *ООП:
 * 1)Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод
 * интерфейса, для валидного перевода величин. Метод для конвертации назовите
 * "convertValue".
 */
interface Converter {
    double convertValue(double baseValue);
}




