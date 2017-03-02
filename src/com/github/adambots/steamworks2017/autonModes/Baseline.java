package com.github.adambots.steamworks2017.autonModes;

import org.usfirst.frc.team245.robot.Actuators;

import com.github.adambots.steamworks2017.auton.GeneratedMotionProfile;
import com.github.adambots.steamworks2017.auton.MotionProfiler;
import com.github.adambots.steamworks2017.drive.Drive;

import edu.wpi.first.wpilibj.command.Command;


public class Baseline extends Command{
	static double distance = 95; //distance to baseline
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Actuators.getLeftDriveMotor().setPosition(0);
		Actuators.getRightDriveMotor().setPosition(0);

	}
	@Override
	protected void execute() {
		System.out.println("I got here execution");
		Drive.driveWithPID(distance, distance);
		
//		GeneratedMotionProfile.Points = Points;
		

		//Drives Motors
//		LeftMotionProfile.startMotionProfile();
//		RightMotionProfile.startMotionProfile();
//		
//		LeftMotionProfile.control();
//		RightMotionProfile.control();
		
	}
	
	
	public Baseline(){
		System.out.println("I got here Baseline");
		

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}
	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}
	
	//this variable placed at the bottom because it is large
//	public static double [][]Points = new double[][]{
//		{0,	0	,10},
//		{0.0000535714285714286,	0.6428571429	,10},
//		{0.000241071428571429,	1.607142857	,10},
//		{0.000616071428571429,	2.892857143	,10},
//		{0.00123214285714286,	4.5	,10},
//		{0.00214285714285714,	6.428571429	,10},
//		{0.00340178571428571,	8.678571429	,10},
//		{0.0050625,	11.25	,10},
//		{0.00717857142857143,	14.14285714	,10},
//		{0.00980357142857143,	17.35714286	,10},
//		{0.0129910714285714,	20.89285714	,10},
//		{0.0167946428571429,	24.75	,10},
//		{0.0212678571428571,	28.92857143	,10},
//		{0.0264642857142857,	33.42857143	,10},
//		{0.0324375,	38.25	,10},
//		{0.0392410714285714,	43.39285714	,10},
//		{0.0469285714285714,	48.85714286	,10},
//		{0.0555535714285714,	54.64285714	,10},
//		{0.0651696428571429,	60.75	,10},
//		{0.0758303571428571,	67.17857143	,10},
//		{0.0875892857142857,	73.92857143	,10},
//		{0.100473214285714,	80.67857143	,10},
//		{0.114482142857143,	87.42857143	,10},
//		{0.129616071428571,	94.17857143	,10},
//		{0.145875,	100.9285714	,10},
//		{0.163258928571429,	107.6785714	,10},
//		{0.181767857142857,	114.4285714	,10},
//		{0.201401785714286,	121.1785714	,10},
//		{0.222160714285714,	127.9285714	,10},
//		{0.244044642857143,	134.6785714	,10},
//		{0.267053571428571,	141.4285714	,10},
//		{0.2911875,	148.1785714	,10},
//		{0.316446428571429,	154.9285714	,10},
//		{0.342830357142857,	161.6785714	,10},
//		{0.370339285714286,	168.4285714	,10},
//		{0.398973214285714,	175.1785714	,10},
//		{0.428732142857143,	181.9285714	,10},
//		{0.459616071428572,	188.6785714	,10},
//		{0.491625,	195.4285714	,10},
//		{0.524758928571429,	202.1785714	,10},
//		{0.559017857142857,	208.9285714	,10},
//		{0.594348214285714,	215.0357143	,10},
//		{0.630669642857143,	220.8214286	,10},
//		{0.667928571428572,	226.2857143	,10},
//		{0.706071428571429,	231.4285714	,10},
//		{0.745044642857143,	236.25	,10},
//		{0.784794642857143,	240.75	,10},
//		{0.825267857142857,	244.9285714	,10},
//		{0.866410714285715,	248.7857143	,10},
//		{0.908169642857143,	252.3214286	,10},
//		{0.950491071428572,	255.5357143	,10},
//		{0.993321428571429,	258.4285714	,10},
//		{1.03660714285714,	261	,10},
//		{1.08029464285714,	263.25	,10},
//		{1.12433035714286,	265.1785714	,10},
//		{1.16866071428571,	266.7857143	,10},
//		{1.21323214285714,	268.0714286	,10},
//		{1.25799107142857,	269.0357143	,10},
//		{1.30288392857143,	269.6785714	,10},
//		{1.34785714285714,	270	,10},
//		{1.39285714285714,	270	,10},
//		{1.43785714285714,	270	,10},
//		{1.48285714285714,	270	,10},
//		{1.52785714285714,	270	,10},
//		{1.57285714285714,	270	,10},
//		{1.61785714285714,	270	,10},
//		{1.66285714285714,	270	,10},
//		{1.70785714285714,	270	,10},
//		{1.75285714285714,	270	,10},
//		{1.79785714285714,	270	,10},
//		{1.84285714285714,	270	,10},
//		{1.88785714285714,	270	,10},
//		{1.93285714285714,	270	,10},
//		{1.97785714285714,	270	,10},
//		{2.02285714285714,	270	,10},
//		{2.06785714285714,	270	,10},
//		{2.11285714285714,	270	,10},
//		{2.15785714285714,	270	,10},
//		{2.20285714285714,	270	,10},
//		{2.24785714285714,	270	,10},
//		{2.29285714285714,	270	,10},
//		{2.33785714285714,	270	,10},
//		{2.38285714285714,	270	,10},
//		{2.42785714285714,	270	,10},
//		{2.47285714285714,	270	,10},
//		{2.51785714285714,	270	,10},
//		{2.56285714285714,	270	,10},
//		{2.60785714285714,	270	,10},
//		{2.65285714285714,	270	,10},
//		{2.69785714285714,	270	,10},
//		{2.74285714285714,	270	,10},
//		{2.78785714285714,	270	,10},
//		{2.83285714285714,	270	,10},
//		{2.87785714285714,	270	,10},
//		{2.92285714285714,	270	,10},
//		{2.96785714285714,	270	,10},
//		{3.01285714285714,	270	,10},
//		{3.05785714285714,	270	,10},
//		{3.10285714285714,	270	,10},
//		{3.14785714285714,	270	,10},
//		{3.19285714285714,	270	,10},
//		{3.23785714285714,	270	,10},
//		{3.28285714285714,	270	,10},
//		{3.32785714285714,	270	,10},
//		{3.37285714285714,	270	,10},
//		{3.41785714285714,	270	,10},
//		{3.46285714285714,	270	,10},
//		{3.50785714285714,	270	,10},
//		{3.55285714285714,	270	,10},
//		{3.59785714285714,	270	,10},
//		{3.64285714285714,	270	,10},
//		{3.68785714285714,	270	,10},
//		{3.73285714285714,	270	,10},
//		{3.77785714285714,	270	,10},
//		{3.82285714285714,	270	,10},
//		{3.86785714285714,	270	,10},
//		{3.91285714285714,	270	,10},
//		{3.95785714285714,	270	,10},
//		{4.00285714285714,	270	,10},
//		{4.04785714285714,	270	,10},
//		{4.09285714285714,	270	,10},
//		{4.13785714285714,	270	,10},
//		{4.18285714285714,	270	,10},
//		{4.22785714285714,	270	,10},
//		{4.27285714285714,	270	,10},
//		{4.31785714285714,	270	,10},
//		{4.36285714285714,	270	,10},
//		{4.40785714285714,	270	,10},
//		{4.45285714285714,	270	,10},
//		{4.49785714285714,	270	,10},
//		{4.54285714285714,	270	,10},
//		{4.58785714285714,	270	,10},
//		{4.63285714285714,	270	,10},
//		{4.67785714285714,	270	,10},
//		{4.72285714285714,	270	,10},
//		{4.76785714285714,	270	,10},
//		{4.81285714285714,	270	,10},
//		{4.85785714285714,	270	,10},
//		{4.90285714285714,	270	,10},
//		{4.94785714285714,	270	,10},
//		{4.99285714285714,	270	,10},
//		{5.03785714285714,	270	,10},
//		{5.08285714285714,	270	,10},
//		{5.12785714285714,	270	,10},
//		{5.17285714285714,	270	,10},
//		{5.21785714285714,	270	,10},
//		{5.26285714285714,	270	,10},
//		{5.30785714285714,	270	,10},
//		{5.35285714285714,	270	,10},
//		{5.39785714285714,	270	,10},
//		{5.44285714285714,	270	,10},
//		{5.48785714285714,	270	,10},
//		{5.53285714285714,	270	,10},
//		{5.57785714285714,	270	,10},
//		{5.62285714285714,	270	,10},
//		{5.66785714285714,	270	,10},
//		{5.71285714285714,	270	,10},
//		{5.75785714285714,	270	,10},
//		{5.80285714285714,	270	,10},
//		{5.84785714285714,	270	,10},
//		{5.89285714285714,	270	,10},
//		{5.93785714285714,	270	,10},
//		{5.98285714285714,	270	,10},
//		{6.02785714285714,	270	,10},
//		{6.07285714285714,	270	,10},
//		{6.11785714285714,	270	,10},
//		{6.16285714285714,	270	,10},
//		{6.20785714285714,	270	,10},
//		{6.25285714285714,	270	,10},
//		{6.29785714285714,	270	,10},
//		{6.34285714285714,	270	,10},
//		{6.38785714285714,	270	,10},
//		{6.43285714285714,	270	,10},
//		{6.47785714285714,	270	,10},
//		{6.52285714285714,	270	,10},
//		{6.56785714285714,	270	,10},
//		{6.61285714285714,	270	,10},
//		{6.65785714285714,	270	,10},
//		{6.70285714285714,	270	,10},
//		{6.74780357142856,	269.3571429	,10},
//		{6.79261607142856,	268.3928571	,10},
//		{6.83724107142856,	267.1071429	,10},
//		{6.88162499999999,	265.5	,10},
//		{6.92571428571428,	263.5714286	,10},
//		{6.96945535714285,	261.3214286	,10},
//		{7.01279464285713,	258.75	,10},
//		{7.05567857142856,	255.8571429	,10},
//		{7.09805357142856,	252.6428571	,10},
//		{7.13986607142856,	249.1071429	,10},
//		{7.18106249999999,	245.25	,10},
//		{7.22158928571428,	241.0714286	,10},
//		{7.26139285714285,	236.5714286	,10},
//		{7.30041964285713,	231.75	,10},
//		{7.33861607142856,	226.6071429	,10},
//		{7.37592857142856,	221.1428571	,10},
//		{7.41230357142856,	215.3571429	,10},
//		{7.44768749999999,	209.25	,10},
//		{7.48202678571427,	202.8214286	,10},
//		{7.51526785714285,	196.0714286	,10},
//		{7.54738392857142,	189.3214286	,10},
//		{7.57837499999999,	182.5714286	,10},
//		{7.60824107142856,	175.8214286	,10},
//		{7.63698214285713,	169.0714286	,10},
//		{7.6645982142857,	162.3214286	,10},
//		{7.69108928571428,	155.5714286	,10},
//		{7.71645535714285,	148.8214286	,10},
//		{7.74069642857142,	142.0714286	,10},
//		{7.76381249999999,	135.3214286	,10},
//		{7.78580357142856,	128.5714286	,10},
//		{7.80666964285713,	121.8214286	,10},
//		{7.8264107142857,	115.0714286	,10},
//		{7.84502678571428,	108.3214286	,10},
//		{7.86251785714285,	101.5714286	,10},
//		{7.87888392857142,	94.82142857	,10},
//		{7.89412499999999,	88.07142857	,10},
//		{7.90824107142856,	81.32142857	,10},
//		{7.92123214285713,	74.57142857	,10},
//		{7.9330982142857,	67.82142857	,10},
//		{7.94383928571427,	61.07142857	,10},
//		{7.95350892857142,	54.96428571	,10},
//		{7.96218749999999,	49.17857143	,10},
//		{7.96992857142856,	43.71428571	,10},
//		{7.9767857142857,	38.57142857	,10},
//		{7.98281249999999,	33.75	,10},
//		{7.98806249999999,	29.25	,10},
//		{7.99258928571428,	25.07142857	,10},
//		{7.99644642857142,	21.21428571	,10},
//		{7.99968749999999,	17.67857143	,10},
//		{8.00236607142856,	14.46428571	,10},
//		{8.0045357142857,	11.57142857	,10},
//		{8.00624999999999,	9	,10},
//		{8.00756249999999,	6.75	,10},
//		{8.00852678571427,	4.821428571	,10},
//		{8.00919642857142,	3.214285714	,10},
//		{8.00962499999999,	1.928571429	,10},
//		{8.00986607142856,	0.9642857143	,10},
//		{8.0099732142857,	0.3214285714	,10},
//		{8.00999999999999,	0	,10}};
//
//	@Override
//	protected boolean isFinished() {
//		// TODO Auto-generated method stub
//		return false;
//	}
}
	