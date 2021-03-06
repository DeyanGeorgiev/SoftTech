﻿namespace CalculatorApp.Models
{
    public class Calculator
    {


        public decimal LeftOperand { get; set; }
        public decimal RightOperand { get; set; }
        public decimal Result { get; set; }
        public string Operator { get; set; }

        public void CalculateResult()
        {
            switch (Operator)
            {
                case "+":
                    Result = LeftOperand + RightOperand;
                    break;
                case "-":
                    Result = LeftOperand - RightOperand;
                    break;
                case "/":
                    Result = LeftOperand / RightOperand;
                    break;
                case "*":
                    Result = LeftOperand * RightOperand;
                    break;
            }
        }
    }
}