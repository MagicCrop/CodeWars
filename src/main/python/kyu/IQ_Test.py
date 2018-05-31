def iq_test(numbers):
    div_arr = [int(i) % 2 for i in numbers.split()]
    if div_arr.count(1) > div_arr.count(0):
        m = 0
    else:
        m = 1
    return div_arr.index(m) + 1

print(iq_test("2 4 7 8 10"), 3)
print(iq_test("1 2 2"), 1)