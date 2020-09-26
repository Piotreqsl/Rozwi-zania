let array = [1, 2, 1, 2, 3, 5, 6];
let result = [1];

const check = (index) => {
  const primo = array[index];
  const secundo = array[index + 1];

  for (var i = 0; i < result.length; i++) {
    const dosprimo = array[result[i] - 1];
    const dossecundo = array[result[i]];

    if (primo == dosprimo && secundo == dossecundo) return false;
  }

  return true;
};

for (var i = 1; i < array.length; i++) {
  var excl, incl;
  if (i == array.length - 1) continue;

  incl = check(i);
  excl = check(i + 1);

  if (array.length - 1 === i || array.length - 2 === i) excl = false;

  if (excl) {
    result.push(i + 2);

    if (array.length - 1 === i || array.length - 2 === i) {
      i++;
    } else i++;
  }

  if (incl && !excl) {
    result.push(i + 1);
  }

  if (!incl && !excl) {
    console.log("NIE");
    break;
  }
}

console.log(result);
