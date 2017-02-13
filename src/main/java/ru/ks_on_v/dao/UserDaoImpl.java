package ru.ks_on_v.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import ru.ks_on_v.model.User;

public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{
    @Override
    public User findByUsername(String name) {
        return null;
    }

    @Override
    public User findById(int id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        return (User) criteria.uniqueResult();
    }
}
