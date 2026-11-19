


So ang Parent class ani kay ang DeliveryRider then ang mga child classes niya kay si BikeRider, MotorcycleRider, and si DroneRider, then naa syay Overridden method ang method niya ani kay si  deliverOrder() (ug getDeliveryFee()), naay @Override and then sa main niya, naghimo ko ug array nga type DeliveryRider ug gi butangan nako ug lahi lahi nga child objects. kung tawagon nako ang rider.deliverOrder(), and tan awon sa java kung unsa gyud nga object ang naa, ug ang version sa method sa mao  nga object ang mo run. maong usa ra ka line sa code pero lahi lahi ang resulta: ang bike nagpedal, ang motorcycle nagdali dali, ug ang drone nga ga lupad.


So ang Abstract class niya ani kay ang PaymentMethod then ang iyang method dayun kay kani sila "processPayment()" (pangalan ra, walay sulod sa parent) then ang Implementation kay Ang GCashPayment, CreditCardPayment, ug CashOnDeliveryPayment kada usa naghimo sa ilang kaugalingong processPayment() and also ang parent nag ingon ra nga “kinahanglan kaya sa tanang payment method nga mag-process og bayad” pero wala niya gi ingon kung unsaon. Ang mga child dayun niya ang maghimo sa details, then naa sad ang printReceipt() nga regular method, gi sulat ra sa parent ug gigamit sa tanan.


Ang abstraction kay naka dependi sa mag desisyon kung unsa ang kinahanglan nga naa sa tanan nga klase ug itago ang details. Ang parent class murag agreement bitaw.
Ang polymorphism kay naka dependi sa paggamit samtang nagrun ang program usa ka parent reference ang gamiton para sa lahi nga mga objects, ug ang each object mo-respond sa iyang kaugalingong paagi.
para masabtan jud ang abstraction mosulbad sa “unsa ang parehas sa tanan?”, ug ang polymorphism mosulbad sa “unsaon nako sila pagtrabaho nga parehas ra ang pamaagi?”



1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method? 

-Ang overriding mao ang hinungdan nga lahi-lahi ang buhaton sa mga object. Kung walay overriding, parehas ra ang code nga run sa tanang child class, mao nga walay "daghang porma". Kung dili i-override sa child class, gamiton ra niya ang version sa parent class. Sa akong code, ang "Walk-in Rider" nga plain DeliveryRider object mao ang nagpakita nga ang standard nga message ug fee nga 50 ang gamit kay parent class ang method nga gigamit.

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction? 

-Ang abstract class kay dili pa complete kay naay method nga walay sulod. Kung mahimo ang new PaymentMethod, unsa may run if tawagon ang processPayment()? Wala. Ang restriction mapugos nato nga mag himo og tinuod ug complete child class aron walay object nga katunga lang. Sa tinuod nga kinabuhi, dili pud makatarunganon ang "bayad" nga walay tinuod nga paagi sama sa GCash o card.

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

- Mo run gihapon ang code nga walay usbon. Kung mohimo ko og BoatRider extends DeliveryRider nga naay kaugalingong deliverOrder(), ibutang ra nako ang new BoatRider sa array. Ang loop nag gamit na og DeliveryRider reference, mao nga automatic niya nga tawagon ang version sa boat. Mao ni ang dako nga benefits: makadugang og bag-ong feature nga dili na usbon ang daan nga code.

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

- Oo, ug gibuhat na gyud sa akong AbstractionDemo.java. Ang PaymentMethod abstract (abstraction), ug gibutang nako ang GCash, card, ug COD objects sa usa ka PaymentMethod[] array unya gitawag ang p.processPayment() sa loop (polymorphism). Ang abstraction maoy nagbutang sa balaod nga kinahanglan naa gyud ang processPayment(), ug ang polymorphism maoy nagtugot sa loop nga motawag niini bisan wala naka balo kung unsa nga klase sa bayad.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

- Gamiton nako ang abstraction kung magsugod ko og group sa related nga klase ug gusto nako nga ang tanan adunay parehas nga mga method, ug naay parehas nga code nga gamiton, sama sa base class para sa lain-laing user roles o klase sa file. Gamiton nako ang polymorphism kung naay pundok sa lain-laing objects nga kinahanglan pagtrabahuon sa parehas nga paagi, same sa listahan sa notification (email, SMS, push) o pagdraw og lain-laing shapes. Kasagaran, gamiton nako silang duha nga magka uban.
