namespace lojaInfoT1Noite
{
    partial class frmVendas
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
            System.Windows.Forms.Label cmbClientes;
            System.Windows.Forms.Label codigoVendaLabel;
            System.Windows.Forms.Label fKCodigoprodutoLabel;
            System.Windows.Forms.Label quantidadeLabel;
            System.Windows.Forms.Label valorItemVendaLabel;
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmVendas));
            this.tb_vendaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.fKCodigoPessoaComboBox = new System.Windows.Forms.ComboBox();
            this.tb_vendaBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.tblpessoaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.btnNovaVenda = new System.Windows.Forms.Button();
            this.grbNovaVenda = new System.Windows.Forms.GroupBox();
            this.txtCodigoVenda = new System.Windows.Forms.TextBox();
            this.tb_itens_vendaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.txtCodigoProduto = new System.Windows.Forms.TextBox();
            this.txtQuantidade = new System.Windows.Forms.TextBox();
            this.txtValorItemVenda = new System.Windows.Forms.TextBox();
            this.dgvItemVenda = new System.Windows.Forms.DataGridView();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn5 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn6 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn7 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            cmbClientes = new System.Windows.Forms.Label();
            codigoVendaLabel = new System.Windows.Forms.Label();
            fKCodigoprodutoLabel = new System.Windows.Forms.Label();
            quantidadeLabel = new System.Windows.Forms.Label();
            valorItemVendaLabel = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.tb_vendaBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tb_vendaBindingSource1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblpessoaBindingSource)).BeginInit();
            this.grbNovaVenda.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.tb_itens_vendaBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dgvItemVenda)).BeginInit();
            this.SuspendLayout();
            // 
            // cmbClientes
            // 
            cmbClientes.AutoSize = true;
            cmbClientes.Location = new System.Drawing.Point(55, 30);
            cmbClientes.Name = "cmbClientes";
            cmbClientes.Size = new System.Drawing.Size(44, 13);
            cmbClientes.TabIndex = 1;
            cmbClientes.Text = "Clientes";
            // 
            // tb_vendaBindingSource
            // 
            this.tb_vendaBindingSource.DataSource = typeof(info.DAL.tb_venda);
            // 
            // fKCodigoPessoaComboBox
            // 
            this.fKCodigoPessoaComboBox.DataBindings.Add(new System.Windows.Forms.Binding("SelectedValue", this.tb_vendaBindingSource, "FKCodigoPessoa", true));
            this.fKCodigoPessoaComboBox.DataSource = this.tb_vendaBindingSource1;
            this.fKCodigoPessoaComboBox.DisplayMember = "CodigoVenda";
            this.fKCodigoPessoaComboBox.FormattingEnabled = true;
            this.fKCodigoPessoaComboBox.Location = new System.Drawing.Point(110, 27);
            this.fKCodigoPessoaComboBox.Name = "fKCodigoPessoaComboBox";
            this.fKCodigoPessoaComboBox.Size = new System.Drawing.Size(121, 21);
            this.fKCodigoPessoaComboBox.TabIndex = 2;
            this.fKCodigoPessoaComboBox.ValueMember = "CodigoVenda";
            // 
            // tb_vendaBindingSource1
            // 
            this.tb_vendaBindingSource1.DataSource = typeof(info.DAL.tb_venda);
            // 
            // tblpessoaBindingSource
            // 
            this.tblpessoaBindingSource.DataSource = typeof(info.DAL.tblpessoa);
            // 
            // btnNovaVenda
            // 
            this.btnNovaVenda.Location = new System.Drawing.Point(274, 25);
            this.btnNovaVenda.Name = "btnNovaVenda";
            this.btnNovaVenda.Size = new System.Drawing.Size(75, 23);
            this.btnNovaVenda.TabIndex = 3;
            this.btnNovaVenda.Text = "&Nova Venda";
            this.btnNovaVenda.UseVisualStyleBackColor = true;
            // 
            // grbNovaVenda
            // 
            this.grbNovaVenda.Controls.Add(this.dgvItemVenda);
            this.grbNovaVenda.Controls.Add(valorItemVendaLabel);
            this.grbNovaVenda.Controls.Add(this.txtValorItemVenda);
            this.grbNovaVenda.Controls.Add(quantidadeLabel);
            this.grbNovaVenda.Controls.Add(this.txtQuantidade);
            this.grbNovaVenda.Controls.Add(fKCodigoprodutoLabel);
            this.grbNovaVenda.Controls.Add(this.txtCodigoProduto);
            this.grbNovaVenda.Controls.Add(codigoVendaLabel);
            this.grbNovaVenda.Controls.Add(this.txtCodigoVenda);
            this.grbNovaVenda.Location = new System.Drawing.Point(25, 107);
            this.grbNovaVenda.Name = "grbNovaVenda";
            this.grbNovaVenda.Size = new System.Drawing.Size(781, 385);
            this.grbNovaVenda.TabIndex = 4;
            this.grbNovaVenda.TabStop = false;
            this.grbNovaVenda.Text = "Nova Venda";
            // 
            // codigoVendaLabel
            // 
            codigoVendaLabel.AutoSize = true;
            codigoVendaLabel.Location = new System.Drawing.Point(19, 33);
            codigoVendaLabel.Name = "codigoVendaLabel";
            codigoVendaLabel.Size = new System.Drawing.Size(77, 13);
            codigoVendaLabel.TabIndex = 0;
            codigoVendaLabel.Text = "Codigo Venda:";
            // 
            // txtCodigoVenda
            // 
            this.txtCodigoVenda.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tb_vendaBindingSource, "CodigoVenda", true));
            this.txtCodigoVenda.Location = new System.Drawing.Point(102, 30);
            this.txtCodigoVenda.Name = "txtCodigoVenda";
            this.txtCodigoVenda.Size = new System.Drawing.Size(100, 20);
            this.txtCodigoVenda.TabIndex = 1;
            // 
            // tb_itens_vendaBindingSource
            // 
            this.tb_itens_vendaBindingSource.DataSource = typeof(info.DAL.tb_itens_venda);
            // 
            // fKCodigoprodutoLabel
            // 
            fKCodigoprodutoLabel.AutoSize = true;
            fKCodigoprodutoLabel.Location = new System.Drawing.Point(4, 59);
            fKCodigoprodutoLabel.Name = "fKCodigoprodutoLabel";
            fKCodigoprodutoLabel.Size = new System.Drawing.Size(92, 13);
            fKCodigoprodutoLabel.TabIndex = 2;
            fKCodigoprodutoLabel.Text = "FKCodigoproduto:";
            // 
            // txtCodigoProduto
            // 
            this.txtCodigoProduto.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tb_itens_vendaBindingSource, "FKCodigoproduto", true));
            this.txtCodigoProduto.Location = new System.Drawing.Point(102, 56);
            this.txtCodigoProduto.Name = "txtCodigoProduto";
            this.txtCodigoProduto.Size = new System.Drawing.Size(100, 20);
            this.txtCodigoProduto.TabIndex = 3;
            // 
            // quantidadeLabel
            // 
            quantidadeLabel.AutoSize = true;
            quantidadeLabel.Location = new System.Drawing.Point(31, 85);
            quantidadeLabel.Name = "quantidadeLabel";
            quantidadeLabel.Size = new System.Drawing.Size(65, 13);
            quantidadeLabel.TabIndex = 4;
            quantidadeLabel.Text = "Quantidade:";
            // 
            // txtQuantidade
            // 
            this.txtQuantidade.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tb_itens_vendaBindingSource, "Quantidade", true));
            this.txtQuantidade.Location = new System.Drawing.Point(102, 82);
            this.txtQuantidade.Name = "txtQuantidade";
            this.txtQuantidade.Size = new System.Drawing.Size(100, 20);
            this.txtQuantidade.TabIndex = 5;
            // 
            // valorItemVendaLabel
            // 
            valorItemVendaLabel.AutoSize = true;
            valorItemVendaLabel.Location = new System.Drawing.Point(5, 111);
            valorItemVendaLabel.Name = "valorItemVendaLabel";
            valorItemVendaLabel.Size = new System.Drawing.Size(91, 13);
            valorItemVendaLabel.TabIndex = 6;
            valorItemVendaLabel.Text = "Valor Item Venda:";
            // 
            // txtValorItemVenda
            // 
            this.txtValorItemVenda.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tb_itens_vendaBindingSource, "ValorItemVenda", true));
            this.txtValorItemVenda.Location = new System.Drawing.Point(102, 108);
            this.txtValorItemVenda.Name = "txtValorItemVenda";
            this.txtValorItemVenda.Size = new System.Drawing.Size(100, 20);
            this.txtValorItemVenda.TabIndex = 7;
            // 
            // dgvItemVenda
            // 
            this.dgvItemVenda.AutoGenerateColumns = false;
            this.dgvItemVenda.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvItemVenda.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn1,
            this.dataGridViewTextBoxColumn2,
            this.dataGridViewTextBoxColumn3,
            this.dataGridViewTextBoxColumn4,
            this.dataGridViewTextBoxColumn5,
            this.dataGridViewTextBoxColumn6,
            this.dataGridViewTextBoxColumn7});
            this.dgvItemVenda.DataSource = this.tb_itens_vendaBindingSource;
            this.dgvItemVenda.Location = new System.Drawing.Point(8, 137);
            this.dgvItemVenda.Name = "dgvItemVenda";
            this.dgvItemVenda.Size = new System.Drawing.Size(752, 220);
            this.dgvItemVenda.TabIndex = 8;
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "Quantidade";
            this.dataGridViewTextBoxColumn1.HeaderText = "Quantidade";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.DataPropertyName = "FKCodigoproduto";
            this.dataGridViewTextBoxColumn2.HeaderText = "FKCodigoproduto";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.DataPropertyName = "FKCodigovenda";
            this.dataGridViewTextBoxColumn3.HeaderText = "FKCodigovenda";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
            // 
            // dataGridViewTextBoxColumn4
            // 
            this.dataGridViewTextBoxColumn4.DataPropertyName = "ValorItemVenda";
            this.dataGridViewTextBoxColumn4.HeaderText = "ValorItemVenda";
            this.dataGridViewTextBoxColumn4.Name = "dataGridViewTextBoxColumn4";
            // 
            // dataGridViewTextBoxColumn5
            // 
            this.dataGridViewTextBoxColumn5.DataPropertyName = "CodigoitemVenda";
            this.dataGridViewTextBoxColumn5.HeaderText = "CodigoitemVenda";
            this.dataGridViewTextBoxColumn5.Name = "dataGridViewTextBoxColumn5";
            // 
            // dataGridViewTextBoxColumn6
            // 
            this.dataGridViewTextBoxColumn6.DataPropertyName = "tblProduto";
            this.dataGridViewTextBoxColumn6.HeaderText = "tblProduto";
            this.dataGridViewTextBoxColumn6.Name = "dataGridViewTextBoxColumn6";
            // 
            // dataGridViewTextBoxColumn7
            // 
            this.dataGridViewTextBoxColumn7.DataPropertyName = "tb_venda";
            this.dataGridViewTextBoxColumn7.HeaderText = "tb_venda";
            this.dataGridViewTextBoxColumn7.Name = "dataGridViewTextBoxColumn7";
            // 
            // frmVendas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(828, 548);
            this.Controls.Add(this.grbNovaVenda);
            this.Controls.Add(this.btnNovaVenda);
            this.Controls.Add(cmbClientes);
            this.Controls.Add(this.fKCodigoPessoaComboBox);
            this.Name = "frmVendas";
            this.Text = "frmVendas";
            this.FormClosed += new System.Windows.Forms.FormClosedEventHandler(this.frmVendas_FormClosed);
            this.Load += new System.EventHandler(this.frmVendas_Load);
            ((System.ComponentModel.ISupportInitialize)(this.tb_vendaBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tb_vendaBindingSource1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblpessoaBindingSource)).EndInit();
            this.grbNovaVenda.ResumeLayout(false);
            this.grbNovaVenda.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.tb_itens_vendaBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dgvItemVenda)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.BindingSource tb_vendaBindingSource;
        private System.Windows.Forms.ComboBox fKCodigoPessoaComboBox;
        private System.Windows.Forms.BindingSource tb_vendaBindingSource1;
        private System.Windows.Forms.BindingSource tblpessoaBindingSource;
        private System.Windows.Forms.Button btnNovaVenda;
        private System.Windows.Forms.GroupBox grbNovaVenda;
        private System.Windows.Forms.DataGridView dgvItemVenda;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn5;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn6;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn7;
        private System.Windows.Forms.BindingSource tb_itens_vendaBindingSource;
        private System.Windows.Forms.TextBox txtValorItemVenda;
        private System.Windows.Forms.TextBox txtQuantidade;
        private System.Windows.Forms.TextBox txtCodigoProduto;
        private System.Windows.Forms.TextBox txtCodigoVenda;
    }
}