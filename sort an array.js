//
// Prompt the user to enter values, separated by commas
const input = prompt("Enter values separated by commas:");

const values = input.split(",");

const numericValues = values.map(value => parseFloat(value));
numericValues.sort(function(a, b) {
  return b - a;
});

alert("Sorted values in descending order: " + numericValues.join(", "));
