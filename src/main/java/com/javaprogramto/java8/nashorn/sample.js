var BigDecimalClass = Java.type('java.math.BigDecimal');

function calculate(amount, percentage) {

    var result = new BigDecimalClass(amount).multiply(new BigDecimalClass(percentage)).divide(
        new BigDecimalClass("100"), 2, BigDecimalClass.ROUND_HALF_EVEN);

    return result.toPlainString();
}
var result = calculate(1000,20);
print("Final value : "+result);