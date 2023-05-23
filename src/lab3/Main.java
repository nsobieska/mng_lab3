package lab3;
public class Main {
    //wypisuje wszystkie dzielniki n
    static public void dzielniki(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i + " jest dzielnikiem " + n);
            }
        }
    }

    public static void main(String[] args) {
     dzielniki(210);
    }
}
/*
Wygenerowano bytecode:

// class version 61.0 (61)
// access flags 0x21
public class lab3/Main {

  // compiled from: Main.java
  // access flags 0x19
  public final static INNERCLASS java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 4 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Llab3/Main; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static dzielniki(I)V
   L0
    LINENUMBER 8 L0
    ICONST_1
    ISTORE 1
   L1
   FRAME APPEND [I]
    ILOAD 1
    ILOAD 0
    IF_ICMPGT L2
   L3
    LINENUMBER 9 L3
    ILOAD 0
    ILOAD 1
    IREM
    IFNE L4
   L5
    LINENUMBER 10 L5
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ILOAD 1
    ILOAD 0
    INVOKEDYNAMIC makeConcatWithConstants(II)Ljava/lang/String; [
      // handle kind 0x6 : INVOKESTATIC
      java/lang/invoke/StringConcatFactory.makeConcatWithConstants(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
      // arguments:
      "\u0001 jest dzielnikiem \u0001"
    ]
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L4
    LINENUMBER 8 L4
   FRAME SAME
    IINC 1 1
    GOTO L1
   L2
    LINENUMBER 13 L2
   FRAME CHOP 1
    RETURN
   L6
    LOCALVARIABLE i I L1 L2 1
    LOCALVARIABLE n I L0 L6 0
    MAXSTACK = 3
    MAXLOCALS = 2

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 17 L0
    SIPUSH 210
    INVOKESTATIC lab3/Main.dzielniki (I)V
   L1
    LINENUMBER 18 L1
    RETURN
   L2
    LOCALVARIABLE args [Ljava/lang/String; L0 L2 0
    MAXSTACK = 1
    MAXLOCALS = 1
}
Pierwsza linia bytecode'u (// class version 61.0 (61)) informuje o wersji klasy.
Druga linia bytecode'u (public final static INNERCLASS java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup) deklaruje finalną stałą INNERCLASS dla klasy java/lang/invoke/MethodHandles$Lookup.
Linie 8-17 bytecode'u zawierają definicję metody dzielniki(int):
Linia 8 (public final static dzielniki(I)V) deklaruje metodę dzielniki jako publiczną, statyczną i bez typu zwracanego, przyjmującą jeden argument typu int.
Linia 10 (ICONST_1) umieszcza stałą wartość 1 na stosie.
Linia 11 (ISTORE 1) pobiera wartość ze stosu i zapisuje ją do lokalnej zmiennej i.
Linia 13 (ILOAD 1) pobiera wartość z lokalnej zmiennej i i umieszcza ją na stosie.
Linia 14 (ILOAD 0) pobiera wartość argumentu n i umieszcza ją na stosie.
Linia 15 (IF_ICMPGT L2) porównuje dwie wartości na szczycie stosu (wartość i i n) i przechodzi do etykiety L2, jeśli wartość na szczycie stosu (i) jest większa niż wartość druga na stosie (n).
Linia 18 (ILOAD 0) pobiera wartość argumentu n i umieszcza ją na stosie.
Linia 19 (ILOAD 1) pobiera wartość z lokalnej zmiennej i i umieszcza ją na stosie.
Linia 20 (IREM) wykonuje operację modulo na dwóch wartościach na szczycie stosu (wartość n i i) i umieszcza wynik na stosie.
Linia 21 (IFNE L4) przechodzi do etykiety L4, jeśli wartość na szczycie stosu (wynik operacji modulo) jest różna od zera.
Linia 24 (GETSTATIC java/lang/System.out : Ljava/io/PrintStream;) pobiera referencję do obiektu System.out (standardowe wyjście).
Linia 25 (ILOAD 1) pobiera wartość z lokalnej zmiennej i i umieszcza ją na stosie.
Linia 26 (ILOAD 0) pobiera wartość argumentu n i umieszcza ją na stosie.
Linia 27 (INVOKEDYNAMIC makeConcatWithConstants(II)Ljava/lang/String; [...]) dynamicznie wywołuje konkatenację stałych i tworzy łańcuch znaków z wykorzystaniem referencji MethodHandles.Lookup.
Linia 28 (INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V) wywołuje metodę
 */