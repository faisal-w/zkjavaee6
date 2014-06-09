/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.go.djbc.app;

import java.util.List;

//import com.wirasoft.app.mymavenzkproject1.bean.MyBean;

import javax.inject.Inject;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.ItemRenderer;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

/**
 *
 * @author LENOVO
 */
@VariableResolver(org.zkoss.zkplus.cdi.DelegatingVariableResolver.class)
public class IndexController extends SelectorComposer<Component>{

    @Wire
    Label lblSatu;
    
    @Wire
    Listbox lbData;

    //@WireVariable
    //MyBean myBean;

    @SuppressWarnings("unchecked")
	@Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        //System.out.println("Data terambil : "+getData());
        /*
        lbData.setItemRenderer(new ListitemRenderer<TntSumberHdr>() {
			@Override
			public void render(Listitem item, TntSumberHdr data, int index)
					throws Exception {
				TntSumberHdr itemData = (TntSumberHdr) data;
				new Listcell(index+"").setParent(item);
				new Listcell(itemData.getKdKantor()).setParent(item);
				new Listcell(itemData.getNoPib()).setParent(item);
				new Listcell(itemData.getNegPemasok()).setParent(item);
				item.setValue(data);
			}
		});
        lbData.setModel(new ListModelList(this.getAllData(),true));
        */
    }
    

}