type Rating = {
    count: number;
    rate: number;
    };
    type Product = {
    category: string;
    description: string;
    id: number;
    image: string;
    price: number;
    rating: Rating;
    title: string;
    };
    fetch('https://fakestoreapi.com/products')
    .then(res => res.json())
    .then((products: Product[]) => {
    // Tabla HTML preparacion
    let tableHTML: string = '<thead><tr><th>ID</th><th>Title</th><th>Description</th><th>Price</th></tr></thead><tbody>';
    // Genero los productos en loop para la tabla
    products.forEach((p: Product) => {
    tableHTML += `<tr><td>${p.id}</td><td>${p.title}</td><td>${p.description}</td><td>${p.price}</td></tr>`;
    });
    // Cierro body de tabla
    tableHTML += '</tbody>';
    // Grab table element to set its inner HTML
    document.querySelector('#tableElement')!.innerHTML = tableHTML; //fuerzo a que no sea opcional
    // Hide spinner
    const spinnerElement: HTMLElement = document.querySelector('#spinnerContainer')!;
    spinnerElement.style.display = 'none';
    });
    