package user.dao;

import java.util.List;
import java.util.Map;

import product.bean.Buy_historyDTO;
import product.bean.ProductImgDTO;
import product.bean.Sell_historyDTO;
import user.bean.AddressDTO;
import user.bean.LikeProDTO;
import user.bean.UserDTO;

public interface UserDAO {
	
	public UserDTO checkLogin(String log_email_input);
	public void addAddressBook(AddressDTO addressDTO);
	public void updateflag(AddressDTO addressDTO);
	public String findEmailAddress(String phone);
	public UserDTO getUserInfo(String user_id);
	public int findPwCheck(Map<String, Object> map);
	public void bookMarkInsert(Map<String, String> map);
	public void bookMarkDelete(Map<String, Object> map);
	public List<LikeProDTO> bookMarkGet(String id);
	public int checkNick(String nickname);
	public int signUpCheck(String hp);
	public void signUpWrite(UserDTO userDTO);
	public void update(UserDTO userDTO);
	public int checkId(String user_id);
	public int checkNaver(String hp);
	public void updateImg(Map<String, String> map);
	public void deleteImg(String user_id);
	public List<Buy_historyDTO> getBuyHistory(String user_id);
	public List<Sell_historyDTO> getSellHistory(String user_id);
	public void SignUpNaver(UserDTO userDTO);
	public UserDTO loginNaver(String user_id);
	public int checkIdKakao(String user_id);
	public void writeKakao(String user_id);
	public ProductImgDTO getProductImg(int product_id);
}
