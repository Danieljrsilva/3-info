namespace lojaInfoT1Noite
{
    partial class frmPessoaFisica
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
            System.Windows.Forms.Label nomePessoaLabel;
            System.Windows.Forms.Label emailPessoaLabel;
            System.Windows.Forms.Label cPF_PFLabel;
            System.Windows.Forms.Label dataNascPFLabel;
            System.Windows.Forms.Label maePFLabel;
            System.Windows.Forms.Label paiPFLabel;
            System.Windows.Forms.Label rG_PFLabel;
            System.Windows.Forms.Label telefonePessoaLabel;
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmPessoaFisica));
            this.tblpessoaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.txtNomePF = new System.Windows.Forms.TextBox();
            this.txtEmailPF = new System.Windows.Forms.TextBox();
            this.txtCPF_PF = new System.Windows.Forms.TextBox();
            this.cmbDataNascPF = new System.Windows.Forms.DateTimePicker();
            this.txtMaePF = new System.Windows.Forms.TextBox();
            this.txtPaiPF = new System.Windows.Forms.TextBox();
            this.txtRGPF = new System.Windows.Forms.TextBox();
            this.dgvPessoafisica = new System.Windows.Forms.DataGridView();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn5 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tblPessoaFisica = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.txtTelefone = new System.Windows.Forms.MaskedTextBox();
            this.btnExcluir = new System.Windows.Forms.Button();
            this.btnCancelar = new System.Windows.Forms.Button();
            this.btnGravar = new System.Windows.Forms.Button();
            this.btnNovo = new System.Windows.Forms.Button();
            nomePessoaLabel = new System.Windows.Forms.Label();
            emailPessoaLabel = new System.Windows.Forms.Label();
            cPF_PFLabel = new System.Windows.Forms.Label();
            dataNascPFLabel = new System.Windows.Forms.Label();
            maePFLabel = new System.Windows.Forms.Label();
            paiPFLabel = new System.Windows.Forms.Label();
            rG_PFLabel = new System.Windows.Forms.Label();
            telefonePessoaLabel = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.tblpessoaBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dgvPessoafisica)).BeginInit();
            this.SuspendLayout();
            // 
            // nomePessoaLabel
            // 
            nomePessoaLabel.AutoSize = true;
            nomePessoaLabel.Location = new System.Drawing.Point(79, 52);
            nomePessoaLabel.Name = "nomePessoaLabel";
            nomePessoaLabel.Size = new System.Drawing.Size(38, 13);
            nomePessoaLabel.TabIndex = 1;
            nomePessoaLabel.Text = "Nome:";
            // 
            // emailPessoaLabel
            // 
            emailPessoaLabel.AutoSize = true;
            emailPessoaLabel.Location = new System.Drawing.Point(79, 96);
            emailPessoaLabel.Name = "emailPessoaLabel";
            emailPessoaLabel.Size = new System.Drawing.Size(35, 13);
            emailPessoaLabel.TabIndex = 2;
            emailPessoaLabel.Text = "Email:";
            // 
            // cPF_PFLabel
            // 
            cPF_PFLabel.AutoSize = true;
            cPF_PFLabel.Location = new System.Drawing.Point(84, 141);
            cPF_PFLabel.Name = "cPF_PFLabel";
            cPF_PFLabel.Size = new System.Drawing.Size(30, 13);
            cPF_PFLabel.TabIndex = 4;
            cPF_PFLabel.Text = "CPF:";
            // 
            // dataNascPFLabel
            // 
            dataNascPFLabel.AutoSize = true;
            dataNascPFLabel.Location = new System.Drawing.Point(48, 177);
            dataNascPFLabel.Name = "dataNascPFLabel";
            dataNascPFLabel.Size = new System.Drawing.Size(66, 13);
            dataNascPFLabel.TabIndex = 6;
            dataNascPFLabel.Text = "Nascimento:";
            // 
            // maePFLabel
            // 
            maePFLabel.AutoSize = true;
            maePFLabel.Location = new System.Drawing.Point(86, 212);
            maePFLabel.Name = "maePFLabel";
            maePFLabel.Size = new System.Drawing.Size(31, 13);
            maePFLabel.TabIndex = 8;
            maePFLabel.Text = "Mae:";
            // 
            // paiPFLabel
            // 
            paiPFLabel.AutoSize = true;
            paiPFLabel.Location = new System.Drawing.Point(89, 257);
            paiPFLabel.Name = "paiPFLabel";
            paiPFLabel.Size = new System.Drawing.Size(25, 13);
            paiPFLabel.TabIndex = 10;
            paiPFLabel.Text = "Pai:";
            // 
            // rG_PFLabel
            // 
            rG_PFLabel.AutoSize = true;
            rG_PFLabel.Location = new System.Drawing.Point(498, 141);
            rG_PFLabel.Name = "rG_PFLabel";
            rG_PFLabel.Size = new System.Drawing.Size(26, 13);
            rG_PFLabel.TabIndex = 12;
            rG_PFLabel.Text = "RG:";
            // 
            // telefonePessoaLabel
            // 
            telefonePessoaLabel.AutoSize = true;
            telefonePessoaLabel.Location = new System.Drawing.Point(595, 171);
            telefonePessoaLabel.Name = "telefonePessoaLabel";
            telefonePessoaLabel.Size = new System.Drawing.Size(52, 13);
            telefonePessoaLabel.TabIndex = 15;
            telefonePessoaLabel.Text = "Telefone:";
            // 
            // tblpessoaBindingSource
            // 
            this.tblpessoaBindingSource.DataSource = typeof(info.DAL.tblpessoa);
            // 
            // txtNomePF
            // 
            this.txtNomePF.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tblpessoaBindingSource, "NomePessoa", true));
            this.txtNomePF.Location = new System.Drawing.Point(123, 49);
            this.txtNomePF.Name = "txtNomePF";
            this.txtNomePF.Size = new System.Drawing.Size(261, 20);
            this.txtNomePF.TabIndex = 2;
            // 
            // txtEmailPF
            // 
            this.txtEmailPF.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tblpessoaBindingSource, "EmailPessoa", true));
            this.txtEmailPF.Location = new System.Drawing.Point(120, 93);
            this.txtEmailPF.Name = "txtEmailPF";
            this.txtEmailPF.Size = new System.Drawing.Size(264, 20);
            this.txtEmailPF.TabIndex = 3;
            // 
            // txtCPF_PF
            // 
            this.txtCPF_PF.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tblpessoaBindingSource, "tblPessoaFisica.CPF_PF", true));
            this.txtCPF_PF.Location = new System.Drawing.Point(120, 138);
            this.txtCPF_PF.Name = "txtCPF_PF";
            this.txtCPF_PF.Size = new System.Drawing.Size(264, 20);
            this.txtCPF_PF.TabIndex = 5;
            // 
            // cmbDataNascPF
            // 
            this.cmbDataNascPF.DataBindings.Add(new System.Windows.Forms.Binding("Value", this.tblpessoaBindingSource, "tblPessoaFisica.DataNascPF", true));
            this.cmbDataNascPF.Location = new System.Drawing.Point(120, 171);
            this.cmbDataNascPF.Name = "cmbDataNascPF";
            this.cmbDataNascPF.Size = new System.Drawing.Size(264, 20);
            this.cmbDataNascPF.TabIndex = 7;
            // 
            // txtMaePF
            // 
            this.txtMaePF.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tblpessoaBindingSource, "tblPessoaFisica.MaePF", true));
            this.txtMaePF.Location = new System.Drawing.Point(123, 209);
            this.txtMaePF.Name = "txtMaePF";
            this.txtMaePF.Size = new System.Drawing.Size(261, 20);
            this.txtMaePF.TabIndex = 9;
            // 
            // txtPaiPF
            // 
            this.txtPaiPF.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tblpessoaBindingSource, "tblPessoaFisica.PaiPF", true));
            this.txtPaiPF.Location = new System.Drawing.Point(120, 254);
            this.txtPaiPF.Name = "txtPaiPF";
            this.txtPaiPF.Size = new System.Drawing.Size(264, 20);
            this.txtPaiPF.TabIndex = 11;
            // 
            // txtRGPF
            // 
            this.txtRGPF.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tblpessoaBindingSource, "tblPessoaFisica.RG_PF", true));
            this.txtRGPF.Location = new System.Drawing.Point(530, 138);
            this.txtRGPF.Name = "txtRGPF";
            this.txtRGPF.Size = new System.Drawing.Size(261, 20);
            this.txtRGPF.TabIndex = 13;
            // 
            // dgvPessoafisica
            // 
            this.dgvPessoafisica.AllowUserToAddRows = false;
            this.dgvPessoafisica.AllowUserToDeleteRows = false;
            this.dgvPessoafisica.AutoGenerateColumns = false;
            this.dgvPessoafisica.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvPessoafisica.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn1,
            this.dataGridViewTextBoxColumn2,
            this.dataGridViewTextBoxColumn3,
            this.dataGridViewTextBoxColumn4,
            this.dataGridViewTextBoxColumn5,
            this.tblPessoaFisica});
            this.dgvPessoafisica.DataSource = this.tblpessoaBindingSource;
            this.dgvPessoafisica.Location = new System.Drawing.Point(147, 338);
            this.dgvPessoafisica.Name = "dgvPessoafisica";
            this.dgvPessoafisica.ReadOnly = true;
            this.dgvPessoafisica.Size = new System.Drawing.Size(733, 220);
            this.dgvPessoafisica.TabIndex = 14;
            this.dgvPessoafisica.CellFormatting += new System.Windows.Forms.DataGridViewCellFormattingEventHandler(this.dgvPessoafisica_CellFormatting);
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "Codigopessoa";
            this.dataGridViewTextBoxColumn1.HeaderText = "Codigo";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            this.dataGridViewTextBoxColumn1.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.DataPropertyName = "NomePessoa";
            this.dataGridViewTextBoxColumn2.HeaderText = "Nome";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            this.dataGridViewTextBoxColumn2.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.DataPropertyName = "TelefonePessoa";
            this.dataGridViewTextBoxColumn3.HeaderText = "Tel.";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
            this.dataGridViewTextBoxColumn3.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn4
            // 
            this.dataGridViewTextBoxColumn4.DataPropertyName = "EmailPessoa";
            this.dataGridViewTextBoxColumn4.HeaderText = "Email";
            this.dataGridViewTextBoxColumn4.Name = "dataGridViewTextBoxColumn4";
            this.dataGridViewTextBoxColumn4.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn5
            // 
            this.dataGridViewTextBoxColumn5.DataPropertyName = "tblPessoaFisica";
            this.dataGridViewTextBoxColumn5.HeaderText = "CPF";
            this.dataGridViewTextBoxColumn5.Name = "dataGridViewTextBoxColumn5";
            this.dataGridViewTextBoxColumn5.ReadOnly = true;
            // 
            // tblPessoaFisica
            // 
            this.tblPessoaFisica.DataPropertyName = "tblPessoaFisica";
            this.tblPessoaFisica.HeaderText = "RG";
            this.tblPessoaFisica.Name = "tblPessoaFisica";
            this.tblPessoaFisica.ReadOnly = true;
            // 
            // txtTelefone
            // 
            this.txtTelefone.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.tblpessoaBindingSource, "TelefonePessoa", true));
            this.txtTelefone.Location = new System.Drawing.Point(691, 168);
            this.txtTelefone.Mask = "(99) 0000-0000";
            this.txtTelefone.Name = "txtTelefone";
            this.txtTelefone.Size = new System.Drawing.Size(100, 20);
            this.txtTelefone.TabIndex = 16;
            // 
            // btnExcluir
            // 
            this.btnExcluir.Location = new System.Drawing.Point(657, 284);
            this.btnExcluir.Name = "btnExcluir";
            this.btnExcluir.Size = new System.Drawing.Size(75, 23);
            this.btnExcluir.TabIndex = 20;
            this.btnExcluir.Text = "&Excluir";
            this.btnExcluir.UseVisualStyleBackColor = true;
            this.btnExcluir.Click += new System.EventHandler(this.btnExcluir_Click);
            // 
            // btnCancelar
            // 
            this.btnCancelar.Enabled = false;
            this.btnCancelar.Location = new System.Drawing.Point(512, 284);
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(75, 23);
            this.btnCancelar.TabIndex = 19;
            this.btnCancelar.Text = "&Cancelar";
            this.btnCancelar.UseVisualStyleBackColor = true;
            this.btnCancelar.Click += new System.EventHandler(this.btnCancelar_Click);
            // 
            // btnGravar
            // 
            this.btnGravar.Enabled = false;
            this.btnGravar.Location = new System.Drawing.Point(344, 284);
            this.btnGravar.Name = "btnGravar";
            this.btnGravar.Size = new System.Drawing.Size(75, 23);
            this.btnGravar.TabIndex = 18;
            this.btnGravar.Text = "&Gravar";
            this.btnGravar.UseVisualStyleBackColor = true;
            this.btnGravar.Click += new System.EventHandler(this.btnGravar_Click);
            // 
            // btnNovo
            // 
            this.btnNovo.Location = new System.Drawing.Point(161, 284);
            this.btnNovo.Name = "btnNovo";
            this.btnNovo.Size = new System.Drawing.Size(75, 23);
            this.btnNovo.TabIndex = 17;
            this.btnNovo.Text = "&Novo";
            this.btnNovo.UseVisualStyleBackColor = true;
            this.btnNovo.Click += new System.EventHandler(this.btnNovo_Click);
            // 
            // frmPessoaFisica
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(892, 591);
            this.Controls.Add(this.btnExcluir);
            this.Controls.Add(this.btnCancelar);
            this.Controls.Add(this.btnGravar);
            this.Controls.Add(this.btnNovo);
            this.Controls.Add(telefonePessoaLabel);
            this.Controls.Add(this.txtTelefone);
            this.Controls.Add(this.dgvPessoafisica);
            this.Controls.Add(rG_PFLabel);
            this.Controls.Add(this.txtRGPF);
            this.Controls.Add(paiPFLabel);
            this.Controls.Add(this.txtPaiPF);
            this.Controls.Add(maePFLabel);
            this.Controls.Add(this.txtMaePF);
            this.Controls.Add(dataNascPFLabel);
            this.Controls.Add(this.cmbDataNascPF);
            this.Controls.Add(cPF_PFLabel);
            this.Controls.Add(this.txtCPF_PF);
            this.Controls.Add(emailPessoaLabel);
            this.Controls.Add(this.txtEmailPF);
            this.Controls.Add(nomePessoaLabel);
            this.Controls.Add(this.txtNomePF);
            this.Name = "frmPessoaFisica";
            this.Text = "frmPessoaFisica";
            this.FormClosed += new System.Windows.Forms.FormClosedEventHandler(this.frmPessoaFisica_FormClosed);
            this.Load += new System.EventHandler(this.frmPessoaFisica_Load);
            ((System.ComponentModel.ISupportInitialize)(this.tblpessoaBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dgvPessoafisica)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.BindingSource tblpessoaBindingSource;
        private System.Windows.Forms.TextBox txtNomePF;
        private System.Windows.Forms.TextBox txtEmailPF;
        private System.Windows.Forms.TextBox txtCPF_PF;
        private System.Windows.Forms.DateTimePicker cmbDataNascPF;
        private System.Windows.Forms.TextBox txtMaePF;
        private System.Windows.Forms.TextBox txtPaiPF;
        private System.Windows.Forms.TextBox txtRGPF;
        private System.Windows.Forms.DataGridView dgvPessoafisica;
        private System.Windows.Forms.MaskedTextBox txtTelefone;
        private System.Windows.Forms.Button btnExcluir;
        private System.Windows.Forms.Button btnCancelar;
        private System.Windows.Forms.Button btnGravar;
        private System.Windows.Forms.Button btnNovo;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn5;
        private System.Windows.Forms.DataGridViewTextBoxColumn tblPessoaFisica;
    }
}