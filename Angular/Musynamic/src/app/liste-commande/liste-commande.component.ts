import { Component } from '@angular/core';
import { Ng2SmartTableModule, LocalDataSource } from 'ng2-smart-table';


@Component({
  selector: 'basic-example-data',
  template: `
    <ng2-smart-table [settings]="settings" [source]="data" (custom)="onCustom($event)"></ng2-smart-table>
  `,
})
export class ListeCommandeComponent {

  data = [
    {
      id: 1,
      nom: 'Graham',
      prenom: 'Bret',
      numClient : 11,
      email: 'Sincere@april.biz',
      dateDebut : '2001/01/01',
      dateFin : '2001/01/02',
    },
    {
      id: 2,
      nom: 'Howell',
      prenom: 'Antonette',
      numClient : 12,
      email: 'Shanna@melissa.tv',
      dateDebut : '2001/02/01',
      dateFin : '2001/02/02',
    },
    {
      id: 3,
      nom: 'Bauch',
      prenom: 'Samantha',
      numClient : 13,
      email: 'Nathan@yesenia.net',
      dateDebut : '2002/01/01',
      dateFin : '2002/01/02',
    },
    {
      id: 4,
      nom: 'Lebsack',
      prenom: 'Karianne',
      numClient : 14,
      email: 'Julianne.OConner@kory.org',
      dateDebut : '2002/01/06',
      dateFin : '2002/01/05',
    },
    {
      id: 5,
      nom: 'Dietrich',
      prenom: 'Kamren',
      email: 'Lucio_Hettinger@annie.ca',
    },
    {
      id: 6,
      nom: 'Schulist',
      prenom: 'Leopoldo_Corkery',
      email: 'Karley_Dach@jasper.info',
    },
    {
      id: 7,
      nom: 'Weissnat',
      prenom: 'Elwyn.Skiles',
      email: 'Telly.Hoeger@billy.biz',
    },
    {
      id: 8,
      nom: 'Runolfsdottir V',
      prenom: 'Maxime_Nienow',
      email: 'Sherwood@rosamond.me',
    },
    {
      id: 9,
      nom: 'Reichert',
      prenom: 'Delphine',
      email: 'Chaim_McDermott@dana.io',
    },
    {
      id: 10,
      nom: 'DuBuque',
      prenom: 'Moriah.Stanton',
      email: 'Rey.Padberg@karina.biz',
    },
    {
      id: 11,
      nom: 'DuBuque',
      prenom: 'Nicholas.Stanton',
      email: 'Rey.Padberg@rosamond.biz',
    },
  ];

  settings = {
    actions: {
      custom: [
        {
          name: 'view',
          title: 'View ',
        },
      ],
    },
    columns: {
      id: {
        title: 'ID commande',
        filter: {
          type: 'completer',
          config: {
            completer: {
              data: this.data,
              searchFields: 'id',
              titleField: 'id',
            },
          },
        },
      },
      nom: {
        title: 'Nom',
        filter: {
          type: 'completer',
          config: {
            completer: {
              data: this.data,
              searchFields: 'nom',
              titleField: 'nom',
            },
          },
        },      },
      prenom: {
        title: 'Prénom',
        filter: {
          type: 'completer',
          config: {
            completer: {
              data: this.data,
              searchFields: 'prenom',
              titleField: 'prenom',
            },
          },
        },      },
      numClient: {
        title: 'N° Client',
        filter: {
          type: 'completer',
          config: {
            completer: {
              data: this.data,
              searchFields: 'numClient',
              titleField: 'numClient',
            },
          },
        },      },
      email: {
        title: 'Email',
        filter: {
          type: 'completer',
          config: {
            completer: {
              data: this.data,
              searchFields: 'email',
              titleField: 'email',
            },
          },
        },
      },
      dateDebut: {
        title: 'Date début commande',
        filter: {
          type: 'completer',
          config: {
            completer: {
              data: this.data,
              searchFields: 'dateDebut',
              titleField: 'dateDebut',
            },
          },
        },
      },
      dateFin: {
        title: 'Date fin commande',
        filter: {
          type: 'completer',
          config: {
            completer: {
              data: this.data,
              searchFields: 'dateFin',
              titleField: 'dateFin',
            },
          },
        },      },
    },
  };


  source: LocalDataSource;
  
  constructor() {
    this.source = new LocalDataSource(this.data);
  }

  onSearch(query: string = '') {
    this.source.setFilter([
      // fields we want to include in the search
      {
        field: 'id',
        search: query
      },
      {
        field: 'nom',
        search: query
      },
      {
        field: 'prenom',
        search: query
      },
      {
        field: 'numClient',
        search: query
      },
      {
        field: 'email',
        search: query
      },
      {
        field: 'Date début commande',
        search: query
      },
      {
        field: 'Date fin commande',
        search: query
      },
    ], false);
  }

  onCustom(event) {
    alert(`Custom event '${event.action}' fired on row №: ${event.data.id}`)
  }
}