package pages;

import Suporte.CliqueCommands;
import maps.ContextMenuMaps;

public class ContextMenuPage {

        ContextMenuMaps contextMenuMaps = new ContextMenuMaps();

        public void clicarComBotaoDireitoBox(){
            CliqueCommands.cliqueBotaoDireito(contextMenuMaps.boxContext);
        }


}
