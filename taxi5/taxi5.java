����   = �  taxi5/taxi5  java/lang/Object 	taxiCount I id booked Z currentSpot C freeTime totalEarnings taxiId Ljava/lang/String; trips Ljava/util/List; 	Signature $Ljava/util/List<Ljava/lang/String;>; <clinit> ()V Code	     LineNumberTable LocalVariableTable <init>
    	    	  !  		  # 
 	  %  	  '   ) java/util/ArrayList
 ( 	  ,   this Ltaxi5/taxi5; 
SetDetails (ZCIILjava/lang/String;)V 2 4 3 java/util/List 5 6 add (Ljava/lang/Object;)Z StripDetails printTaxiDetails	 : < ; java/lang/System = > out Ljava/io/PrintStream; @ java/lang/StringBuilder B TaxiId=
 ? D  E (Ljava/lang/String;)V	  G  
 ? I J K append -(Ljava/lang/String;)Ljava/lang/StringBuilder; M    TotalEarnings=
 ? O J P (I)Ljava/lang/StringBuilder;
 ? R S T toString ()Ljava/lang/String;
 V X W java/io/PrintStream Y E println [ STaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount 2 ] ^ _ iterator ()Ljava/util/Iterator; a c b java/util/Iterator d e next ()Ljava/lang/Object; g java/lang/String
 f i j k valueOf (I)Ljava/lang/String; m 
           a o p q hasNext ()Z s V-------------------------------------------------------------------------------------- trip StackMapTable printDetails x Taxi -  z  Total Earnings -  |  Current spot - 
 ? ~ J  (C)Ljava/lang/StringBuilder; �  Free Time -  
SourceFile 
taxi5.java !                    	     
                                      %      � �                              5*� � `� *� � *�  *A� "*� $*� &*� (Y� *� +�       & 	              $  )  4         5 - .    / 0     �     "*�  *� "*� $*� &*� +� 1 W�              
      ! ! "    >    " - .     "  	    " 
     "      "      " 7    8      �     v� 9� ?YA� C*� F� HL� H*� &� N� Q� U� 9Z� U*� +� \ M� -,� ` � fL� 9� ?Y*� � h� Cl� H+� H� Q� U,� n ��в 9r� U�           & % ' - ( D * d ( m , u .        v - .   D   t   u    � :    a  )  v      l     >� 9� ?Yw� C*� � Ny� H*� &� N{� H*� "� }�� H*� $� N� Q� U�       
    1 = 3        > - .    �    �