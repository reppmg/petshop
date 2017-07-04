Ext.onReady(function () {

    Ext.BLANK_IMAGE_URL = '/resources/ext-3.1.1/resources/images/default/s.gif';

    var Master = Ext.data.Record.create([
        {name: 'id'},
        {
            name: 'name',
            type: 'string'
        }, {
            name: 'phone',
            type: 'string'
        }, {
            name: 'mail',
            type: 'string'
        }]);

    var Pet = Ext.data.Record.create([
        {name: 'id'},
        {
            name: 'birthdate',
            type: 'string'
        },
        {
            name: 'pet_name',
            type: 'string'
        },
        {
            name: 'pet_type',
            type: 'string'
        },
        {
            name: 'master_name',
            type: 'string'
        },
        {
            name: 'phone',
            type: 'string'
        },
        {
            name: 'mail',
            type: 'string'
        }
    ]);

    var masterProxy = new Ext.data.HttpProxy({
        api: {
            read: 'masters'
        }
    });

    var petProxy = new Ext.data.HttpProxy({
        api: {
            read: 'pets'
        }
    });


    var masterReader = new Ext.data.JsonReader({
            totalProperty: 'total',
            successProperty: 'success',
            idProperty: 'id',
            root: 'data',
            messageProperty: 'message'  // <-- New "messageProperty" meta-data
        },
        Master);

    var petReader = new Ext.data.JsonReader({
            totalProperty: 'total',
            successProperty: 'success',
            idProperty: 'id',
            root: 'data',
            messageProperty: 'message'  // <-- New "messageProperty" meta-data
        },
        Pet);

    // Typical Store collecting the Proxy, Reader and Writer together.
    var masterStore = new Ext.data.Store({
        id: 'master',
        proxy: masterProxy,
        reader: masterReader,
        autoSave: false // <-- false would delay executing create, update, destroy requests until specifically told to do so with some [save] buton.
    });
    var petStore = new Ext.data.Store({
        id: 'master',
        proxy: petProxy,
        reader: petReader,
        autoSave: false // <-- false would delay executing create, update, destroy requests until specifically told to do so with some [save] buton.
    });

    //read the data from simple array
    masterStore.load();
    petStore.load();

    Ext.data.DataProxy.addListener('exception', function (proxy, type, action, options, res) {
        Ext.Msg.show({
            title: 'ERROR',
            msg: res.message,
            icon: Ext.MessageBox.ERROR,
            buttons: Ext.Msg.OK
        });
    });


    var editor = new Ext.ux.grid.RowEditor({
        saveText: 'Update'
    });


    // create grid
    var grid = new Ext.grid.GridPanel({
        store: masterStore,
        columns: [
            {
                header: "NAME",
                width: 170,
                sortable: true,
                dataIndex: 'name',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            },
            {
                header: "PHONE #",
                width: 150,
                sortable: true,
                dataIndex: 'phone',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            },
            {
                header: "MAIL",
                width: 150,
                sortable: true,
                dataIndex: 'mail',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            }
        ],
        title: 'Masters',
        height: 300,
        width: 610,
        frame: true
    });


    // create grid
    var petGrid = new Ext.grid.GridPanel({
        store: petStore,
        columns: [
            {
                header: "NAME",
                width: 70,
                sortable: true,
                dataIndex: 'pet_name',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            },
            {
                header: "TYPE",
                width: 50,
                sortable: true,
                dataIndex: 'pet_type',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            },
            {
                header: "BIRTHDATE",
                width: 100,
                sortable: true,
                dataIndex: 'birthdate',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            },
            {
                header: "MASTER",
                width: 100,
                sortable: true,
                dataIndex: 'master_name',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            },
            {
                header: "Master's phone",
                width: 100,
                sortable: true,
                dataIndex: 'phone',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            },
            {
                header: "Master's mail",
                width: 150,
                sortable: true,
                dataIndex: 'mail',
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            }
        ],
        title: 'Pets',
        height: 300,
        width: 610,
        frame: true
    });

    //render to DIV
    grid.render('crud-grid');
    petGrid.render('pet-grid');
});