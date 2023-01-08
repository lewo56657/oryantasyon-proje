namespace sınıf
{
    partial class kronometre
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
            this.btnbaşla = new System.Windows.Forms.Button();
            this.btndurdr = new System.Windows.Forms.Button();
            this.btnsıfırla = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.SuspendLayout();
            // 
            // btnbaşla
            // 
            this.btnbaşla.Location = new System.Drawing.Point(224, 247);
            this.btnbaşla.Name = "btnbaşla";
            this.btnbaşla.Size = new System.Drawing.Size(94, 29);
            this.btnbaşla.TabIndex = 0;
            this.btnbaşla.Text = "Başla";
            this.btnbaşla.UseVisualStyleBackColor = true;
            this.btnbaşla.Click += new System.EventHandler(this.btnbaşla_Click);
            // 
            // btndurdr
            // 
            this.btndurdr.Location = new System.Drawing.Point(372, 247);
            this.btndurdr.Name = "btndurdr";
            this.btndurdr.Size = new System.Drawing.Size(94, 29);
            this.btndurdr.TabIndex = 1;
            this.btndurdr.Text = "durdur";
            this.btndurdr.UseVisualStyleBackColor = true;
            this.btndurdr.Click += new System.EventHandler(this.btndurdr_Click);
            // 
            // btnsıfırla
            // 
            this.btnsıfırla.Location = new System.Drawing.Point(510, 247);
            this.btnsıfırla.Name = "btnsıfırla";
            this.btnsıfırla.Size = new System.Drawing.Size(94, 29);
            this.btnsıfırla.TabIndex = 2;
            this.btnsıfırla.Text = "sıfırla";
            this.btnsıfırla.UseVisualStyleBackColor = true;
            this.btnsıfırla.Click += new System.EventHandler(this.btnsıfırla_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.label1.Location = new System.Drawing.Point(372, 132);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(70, 28);
            this.label1.TabIndex = 3;
            this.label1.Text = "label1";
            // 
            // timer1
            // 
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // kronometre
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnsıfırla);
            this.Controls.Add(this.btndurdr);
            this.Controls.Add(this.btnbaşla);
            this.Name = "kronometre";
            this.Text = "kronometre";
            this.Load += new System.EventHandler(this.kronometre_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private Button btnbaşla;
        private Button btndurdr;
        private Button btnsıfırla;
        private Label label1;
        private System.Windows.Forms.Timer timer1;
    }
}