# PayPayDemo
Show two ways to parse data from Gson.(reflection && AdapterType for gson builder.
Implement newest technical such as Navigation( include two fragments), LiveData, VIewModel
Database: Room, because for quick setup, I just save Exchange Rates with converter type.
Structure such as BaseFragment, BaseViewModel…
Network: Retrofit2+ RxJava2
View: using ConstrainLayout 
Schedule 30’: WorkerManager
Loading data: load and observer data change from Database, and any event update data will auto bind to view. 
In this case, WorkerManager is auto call after 30 minutes and update to DB,
and view will auto change. 
Your link: https://currencylayer.com/ limit my account for the query that changed source base
(default is USD and not allow other currency ), so when you select new currency, 
I’m just update title and notify with this selected currency, but the real loading is for USD.
All code is write in Kotlin language.
