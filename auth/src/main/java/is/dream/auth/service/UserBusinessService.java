package is.dream.auth.service;

import is.dream.common.Result;
import is.dream.common.exception.BaseBusinessException;
import is.dream.dao.entiry.User;

/**
 * @author chendongzhao
 * @version 1.0
 * @date 2020/6/10 1:00
 */
public interface UserBusinessService {

     Result<Object> login(String userName, String password) throws BaseBusinessException;

     Result<Object> register(User user);

     Result<Object> logout(User user);

     Result<Object> isLogin(String token);

     Result<Object> isLawful(String token) throws BaseBusinessException;

     Result<Object> isLawfulUserName(String username);

     Result<Object> isLawfulEmail(String email);

}
