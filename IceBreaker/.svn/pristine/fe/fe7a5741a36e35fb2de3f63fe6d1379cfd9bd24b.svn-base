package team.mosaic.icebreaker.viewservice;

import team.mosaic.icebreaker.vo.GainVO;

/**
 * 游戏界面接口
 */
public interface GameViewService {
	
	/**
	 * 显示人物
	 * @param character 1为Anna，2为Kristoff，3为Sven，4为Elsa
	 */
	public void showChar(int character);
	
	/**
	 * 改变计时器  
	 * @param time 参数为int，单位为秒
	 */
	public void refreshTime(int time);
	
	/**
	 * 改变连击计数器 面板中尚未添加连击区域
	 * @param count 参数为int
	 */
	public void refreshCombo(int count);
	
	/**
	 * 改变得分
	 * @param score
	 */
	public void refreshScore(int score);
	/**
	 * 结算游戏
	 * @param gvo 所获金币、经验、分数
	 */
	public void end(GainVO gvo);

	public void initSingle(int character,boolean[] tools);
	
	public void initCoop(int character,String player2,boolean[] tools);
	
	public void initPk(int character,String player2,boolean[] tools);
	
	public void initCoopFour(int character,String[] others,boolean[] tools);
	
	public void initPKFour(int character,String[] others,boolean[] tools);
	
	public void someoneQuit(String id);
}
