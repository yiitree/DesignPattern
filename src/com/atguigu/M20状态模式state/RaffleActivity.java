package com.atguigu.M20״̬ģʽstate;

import com.atguigu.M20״̬ģʽstate.״̬.CanRaffleState;
import com.atguigu.M20״̬ģʽstate.״̬.DispenseOutState;
import com.atguigu.M20״̬ģʽstate.״̬.DispenseState;
import com.atguigu.M20״̬ģʽstate.״̬.NoRaffleState;
import com.atguigu.M20״̬ģʽstate.״̬.State;

/**
 * �齱�
 */
public class RaffleActivity {

	// state ��ʾ���ǰ��״̬���Ǳ仯
    private State state = null;
    // ��Ʒ����
    private int count = 0;
    
    // �ĸ����ԣ���ʾ����״̬
    private State noRafflleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseState = new DispenseState(this);
    private State dispensOutState = new DispenseOutState(this);

    // ������
    //1. ��ʼ����ǰ��״̬Ϊ noRafflleState�������ܳ齱��״̬��
    //2. ��ʼ����Ʒ������
    public RaffleActivity( int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    // 1���۷�, ���õ�ǰ״̬�� deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    // 2���齱
    public void raffle(){
    	// �����ǰ��״̬�ǳ齱�ɹ�
        if(state.raffle()){
        	//��ȡ��Ʒ
            state.dispensePrize();
        }
    }

    // 3���콱����������ע�⣬ÿ��ȡһ�ν�Ʒ��count--��
    public int getCount() {
    	int curCount = count; 
    	count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
    
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
