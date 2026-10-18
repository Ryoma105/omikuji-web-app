// ④ おみくじを引く処理

const drawButton = document.getElementById("drawButton");

drawButton.addEventListener("click", async function () {

    try {

        // Spring BootのJavaにおみくじ抽選をお願いする
        const response = await fetch("/api/omikuji");

        // Javaから返ってきた結果を受け取る
        const result = await response.text();

        // 結果画面へ移動する
        window.location.href =
            "result.html?result=" + encodeURIComponent(result);

    } catch (error) {

        alert("おみくじの取得に失敗しました。");

        console.error(error);
    }

});