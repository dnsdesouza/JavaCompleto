const valores = [7.7, 8.9, 6.3]
console.log(valores[0], valores[2])
console.log(valores[3])

valores [3]=10
console.log(valores[3])
console.log(valores.length)


valores.push ({id: 3}, false, null, 'teste')
console.log(valores)
console.log(valores.length)

console.log(valores.pop())
console.log(valores)
console.log(valores.length)

console.log(valores.pop())
console.log(valores)
console.log(valores.length)

console.log(typeof(valores))