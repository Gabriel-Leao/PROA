const app = document.querySelector(".app")
const header = document.createElement("header")
const h1 = document.createElement("h1")
const p = document.createElement("p")
const pContent = document.createTextNode("This are make with Javascript")
const h1Content = document.createTextNode("Magic 🦁 is the best!")
h1.appendChild(h1Content)
p.appendChild(pContent)
header.appendChild(h1)
header.appendChild(p)
app.appendChild(header)

const button = document.querySelector("#botao")
button.addEventListener("click", function() {
  const data = document.querySelector(".data").innerHTML = `<p>A data de hoje é ${Date()}</p>`
})

function luzOn() {
  const image = document.querySelector("#lampada").src="pic_bulbon.gif"
}

function luzOff() {
  const image = document.querySelector("#lampada").src="pic_bulboff.gif"
}