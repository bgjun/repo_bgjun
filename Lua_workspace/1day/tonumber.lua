print("input line number:")
line = io.read()
n = tonumber(line)
print(n)
if n == nil then
	error(line .. "is not a valid number")
else
	print(n*2)
end

