namespace lojaInfoT1Noite
{
    partial class frmProdutosPorCategoria
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmProdutosPorCategoria));
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            this.tblCategoriaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.tblCategoriaBindingNavigator = new System.Windows.Forms.BindingNavigator(this.components);
            this.bindingNavigatorAddNewItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorCountItem = new System.Windows.Forms.ToolStripLabel();
            this.bindingNavigatorDeleteItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMoveFirstItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMovePreviousItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorSeparator = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorPositionItem = new System.Windows.Forms.ToolStripTextBox();
            this.bindingNavigatorSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorMoveNextItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMoveLastItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.tblCategoriaBindingNavigatorSaveItem = new System.Windows.Forms.ToolStripButton();
            this.tblProdutoBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.tblProdutoDataGridView = new System.Windows.Forms.DataGridView();
            this.label1 = new System.Windows.Forms.Label();
            this.cmbConsultaCategoria = new System.Windows.Forms.ComboBox();
            this.tblCategoriaBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.btnConsultar = new System.Windows.Forms.Button();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.tblCategoriaBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblCategoriaBindingNavigator)).BeginInit();
            this.tblCategoriaBindingNavigator.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.tblProdutoBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblProdutoDataGridView)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblCategoriaBindingSource1)).BeginInit();
            this.SuspendLayout();
            // 
            // tblCategoriaBindingSource
            // 
            this.tblCategoriaBindingSource.DataSource = typeof(info.DAL.tblCategoria);
            // 
            // tblCategoriaBindingNavigator
            // 
            this.tblCategoriaBindingNavigator.AddNewItem = this.bindingNavigatorAddNewItem;
            this.tblCategoriaBindingNavigator.BindingSource = this.tblCategoriaBindingSource;
            this.tblCategoriaBindingNavigator.CountItem = this.bindingNavigatorCountItem;
            this.tblCategoriaBindingNavigator.DeleteItem = this.bindingNavigatorDeleteItem;
            this.tblCategoriaBindingNavigator.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.bindingNavigatorMoveFirstItem,
            this.bindingNavigatorMovePreviousItem,
            this.bindingNavigatorSeparator,
            this.bindingNavigatorPositionItem,
            this.bindingNavigatorCountItem,
            this.bindingNavigatorSeparator1,
            this.bindingNavigatorMoveNextItem,
            this.bindingNavigatorMoveLastItem,
            this.bindingNavigatorSeparator2,
            this.bindingNavigatorAddNewItem,
            this.bindingNavigatorDeleteItem,
            this.tblCategoriaBindingNavigatorSaveItem});
            this.tblCategoriaBindingNavigator.Location = new System.Drawing.Point(0, 0);
            this.tblCategoriaBindingNavigator.MoveFirstItem = this.bindingNavigatorMoveFirstItem;
            this.tblCategoriaBindingNavigator.MoveLastItem = this.bindingNavigatorMoveLastItem;
            this.tblCategoriaBindingNavigator.MoveNextItem = this.bindingNavigatorMoveNextItem;
            this.tblCategoriaBindingNavigator.MovePreviousItem = this.bindingNavigatorMovePreviousItem;
            this.tblCategoriaBindingNavigator.Name = "tblCategoriaBindingNavigator";
            this.tblCategoriaBindingNavigator.PositionItem = this.bindingNavigatorPositionItem;
            this.tblCategoriaBindingNavigator.Size = new System.Drawing.Size(653, 25);
            this.tblCategoriaBindingNavigator.TabIndex = 0;
            this.tblCategoriaBindingNavigator.Text = "bindingNavigator1";
            // 
            // bindingNavigatorAddNewItem
            // 
            this.bindingNavigatorAddNewItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorAddNewItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorAddNewItem.Image")));
            this.bindingNavigatorAddNewItem.Name = "bindingNavigatorAddNewItem";
            this.bindingNavigatorAddNewItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorAddNewItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorAddNewItem.Text = "Add new";
            // 
            // bindingNavigatorCountItem
            // 
            this.bindingNavigatorCountItem.Name = "bindingNavigatorCountItem";
            this.bindingNavigatorCountItem.Size = new System.Drawing.Size(35, 22);
            this.bindingNavigatorCountItem.Text = "of {0}";
            this.bindingNavigatorCountItem.ToolTipText = "Total number of items";
            // 
            // bindingNavigatorDeleteItem
            // 
            this.bindingNavigatorDeleteItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorDeleteItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorDeleteItem.Image")));
            this.bindingNavigatorDeleteItem.Name = "bindingNavigatorDeleteItem";
            this.bindingNavigatorDeleteItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorDeleteItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorDeleteItem.Text = "Delete";
            // 
            // bindingNavigatorMoveFirstItem
            // 
            this.bindingNavigatorMoveFirstItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveFirstItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveFirstItem.Image")));
            this.bindingNavigatorMoveFirstItem.Name = "bindingNavigatorMoveFirstItem";
            this.bindingNavigatorMoveFirstItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveFirstItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveFirstItem.Text = "Move first";
            // 
            // bindingNavigatorMovePreviousItem
            // 
            this.bindingNavigatorMovePreviousItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMovePreviousItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMovePreviousItem.Image")));
            this.bindingNavigatorMovePreviousItem.Name = "bindingNavigatorMovePreviousItem";
            this.bindingNavigatorMovePreviousItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMovePreviousItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMovePreviousItem.Text = "Move previous";
            // 
            // bindingNavigatorSeparator
            // 
            this.bindingNavigatorSeparator.Name = "bindingNavigatorSeparator";
            this.bindingNavigatorSeparator.Size = new System.Drawing.Size(6, 25);
            // 
            // bindingNavigatorPositionItem
            // 
            this.bindingNavigatorPositionItem.AccessibleName = "Position";
            this.bindingNavigatorPositionItem.AutoSize = false;
            this.bindingNavigatorPositionItem.Name = "bindingNavigatorPositionItem";
            this.bindingNavigatorPositionItem.Size = new System.Drawing.Size(50, 23);
            this.bindingNavigatorPositionItem.Text = "0";
            this.bindingNavigatorPositionItem.ToolTipText = "Current position";
            // 
            // bindingNavigatorSeparator1
            // 
            this.bindingNavigatorSeparator1.Name = "bindingNavigatorSeparator1";
            this.bindingNavigatorSeparator1.Size = new System.Drawing.Size(6, 25);
            // 
            // bindingNavigatorMoveNextItem
            // 
            this.bindingNavigatorMoveNextItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveNextItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveNextItem.Image")));
            this.bindingNavigatorMoveNextItem.Name = "bindingNavigatorMoveNextItem";
            this.bindingNavigatorMoveNextItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveNextItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveNextItem.Text = "Move next";
            // 
            // bindingNavigatorMoveLastItem
            // 
            this.bindingNavigatorMoveLastItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveLastItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveLastItem.Image")));
            this.bindingNavigatorMoveLastItem.Name = "bindingNavigatorMoveLastItem";
            this.bindingNavigatorMoveLastItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveLastItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveLastItem.Text = "Move last";
            // 
            // bindingNavigatorSeparator2
            // 
            this.bindingNavigatorSeparator2.Name = "bindingNavigatorSeparator2";
            this.bindingNavigatorSeparator2.Size = new System.Drawing.Size(6, 25);
            // 
            // tblCategoriaBindingNavigatorSaveItem
            // 
            this.tblCategoriaBindingNavigatorSaveItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.tblCategoriaBindingNavigatorSaveItem.Enabled = false;
            this.tblCategoriaBindingNavigatorSaveItem.Image = ((System.Drawing.Image)(resources.GetObject("tblCategoriaBindingNavigatorSaveItem.Image")));
            this.tblCategoriaBindingNavigatorSaveItem.Name = "tblCategoriaBindingNavigatorSaveItem";
            this.tblCategoriaBindingNavigatorSaveItem.Size = new System.Drawing.Size(23, 22);
            this.tblCategoriaBindingNavigatorSaveItem.Text = "Save Data";
            // 
            // tblProdutoBindingSource
            // 
            this.tblProdutoBindingSource.DataSource = typeof(info.DAL.tblProduto);
            // 
            // tblProdutoDataGridView
            // 
            this.tblProdutoDataGridView.AllowUserToAddRows = false;
            this.tblProdutoDataGridView.AllowUserToDeleteRows = false;
            this.tblProdutoDataGridView.AutoGenerateColumns = false;
            this.tblProdutoDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tblProdutoDataGridView.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn1,
            this.dataGridViewTextBoxColumn2,
            this.dataGridViewTextBoxColumn3});
            this.tblProdutoDataGridView.DataSource = this.tblProdutoBindingSource;
            this.tblProdutoDataGridView.Location = new System.Drawing.Point(38, 156);
            this.tblProdutoDataGridView.Name = "tblProdutoDataGridView";
            this.tblProdutoDataGridView.ReadOnly = true;
            this.tblProdutoDataGridView.Size = new System.Drawing.Size(603, 220);
            this.tblProdutoDataGridView.TabIndex = 1;
            this.tblProdutoDataGridView.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tblProdutoDataGridView_CellContentClick);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(38, 52);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(158, 13);
            this.label1.TabIndex = 2;
            this.label1.Text = "Consulta produtos por Categoria";
            // 
            // cmbConsultaCategoria
            // 
            this.cmbConsultaCategoria.DataSource = this.tblCategoriaBindingSource1;
            this.cmbConsultaCategoria.DisplayMember = "NomeCategoria";
            this.cmbConsultaCategoria.FormattingEnabled = true;
            this.cmbConsultaCategoria.Location = new System.Drawing.Point(214, 52);
            this.cmbConsultaCategoria.Name = "cmbConsultaCategoria";
            this.cmbConsultaCategoria.Size = new System.Drawing.Size(209, 21);
            this.cmbConsultaCategoria.TabIndex = 3;
            this.cmbConsultaCategoria.ValueMember = "codigoCategoria";
            // 
            // tblCategoriaBindingSource1
            // 
            this.tblCategoriaBindingSource1.DataSource = typeof(info.DAL.tblCategoria);
            // 
            // btnConsultar
            // 
            this.btnConsultar.Location = new System.Drawing.Point(429, 52);
            this.btnConsultar.Name = "btnConsultar";
            this.btnConsultar.Size = new System.Drawing.Size(75, 23);
            this.btnConsultar.TabIndex = 4;
            this.btnConsultar.Text = "&Consultar";
            this.btnConsultar.UseVisualStyleBackColor = true;
            this.btnConsultar.Click += new System.EventHandler(this.btnConsultar_Click);
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "CodigoProduto";
            this.dataGridViewTextBoxColumn1.HeaderText = "CodigoProduto";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            this.dataGridViewTextBoxColumn1.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.DataPropertyName = "NomeProduto";
            this.dataGridViewTextBoxColumn2.HeaderText = "NomeProduto";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            this.dataGridViewTextBoxColumn2.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.DataPropertyName = "valorProduto";
            dataGridViewCellStyle1.Format = "C2";
            dataGridViewCellStyle1.NullValue = null;
            this.dataGridViewTextBoxColumn3.DefaultCellStyle = dataGridViewCellStyle1;
            this.dataGridViewTextBoxColumn3.HeaderText = "valorProduto";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
            this.dataGridViewTextBoxColumn3.ReadOnly = true;
            // 
            // frmProdutosPorCategoria
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(653, 396);
            this.Controls.Add(this.btnConsultar);
            this.Controls.Add(this.cmbConsultaCategoria);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.tblProdutoDataGridView);
            this.Controls.Add(this.tblCategoriaBindingNavigator);
            this.Name = "frmProdutosPorCategoria";
            this.Text = "frmProdutosPorCategoria";
            this.FormClosed += new System.Windows.Forms.FormClosedEventHandler(this.frmProdutosPorCategoria_FormClosed);
            this.Load += new System.EventHandler(this.frmProdutosPorCategoria_Load);
            ((System.ComponentModel.ISupportInitialize)(this.tblCategoriaBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblCategoriaBindingNavigator)).EndInit();
            this.tblCategoriaBindingNavigator.ResumeLayout(false);
            this.tblCategoriaBindingNavigator.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.tblProdutoBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblProdutoDataGridView)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblCategoriaBindingSource1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.BindingSource tblCategoriaBindingSource;
        private System.Windows.Forms.BindingNavigator tblCategoriaBindingNavigator;
        private System.Windows.Forms.ToolStripButton bindingNavigatorAddNewItem;
        private System.Windows.Forms.ToolStripLabel bindingNavigatorCountItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorDeleteItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveFirstItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMovePreviousItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator;
        private System.Windows.Forms.ToolStripTextBox bindingNavigatorPositionItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator1;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveNextItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveLastItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator2;
        private System.Windows.Forms.ToolStripButton tblCategoriaBindingNavigatorSaveItem;
        private System.Windows.Forms.BindingSource tblProdutoBindingSource;
        private System.Windows.Forms.DataGridView tblProdutoDataGridView;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox cmbConsultaCategoria;
        private System.Windows.Forms.BindingSource tblCategoriaBindingSource1;
        private System.Windows.Forms.Button btnConsultar;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
    }
}