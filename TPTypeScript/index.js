fetch('https://fakestoreapi.com/products')
.then(function (res) {return res.json();})
.then(function (products){
    var tableHTML = '<thead><tr><th>ID</th><th>Title</th><th>Description</th><th>Price</th></tr></thead><tbody>';
    products.forEach(function (p){
        tableHTML += "<tr>td>".concat(p.id, "</td><td>").concat(p.title, "</td><td>").concat(p.description, "</td><td>").concat(p.price, "</td><td>")
    });

    tableHTML += '</tbody>';

    document.querySelector('#tableElement').innerHTML = tableHTML;

    var spinnerElement = document.querySelector('#SpinnerContainer');
    spinnerElement.style.display='none';
});