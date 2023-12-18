let isAtivo = false
console.log(isAtivo)

isAtivo = true
console.log(isAtivo)

isAtivo = 1 
console.log(!!isAtivo)


console.log('os verdadeiros...')
console.log(!!3)
console.log(!!-1)
console.log(!!' s')
console.log(!![])
console.log(!!(isAtivo = true))

console.log('os falsos...')

console.log(!!0)
console.log(!!'')
console.log(!!null)
console.log(!!NaN)

console.log('para resolver')
console.log(!!('' || null || 0 || ''))
console.log(!!(''))

let nome = 'Lucas'

console.log(nome || 'Lucas')














