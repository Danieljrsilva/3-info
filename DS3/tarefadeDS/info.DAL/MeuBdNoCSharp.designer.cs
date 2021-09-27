﻿#pragma warning disable 1591
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace info.DAL
{
	using System.Data.Linq;
	using System.Data.Linq.Mapping;
	using System.Data;
	using System.Collections.Generic;
	using System.Reflection;
	using System.Linq;
	using System.Linq.Expressions;
	using System.ComponentModel;
	using System;
	
	
	[global::System.Data.Linq.Mapping.DatabaseAttribute(Name="db_info")]
	public partial class MeuBdNoCSharpDataContext : System.Data.Linq.DataContext
	{
		
		private static System.Data.Linq.Mapping.MappingSource mappingSource = new AttributeMappingSource();
		
    #region Extensibility Method Definitions
    partial void OnCreated();
    partial void Inserttb_categoria(tb_categoria instance);
    partial void Updatetb_categoria(tb_categoria instance);
    partial void Deletetb_categoria(tb_categoria instance);
    partial void Inserttb_produto(tb_produto instance);
    partial void Updatetb_produto(tb_produto instance);
    partial void Deletetb_produto(tb_produto instance);
    #endregion
		
		public MeuBdNoCSharpDataContext() : 
				base(global::info.DAL.Properties.Settings.Default.db_infoConnectionString, mappingSource)
		{
			OnCreated();
		}
		
		public MeuBdNoCSharpDataContext(string connection) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public MeuBdNoCSharpDataContext(System.Data.IDbConnection connection) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public MeuBdNoCSharpDataContext(string connection, System.Data.Linq.Mapping.MappingSource mappingSource) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public MeuBdNoCSharpDataContext(System.Data.IDbConnection connection, System.Data.Linq.Mapping.MappingSource mappingSource) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public System.Data.Linq.Table<tb_categoria> tb_categorias
		{
			get
			{
				return this.GetTable<tb_categoria>();
			}
		}
		
		public System.Data.Linq.Table<tb_produto> tb_produtos
		{
			get
			{
				return this.GetTable<tb_produto>();
			}
		}
	}
	
	[global::System.Data.Linq.Mapping.TableAttribute(Name="dbo.tb_categoria")]
	public partial class tb_categoria : INotifyPropertyChanging, INotifyPropertyChanged
	{
		
		private static PropertyChangingEventArgs emptyChangingEventArgs = new PropertyChangingEventArgs(String.Empty);
		
		private int _ID_categoria;
		
		private string _ds_categoria;
		
		private EntitySet<tb_produto> _tb_produtos;
		
    #region Extensibility Method Definitions
    partial void OnLoaded();
    partial void OnValidate(System.Data.Linq.ChangeAction action);
    partial void OnCreated();
    partial void OnID_categoriaChanging(int value);
    partial void OnID_categoriaChanged();
    partial void Onds_categoriaChanging(string value);
    partial void Onds_categoriaChanged();
    #endregion
		
		public tb_categoria()
		{
			this._tb_produtos = new EntitySet<tb_produto>(new Action<tb_produto>(this.attach_tb_produtos), new Action<tb_produto>(this.detach_tb_produtos));
			OnCreated();
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_ID_categoria", DbType="Int NOT NULL", IsPrimaryKey=true)]
		public int ID_categoria
		{
			get
			{
				return this._ID_categoria;
			}
			set
			{
				if ((this._ID_categoria != value))
				{
					this.OnID_categoriaChanging(value);
					this.SendPropertyChanging();
					this._ID_categoria = value;
					this.SendPropertyChanged("ID_categoria");
					this.OnID_categoriaChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_ds_categoria", DbType="NChar(50)")]
		public string ds_categoria
		{
			get
			{
				return this._ds_categoria;
			}
			set
			{
				if ((this._ds_categoria != value))
				{
					this.Onds_categoriaChanging(value);
					this.SendPropertyChanging();
					this._ds_categoria = value;
					this.SendPropertyChanged("ds_categoria");
					this.Onds_categoriaChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.AssociationAttribute(Name="tb_categoria_tb_produto", Storage="_tb_produtos", ThisKey="ID_categoria", OtherKey="id_categoria")]
		public EntitySet<tb_produto> tb_produtos
		{
			get
			{
				return this._tb_produtos;
			}
			set
			{
				this._tb_produtos.Assign(value);
			}
		}
		
		public event PropertyChangingEventHandler PropertyChanging;
		
		public event PropertyChangedEventHandler PropertyChanged;
		
		protected virtual void SendPropertyChanging()
		{
			if ((this.PropertyChanging != null))
			{
				this.PropertyChanging(this, emptyChangingEventArgs);
			}
		}
		
		protected virtual void SendPropertyChanged(String propertyName)
		{
			if ((this.PropertyChanged != null))
			{
				this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
			}
		}
		
		private void attach_tb_produtos(tb_produto entity)
		{
			this.SendPropertyChanging();
			entity.tb_categoria = this;
		}
		
		private void detach_tb_produtos(tb_produto entity)
		{
			this.SendPropertyChanging();
			entity.tb_categoria = null;
		}
	}
	
	[global::System.Data.Linq.Mapping.TableAttribute(Name="dbo.tb_produto")]
	public partial class tb_produto : INotifyPropertyChanging, INotifyPropertyChanged
	{
		
		private static PropertyChangingEventArgs emptyChangingEventArgs = new PropertyChangingEventArgs(String.Empty);
		
		private int _Id_produto;
		
		private string _ds_produto;
		
		private System.Nullable<decimal> _valor;
		
		private System.Nullable<int> _id_categoria;
		
		private EntityRef<tb_categoria> _tb_categoria;
		
    #region Extensibility Method Definitions
    partial void OnLoaded();
    partial void OnValidate(System.Data.Linq.ChangeAction action);
    partial void OnCreated();
    partial void OnId_produtoChanging(int value);
    partial void OnId_produtoChanged();
    partial void Onds_produtoChanging(string value);
    partial void Onds_produtoChanged();
    partial void OnvalorChanging(System.Nullable<decimal> value);
    partial void OnvalorChanged();
    partial void Onid_categoriaChanging(System.Nullable<int> value);
    partial void Onid_categoriaChanged();
    #endregion
		
		public tb_produto()
		{
			this._tb_categoria = default(EntityRef<tb_categoria>);
			OnCreated();
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_Id_produto", DbType="Int NOT NULL", IsPrimaryKey=true)]
		public int Id_produto
		{
			get
			{
				return this._Id_produto;
			}
			set
			{
				if ((this._Id_produto != value))
				{
					this.OnId_produtoChanging(value);
					this.SendPropertyChanging();
					this._Id_produto = value;
					this.SendPropertyChanged("Id_produto");
					this.OnId_produtoChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_ds_produto", DbType="NChar(50)")]
		public string ds_produto
		{
			get
			{
				return this._ds_produto;
			}
			set
			{
				if ((this._ds_produto != value))
				{
					this.Onds_produtoChanging(value);
					this.SendPropertyChanging();
					this._ds_produto = value;
					this.SendPropertyChanged("ds_produto");
					this.Onds_produtoChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_valor", DbType="Decimal(18,0)")]
		public System.Nullable<decimal> valor
		{
			get
			{
				return this._valor;
			}
			set
			{
				if ((this._valor != value))
				{
					this.OnvalorChanging(value);
					this.SendPropertyChanging();
					this._valor = value;
					this.SendPropertyChanged("valor");
					this.OnvalorChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_id_categoria", DbType="Int")]
		public System.Nullable<int> id_categoria
		{
			get
			{
				return this._id_categoria;
			}
			set
			{
				if ((this._id_categoria != value))
				{
					if (this._tb_categoria.HasLoadedOrAssignedValue)
					{
						throw new System.Data.Linq.ForeignKeyReferenceAlreadyHasValueException();
					}
					this.Onid_categoriaChanging(value);
					this.SendPropertyChanging();
					this._id_categoria = value;
					this.SendPropertyChanged("id_categoria");
					this.Onid_categoriaChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.AssociationAttribute(Name="tb_categoria_tb_produto", Storage="_tb_categoria", ThisKey="id_categoria", OtherKey="ID_categoria", IsForeignKey=true)]
		public tb_categoria tb_categoria
		{
			get
			{
				return this._tb_categoria.Entity;
			}
			set
			{
				tb_categoria previousValue = this._tb_categoria.Entity;
				if (((previousValue != value) 
							|| (this._tb_categoria.HasLoadedOrAssignedValue == false)))
				{
					this.SendPropertyChanging();
					if ((previousValue != null))
					{
						this._tb_categoria.Entity = null;
						previousValue.tb_produtos.Remove(this);
					}
					this._tb_categoria.Entity = value;
					if ((value != null))
					{
						value.tb_produtos.Add(this);
						this._id_categoria = value.ID_categoria;
					}
					else
					{
						this._id_categoria = default(Nullable<int>);
					}
					this.SendPropertyChanged("tb_categoria");
				}
			}
		}
		
		public event PropertyChangingEventHandler PropertyChanging;
		
		public event PropertyChangedEventHandler PropertyChanged;
		
		protected virtual void SendPropertyChanging()
		{
			if ((this.PropertyChanging != null))
			{
				this.PropertyChanging(this, emptyChangingEventArgs);
			}
		}
		
		protected virtual void SendPropertyChanged(String propertyName)
		{
			if ((this.PropertyChanged != null))
			{
				this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
			}
		}
	}
}
#pragma warning restore 1591
