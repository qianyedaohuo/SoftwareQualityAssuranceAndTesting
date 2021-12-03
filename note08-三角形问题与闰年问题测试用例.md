# 三角形问题 边界值分析 测试用例

测试用例|a|b|c|预期输出
--|--|--|--|--
test1|60|60|1|等腰三角形
test2|60|60|2|等腰三角形
test3|60|60|60|等边三角形
test4|50|50|99|等腰三角形
test5|50|50|100|非三角形
test6|60|1|60|等腰三角形
test7|60|2|60|等腰三角形
test8|50|99|50|等腰三角形
test9|50|100|50|非三角形
test10|1|60|60|等腰三角形
test11|2|60|60|等腰三角形
test12|99|50|50|等腰三角形
test13|100|50|50|非三角形

# nextdate问题 边界值分析 测试用例

测试用例|month|day|year|预期输出
--|--|--|--|--
test1|6|15|1911|1
test2|6|15|1912|1
test3|6|15|1913|1
test4|6|15|1947|1
test5|6|15|2049|1
test6|6|1|2050|1
test7|6|2|2051|1
test8|6|-1|2001|
test9|6|1|2001|
test10|6|2|2001|
test11|6|30|2001|
test12|6|31|2001|
test13|6|32|2001|
test14|-1|15|2001|
test15|1|15|2001|
test16|2|15|2001|
test17|11|15|2001|
test18|12|15|2001|
test19|13|15|2001|

# 闰年问题

//测试输入年份与1582年的关系
assertEquals("after1582",LeapYearJudge.isTrueInput(2000));
assertEquals("after1582",LeapYearJudge.isTrueInput(1582));
assertEquals("before1582",LeapYearJudge.isTrueInput(1581));
assertEquals("before1582",LeapYearJudge.isTrueInput(-1));
		
//测试输入的1582年以来的年分是否是闰年
assertTrue(LeapYearJudge.isLeapYearA(10000));
assertTrue(LeapYearJudge.isLeapYearA(2000));
assertTrue(LeapYearJudge.isLeapYearA(1584));
assertFalse(LeapYearJudge.isLeapYearA(1582));
assertFalse(LeapYearJudge.isLeapYearA(2021));
		
//测试输入的1582年之前的年分是否是闰年
assertTrue(LeapYearJudge.isLeapYearB(1580));
assertTrue(LeapYearJudge.isLeapYearB(-5));
assertTrue(LeapYearJudge.isLeapYearB(0));
assertFalse(LeapYearJudge.isLeapYearB(1581));
assertFalse(LeapYearJudge.isLeapYearB(-3));
assertFalse(LeapYearJudge.isLeapYearB(-4));
