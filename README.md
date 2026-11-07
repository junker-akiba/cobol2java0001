COBOLの数値計算をJAVAに移植(誤差が出ない金額計算)

テストプログラム  
・JavaCobolInteger:COBOL移植ライブラリを使った計算結果を表示するJavaプログラム  
・JavaInt:通常の計算結果を表示するJavaプログラム  
・CobolNumeric:通常の計算結果を表示するCOBOLプログラム  

実行結果  
#java -jar JavaCobolInteger.jar ADD 1234 9999  
result = 11233  
#java -jar JavaCobolInteger.jar SUB 5678 1234  
result = 4444  
#java -jar JavaCobolInteger.jar MUL 5678 1234  
result = 7006652  
#java -jar JavaCobolInteger.jar DIV 12345678 5678  
remainder = 1706  
result = 2174  

開発環境  
　JavaはEclipse、COBOLはVsCodeからGnuCobolを使用。  

課題  
　現状は正の整数のみ(減算では補数表現)なので、符号付き小数に対応する予定。
 
