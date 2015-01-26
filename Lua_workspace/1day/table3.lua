-- create table
a = {}
-- create 1000 item
for i=1,1000 do a[i] = i*2 end
print(a[9])
a["x"] = 10
print(a["x"])
print(a["y"])
