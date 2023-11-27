package com.example.appanimefantasyjoelcouto.listaCartas

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.appanimefantasyjoelcouto.R
import com.example.appanimefantasyjoelcouto.modelos.JugadorAnime

@Composable
fun CrearListaJugadores(): List<JugadorAnime> {

    val listaPosiciones = listOf<String>("PG","SG","SF","PF","C")

    val listaJugadores = listOf<JugadorAnime>(
        JugadorAnime(
            "Levi Ackerman",
            "Levi es una persona seria, de carácter firme e ideas claras. Siente un gran respeto por la disciplina y es un conscripto con un enorme potencial para ser líder, pues sus órdenes siempre son claras y precisas, sin que nadie se atreva a cuestionar su autoridad. Su seriedad y frialdad transmite ese tipo de respeto, sobre todo este primer factor, siendo alguien de pocas palabras y que muy rara vez expresa sus sentimientos. Sabe perfectamente la responsabilidad que conlleva manejar a un grupo de soldados, y que según cómo sean sus órdenes puede llevar a esos soldados a una muerte segura.\n" +
                    "\n" +
                    "Su expresión varía entre la seriedad y la neutralidad, siendo muy atípico el verlo sonreír. Sin embargo, eso no quiere decir que no sienta nada. Es cierto que no es la persona más emotiva del planeta, pero eso no justifica el que no sea sensible o empático. Se preocupa por sus camaradas y aquellas personas en las que ha depositado su confianza. Procura hacer todo lo posible para protegerlas y siempre piensa sus acciones, tratando de hacer el menor daño posible. Sin embargo, al ser un líder, no debe mostrar abiertamente esos sentimientos y de ahí que oculte todo tras una expresión seria y algo distante.\n" +
                    "\n" +
                    "No se deja adular por las palabras, ya que prefiere guiarse por las acciones que por las falsas promesas. Es algo desconfiado con la gente que no conoce, pero una vez esas personas se ganan su confianza, éstas pasan a ser alguien a quienes tiene en alta estima, a pesar que no sea alguien que halague con palabras.\n" +
                    "\n" +
                    "Posee un tamaño pequeño, pero a pesar de ello, muestra la mente y madurez de un adulto, así como la astucia propia de un soldado que ha pasado por todo tipo de penurias. Es fácil hacerle enfadar, pero muy difícil que se enfurezca hasta el punto de perder los estribos. Tiene la paciencia justa y siempre parece tener una palabra para cada situación.\n" +
                    "\n" +
                    "Suele molestarse por las cosas poco serias, como los abucheos de una multitud, las voces demasiado altas y sobre todo las acciones cometidas de manera imprudente. Con ese tipo de personas tiene muy poca paciencia y suele ignorarlas o darles miradas de advertencia para que corrijan su actitud.\n" +
                    "\n" +
                    "Es bastante perfeccionista y tiene una obsesión insana por el orden y la limpieza, siendo llegado a llamar \"loco de la limpieza\" por Hange Zoë.",
            painterResource(id = R.drawable.levi),
            painterResource(id = R.drawable.levi2),
            "Shingeki no Basket",
            listaPosiciones,
            "40",
            "Bleach United",
            "1/02/2023"
        ), JugadorAnime(
            "Edward Elrich",
            "Edward cuando niño era bastante hiperactivo y alegre; amó con todas sus fuerzas a su madre y siempre se esforzó por verla sonreír; al contrario que con Hohenheim, a quien le guardó rencor desde pequeño. Al fallecer Trisha, Edward fue el más afectado al no aceptarlo y utilizar la alquimia para llevar a cabo la transmutación humana donde perdió a su hermano ante sus ojos, un brazo y una pierna; cuando llamó a su madre esperanzado en que diera éxito, lo que encontró fue a un monstruo amorfo que lo afectó sobremanera. Ed como pudo fijó el alma de su hermano menor en el cuerpo de una vieja armadura pidiendo a Dios que tomara lo que quisiera de él y perdiendo como pago por fijar el alma de su hermano, su brazo derecho. Los hechos sucedidos marcaron a Edward: Por su culpa su hermano había quedado en esa situación, y su madre nunca le perdonaría el haberle hecho eso. El trauma se ve reflejado cuando sueña que Trisha le reclama el haberla hecho \"mal\" y no haber sido lo suficientemente bueno para eso. Cuando finalmente decide exhumar los restos de la criatura amorfa que transmutaron cuando eran niños y tras ver el cuerpo de su hermano en el otro lado de la Puerta de la Verdad, Ed se convence de que la Alquimia no puede devolverle la vida a otra persona o ser vivo y con un fervor renovado, consigue superar su trauma personal una vez sabe que puede recuperar el cuerpo de su hermano menor.\n" +
                    "\n" +
                    "Edward de adolescente se mantiene hiperactivo y de carácter fuerte; enfureciendo cuando le llaman con cualquier adjetivo cuyo sinónimo sea \"pequeño\" lo cual a menudo es usado como alivio cómico para la serie. A pesar de sufrir y cargar con el peso de sus pecados, Ed se mantiene de pie para devolverle a Alphonse su cuerpo, quien es la persona más importante para él. Bromista, ocurrente, impredecible y \"malvado\", aunque quizás suele ser algo duro con aquellos que se dan por vencidos. Él mismo menciona que no ha madurado lo suficiente siendo igual de incapaz para salvar a alguien como cuando era niño. Tras la muerte trágica de Nina, Edward cayó en la cuenta de que era un simple humano y se vio abatido por ello; sin embargo, la segunda vez que sintió un verdadero terror fue cuando estuvo a punto de morir por manos de Scar, momento en el que dejó de lado sus ideales prefiriendo morir con tal de que su hermano siga con vida.\n" +
                    "\n" +
                    "Cuando se reencuentra con su padre le propina un buen golpe al no perdonarlo nunca por completo, debido al resentimiento que guardó durante muchos años. Edward detesta asesinar personas inocentes, estando esto por arriba de su propósito. Luego de que Alphonse se sacrificara para devolverle su brazo, Ed logra entender a lo que se refería la verdad y lo apuesta todo transmutándose a sí mismo para intercambiar la vida de su hermano por su puerta de la verdad venciendo así a Dios y cumpliendo su meta; con el hecho de no volver a transmutar nunca más como pago a cambio de ver con su cuerpo a su querido hermano. Aunque no se demuestra al principio de la serie, al final Edward se enamora de Winry y declara su amor oficialmente antes de partir en su viaje.",
            painterResource(id = R.drawable.edward),
            painterResource(id = R.drawable.edward2),
            "FullMetal Team",
            listaPosiciones,
            "25",
            "Shingeki no Basket",
            "11/03/2023"
        ), JugadorAnime(
            "Eren Jaeger",
            "Desde niño, Eren siempre ha sido una persona determinada, de fuertes ideales y con un gran sentido de la justicia. Desde su infancia odiaba vivir encerrado por las murallas y en cambio, defendía la idea de unirse al Cuerpo de Exploración para explorar el mundo entero fuera de estas[11]. Este sueño fue gracias a su mejor amigo de la infancia Armin, quien le mostró un libro de investigaciones de los fenómenos de la naturaleza del mundo exterior. Eren admiraba bastante a los reclutas y les consideraba \"héroes\" por sus grandes hazañas incluso si estos no salían exitosos de sus expediciones. Las ideas de Eren le llevaron a una discusión con su madre y ser desaprobado por Mikasa, pero su padre le apoyó en su sueño. Eren también es muy curioso y tenía la expectativa de un día conocer los misterios dentro del sótano de su padre. En actitud, debido a ser apasionado e impulsivo resultaba en una persona capaz de hacer lo que quiere sin importar lo que otros piensen de él. Su gran determinación le llevó a defender a sus seres queridos como Mikasa al defenderla de unos ladrones y a su mejor amigo Armin de los matones locales del pueblo. En ocasiones parecía ser un poco tosco y no tan gentil como lo era Armin, resultando incluso en ser una persona algo indiferente. Sin embargo, en un todo Eren era un niño feliz que apreciaba bastante su vida cotidiana con su familia nuclear y su amigo Armin. Después de presenciar la terrible muerte de su madre, esto incentivó la venganza y deseo de Eren de asesinar a todos los titanes del mundo que fueron la raíz de su tragedia e infelicidad. Eren lamentó el hecho de que la última conversación que tuvo con su madre fue una pelea con ella.\n" +
                    "\n" +
                    "En su temprana adolescencia (12-14) años se unió con mucho esfuerzo a la milicia con tal de cumplir su objetivo. Eren mantenía compañerismo con los otros reclutas y destacaba por su fuerte dedicación a las expediciones aunque nunca llegó a ser un líder como lo fue Reiner Braun, otro de los reclutas con quien se llevaba bien. El hecho de haber sufrido una invasión titán que destruyó todo su hogar le hizo llevarse mejor con Reiner y Bertolt Hoover. A pesar de ser testarudo, Eren era capaz de escuchar otras ideologías diferentes a la suya: como ocurrió cuando conoció a Annie Leonhart. Esto le hizo reflexionar sobre los verdaderos valorar a considerar en el entrenamiento. Eren también estaba dispuesto a trabajar con los demás, a menudo pidiendo ayuda o consejos a sus otros reclutas; además de que por cierto tiempo recibió entrenamiento de técnicas por parte de Annie. Eren valoraba mucho la vida de sus compañeros y estaba dispuesto a vengar sus muertes incluso si se trataba de compañeros con los que no conocía tan bien como fue el caso de Thomas Wagner. También valora mucho el hecho de que la gente tenga ideales bien marcados: como fue el sueño de Armin de conocer el mundo exterior y la sinceridad de Annie Leonhart sobre sus propias prioridades. Con el poder que tiene, Eren carga un gran peso en sus hombros al ser la única esperanza de la humanidad. Eren tiene dudas internas a la hora de enfrentarse a compañeros traidores ras haber depositado confianza por años con ellos. Eventualmente hace su mejor esfuerzo para lidiar con ello y beneficiar a la humanidad. Uno de los rasgos más destacables de Eren como recluta era su mentalidad determinada, no permitiendo que los Titanes le hagan retroceder en cumplir su sueño. Varios reclutas pensaban que Eren era \"raro\" e incluso \"suicida\" por sus ganas de enfrentarse a los Titanes pero algunos otros les llamaba la atención su forma de ser, incluyendo a Jean Kirstein y Annie Leonhart.\n" +
                    "\n" +
                    "Dadas las circunstancias que enfrentó contra Rod Reiss y descubrir las acciones de su padre Grisha en el pasado, Eren desarrolló una fuerte desilusión por su propia vida. Al ser una persona con fuerte sentido de la justicia, Eren estuvo dispuesto a ser asesinado por Historia Reiss para que así vengara a su hermana Frieda que fue terriblemente asesinada por Grisha en el pasado. Eren incluso lloró por la muerte de ella y se declaró a sí mismo como una persona que solo merece morir para que así otro tome su lugar. Sin embargo, gracias a sus compañeros dicho pensamiento fue desvaneciéndose temporalmente ahora que participaría en otras misiones más decisivas. La relación con sus compañeros le ha permitido dar lugar a la razón. Es por ello que puede realizar su deber con la suficiente confianza y convicción frente a una amenaza. Eren ha concordado que actuó como un tonto al creer que el poder que se le había concebido era lo que lo hacía fuerte, con lo que llega a afirmar que eso es lo que una persona débil llegaría a decir. En el fondo Eren tenía dudas sobre si sus decisiones eran las correctas pero después de escuchar las palabras del Comandante Levi sobre \"que realmente no hay ninguna correcta\", Eren comprendió que no podía culparse a sí mismo o a los demás por hechos que no puede controlar; siendo este su mensaje de apoyo a un confundido Armin que dudaba de sí mismo[12]. Sin embargo, tiene dificultades con este pensamiento al sentirse culpable respecto a otros eventos injustificables e inhumanos, como el cruel asesinato de Faye Jaeger tras los militares en su temprana infancia. Una vez Eren asimila las memorias de su padre, este muestra evidente culpa por sus actos llegando incluso llorar y lamentarse por la muerte de Dina Jaeger, la antigua esposa de Grisha. Un año después se muestra a un Eren opaco y deprimido incluso cuando ya había cumplido su sueño de conocer el mundo exterior y el mar.\n" +
                    "\n" +
                    "Los cuatro años posteriores al descubrimiento de la mentira de Marley provocaron un profundo cambio en su personalidad, Eren se ha convertido en un ser frío y calculador a quien le produce poca empatía el transformarse en titán y causar grandes destrozos con pérdidas de vidas inocentes de por medio, aunque es plenamente consciente de que esto es un mal necesario para devolverle su gloria perdida a Eldia. Gran parte de su ser actual y las acciones que lleva a cabo derivan de las memorias de quienes le precedieron como los portadores del Titán Fundador y el Titán de Ataque.[7] A pesar de su estoicismo, Eren posee un punto de quiebre, el cual es alcanzado tras la muerte de Sasha Blouse. También ha dejado de sentir ira hacia los que atacaron su hogar en el 845, tal y como se lo mencionó a Reiner Braun en su reunión cuatro años después de su último enfrentamiento en el Distrito Shiganshina, diciendo que ya no lo odia e incluso llega a comprender la razón de sus acciones considerándose igual a él.\n" +
                    "\n" +
                    "También se ha vuelto implacable y despiadado, utilizando constantemente la violencia para conseguir resultados. Se le ha visto además muy manipulador y no duda en engañar a otros para utilizarlos y alcanzar sus objetivos, como cuando se acercó a Falco Grice y rápidamente se ganó su confianza para luego pedirle enviar cartas a sus aliados.\n" +
                    "\n" +
                    "Además, derivado de poseer el poder del Titán Fundador, Eren ya no siente miedo por nadie, ya no se siente amenazado y le es indiferente cualquier método que usen para detenerlo, porque sabe que su poder no puede ser detenido. Cuando Pieck lo apuntó con un arma amenazándolo para que dejase ir a Gabi, él se mostro tranquilo ya que sabía que no pueden matarlo por tener el poder del Fundador.\n" +
                    "\n" +
                    "Eren tiene una fijación especial por la libertad, valorándola por encima de todo y todos, hasta el punto de obsesionarse con ella. Ha declarado que el tipo de persona que más odia es aquella que no tiene valor ni libertad y que cumple con cualquier orden como un esclavo. Es esta razón por la que no impidió que sus amigos se fuesen en su contra y se enfrentasen a él ni se molestó con ellos por oponérsele, porque escogieron libremente tomar ese camino.",
            painterResource(id = R.drawable.eren),
            painterResource(id = R.drawable.eren2),
            "Shingeki no Basket",
            listaPosiciones,
            "26",
            "FullMetal Team",
            "15/05/2023"
        ), JugadorAnime(
            "Ichigo",
            "Ichigo es obstinado, espontáneo, decidido, franco, de carácter fuerte e impulsivo, y a veces busca un poco de confrontación. A pesar de ser ingenioso y cínico, muestra verdadera compasión y empatía por los demás, sobre todo si un espíritu está implicado; un ejemplo de ésto es traerle flores al espíritu de una niña. También es muy protector con sus amigos y familiares ya que es capaz de dar su vida por la de sus seres queridos. Este último rasgo es la fuerza impulsora detrás de la mayoría de sus acciones y casi todos los arcos de la historia han derivado de él corriendo para salvar a alguien, generalmente mujeres, rasgo característico de él.\n" +
                    "\n" +
                    "Trata de mantenerse separado y de dar una imagen \"cool\", a pesar de afirmar que no le importa lo que piensen los demás acerca de él. Por esta razón, en general, mantiene en su rostro un ceño fruncido permanentemente con las cejas siempre estiradas. Sin embargo, a pesar de esta imagen de tipo duro que trata de mantener, se convierte en extremadamente tímido e incómodo alrededor de desnudos o vestidos sin pudor por parte de las mujeres, un hecho que tanto Rangiku Matsumoto y Yoruichi Shihōin han burlado de él. También es más arrogante y ha sabido burlarse y menospreciar a sus oponentes cuando está en combate. A la inversa, también puede entrar en un estado de profunda depresión cuando pierde una gran batalla o permite que un amigo salga lastimado.\n" +
                    "\n" +
                    "Ichigo tiene el hábito de la lectura errónea en nombres de otras personas, tales como Uryū Ishida y Yasutora Sado (los resultados de este último caso es el apodo de Sado, Sado). Una de gags más frecuentes es que se sigue olvidando de los nombres cada vez que se enfrenta a un compañero de clase nuevo, afirmando que sólo conoce el nombre de la mitad de la clase. Sin embargo, parece que le es mucho más fácil recordar los nombres más adelante en la serie.\n" +
                    "\n" +
                    "Aunque es engreído, impetuoso y de naturaleza espontánea, esto lo hace parecer más tonto, más integrado y el cálculo de individuos (en particular Uryū Ishida), Ichigo es un analista capaz cuando es necesario, e instintivamente puede captar, en algunos casos, las cosas mucho más rápido que los que le rodean y parece disfrutar de la lucha contra la gente, otro rasgo de él es que es bastante honorable, como cuando curó desinteresadamente las heridas a Dordonii o desplazó lentamente el cuerpo de su rival Grimmjow hacia el piso.\n" +
                    "\n" +
                    "Cuando está peleando normalmente en el último instante saca las energías suficientes para ganar. Tenía el pelo de naranja natural y sus disposiciones rebeldes tienden a molestar a muchos matones en su escuela, que constantemente buscan peleas con él. Ichigo afirma que no le importan las opiniones de otras personas acerca de él (tanto en lo que respecta a su cabello y otros temas) pero cuando alguien está haciendo el tonto cerca de el se avergüenza mucho,\n" +
                    "\n" +
                    "Del mismo modo, también era un estudiante capaz, puesto 23 en su escuela, lleva los estudios de forma regular y no descuida sus deberes escolares, pues él afirma que no tiene \"nada mejor que hacer en casa\". Más tarde se reveló que trabaja tan duro simplemente para superar los conceptos erróneos que muchos profesores tienen de él, en base a su color de pelo y de las interacciones con otros estudiantes. Se muestra en un omake reciente que aún con su condición de Shinigami que todavía es capaz de pasar los exámenes, aunque su profesora le dió los exámenes de recuperación a causa de su desaparición constante.\n" +
                    "\n" +
                    "Debido a sus constantes peleas con los bravucones y su permanente ceño fruncido, muchos estudiantes tienen más bien miedo de él. A pesar de esto, él tiene un corazón cálido y amable, desafiante, vela por los que se sitúan bajo su cuidado y es, hasta cierto punto, bastante compasivo una vez que entiende otro punto de vista. También parece ser algo perceptivo, como cuando señala que lo que emana Zangetsu es tristeza. Rukia incluso dice, en la primera película, que \"sólo se ve de miedo\".\n" +
                    "\n" +
                    "Esta característica lo hace muy agradable con los niños. Como tal, no ha amenazado o casi nunca levantó la voz a sus hermanas menores, Karin y Yuzu (una sola vez y es cuestionable ya que estaban siendo atacadas). Sin embargo, tiene algunos problemas con la autoridad y el respeto tradicional, y es a menudo bastante grosero y falto de respeto al hablar con los mayores de sí mismo. Aunque no tiene la intención de ser grosero, tiende a llamar al Capitán General Yamamoto \"abuelo\" y se refiere a algunos Capitanes (en particular Zaraki, Byakuya y Hitsugaya) por sus nombres, a pesar de las protestas verbales de Byakuya y Hitsugaya (este último sugiere en un punto que Ichigo lo hace a propósito).\n" +
                    "\n" +
                    "Sin embargo, hace uso de los honoríficos japoneses para un reducido número de individuos, tales como Urahara, Yoruichi ,Unohana, Komamura, Kyōraku y Ukitake. También se refiere a Rangiku Matsumoto como \"Rangiku-san\", pero se refiere a Yumichika Ayasegawa e Ikkaku Madarame por su primer nombre. En la tercera película también utiliza el sufijo \"-san\" con Hisagi, pero se dirigió a Iduru Kira únicamente como \"Kira\", sin honorífico alguno, en el arco del las Historias de las Zanpaku-tō (relleno del anime). Se ha demostrado que Ichigo se refiere a Mayuri Kurotsuchi sin honorífico, lo que este último encuentra irritante. También Ichigo se refiere a Ikumi Unagiya como Ikumi-san.",
            painterResource(id = R.drawable.ichigo),
            painterResource(id = R.drawable.ichigo2),
            "Bleach United",
            listaPosiciones,
            "23",
            "One Piece Stars",
            "20/06/2023"
        ), JugadorAnime(
            "Monkey D. Luffy",
            "Monkey D. Luffy (モンキー・Ｄ・ルフィ Monkī Dī Rufi?), más conocido como Luffy «Sombrero de Paja» (麦わらのルフィ Mugiwara no Rufi?), es el protagonista principal de la serie de manga y anime One Piece. Es el capitán y fundador de los Piratas de Sombrero de Paja así como un de los Cuatro Emperadores que gobiernan los mares del Nuevo Mundo.[19] Comió una fruta del diablo llamada fruta Gomu Gomu, que le convirtió en un hombre de goma. Además de esto, posee varias habilidades que le hacen ser un pirata más que especial; un gran ejemplo de ello es la capacidad de usar el haoshoku haki ―que sólo lo posee una persona dentro de un millón― y poseer también los otros dos tipos de haki.\n" +
                    "\n" +
                    "Luffy pertenece a una familia plagada de personajes conocidos mundialmente: es hijo del líder del Ejército Revolucionario y criminal más buscado del mundo, Monkey D. Dragon; nieto del héroe de la Marina y anterior vicealmirante Monkey D. Garp, hermano adoptivo del conocido pirata Ace \"Puño de Fuego\" ―antiguo comandante de la segunda división de los Piratas de Barbablanca―, así como del oficial general del Ejército Revolucionario, Sabo. Su objetivo en la vida es convertirse en el próximo Rey de los Piratas, encontrar el legendario tesoro conocido como el \"One Piece\", que perteneció al anterior Rey de los Piratas Gol D. Roger, y conquistar el Nuevo Mundo liderando una tripulación formada por grandes piratas.\n" +
                    "\n" +
                    "Como fundador y capitán de los Piratas de Sombrero de Paja, es el primer miembro que compone la tripulación, así como uno de sus tres principales combatientes. Luffy fue uno de los once piratas novatos conocidos como los \"los Once Supernovas\" junto al espadachín de su tripulación Roronoa Zoro y, con ello, uno de los once piratas con una recompensa superior a Belly100.000.000. Posteriormente su recompensa subió a Belly1.500.000.000 tras los hechos acaecidos en Whole Cake Island[1] y actualmente cuenta con una recompensa de Belly3.000.000.000 como consecuencia de todos los acontecimientos acaecidos en el asalto a Onigashima.[19]\n" +
                    "\n" +
                    "Luffy se ha ganado una enorme reputación en todo el mundo por causar problemas incluso entre los Siete Guerreros del Mar y la Marina, cometiendo crímenes y acciones que se consideran amenazadoras contra el Gobierno Mundial.\n" +
                    "\n" +
                    "También es especialmente conocido por su conducta irresponsable e impulsiva, así como por tomar decisiones que normalmente son consideradas verdaderas locuras; siendo un gran ejemplo el incidente causado en Enies Lobby, la infiltración y fuga de la prisión de Impel Down, y su participación en la batalla de Marineford. Es, por lo tanto, famoso no sólo por ser el único pirata en asaltar las tres instalaciones más importantes del gobierno, sino también de huir de todas ellas sin que su tripulación sufriera ninguna baja y causando grandes daños a su paso (especialmente en Enies Lobby).\n" +
                    "\n" +
                    "Todo lo anterior, sumado al hecho de que arremetió contra un Noble Mundial, golpeándole aún con pleno conocimiento de las consecuencias debido a la posición sagrada que concede el Gobierno Mundial a los nobles, ha causado que Luffy sea etiquetado por la Marina como la clase de pirata que causaría graves problemas en un futuro próximo.",
            painterResource(id = R.drawable.luffy),
            painterResource(id = R.drawable.luffy2),
            "One Piece Stars",
            listaPosiciones,
            "40",
            "FullMetal Team",
            "09/07/2023"
        ), JugadorAnime(
            "Roy Mustang",
            "Las atrocidades que tuvo que ejecutar y presenciar durante el exterminio perpetrado en la Guerra Civil de Ishval moldearon duramente su carácter al volverlo una persona completamente entregada a la protección de los necesitados, no ajeno, por supuesto, a una visión y perspectiva cínica de la vida; más allá de los \"logros\" y el ascenso que obtuvo en la guerra civil, algo de lo que se siente avergonzado, ya que al ver que fue usado como un instrumento más en la matanza, Roy se llenó de un fervor renovado para derrocar a King Bradley y convertirse en el nuevo líder de Amestris para guiar al país hacia un estado más democrático, aunque sabe que tiene que pagar por ello como un criminal de guerra, al igual que Riza Hawkeye, quien participó junto a él en la matanza.\n" +
                    "\n" +
                    "Siente un gran apego y profundo cariño por esta última, ya que es su punto débil y la persona más importante en su vida. Tanto es así que la llama su reina, haciendo referencia a que es la pieza más importante en el tablero de ajedrez. \n" +
                    "\n" +
                    "Se muestra al coronel sentir celos cuando Barry abraza a la teniente y cuando ella lo molesta diciendo que el führer es más disciplinado que él. \n" +
                    "\n" +
                    "A pesar de todos esos defectos, el verdadero Roy Mustang está lejos de ser considerado alguien despreciable para quienes no lo conocen. Pues aunque da la impresión de ser alguien arrogante y frío (especialmente con Edward Elric, a quien llama por su apodo y no por su nombre, salvo una vez cuando supo lo que realmente le pasó a Hughes y quien lo mató) y mujeriego a más no poder, está muy lejos de ser eso: el verdadero Roy Mustang se muestra como alguien serio y calculador que aparte, gusta vivir de las apariencias para no llamar la atención. Usando su personalidad de mujeriego, Roy esconde sus mejores armas en las manos de su tía Chris Mustang y su red de espías, todas ellas mujeres a quienes acude cuando la ocasión lo amerite (fue gracias a ellas y por el mensaje cifrado de Riza que pudo confirmar que Selim Bradley es un homúnculo) demostrando que Roy, a pesar de tener un rango relativamente menor en el ejército, es un estratega de temer ya que suele estar siempre un paso adelante de sus enemigos y su manera de actuar a espaldas de las autoridades es digno de alabar. Su meta final es destapar la conspiración que se esconde tras la milicia de Amestris y llegar a la cumbre para así poder proteger a todo el país y compensar en cierto modo, su rol en la masacre de Ishval. Roy es capaz de darlo absolutamente todo por sus subordinados y la gente a la que aprecia, poniéndose en peligro sin dudarlo, aunque también muestra que puede ser muy temible si se le hace enojar, ya que tiene un lado implacable y despiadado.",
            painterResource(id = R.drawable.mustang),
            painterResource(id = R.drawable.mustang2),
            "FullMetal Team",
            listaPosiciones,
            "43",
            "Shingeki no Basket",
            "04/08/2023"
        ), JugadorAnime(
            "Sukuna, King of Curses",
            "Sukuna posee un espíritu libre que solo guía del placer[9], y dada su personalidad sádica, le gusta y disfruta inmensamente del sufrimiento de los demás. Es codicioso y siempre quiere mantener el control de la situación sin preocuparse por las consecuencias. Asegura no tener interés alguno en su recipiente, Yuji Itadori, pero se niega rotundamente a que alguien intente matarlo, ya que, hacer eso, significa interponerse entre sus planes[9].\n" +
                    "\n" +
                    "Considera inmediatamente aburrido a todo aquel que no cumpla con sus expectativas en base a fuerza o habilidades físicas[10]. Constantemente critica a su recipiente por lo débil e incompetente que es con sus habilidades, incluso, llega a molestarse cuando pierde contra un oponente que él considera más débil que Itadori[11]. Por otro lado, si se encuentra con alguien fuerte y que sea capaz de entretenerlo lo suficiente, suele halagar las habilidades de su oponente[12].\n" +
                    "\n" +
                    "Aunque le gusta matar humanos, especialmente niños débiles[13] y mujeres llenas de vitalidad[14], posee un lado astuto que suele usar a su favor. Por ejemplo, durante su enfrentamiento contra Megumi Fushiguro, arrancó el corazón de su recipiente para evitar que éste realizara el cambio de cuerpo de manera exitosa[15].\n" +
                    "\n" +
                    "Sukuna se considera a sí mismo por encima de humanos, hechiceros, maldiciones y usuarios malditos. Su actitud es similar al de un rey tirano arrogante y, como tal, constantemente trata a los demás como sus inferiores y les da órdenes dado que se siente en el derecho de hacerlo. Sukuna posee un aura intimidante e inspira terror a todo el mundo. Él no duda en intimidar y amenazar a los que están a su alrededor para que éstos hagan lo que él les ordene. En Shibuya, apenas despertó y tomó el control de su cuerpo recipiente, amenazó a Jogo, Mimiko y a Nanako para que se arrodillaran ante él. También amenazó a todos los humanos presentes, diciendo que si se movían sin su permiso, los mataría a todos sin dudarlo.",
            painterResource(id = R.drawable.sukuna),
            painterResource(id = R.drawable.sukuna2),
            "Jujutsu Basket Club",
            listaPosiciones,
            "45",
            "One Piece Stars",
            "20/05/2023"
        ), JugadorAnime(
            "Toji Zennin",
            "Toji tenía la mala costumbre de apostar dinero en las carreras de caballos a pesar de no ganar nunca. Dado que no siempre expresaba sus planes, solía dar la imagen de una persona desinteresada, sin embargo ha demostrado ser un excelente planificador, tanto fuera de combate como en la misma batalla[3]. En combate, era un brutal guerrero que atacaba salvajemente a sus enemigos con una amplia sonrisa en su rostro[6].\n" +
                    "\n" +
                    "Siempre sintió un profundo odio al Clan Zenin y a las grandes cabezas del mundo del jujutsu. No se valoraba, ni a él mismo, ni tampoco valoraba a los demás. Cuando aceptó asesinar a Riko Amanai[2], quería poder afirmarse a él mismo que podría luchar contra algunos de los chamanes más fuertes, sin la necesidad de tener energía maldita.\n" +
                    "\n" +
                    "Su relación con su hijo es complicada. Toji nombró a Megumi antes de saber si era niño o niña[7]. Ha declarado que es malo recordando nombres, eso incluso se aplica con el nombre de su hijo dado que en un momento no llegó a recordar quién era[2]. Sin embargo, a pesar de que parece que no le interesaba demasiado su hijo, le otorgó un nombre que significa \"Esperanza\" y cuando estuvo en sus últimos momentos de vida, sus últimos pensamientos fueron acerca de él y hasta le dijo a Gojo acerca de éste para que pudiera hacer algo y así evitar que Megumi cayera en las manos del Clan Zenin[8]. Inclusive cuando su cuerpo fue invocado y tuvo una pelea contra Megumi, por unos segundos trajo de vuelta la información de su alma cuando recordó quien era la persona que estaba frente a él y decidió suicidarse en lugar de combatir con su hijo.",
            painterResource(id = R.drawable.toji),
            painterResource(id = R.drawable.toji2),
            "Jujutsu Basket Club",
            listaPosiciones,
            "60",
            "FullMetal Team",
            "14/09/2023"
        ), JugadorAnime(
            "Ulquiorra",
            "De entre todos los personajes de Bleach, Ulquiorra bien podría ser quien poseía la personalidad más fría e insensible entre todos, mezclado con un halo melancólico no exento de crueldad. Esto permite establecer un cierto paralelismo con Byakuya (debido al carácter también frío de este). No suele mostrar emoción alguna hacia cualquier estímulo externo, pareciendo indiferente ante todo lo que sucede a su alrededor, y no tiene el menor reparo en herir tanto a enemigos como a camaradas si se interponen en su camino o actúan sin pensar como cuando golpeó a un maltrecho Yammy en el vientre. En su primera aparición llamaba \"basura\" a todo aquel que no era digno de su atención, algo que si bien no ha vuelto a hacer, ya se ha convertido en una de sus señas de identidad. Aun así, Ulquiorra no es particularmente violento, y solo pelea cuando se lo ordena Aizen o cuando busca a personas que despertaron su interés para provocar una batalla con dichas personas. Según Grimmjow Jaegerjaquez, Ulquiorra tiene el hábito de atravesar con sus propias manos a la gente que le llama la atención en el lugar donde tiene su agujero de Hollow, una costumbre que no se sabe si realiza conscientemente o no.\n" +
                    "\n" +
                    "De naturaleza inteligente y mente analítica, Ulquiorra es sumamente perceptivo, y capaz de destacar el más mínimo detalle en cualquier situación, lo que le convierte en una muy valiosa fuente de información. Además, ha demostrado ser bastante retorcido, a sabiendas o no, siendo capaz de atacar directamente los sentimientos de aquellos que se enfrentan a él (despertando la ira de Ichigo, sometiendo a Orihime a una auténtica guerra psicológica...) y observando su reacción. Su forma de ser es implacable, y es capaz de realizar cualquier acto, por inhumano y abominable que pueda ser, sin siquiera pestañear.\n" +
                    "\n" +
                    "Ulquiorra muestra cierto interés por los vínculos entre los humanas, aunque no llega a comprenderlas e incluso niega su existencia, ya que, según él dice: \"si sus ojos no pueden verlas, no son reales\". Podría parecer, por esta forma de pensar, que debido a la forma de vida sin sentido de un Hollow Ulquiorra no entiende qué son los sentimientos, aunque como aún no sabemos lo suficiente de su pasado, no podemos confirmarlo. Sea como fuese, lo cierto es que cuando Ichigo Kurosaki aventuró sobre la posibilidad de que este se estuviese volviendo cada vez más humano, posiblemente influenciado por Orihime, pareció tomárselo como una ofensa y respondió con una furia no vista en él hasta entonces o cuando Ichigo malherido intentaba atacarlo a toda costa se enfureció diciéndole que era inútil. Antes de desvenecerse finalmente entendió el significado de esos lazos, intentando estrechar la mano a Orihime y comprendiendo que lo que está en su mano era el \"Corazón\".",
            painterResource(id = R.drawable.ulquiorra),
            painterResource(id = R.drawable.ultquiorra2),
            "Bleach United",
            listaPosiciones,
            "34",
            "Jujutsu Basket Club",
            "17/08/2023"
        ), JugadorAnime(
            "Roronoa Zoro",
            "Zoro, también llamado \"el cazador de Minorias\", es un espadachín experto en el Santōryū (estilo de tres espadas). Usa tres espadas, llevando una en cada mano y otra en la boca. Es valiente, fuerte y siempre cumple su palabra, aunque también bastante temperamental. Su sueño es llegar a ser el mejor espadachín del mundo.\n" +
                    "\n" +
                    "Es de carácter reservado, aunque muy a menudo actúa de manera cómica. También tiene un pésimo sentido de la orientación, al grado de perderse incluso en caminos rectos o cuando alguien lo está guiando. Cuando él y el resto de la tripulación se encuentra navegando, Zoro está durmiendo o entrenando. Él y Sanji poseen una gran rivalidad, se pelean (verbal y físicamente) por asuntos sin importancia y muy a menudo, en situaciones y/o momentos inoportunos, (casi siempre a causa de la frase \"Yo me encargo de él\"), aunque cuando cooperan (que pocas veces se da el caso) forman un gran equipo.\n" +
                    "\n" +
                    "Tiene un fuerte sentido de la razón que lo convierte en el pilar de la tripulación cuando llegan a un punto en que la situación es seria o crítica (como cuando Usopp dejó la tripulación). A pesar de que esté o no de acuerdo, él siempre respaldará las decisiones de Luffy (al igual que Nico Robin), hablando solo para opinar cuando los otros no llegan a ver las reales implicaciones de la situación (como cuando se enfrentan a Aokiji). Su único trabajo aparente a bordo del Going Merry es usar su enorme fuerza para subir el ancla, aunque últimamente (y desde que el Thousand Sunny tiene un mecanismo para hacer eso) se le ha visto efectuar el papel de vigía.\n" +
                    "\n" +
                    "Zoro también puede ser muy vigoroso y no cederá cuando está determinado a lograr una meta o derrotar un enemigo. Cuando Zoro tiene la intención de pelear seriamente, normalmente se pone su bandana verde oscura (que usualmente tiene amarrada sobre su brazo izquierdo) en la cabeza.\n" +
                    "\n" +
                    "Durante el viaje en un principio, Zoro le aclaró a Luffy que simplemente se unía a él para cumplir su sueño, sin embargo, lentamente, ha comenzado a cambiar su manera de pensar llegando incluso (en su pelea contra Kuma) a decir que \"Luffy debe ser el hombre que se convertirá en el Rey de los Piratas\", lo cual podría interpretarse como una meta añadida a sí mismo. A lo largo de la serie ha demostrado ser el más leal a Luffy, incluso lo ha llamado \"Rey Pirata\" tras su derrota a manos de Mihawk y en el duelo contra Kuma. En una ocasión, Zoro casi abandonó su sueño en un intento por convencer a Kuma de no matar a Luffy y a su tripulación, probando así su lealtad y el apego que se ha formado entre todos.",
            painterResource(id = R.drawable.zoro),
            painterResource(id = R.drawable.zoro2),
            "One Piece Stars",
            listaPosiciones,
            "50",
            "Bleach United",
            "21/04/2023"
        )

    )

    return listaJugadores;

}