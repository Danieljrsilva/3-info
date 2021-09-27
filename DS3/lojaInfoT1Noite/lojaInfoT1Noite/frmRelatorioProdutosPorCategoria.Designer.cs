namespace lojaInfoT1Noite
{
    partial class frmRelatorioProdutosPorCategoria
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmRelatorioProdutosPorCategoria));
            this.crvProdutoporCategoria = new CrystalDecisions.Windows.Forms.CrystalReportViewer();
            this.SuspendLayout();
            // 
            // crvProdutoporCategoria
            // 
            this.crvProdutoporCategoria.ActiveViewIndex = -1;
            this.crvProdutoporCategoria.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.crvProdutoporCategoria.Cursor = System.Windows.Forms.Cursors.Default;
            this.crvProdutoporCategoria.Dock = System.Windows.Forms.DockStyle.Fill;
            this.crvProdutoporCategoria.Location = new System.Drawing.Point(0, 0);
            this.crvProdutoporCategoria.Name = "crvProdutoporCategoria";
            this.crvProdutoporCategoria.Size = new System.Drawing.Size(906, 538);
            this.crvProdutoporCategoria.TabIndex = 0;
            this.crvProdutoporCategoria.ToolPanelView = CrystalDecisions.Windows.Forms.ToolPanelViewType.None;
            // 
            // frmRelatorioProdutosPorCategoria
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(906, 538);
            this.Controls.Add(this.crvProdutoporCategoria);
            this.Name = "frmRelatorioProdutosPorCategoria";
            this.Text = "frmRelatorioProdutosPorCategoria";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.FormClosed += new System.Windows.Forms.FormClosedEventHandler(this.frmRelatorioProdutosPorCategoria_FormClosed);
            this.Load += new System.EventHandler(this.frmRelatorioProdutosPorCategoria_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private RPT.ProdutosPorCategoria produtosPorCategoria1;
        private CrystalDecisions.Windows.Forms.CrystalReportViewer crvProdutoporCategoria;
    }
}