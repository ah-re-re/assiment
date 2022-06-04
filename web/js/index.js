let slide_index = 0
let slide_play = true
let slides = document.querySelectorAll('.slide')

hideAllSlide = () => {
    slides.forEach(e => {
        e.classList.remove('active')
    })
}

showSlide = () => {
    hideAllSlide()
    slides[slide_index].classList.add('active')
}

nextSlide = () => slide_index = slide_index + 1 === slides.length ? 0 : slide_index + 1

prevSlide = () => slide_index = slide_index - 1 < 0 ? slides.length - 1 : slide_index - 1

// pause slide when hover slider

document.querySelector('.slider').addEventListener('mouseover', () => slide_play = false)

// enable slide when mouse leave out slider
document.querySelector('.slider').addEventListener('mouseleave', () => slide_play = true)

// slider controll

document.querySelector('.slide-next').addEventListener('click', () => {
    nextSlide()
    showSlide()
})

document.querySelector('.slide-prev').addEventListener('click', () => {
    prevSlide()
    showSlide()
})

showSlide()

// setInterval(() => {
//     if (!slide_play) return
//     nextSlide()
//     showSlide()
// }, 3000);

// render products

let products = [
    {
        name: 'Qing Dynasty vase 1860s',
        image1: 'img/1_12.png',
        image2: 'img/1_12.png',
        old_price: '$4000',
        curr_price: '$3500'
    },
    {
        name: 'Vietnamese vase 1900s',
        image1: 'img/timthumb.jpg',
        image2: 'img/timthumb.jpg',
        old_price: '$4000',
        curr_price: '$3000'
    },
    {
        name: 'pharaoh statue head',
        image1: 'img/dau-tuong-pharaoh-2-5734-1562298569.jpg',
        image2: 'img/dau-tuong-pharaoh-2-5734-1562298569.jpg',
        old_price: '$36990',
        curr_price: '$39990'
    },
    {
        name: 'Kangxi period ceramic bowl',
        image1: 'img/mg-6478-jpg-f726f27b-4749-458b-916e-506519f6c169.webp',
        image2: 'img/mg-6478-jpg-f726f27b-4749-458b-916e-506519f6c169.webp',
        old_price: '$2400',
        curr_price: '$2300'
    },
    {
        name: 'bronze coin 2000 B.C ',
        image1: 'img/istockphoto-943627028-1024x1024.jpg',
        image2: 'img/istockphoto-943627028-1024x1024.jpg',
        old_price: '$1400',
        curr_price: '$900'
    },
    {
        name: 'Ancient Roman loafers',
        image1: 'img/1002205382-photo-u1-1595494652892551513134.webp',
        image2: 'img/1002205382-photo-u1-1595494652892551513134.webp',
        old_price: '$9999',
        curr_price: '!over!'
    },
    {
        name: 'the coin in Vietnamese 1700s',
        image1: 'img/2d320d2bdc9988a43a4e1324412a443d.jpg',
        image2: 'img/2d320d2bdc9988a43a4e1324412a443d.jpg',
        old_price: '$400',
        curr_price: '$700'
    },
]

let product_list = document.querySelector('#latest-products')
let best_product_list = document.querySelector('#best-products')

products.forEach(e => {
    let prod = `
        <div class="col-3 col-md-6 col-sm-12">
            <div class="product-card">
                <div class="product-card-img">
                    <img src="${e.image1}" alt="">
                    <img src="${e.image2}" alt="">
                </div>
                <div class="product-card-info">
                    <div class="product-btn">
                        <button class="btn-flat btn-hover btn-shop-now">shop now</button>
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
    best_product_list.insertAdjacentHTML("afterbegin", prod)
})

