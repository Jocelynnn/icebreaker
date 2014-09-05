package team.mosaic.icebreaker.viewservice;

import team.mosaic.icebreaker.vo.GainVO;

/**
 * ��Ϸ����ӿ�
 */
public interface GameViewService {
	
	/**
	 * ��ʾ����
	 * @param character 1ΪAnna��2ΪKristoff��3ΪSven��4ΪElsa
	 */
	public void showChar(int character);
	
	/**
	 * �ı��ʱ��  
	 * @param time ����Ϊint����λΪ��
	 */
	public void refreshTime(int time);
	
	/**
	 * �ı����������� �������δ�����������
	 * @param count ����Ϊint
	 */
	public void refreshCombo(int count);
	
	/**
	 * �ı�÷�
	 * @param score
	 */
	public void refreshScore(int score);
	/**
	 * ������Ϸ
	 * @param gvo �����ҡ����顢����
	 */
	public void end(GainVO gvo);

	public void initSingle(int character,boolean[] tools);
	
	public void initCoop(int character,String player2,boolean[] tools);
	
	public void initPk(int character,String player2,boolean[] tools);
	
	public void initCoopFour(int character,String[] others,boolean[] tools);
	
	public void initPKFour(int character,String[] others,boolean[] tools);
	
	public void someoneQuit(String id);
}
