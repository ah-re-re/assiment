document.getElementById("showcart").style.display = "none";

var giohang = new Array();

function themvaogiohang(x) {
    var boxsp = x.parentElement.children;
    var hinh = boxsp[0].children[0].src;
    var gia = boxsp[1].children[0].innerText;
    var tensp = boxsp[2].innerText;
    var solong = boxsp[3].innerText;
    var sp = new Array(hinh, gia, tensp, solong);

    giohang.push(sp);

    showcountsp();
    sessionStorage.setItem("giohang",JSON.stringify(giohang));

}

function showcountsp() {
    document.getElementById("showcountsp").innerHTML = giohang.length;

}

function showmycart() {
    var ttgh = "";
    var tong = 0;
    for (let i = 0; i < giohang.length; i++){
        var tt = parseInt(giohang[i][1]) * parseInt(giohang[i][3]);
        tong += tt;
        ttgh += '<tr>' +
                '<td><img src="' + giohang[i][0] + '" alt=""></td>' +
                '<td>' + giohang[i][2] + '</td>' + 
                '<td>' + giohang[i][1] + '</td>' +
                '<td>' + giohang[i][3] + '</td>' +
                '<td>' + 
                '<div>' + tt + '</div>' +
                '</td>' +
                '</tr>';
    }
    ttgh += '<tr>' +
        '<th colspan="5"> Tong don hang</th>' + 
        '<th>' + 
        ' <div>' + tong + '</div>' +
        '</th>' +
        '</tr>';
        document.getElementById("mycart").innerHTML = ttgh;
}   

function showcart(){

    var x = document.getElementById("showcart");
    if (x.style.display == "block"){
        x.style.display = "none";
    } else {
        x.style.display = "block";
        showmycart();
    }
}
function showgioang_trangthanhtoan(){
    var gh = sessionStorage.getItem("giohang");
    var giohang = JSON.parse(gh);
    var ttgh = "";
    var tong = 0;
    for (let i = 0; i < giohang.length; i++){
        var tt = parseInt(giohang[i][1]) * parseInt(giohang[i][3]);
        tong += tt;
        ttgh += '<tr>' +
                '<td><img src="' + giohang[i][0] + '" alt=""></td>' +
                '<td>' + giohang[i][2] + '</td>' + 
                '<td>' + giohang[i][1] + '</td>' +
                '<td>' + giohang[i][3] + '</td>' +
                '<td>' + 
                '<div>' + tt + '</div>' +
                '</td>' +
                '</tr>';
    }
    ttgh += '<tr>' +
        '<th colspan="5"> Tong don hang</th>' + 
        '<th>' + 
        ' <div>' + tong + '</div>' +
        '</th>' +
        '</tr>';
        document.getElementById("mycart").innerHTML = ttgh;
}