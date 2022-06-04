document.querySelectorAll('.product-img-item').forEach(e => {
    e.addEventListener('click', () => {
        let img = e.querySelector('img').getAttribute('src')
        document.querySelector('#product-img > img').setAttribute('src', img)
    })
})

document.querySelector('#view-all-description').addEventListener('click', () => {
    let content = document.querySelector('.product-detail-description-content')
    content.classList.toggle('active')
    document.querySelector('#view-all-description').innerHTML = content.classList.contains('active') ? 'view less' : 'view all'
})

let products = [
   {
        name: 'Xìngyùn cáishén',
        image1: 'img/tải xuống (1).jpg',
        image2: 'img/tải xuống (1).jpg',
        old_price: '$4000',
        curr_price: '$3500'
    },
    
    {
        name: 'Vietnamese picture 1900s',
        image1: 'img/tải xuống (2).jpg',
        image2: 'img/tải xuống (2).jpg',
        old_price: '$4000',
        curr_price: '$3000'
    },
    {
        name: 'Mona Lisa',
        image1: 'img/tải xuống (4).jpg',
        image2: 'img/tải xuống (4).jpg',
        old_price: '$7000',
        curr_price: '$30000'
    },
    {
        name: 'Napoleon',
        image1: 'img/tải xuống.jpg',
        image2: 'img/tải xuống.jpg',
        old_price: '$36990',
        curr_price: '$39990'
    },
    {
        name: 'Porsche 356 A Speedster',
        image1: 'img/xe-hoi-co-Porsche-356-A-Speedster-e1438676827977-475x230.jpg',
        image2: 'img/xe-hoi-co-Porsche-356-A-Speedster-e1438676827977-475x230.jpg',
        old_price: '$500000',
        curr_price: '$900000'
    },
    
    {
        name: 'Qing Dynasty vase 1860s',
        image1: 'img/1_12.png',
        image2: 'img/1_12.png',
        old_price: '$4000',
        curr_price: '$3500'
    },
]

let product_list = document.querySelector('#related-products')

renderProducts = (products) => {
    products.forEach(e => {
        let prod = `
            <div class="col-4 col-md-6 col-sm-12">
                <div class="product-card">
                    <div class="product-card-img">
                        <img src="${e.image1}" alt="">
                        <img src="${e.image2}" alt="">
                    </div>
                    <div class="product-card-info">
                        <div class="product-btn">
                            <a href="assiment2.html" class="btn-flat btn-hover btn-shop-now">shop now</a>
                            <button class="btn-flat btn-hover btn-cart-add">
                                <i class='bx bxs-cart-add'></i>
                            </button>
                            <button class="btn-flat btn-hover btn-cart-add">
                                <i class='bx bxs-heart'></i>
                            </button>
                        </div>
                        <div class="product-card-name">
                            ${e.name}
                        </div>
                        <div class="product-card-price">
                            <span><del>${e.old_price}</del></span>
                            <span class="curr-price">${e.curr_price}</span>
                        </div>
                    </div>
                </div>
            </div>
        `
        product_list.insertAdjacentHTML("beforeend", prod)
    })
}

renderProducts(products)