package io.github.lihthub.simpletodo.ui;

import io.github.lihthub.simpletodo.constant.SimpleColors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Vector;

/**
 * @author lihaitao
 * @date 2022/2/20
 */
public class MainFrame extends JFrame {

    private static final int DEFAULT_WITH = 800;

    private static final int DEFAULT_HEIGHT = 600;

    public MainFrame() {
        initFrame();
    }

    private void initFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JSplitPane mainContentPane = new JSplitPane();
        mainContentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        mainContentPane.setDividerSize(1);
        createMenuPanel(mainContentPane);
        createTaskPanel(mainContentPane);

        this.setContentPane(mainContentPane);
        this.setMinimumSize(new Dimension(DEFAULT_WITH, DEFAULT_HEIGHT));
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 窗体居中显示
        this.setLocationRelativeTo(null);
        this.pack();
    }

    private void createMenuPanel(JSplitPane mainContentPane) {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(280, 500));
        menuPanel.setMinimumSize(new Dimension(280, 500));
        menuPanel.setBackground(SimpleColors.MAIN_GRAY);
        createMenuList(menuPanel);
        menuPanel.setVisible(true);
        mainContentPane.setLeftComponent(menuPanel);
    }

    private void createTaskPanel(JSplitPane mainContentPane) {
        JPanel taskPanel = new JPanel();
        taskPanel.setPreferredSize(new Dimension(520, 500));
        taskPanel.setMinimumSize(new Dimension(520, 500));
        taskPanel.setBackground(SimpleColors.MAIN_BLUE);
        taskPanel.setVisible(true);
        mainContentPane.setRightComponent(taskPanel);
    }

    private void createMenuList(JPanel menuPanel) {
        JLabel jLabel1 = new JLabel("我的一天");
        JLabel jLabel2 = new JLabel("重要");
        JLabel jLabel3 = new JLabel("计划内");
        JLabel jLabel4 = new JLabel("已完成");
        JLabel jLabel5 = new JLabel("任务");
        JLabel jLabel6 = new JLabel("报告");
        JLabel jLabel7 = new JLabel("统计");

        Vector<JLabel> menuListData = new Vector<>();
        menuListData.add(jLabel1);
        menuListData.add(jLabel2);
        menuListData.add(jLabel3);
        menuListData.add(jLabel4);
        menuListData.add(jLabel5);
        menuListData.add(jLabel6);
        menuListData.add(jLabel7);

        JList<JLabel> menuList = new JList<>();
        menuList.setListData(menuListData);
        menuList.setFixedCellHeight(30);
        menuList.setSelectedIndex(0);
        menuList.setSelectionBackground(SimpleColors.SELECTED_GRAY);
        menuList.setForeground(Color.BLACK);
        menuList.setFont(new Font("PingFang SC", Font.PLAIN, 20));
        menuList.setVisible(true);

        menuPanel.add(menuList);
    }

}
