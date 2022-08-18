# DDD
## パッケージ構成
- `com.github.arknote02` ベース（グループID）
- `com.github.arknote02.book` アプリ名（アーティファクトID）  
SpringBootなら起動クラスも置いとく。
- `com.github.arknote02.book.domain` ドメイン
- `com.github.arknote02.book.infrastructure` インフラ  
フレームワークや外部リソースに依存するコード。  
エンドポイントは別パッケージに切り出してもいいかも。
- `com.github.arknote02.book.usecase` ユースケース  
インタフェースのみにしてフレームワークへの依存を排除。
## その他
今回は使ってないけどlombok使うとラク
