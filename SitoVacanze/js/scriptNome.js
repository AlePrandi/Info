const subNome = document.getElementById("submitNome");
const Cocktail = document.getElementById("fCocktail");
const dinamico = document.getElementById("dinamico");

subNome.addEventListener("click", function (e) {
    e.preventDefault();
    let url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + Cocktail.value;

    fetch(url)
        .then(response => response.json())
        .then(dati => {
            dinamico.innerHTML = ''; // Clear previous results
            const datiJson = dati;
            console.log(datiJson);
            if (datiJson.drinks) {
                datiJson.drinks.forEach(element => {
                    console.log("--", element.strDrink);
                    let div_cocktail = document.createElement('div');
                    div_cocktail.innerHTML =
                        `<div class="card">
                        <div class="content">
                            <div class="back">
                            <div class="back-content">
                                <img src="../img/Cocktail.png" style="width:40%">
                                <strong>${element.strDrink}</strong>
                            </div>
                            </div>
                            <div class="front">
                            
                            <div class="img">
                                <img src="${element.strDrinkThumb}" alt="Cocktail" style="width:100%">
                            </div>

                            <div class="front-content">
                                <small class="badge">${element.strCategory}</small>
                                <div class="description">
                                <div class="title">
                                    <p class="title">
                                    <strong>${element.strDrink}</strong>
                                    </p>
                                </div>
                                <p class="card-footer">
                                    ${Listaingredienti(element)}
                                </p>
                                </div>
                            </div>
                            </div>
                        </div>
                        </div>`;
                    dinamico.appendChild(div_cocktail);

                    div_cocktail.addEventListener("click", function () {
                        window.location.href = `Carta.html?id=${element.strDrink}`;
                    });
                });
            } else {
                let div_cocktail = document.createElement('div');
                div_cocktail.innerHTML =
                    `<div class="card">
                    <div class="content">
                        <div class="back">
                        <div class="back-content">
                            <img src="../img/Cocktail.png" style="width:40%">
                            <strong>Cocktail non trovato</strong>
                        </div>
                        </div>
                        <div class="front">
                            
                            <div class="img">
                                <img src="../img/Error.png" alt="Cocktail" style="width:100%">
                            </div>
                        </div>
                    </div>
                    </div>`;
                dinamico.appendChild(div_cocktail);
            }
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
});


function Listaingredienti(cocktail) {
    let ingredientsList = '';
    let moreIngredients = false;

    for (let i = 1; i <= 6; i++) {
        let ingredient = cocktail[`strIngredient${i}`];
        let measure = cocktail[`strMeasure${i}`];
        if (ingredient) {
            if (i === 5) {
                moreIngredients = true;
                break;
            } else if (measure) {
                ingredientsList += `<li>${ingredient} - ${measure}</li>`;
            } else {
                ingredientsList += `<li>${ingredient}</li>`;
            }
        }
    }

    if (moreIngredients) {
        ingredientsList += `<li>More...</li>`;
    }

    return ingredientsList;
}