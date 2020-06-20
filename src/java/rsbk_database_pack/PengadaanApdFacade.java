/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsbk_database_pack;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author Gredo_JT
 */
@Stateless
public class PengadaanApdFacade extends AbstractFacade<PengadaanApd> {

    @PersistenceContext(unitName = "rsbk_gredoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PengadaanApdFacade() {
        super(PengadaanApd.class);
    }
    
}
