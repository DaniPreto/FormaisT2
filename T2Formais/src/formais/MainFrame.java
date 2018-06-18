package formais;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.lang.String;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.awt.Color;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txt_n_passos;
	private JTextField txt_vazia_fin_inf;
	private JTextField txt_fatorada;
	private JTextField txt_Nf;
	private JTextField txt_Vi;
	private JTextField txt_Ne;
	private JTextField txt_Na;
	private JTextField txt_recursao;
	Pattern numero = Pattern.compile("[0-9]{3}");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 954, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 41, 316, 167);
		contentPane.add(scrollPane);
		
		JEditorPane editPane_GLC_entrada = new JEditorPane();
		scrollPane.setViewportView(editPane_GLC_entrada);
		
		JLabel lblDigiteAGramtica = new JLabel("Digite a gram\u00E1tica Livre de Contexto:");
		lblDigiteAGramtica.setBounds(20, 11, 293, 14);
		contentPane.add(lblDigiteAGramtica);
		
		JButton btnGerarGlcPrpria = new JButton("Gerar GLC Pr\u00F3pria");
		btnGerarGlcPrpria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO
			}
		});
		btnGerarGlcPrpria.setBounds(20, 210, 316, 23);
		contentPane.add(btnGerarGlcPrpria);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(368, 41, 159, 167);
		contentPane.add(scrollPane_1);
		
		JEditorPane editPane_first = new JEditorPane();
		editPane_first.setBackground(Color.LIGHT_GRAY);
		editPane_first.setEditable(false);
		scrollPane_1.setViewportView(editPane_first);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(547, 41, 159, 167);
		contentPane.add(scrollPane_2);
		
		JEditorPane editPane_follow = new JEditorPane();
		editPane_follow.setBackground(Color.LIGHT_GRAY);
		editPane_follow.setEditable(false);
		scrollPane_2.setViewportView(editPane_follow);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(729, 41, 159, 167);
		contentPane.add(scrollPane_3);
		
		JEditorPane editPane_firstNT = new JEditorPane();
		editPane_firstNT.setBackground(Color.LIGHT_GRAY);
		editPane_firstNT.setEditable(false);
		scrollPane_3.setViewportView(editPane_firstNT);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(20, 383, 316, 167);
		contentPane.add(scrollPane_4);
		
		JEditorPane editPane_GLCFinal = new JEditorPane();
		editPane_GLCFinal.setBackground(Color.LIGHT_GRAY);
		editPane_GLCFinal.setEditable(false);
		scrollPane_4.setViewportView(editPane_GLCFinal);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(362, 383, 316, 167);
		contentPane.add(scrollPane_5);
		
		JEditorPane editPane_Coment = new JEditorPane();
		editPane_Coment.setBackground(Color.LIGHT_GRAY);
		editPane_Coment.setEditable(false);
		scrollPane_5.setViewportView(editPane_Coment);
		
		JLabel lblFirsta = new JLabel("First (A):");
		lblFirsta.setBounds(368, 11, 69, 14);
		contentPane.add(lblFirsta);
		
		JLabel lblFollowa = new JLabel("Follow (A):");
		lblFollowa.setBounds(547, 11, 126, 14);
		contentPane.add(lblFollowa);
		
		JLabel lblFirstNt = new JLabel("First-NT(A):");
		lblFirstNt.setBounds(729, 11, 69, 14);
		contentPane.add(lblFirstNt);
		
		JButton btn_calcular_first = new JButton("Calcular");
		btn_calcular_first.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GLC glc = criarGLC(editPane_GLC_entrada);
				String first = glc.calcularFirst();
				editPane_first.setText(first);
			}
		});
		btn_calcular_first.setBounds(433, 7, 94, 23);
		contentPane.add(btn_calcular_first);
		
		JButton btn_calcular_follow = new JButton("Calcular");
		btn_calcular_follow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GLC glc = criarGLC(editPane_GLC_entrada);
				String follow = glc.calcularFollow();
				editPane_follow.setText(follow);
			}
		});
		btn_calcular_follow.setBounds(612, 7, 94, 23);
		contentPane.add(btn_calcular_follow);
		
		JButton btn_calcular_firstNT = new JButton("Calcular");
		btn_calcular_firstNT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GLC glc = criarGLC(editPane_GLC_entrada);
				String firstNT = glc.calcularFirstNT();
				editPane_follow.setText(firstNT);
			}
		});
		btn_calcular_firstNT.setBounds(794, 7, 94, 23);
		contentPane.add(btn_calcular_firstNT);
		
		JLabel lblNewLabel = new JLabel("GLC Final:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 361, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblVaziaFinita = new JLabel("\u00C9 vazia, finita ou infinita?");
		lblVaziaFinita.setBounds(20, 249, 185, 14);
		contentPane.add(lblVaziaFinita);
		
		JLabel lblFatoradaEm = new JLabel("\u00C9 fatorada em ");
		lblFatoradaEm.setBounds(20, 285, 94, 14);
		contentPane.add(lblFatoradaEm);
		
		txt_n_passos = new JTextField();
		txt_n_passos.setBounds(111, 282, 57, 20);
		contentPane.add(txt_n_passos);
		txt_n_passos.setColumns(10);
		
		JLabel lblPassos = new JLabel("passos ?");
		lblPassos.setBounds(179, 285, 57, 14);
		contentPane.add(lblPassos);
		
		JLabel lblRecursoAEsquerda = new JLabel("Recurs\u00E3o a esquerda?");
		lblRecursoAEsquerda.setBounds(20, 321, 185, 14);
		contentPane.add(lblRecursoAEsquerda);
		
		txt_vazia_fin_inf = new JTextField();
		txt_vazia_fin_inf.setBackground(Color.LIGHT_GRAY);
		txt_vazia_fin_inf.setEditable(false);
		txt_vazia_fin_inf.setBounds(362, 246, 344, 20);
		contentPane.add(txt_vazia_fin_inf);
		txt_vazia_fin_inf.setColumns(10);
		
		
		JButton btn_verificar_vff = new JButton("Verificar");
		btn_verificar_vff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GLC glc = criarGLC(editPane_GLC_entrada);
				if(glc.verificarVazia()) {
					txt_vazia_fin_inf.setText("A linguagem é vazia.");
				}
				if(glc.verificarFinitude()) {
					txt_vazia_fin_inf.setText("A linguagem é finita");
				}else {
					txt_vazia_fin_inf.setText("A linguagem é infinita");
				}
			}
		});
		btn_verificar_vff.setBounds(247, 245, 89, 23);
		contentPane.add(btn_verificar_vff);
		
		JButton btn_verificar_fatorada = new JButton("Verificar");
		btn_verificar_fatorada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GLC glc = criarGLC(editPane_GLC_entrada);
				String n = txt_n_passos.getText();
				
				if(numero.matcher(n).matches()){
					if(glc.ehFatorada()) {
						txt_fatorada.setText("Gramática está fatorada.");
					}
					if(glc.ehFatoravelNPassos()) {
						txt_fatorada.setText("É fatoravél em " + txt_n_passos + ".");
					}else{
						txt_fatorada.setText("Não é fatoravel em " + txt_n_passos+ ".");
					}
				}else {
					JOptionPane.showMessageDialog(null,"Número de passos inválido.");
				}
			}
		});
		btn_verificar_fatorada.setBounds(247, 281, 89, 23);
		contentPane.add(btn_verificar_fatorada);
		
		txt_fatorada = new JTextField();
		txt_fatorada.setBackground(Color.LIGHT_GRAY);
		txt_fatorada.setEditable(false);
		txt_fatorada.setColumns(10);
		txt_fatorada.setBounds(362, 282, 344, 20);
		contentPane.add(txt_fatorada);
		
		JButton btn_verificar_recursao = new JButton("Verificar");
		btn_verificar_recursao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GLC glc = criarGLC(editPane_GLC_entrada);
				if(glc.temRecursaoEsquerda()) {
					txt_recursao.setText("Possui recursão a esquerda.");
					editPane_GLCFinal.setText(glc.getGLCNaoRecursiva().toString());
					HashSet<Character> nt = glc.getNTerminaisRecursivos();
					HashSet<String> tipoRec = glc.getTipoDeRecursao();
					String resp = escreverRecursao(nt, tipoRec);
					editPane_Coment.setText("Não terminais recursivos:\n" + resp);
				}else {
					txt_recursao.setText("Não possui recursão a esquerda.");
				}
			}
		});
		btn_verificar_recursao.setBounds(247, 317, 89, 23);
		contentPane.add(btn_verificar_recursao);
		
		txt_Nf = new JTextField();
		txt_Nf.setBackground(Color.LIGHT_GRAY);
		txt_Nf.setEditable(false);
		txt_Nf.setColumns(10);
		txt_Nf.setBounds(724, 383, 204, 20);
		contentPane.add(txt_Nf);
		
		JLabel lblNf = new JLabel("Nf:");
		lblNf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNf.setBounds(686, 383, 31, 14);
		contentPane.add(lblNf);
		
		JLabel lblVi = new JLabel("Vi:");
		lblVi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVi.setBounds(686, 431, 31, 14);
		contentPane.add(lblVi);
		
		JLabel lblNe = new JLabel("Ne:");
		lblNe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNe.setBounds(686, 474, 31, 14);
		contentPane.add(lblNe);
		
		txt_Vi = new JTextField();
		txt_Vi.setBackground(Color.LIGHT_GRAY);
		txt_Vi.setEditable(false);
		txt_Vi.setColumns(10);
		txt_Vi.setBounds(724, 428, 204, 20);
		contentPane.add(txt_Vi);
		
		txt_Ne = new JTextField();
		txt_Ne.setBackground(Color.LIGHT_GRAY);
		txt_Ne.setEditable(false);
		txt_Ne.setColumns(10);
		txt_Ne.setBounds(724, 471, 204, 20);
		contentPane.add(txt_Ne);
		
		JLabel lblNa = new JLabel("Na:");
		lblNa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNa.setBounds(686, 521, 31, 14);
		contentPane.add(lblNa);
		
		txt_Na = new JTextField();
		txt_Na.setBackground(Color.LIGHT_GRAY);
		txt_Na.setEditable(false);
		txt_Na.setColumns(10);
		txt_Na.setBounds(724, 518, 204, 20);
		contentPane.add(txt_Na);
		
		txt_recursao = new JTextField();
		txt_recursao.setBackground(Color.LIGHT_GRAY);
		txt_recursao.setEditable(false);
		txt_recursao.setColumns(10);
		txt_recursao.setBounds(362, 318, 344, 20);
		contentPane.add(txt_recursao);
		
		JLabel lblComentrios = new JLabel("Coment\u00E1rios:");
		lblComentrios.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComentrios.setBounds(362, 362, 165, 14);
		contentPane.add(lblComentrios);
		
		JButton btn_LimparPainel = new JButton("Limpar painel");
		btn_LimparPainel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_fatorada.setText(null);
				txt_n_passos.setText(null);
				txt_Na.setText(null);
				txt_Ne.setText(null);
				txt_Nf.setText(null);
				txt_recursao.setText(null);
				txt_vazia_fin_inf.setText(null);
				txt_Vi.setText(null);
				editPane_Coment.setText(null);
				editPane_first.setText(null);
				editPane_firstNT.setText(null);
				editPane_follow.setText(null);
				editPane_GLC_entrada.setText(null);
				editPane_GLCFinal.setText(null);
				
			}
		});
		btn_LimparPainel.setBounds(724, 579, 204, 23);
		contentPane.add(btn_LimparPainel);
	}
	
	public GLC criarGLC(JEditorPane entrada) { //Transformar o texto de entrada em uma GLC
		//TODO
		return null;
	}
	public String escreverRecursao(HashSet<Character>nt, HashSet<String>tipoRec) {
		//TODO
		return null;
	}
}
