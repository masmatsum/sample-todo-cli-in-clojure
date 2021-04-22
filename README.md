# sample-todo-cli-in-clojure

Clojure 学習のためのサンプル ToDo アプリです (作成中)。
CLI で実行します。

## Commands

```
lein run add "Watch Tangled movie"  # タイトルを指定してタスクを追加

lein run list  # 未完了タスクを表示
lein run list --finished  # 完了タスクを表示
lein run list --all  # 全タスクを表示

lein run modify 3 "Watch Tangled movie"   # item-id を指定してタスクを修正
lein run finish 3   # item-id を指定してタスクを完了させる
lein run unfinish 3 # item-id を指定してタスクを未完了にする

lein run delete 3 # item-id を指定してタスクを削除
```

