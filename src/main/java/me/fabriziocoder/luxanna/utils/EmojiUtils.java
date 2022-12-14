package me.fabriziocoder.luxanna.utils;

public class EmojiUtils {
    public static String getRankEmojiByRankName(String name) {
        String emoji = null;
        switch (name) {
            case "IRON" -> emoji = "<:IronLogo:949777641194549358>";
            case "BRONZE" -> emoji = "<:BronzeLogo:949777641165180968>";
            case "SILVER" -> emoji = "<:SilverLogo:949777641001586818>";
            case "GOLD" -> emoji = "<:GoldLogo:949777640863203350>";
            case "PLATINUM" -> emoji = "<:PlatiniumLogo:949777641039343676>";
            case "DIAMOND" -> emoji = "<:DiamondLogo:949777640993226792>";
            case "MASTER" -> emoji = "<:MasterLogo:949777640989003796>";
            case "GRANDMASTER" -> emoji = "<:GrandMasterLogo:949777641060315176>";
            case "CHALLENGER" -> emoji = "<:ChallengerLogo:949777641022570496>";
        }
        return emoji;
    }

    public static String getChampionEmojiByChampionName(String name) {
        String emoji = null;
        switch (name) {
            case "None" -> emoji = "<:None:936101187533541466>";
            case "Aatrox" -> emoji = "<:Aatrox:888534735498911844>";
            case "Ahri" -> emoji = "<:Ahri:888534778175950868>";
            case "Akali" -> emoji = "<:Akali:888534821104672778>";
            case "Akshan" -> emoji = "<:Akshan:888534864079511672>";
            case "Alistar" -> emoji = "<:Alistar:888534907037564928>";
            case "Amumu" -> emoji = "<:Amumu:888534949681045536>";
            case "Anivia" -> emoji = "<:Anivia:888534992999829564>";
            case "Annie" -> emoji = "<:Annie:888535036016599100>";
            case "Aphelios" -> emoji = "<:Aphelios:888535078911750185>";
            case "Ashe" -> emoji = "<:Ashe:888535121651716136>";
            case "Aurelion Sol" -> emoji = "<:AurelionSol:888535164517486662>";
            case "AurelionSol" -> emoji = "<:AurelionSol:888535164517486662>";
            case "Azir" -> emoji = "<:Azir:888535207567847424>";
            case "Bard" -> emoji = "<:Bardo:888535250202939433>";
            case "Bardo" -> emoji = "<:Bardo:888535250202939433>";
            case "Bel'Veth" -> emoji = "<:BelVeth:994807834355191940>";
            case "Blitzcrank" -> emoji = "<:Blitzcrank:888535293018406923>";
            case "Brand" -> emoji = "<:Brand:888535336089714758>";
            case "Braum" -> emoji = "<:Braum:888535378435387423>";
            case "Caitlyn" -> emoji = "<:Caitlyn:888535421615763496>";
            case "Camille" -> emoji = "<:Camille:888535464569622618>";
            case "Cassiopeia" -> emoji = "<:Cassiopeia:888535507661889596>";
            case "Cho'Gath" -> emoji = "<:ChoGath:888535550582206495>";
            case "Corki" -> emoji = "<:Corki:888535593401872394>";
            case "Darius" -> emoji = "<:Darius:888535636166979654>";
            case "Diana" -> emoji = "<:Diana:888535679393472562>";
            case "Draven" -> emoji = "<:Draven:888535722045374495>";
            case "Dr. Mundo" -> emoji = "<:DrMundo:888535765150236712>";
            case "DrMundo" -> emoji = "<:DrMundo:888535765150236712>";
            case "Ekko" -> emoji = "<:Ekko:888535807827255307>";
            case "Elise" -> emoji = "<:Elise:888535851112484935>";
            case "Evelynn" -> emoji = "<:Evelynn:888535894041194606>";
            case "Ezreal" -> emoji = "<:Ezreal:888535936638550067>";
            case "Fiddlesticks" -> emoji = "<:Fiddlesticks:888535979688869898>";
            case "Fiora" -> emoji = "<:Fiora:888536022575640656>";
            case "Fizz" -> emoji = "<:Fizz:888536065944748112>";
            case "Galio" -> emoji = "<:Galio:888536108982468679>";
            case "Gangplank" -> emoji = "<:Gangplank:888536152406106172>";
            case "Garen" -> emoji = "<:Garen:888536195510988800>";
            case "Gnar" -> emoji = "<:Gnar:888536238775205979>";
            case "Gragas" -> emoji = "<:Gragas:888536281896861807>";
            case "Graves" -> emoji = "<:Graves:888536324699750412>";
            case "Gwen" -> emoji = "<:Gwen:888536368094007337>";
            case "Hecarim" -> emoji = "<:Hecarim:888536410871697458>";
            case "Heimerdinger" -> emoji = "<:Heimerdinger:888536454358241291>";
            case "Illaoi" -> emoji = "<:Illaoi:888536497387622562>";
            case "Irelia" -> emoji = "<:Irelia:888536540693790750>";
            case "Ivern" -> emoji = "<:Ivern:888536583626686504>";
            case "Janna" -> emoji = "<:Janna:888536626270187532>";
            case "Jarvan IV" -> emoji = "<:JarvanIV:888536669580587038>";
            case "JarvanIV" -> emoji = "<:JarvanIV:888536669580587038>";
            case "Jax" -> emoji = "<:Jax:888536711976587266>";
            case "Jayce" -> emoji = "<:Jayce:888536755039522846>";
            case "Jhin" -> emoji = "<:Jhin:888536798169550869>";
            case "Jinx" -> emoji = "<:Jinx:888536841333125180>";
            case "Kai'Sa" -> emoji = "<:KaiSa:888550808445132810>";
            case "Kalista" -> emoji = "<:Kalista:888550851331887126>";
            case "Karma" -> emoji = "<:Karma:888550894512250930>";
            case "Karthus" -> emoji = "<:Karthus:888550937709404180>";
            case "Kassadin" -> emoji = "<:Kassadin:888550980860403752>";
            case "Katarina" -> emoji = "<:Katarina:888551023625502741>";
            case "Kayle" -> emoji = "<:Kayle:888551066029948969>";
            case "Kayn" -> emoji = "<:Kayn:888551108929290251>";
            case "Kennen" -> emoji = "<:Kennen:888551152566820954>";
            case "Kha'Zix" -> emoji = "<:KhaZix:888551195654885446>";
            case "Kindred" -> emoji = "<:Kindred:888551238235463692>";
            case "Kled" -> emoji = "<:Kled:888551281445183529>";
            case "Kog'Maw" -> emoji = "<:KogMaw:888551324436791336>";
            case "LeBlanc" -> emoji = "<:LeBlanc:888551367139033138>";
            case "Lee Sin" -> emoji = "<:LeeSin:888551409983819776>";
            case "Leona" -> emoji = "<:Leona:888551452715384852>";
            case "Lillia" -> emoji = "<:Lillia:888551495400828970>";
            case "Lissandra" -> emoji = "<:Lissandra:888551538572812328>";
            case "Lucian" -> emoji = "<:Lucian:888551580968816732>";
            case "Lulu" -> emoji = "<:Lulu:888551624077897738>";
            case "Lux" -> emoji = "<:Lux:888551667585392670>";
            case "Malphite" -> emoji = "<:Malphite:888551710715412480>";
            case "Malzahar" -> emoji = "<:Malzahar:888551753669300305>";
            case "Maokai" -> emoji = "<:Maokai:888551796107264011>";
            case "Master Yi" -> emoji = "<:MaestroYi:888551839304405004>";
            case "MasterYi" -> emoji = "<:MaestroYi:888551839304405004>";
            case "Miss Fortune" -> emoji = "<:MissFortune:888551882677702717>";
            case "MissFortune" -> emoji = "<:MissFortune:888551882677702717>";
            case "Wukong" -> emoji = "<:Wukong:888551926042595369>";
            case "Mordekaiser" -> emoji = "<:Mordekaiser:888551969235566652>";
            case "Morgana" -> emoji = "<:Morgana:888552011920982017>";
            case "Nami" -> emoji = "<:Nami:888552054941954118>";
            case "Nasus" -> emoji = "<:Nasus:888552237146730536>";
            case "Nautilus" -> emoji = "<:Nautilus:888552280280932392>";
            case "Nilah" -> emoji = "<:Nilah:996917711068209265>";
            case "Neeko" -> emoji = "<:Neeko:888552323113181244>";
            case "Nidalee" -> emoji = "<:Nidalee:888552365924438016>";
            case "Nocturne" -> emoji = "<:Nocturne:888552408580489267>";
            case "Nunu & Willump" -> emoji = "<:Nunu:888552451626659922>";
            case "Nunu" -> emoji = "<:Nunu:888552451626659922>";
            case "Olaf" -> emoji = "<:Olaf:888552494467252226>";
            case "Orianna" -> emoji = "<:Orianna:888552538247405580>";
            case "Ornn" -> emoji = "<:Ornn:888552581163515906>";
            case "Pantheon" -> emoji = "<:Pantheon:888552624939474985>";
            case "Poppy" -> emoji = "<:Poppy:888552667817840651>";
            case "Pyke" -> emoji = "<:Pyke:888552711044349963>";
            case "Qiyana" -> emoji = "<:Qiyana:888552754002395186>";
            case "Quinn" -> emoji = "<:Quinn:888552797098872862>";
            case "Rakan" -> emoji = "<:Rakan:888552839905968128>";
            case "Rammus" -> emoji = "<:Rammus:888552883266666546>";
            case "Rek'Sai" -> emoji = "<:RekSai:888552925679484930>";
            case "Rell" -> emoji = "<:Rell:888552968956293162>";
            case "Renata Glasc" -> emoji = "<:RenataGlasc:1006260533168717894>";
            case "RenataGlasc" -> emoji = "<:RenataGlasc:1006260533168717894>";
            case "Renekton" -> emoji = "<:Renekton:888553011893391390>";
            case "Rengar" -> emoji = "<:Rengar:888553054423629877>";
            case "Riven" -> emoji = "<:Riven:888553348851175516>";
            case "Rumble" -> emoji = "<:Rumble:888553392056696852>";
            case "Ryze" -> emoji = "<:Ryze:888553435107053578>";
            case "Samira" -> emoji = "<:Samira:888553477754716171>";
            case "Sejuani" -> emoji = "<:Sejuani:888553520792481844>";
            case "Senna" -> emoji = "<:Senna:888553563666673674>";
            case "Seraphine" -> emoji = "<:Seraphine:888553606268190732>";
            case "Sett" -> emoji = "<:Sett:888553649280778302>";
            case "Shaco" -> emoji = "<:Shaco:888553692784103474>";
            case "Shen" -> emoji = "<:Shen:888553735419211858>";
            case "Shyvana" -> emoji = "<:Shyvana:888553778146590722>";
            case "Singed" -> emoji = "<:Singed:888553821452767324>";
            case "Sion" -> emoji = "<:Sion:888553864519880724>";
            case "Sivir" -> emoji = "<:Sivir:888553907247284265>";
            case "Skarner" -> emoji = "<:Skarner:888553949945270303>";
            case "Sona" -> emoji = "<:Sona:888553992500682763>";
            case "Soraka" -> emoji = "<:Soraka:888554037669167144>";
            case "Swain" -> emoji = "<:Swain:888554080757239868>";
            case "Sylas" -> emoji = "<:Sylas:888554123631419414>";
            case "Syndra" -> emoji = "<:Syndra:888554167180861501>";
            case "TahmKench" -> emoji = "<:TahmKench:888554210218631229>";
            case "Tahm Kench" -> emoji = "<:TahmKench:888554210218631229>";
            case "Taliyah" -> emoji = "<:Taliyah:888554253243805756>";
            case "Talon" -> emoji = "<:Talon:888554296604508190>";
            case "Taric" -> emoji = "<:Taric:888554339541590078>";
            case "Teemo" -> emoji = "<:Teemo:888554382692581427>";
            case "Thresh" -> emoji = "<:Thresh:888554425789063168>";
            case "Tristana" -> emoji = "<:Tristana:888554468789063730>";
            case "Trundle" -> emoji = "<:Trundle:888554511352885249>";
            case "Tryndamere" -> emoji = "<:Tryndamere:888554554092830762>";
            case "Twisted Fate" -> emoji = "<:TwistedFate:888554597298372708>";
            case "TwistedFate" -> emoji = "<:TwistedFate:888554597298372708>";
            case "Twitch" -> emoji = "<:Twitch:888554639908298763>";
            case "Udyr" -> emoji = "<:Udyr:888554683369660477>";
            case "Urgot" -> emoji = "<:Urgot:888554726638092328>";
            case "Varus" -> emoji = "<:Varus:888554769524863036>";
            case "Vayne" -> emoji = "<:Vayne:888554812520689695>";
            case "Veigar" -> emoji = "<:Veigar:888554855457783850>";
            case "Vel'Koz" -> emoji = "<:VelKoz:888554898373886003>";
            case "Vex" -> emoji = "<:Vex:890700471805837352>";
            case "Vi" -> emoji = "<:Vi:888554941164159008>";
            case "Viego" -> emoji = "<:Viego:888554984512315422>";
            case "Viktor" -> emoji = "<:Viktor:888555027537485854>";
            case "Vladimir" -> emoji = "<:Vladimir:888555070285824071>";
            case "Volibear" -> emoji = "<:Volibear:888555113000611920>";
            case "Warwick" -> emoji = "<:Warwick:888555155744780298>";
            case "Xayah" -> emoji = "<:Xayah:888555198698635294>";
            case "Xerath" -> emoji = "<:Xerath:888555241514102794>";
            case "Xin Zhao" -> emoji = "<:XinZhao:888555284354699284>";
            case "XinZhao" -> emoji = "<:XinZhao:888555284354699284>";
            case "Yasuo" -> emoji = "<:Yasuo:888555327367299082>";
            case "Yone" -> emoji = "<:Yone:888555370220519445>";
            case "Yorick" -> emoji = "<:Yorick:888555413837062176>";
            case "Yuumi" -> emoji = "<:Yuumi:888555457382318150>";
            case "Zac" -> emoji = "<:Zac:888555751948316702>";
            case "Zed" -> emoji = "<:Zed:888555795170619394>";
            case "Zeri" -> emoji = "<:Zeri:994813016245813248>";
            case "Ziggs" -> emoji = "<:Ziggs:888555838497751070>";
            case "Zilean" -> emoji = "<:Zilean:888555881267073035>";
            case "Zoe" -> emoji = "<:Zoe:888555924652982282>";
            case "Zyra" -> emoji = "<:Zyra:888555967594250290>";
        }
        return emoji;
    }

    public enum Discord {
        CHECK("<:check_mark:1006378529916719134>"), X("<:x_:1006378538196279386>");

        private final String text;

        Discord(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
}
