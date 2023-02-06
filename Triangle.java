public class Triangle extends GeometricObject {
	
	private double side1 , side2  , side3  ;
	
	private String colour ;
	  private boolean fill;
	
	
	public Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;	
		
	}
	
    public Triangle( double sd1, double sd2, double sd3)
	{
		side1 = sd1;
		side2 = sd2;
		side3 = sd3;	
	}
	
   
	public void setColor(String color) 
	{
		this.colour = color;
	}
	
	
	public String getColor()
	{
	 return this.colour;
	}
	
	
	public boolean getFilled()
	{
		return fill;
	}
	
	

	
	public void setFilled(boolean filled) 
	{
		fill = filled;
	}
	
	
	

	public double getSide1()
    {
        return side1;
    }
    

    public void setSide1(double value)
    {
        if (value < 0)
            side1 = 0;
        else
            side1 = value;
    }

    public double getSide2()
    {
        return side2;
    }
    

    public void setSide2(double value)
    {
        if (value < 0)
            side2 = 0;
        else
            side2 = value;
    }
    public double getSide3()
    {
        return side3;
    }
    

    public void setSide3(double value)
    {
        if (value < 0)
            side3 = 0;
        else
            side3 = value;
    }
    
    
	public double getPerimeter()
	{
		return side1 + side2 +side3;
		
	}
	 
	public double getArea( )
	{
		double p = side1 + side2 + side3;
		
		return  Math.sqrt(p * ( (p - side1)*(p - side2)*(p - side3)));
	}

	
	 
	@Override
	  public String toString() 
	  {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				  " side3 = " + side3 + "created on "  + "\ncolor: " + color +
	            " and filled: " + filled;
	  }

	
	

	



}