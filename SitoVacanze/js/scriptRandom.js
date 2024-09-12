document.addEventListener("DOMContentLoaded", function () {

    fetch(`https://www.thecocktaildb.com/api/json/v1/1/random.php`)
        .then(response => response.json())
        .then(data => {
            const cocktail = data.drinks[0];
            const cocktailDetailsDiv = document.getElementById('CocktailDin');
            cocktailDetailsDiv.innerHTML =
                `<div class="cocktail-container">
                        <div class="cocktail-img">
                            <img src="${cocktail.strDrinkThumb}" alt="Cocktail">
                        </div>
                        <div class="cocktail-details">
                            <small class="badge">${cocktail.strCategory}</small>
                            <div class="description">
                                <div class="title">
                                    <strong>${cocktail.strDrink}</strong>
                                </div>
                                <p>
                                    <strong>${cocktail.strAlcoholic}</strong>
                                </p>
                                <p> 
                                    <strong>Bicchiere:</strong> ${cocktail.strGlass}
                                </p>
                                <p>
                                    <strong>Ingredienti:</strong> ${Listaingredienti(cocktail)}
                                </p>
                                <p>
                                    <strong>Istruzioni:</strong> ${cocktail.strInstructionsIT}
                                </p>
                            </div>
                        </div>
                    </div>`;
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
});

function Listaingredienti(cocktail) {
    let ingredientsList = '';

    for (let i = 1; i <= 15; i++) {
        let ingredient = cocktail[`strIngredient${i}`];
        let measure = cocktail[`strMeasure${i}`];
        if (ingredient) {
            if (measure) {
                ingredientsList += `<li>${ingredient} - ${measure}</li>`;
            } else {
                ingredientsList += `<li>${ingredient}</li>`;
            }
        }
    }

    return ingredientsList;
}