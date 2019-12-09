package com.company;

public class Figure {
    protected Point[] pnts;
    public Figure(int pointCount){
        pnts=new Point[pointCount];
        for (int i=0;i<pnts.length; i++)
            pnts[i]=new Point();
    }
    public void setCoord(int n, double x, double y)
        throws PointIndexException{
        if (n>=0 && n<pnts.length)
            pnts[n].setCoord(x, y);
        else
            throw new PointIndexException(n);
    }
}