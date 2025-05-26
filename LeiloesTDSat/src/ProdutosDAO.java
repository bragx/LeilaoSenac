import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    
    
    public int cadastrarProduto (ProdutosDTO produto){
        
                conn = new conectaDAO().connectDB();
                 int status;
                try
                {
                  String sql = "insert into produtos (nome, valor, status) values (?, ?, ?)";
                        prep = conn.prepareStatement(sql);
                        prep.setString(1, produto.getNome());
                        prep.setInt(2, produto.getValor());
                        prep.setString(3, produto.getStatus());
                        status = prep.executeUpdate();
                        return status;
                }
                catch(SQLException sqle)
                {
                        JOptionPane.showMessageDialog(null, "Erro ao conectar: "+ sqle.getMessage());
                        return 0;
                }
                
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        conn = new conectaDAO().connectDB();
        ArrayList<ProdutosDTO> listagem = new ArrayList<>();
        
        try
        {
                String sql= "select * from produtos";
                prep = conn.prepareStatement(sql);
                resultset = prep.executeQuery();
                
                while(resultset.next())
                {
                        ProdutosDTO produto  = new ProdutosDTO();
                        produto.setId(resultset.getInt("id"));
                        produto.setNome(resultset.getString("nome"));
                        produto.setValor(resultset.getInt("valor"));
                        produto.setStatus(resultset.getString("status"));
                        
                        listagem.add(produto);
                }
        }
        catch(SQLException sqle)
        {
                JOptionPane.showMessageDialog(null, "Erro ao listar o produto: " + sqle.getMessage());
        }
        return listagem;
    }
    }

