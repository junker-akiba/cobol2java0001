COBOLの数値計算をJAVAに移植(誤差が出ない金額計算)

概要  
  COBOLの計算処理をJAVAに移植するため、演算結果に応じて桁数を拡張する  
  四則演算ライブラリを作成。  
  ・CbInteger:正の整数に対応(減算では補数表現)  
  ・CbNumeric:符号および小数に対応  

テストプログラム  
・JavaCobolInteger:COBOL計算処理を移植したJavaプログラム(整数のみ)  
・JavaCobolNumeric:COBOL計算処理を移植したJavaプログラム(小数対応)  
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

#java -jar JavaCobolNumeric.jar ADD 12345.678 123456.78  
result = 135802.458  
#java -jar JavaCobolNumeric.jar SUB 12345.678 123456.78  
result = -111111.102  
#java -jar JavaCobolNumeric.jar MUL -12345.678 123456.78  
result = -1524157652.79684  
#java -jar JavaCobolNumeric.jar DIV 123456.78 2345.678  
remainder = 6172.88  
result = 50  

開発環境  
  JavaはEclipse、COBOLはVsCodeからGnuCobolを使用。  
  Ubuntu26.04の上で環境構築、動作確認。  

課題  
  COBOLの端数処理に対応する予定。  
 
