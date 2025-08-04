//
// This is only a SKELETON file for the 'ISBN Verifier' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const isValid = (id) => {
  const editedId = id.replaceAll("-", "");
  if (editedId.length < 10) return false;
  
  const m = {0: 10, 1: 9, 2: 8, 3: 7, 4: 6, 5: 5, 6: 4, 7: 3, 8: 2, 9: 1};
  
  let sum = 0;
  for (let i = 0; i < editedId.length; i++) {
    let n;
    if (editedId[i] === "X" && i === editedId.length - 1) {
      n = 10;
    } else if (Number(editedId[i]) || editedId[i] === "0") {
      n = editedId[i];
    } else {
      return false;
    }
    
    console.log
    sum += n * m[i];
  }

  return sum % 11 === 0;
};
