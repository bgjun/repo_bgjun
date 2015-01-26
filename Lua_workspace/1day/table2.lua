a = {}
a["x"] = 10
b = a
print(b["x"])
b["x"] =20
print(a["x"])
a = nil
print(b["x"])
b = nil
--print(a["x"])
--print(b["x"])
