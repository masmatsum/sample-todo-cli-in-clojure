# sample-todo-cli-in-clojure

Clojure 学習のためのサンプル ToDo アプリです (作成中)。
CLI で実行します。

## Commands

```
xx add "Watch Tangled movie"  # タイトルを指定してタスクを追加

xx list  # 未完了タスクを表示
xx list --finished  # 完了タスクを表示
xx list --all  # 全タスクを表示

xx modify 3 "Watch Tangled movie"   # item-id を指定してタスクを修正
xx finish 3   # item-id を指定してタスクを完了させる
xx unfinish 3 # item-id を指定してタスクを未完了にする

xx delete 3 # item-id を指定してタスクを削除
```

