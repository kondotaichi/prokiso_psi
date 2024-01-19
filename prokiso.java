import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class source_code {
    private JFrame frame;
    private JLabel questionLabel;
    private JButton yesButton;
    private JButton noButton;


   public source_code() {
       // フレームの初期化
       frame = new JFrame("出身地テスト");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(300, 200);
           frame.setLayout(null);

           // 質問ラベル
           questionLabel = new JLabel("塩気が効いていることをなんという？");
           questionLabel.setBounds(50, 50, 400, 20);
           frame.add(questionLabel);

           // はいボタン
           yesButton = new JButton("しょっぱい");
           yesButton.setBounds(50, 100, 100, 20);
           frame.add(yesButton);

           // いいえボタン
           noButton = new JButton("辛い");
           noButton.setBounds(200, 100, 100, 20);
           frame.add(noButton);

           // ボタンのアクションリスナー
           yesButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   processAnswer(true);
               }
           });
           noButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   processAnswer(false);
               }
           });

           frame.setVisible(true);
       }

       private void processAnswer(boolean isYes) {
           String question = questionLabel.getText();

           switch (question) {
               case "塩気が効いていることをなんという？":
                   questionLabel.setText(isYes ? "一人称で「わ」といいますか？" : "エスカレーターはどっちにならぶ？");
                   yesButton.setText(isYes ? "いう" : "左");
                   noButton.setText(isYes ? "いわない" : "右");
                   break;
               case  "エスカレーターはどっちにならぶ？":
                   questionLabel.setText(isYes ? "せからしか　がわかる？" : "片付けることを直すっていう？");
                   yesButton.setText(isYes ? "いう" : "いう");
                   noButton.setText(isYes ? "いわない" : "いわない");
                   break;
               case  "片付けることを直すっていう？":
                   questionLabel.setText(isYes ? "モータープールという言葉を使う？" : "捨てるという意味で「ほる」という");
                   yesButton.setText(isYes ? "はい" : "言う");
                   noButton.setText(isYes ? "いいえ" : "言わない");
                   break;
               case  "モータープールという言葉を使う？":
                   questionLabel.setText(isYes ? "日番という言葉の意味がわかる？" : "「しかええ」という");
                   yesButton.setText(isYes ? "はい" : "言う");
                   noButton.setText(isYes ? "いいえ" : "言わない");
                   break;
               case  "捨てるという意味で「ほる」という":
                   questionLabel.setText(isYes ? "踊りが有名？" : "有名なゆるキャラがいる？");
                   yesButton.setText(isYes ? "はい" : "はい");
                   noButton.setText(isYes ? "いいえ" : "いいえ");
                   break;
               case  "日番という言葉の意味がわかる？":
                   questionLabel.setText(isYes ? "製作者は喜んでいます" : "時代になったことがある？");
                   yesButton.setText(isYes ? "まじ" : "はい");
                   noButton.setText(isYes ? "なんでや" : "いいえ");
                   break;
               case "製作者は喜んでいます" :
                   showResult(isYes ? "兵庫県" : "近藤と同じ兵庫県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/hyogo_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/hyogo_kensho.png");
                   break;
               case "踊りが有名？" :
                   showResult(isYes ? "徳島県" : "愛媛県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/tokushima_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/ehime_kensho.png");
                   break;
               case"有名なゆるキャラがいる？" :
                   showResult(isYes ? "島根県" : "福井県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/shimane_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/fukui_kensho.png");
                   break;
               case "「しかええ」という" :
                   showResult(isYes ? "岡山ではなく和歌山県" : "宮崎県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/wakayama_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/miyazaki_kensho.png");
                   break;
               case "時代になったことがある？" :
                   showResult(isYes ? "奈良県" : "大阪府", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/nara_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/osaka_fusho.png");
                   break;
               case  "せからしか　がわかる？":
                   questionLabel.setText(isYes ? "九州新幹線が通ってる？" : "「さかい」と語尾につける？");
                   yesButton.setText(isYes ? "はい" : "つける");
                   noButton.setText(isYes ? "いいえ" : "つけない");
                   break;
               case  "九州新幹線が通ってる？":
                   questionLabel.setText(isYes ? "有名な火山がある？" : "くわっちーという?");
                   yesButton.setText(isYes ? "はい" : "いう");
                   noButton.setText(isYes ? "いいえ" : "いわない");
                   break;
               case  "「さかい」と語尾につける？":
                   questionLabel.setText(isYes ? "スイッチ！というテレビ番組を" : "捨てることを「ほる」という");
                   yesButton.setText(isYes ? "知っている" : "はい");
                   noButton.setText(isYes ? "知らない" : "いいえ");
                   break;
               case  "捨てることを「ほる」という":
                   questionLabel.setText(isYes ? "毛利氏と関係がある？" : "幕末で活躍した?");
                   yesButton.setText(isYes ? "知っている" : "はい");
                   noButton.setText(isYes ? "知らない" : "いいえ");
                   break;
               case  "毛利氏と関係がある？":
                   questionLabel.setText(isYes ? "晴れが多い?": "ヤクザの組長が狙われる？");
                   yesButton.setText(isYes ? "それしか自慢がない" : "はい");
                   noButton.setText(isYes ? "それほどでもない" : "いいえ");
                   break;
               case "幕末で活躍した?" :
                   showResult(isYes ? "高知県" : "香川県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/kochi_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/kagawa_kensho.png");
                   break;
               case "晴れが多い?" :
                   showResult(isYes ? "岡山県" : "鳥取県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/okayama_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/tottori_kensho.png");
                   break;
               case "ヤクザの組長が狙われる？" :
                   showResult(isYes ? "広島県" : "山口県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/hiroshima_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/yamaguchi_kensho.png");
                   break;
               case  "スイッチ！というテレビ番組を":
                   questionLabel.setText(isYes ? "バス停が道路の真ん中にあることがある" : "「あんや」という言葉の");
                   yesButton.setText(isYes ? "ある" : "意味がわかる");
                   noButton.setText(isYes ? "ない" : "意味がわからない");
                   break;
               case  "「あんや」という言葉の":
                   questionLabel.setText(isYes ? "知らんがけと" : "いちびるの意味がわかりますか");
                   yesButton.setText(isYes ? "いう" : "はい");
                   noButton.setText(isYes ? "いわない" : "いいえ");
                   break;
               case "知らんがけと" :
                   showResult(isYes ? "富山県" : "石川県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/toyama_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/ishikawa_kensho.png");
                   break;
               case "いちびるの意味がわかりますか" :
                   showResult(isYes ? "滋賀県" : "京都府", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/shiga_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/kyoto_fusho.png");
                   break;
               case  "バス停が道路の真ん中にあることがある":
                   questionLabel.setText(isYes ? "では結果を見てみましょう" : "忍者にゆかりがありますか");
                   yesButton.setText(isYes ? "おけ" : "はい");
                   noButton.setText(isYes ? "みよ" : "いいえ");
                   break;
               case "では結果を見てみましょう" :
                   showResult(isYes ? "愛知県" : "愛知県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/aichi_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/aichi_kensho.png");
                   break;
               case "忍者にゆかりがありますか" :
                   showResult(isYes ? "三重県" : "岐阜県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/mie_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/gifu_kensho.png");
                   break;
               case   "くわっちーという?":
                   questionLabel.setText(isYes ? "診断結果のページに移ります" : "テーマパークがありますか");
                   yesButton.setText(isYes ? "はい" : "はい");
                   noButton.setText(isYes ? "承認しました" : "いいえ");
                   break;
               case  "有名な火山がある？":
                   questionLabel.setText(isYes ? "ゆるキャラが有名?" : "海外に行くルートがある？");
                   yesButton.setText(isYes ? "はい" : "ある");
                   noButton.setText(isYes ? "いいえ" : "ない");
                   break;
               case "ゆるキャラが有名?" :
                   showResult(isYes ? "熊本県" : "鹿児島県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/kumamoto_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/kagoshima_kensho.png");
                   break;
               case "テーマパークがありますか" :
                   showResult(isYes ? "長崎県" : "大分県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/nagasaki_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/oita_kensho.png");
                   break;
               case "診断結果のページに移ります" :
                   showResult(isYes ? "沖縄県" : "沖縄県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/okinawa_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/okinawa_kensho.png");
                   break;
               case "海外に行くルートがある？" :
                   showResult(isYes ? "福岡県" : "なくてもいい佐賀県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/fukuoka_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/saga_kensho.png");
                   break;
               case  "一人称で「わ」といいますか？":
                   questionLabel.setText(isYes ? "しったけね！といいますか" : "語尾に「じゃね」をつけますか");
                   yesButton.setText(isYes ? "いう" : "いう");
                   noButton.setText(isYes ? "いわない" : "いわない");
                   break;
               case  "しったけね！といいますか":
                   questionLabel.setText(isYes ? "用意はできましたか" : "東北新幹線が通っていますか");
                   yesButton.setText(isYes ? "はい" : "通っている");
                   noButton.setText(isYes ? "わかりました" : "通っていない");
                   break;
               case  "語尾に「じゃね」をつけますか":
                   questionLabel.setText(isYes ? "おやげがわかりますか" : "有名な戦国大名にゆかりがありますか");
                   yesButton.setText(isYes ? "はい" : "はい");
                   noButton.setText(isYes ? "いいえ" : "いいえ");
                   break;
               case  "有名な戦国大名にゆかりがありますか":
                   questionLabel.setText(isYes ? "「ずら」といいますか" : "おわりましたよ");
                   yesButton.setText(isYes ? "はい" : "はい");
                   noButton.setText(isYes ? "いいえ" : "わかりました");
                   break;
               case  "「ずら」といいますか":
                   questionLabel.setText(isYes ? "おけ" : "つもいといいますか");
                   yesButton.setText(isYes ? "next" : "はい");
                   noButton.setText(isYes ? "つぎへ" : "いいえ");
                   break;
               case  "東北新幹線が走っていますか":
                   questionLabel.setText(isYes ? "球団がありますか" : "おわりましたよ");
                   yesButton.setText(isYes ? "はい" : "はい");
                   noButton.setText(isYes ? "いいえ" : "わかりました");
                   break;
               case  "おやげがわかりますか":
                   questionLabel.setText(isYes ? "だいじを大丈夫という意味で使いますか" : "だいじを大丈夫の意味で使いますか");
                   yesButton.setText(isYes ? "はい" : "はい");
                   noButton.setText(isYes ? "いいえ" : "いいえ");
                   break;
               case  "だいじを大丈夫の意味で使いますか":
                   questionLabel.setText(isYes ? "後ろのことを裏といいますか" : "横入りという言葉の意味がわかりますか");
                   yesButton.setText(isYes ? "はい" : "はい");
                   noButton.setText(isYes ? "いいえ" : "いいえ");
                   break;
               case  "東北新幹線が通っていますか":
                   questionLabel.setText(isYes ? "大きな島がありますか" : "リアス式海岸が有名ですか");
                   yesButton.setText(isYes ? "はい" : "はい");
                   noButton.setText(isYes ? "いいえ" : "いいえ");
                   break;
               case  "横入りという言葉の意味がわかりますか":
                   questionLabel.setText(isYes ? "中華街がありますか" : "小学校の出席番号は何順ですか");
                   yesButton.setText(isYes ? "はい" : "誕生日");
                   noButton.setText(isYes ? "いいえ" : "名前");
                   break;
               case "小学校の出席番号は何順ですか":
                   showResult(isYes ? "千葉県" : "埼玉県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/chiba_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/saitama_kensho.png");
                   break;
               case "おけ":
                   showResult(isYes ? "山梨県" : "山梨", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/yamanashi_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/yamanashi_kensho.png");
                   break;
               case "おわりましたよ":
                   showResult(isYes ? "山形県" : "山形", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/yamagata_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/yamagata_kensho.png");
                   break;
               case "つもいといいますか" :
                   showResult(isYes ? "長野県" : "静岡県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/nagano_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/shizuoka_kensho.png");
                   break;
               case "大きな島がありますか" :
                   showResult(isYes ? "新潟県" : "秋田県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/niigata_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/akita_kensho.png");
                   break;
               case "中華街がありますか" :
                   showResult(isYes ? "神奈川県" : "東京都", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/kanagawa_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/tokyo_monsho.png");
                   break;
               case "後ろのことを裏といいますか" :
                   showResult(isYes ? "栃木県" : "茨城県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/tochigi_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/ibaragi_kensho.png");
                   break;
               case "だいじを大丈夫という意味で使いますか" :
                   showResult(isYes ? "群馬県" : "群馬県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/gunma_monsho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/gunma_kensho.png");
                   break;
               case "球団がありますか" :
                   showResult(isYes ? "宮城県" : "福島県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/miyagi_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/fukushima_kensho.png");
                   break;
               case "リアス式海岸が有名ですか" :
                   showResult(isYes ? "岩手県" : "青森県", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/iwate_kensho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/aomori_kensho.png");
                   break;
               case "用意はできましたか":
                   showResult(isYes ? "北海道" : "北海道", isYes ? "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/hokkaido_dousho.png" : "/System/Volumes/Data/home/2394646810/Desktop/untitled folder/hokkaido_dousho.png");
                   break;
           }
       }

       private void showResult(String result, String imagePath) {
           ImageIcon icon = new ImageIcon(imagePath);
           JOptionPane.showMessageDialog(frame, "あなたは " + result + " 出身です。", result, JOptionPane.INFORMATION_MESSAGE, icon);
           frame.dispose();
       }

       public static void main(String[] args) {
           new source_code();
       }

    }