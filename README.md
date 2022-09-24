# Fast-Webhooks-Receiver

一个Java实现的Webhooks接收器，可以快速预览三方平台的Webhooks数据。支持预览Post，Get等方式的Webhooks数据。

## 为什么要做这个

在开发过程中，经常需要接入第三方平台，比如微信、支付宝、钉钉等，这些平台都提供了Webhooks功能，
可以在平台上配置Webhooks回调地址，当业务状态发生变动时，会向回调地址发送一个HTTP请求，开发者可以在通过回调响应处理这些事件。

Fast-Webhooks-Receiver可以帮助开发者在API接入环节快速预览Webhooks数据结构。

## 如何使用

