package com.company;

public class cake {
    private double sugar;
    private double butter;
    private double eggs;
    private double vanilla;
    private double flour;
    private double bakingPowder;
    private double milk;
    private double cherry;
    private boolean vegan;
    private boolean diabetes;
    public static class cakeBuilder
    {
        private double sugar;
        private double butter;
        private double eggs;
        private double vanilla;
        private final double flour;
        private final double bakingPowder;
        private final double milk;
        private double cherry;
        private boolean vegan;
        private boolean diabetes;
        public cakeBuilder(double flour,double milk,double bakingPowder)
        {
            this.flour = flour;
            this.milk = milk;
            this.bakingPowder = bakingPowder;
        }
        public cakeBuilder setSugarWeight(double sugar)
        {
            this.sugar = sugar;
            return this;
        }
        public cakeBuilder setButterWeight(double butter)
        {
            this.butter = butter;
            return this;
        }
        public cakeBuilder setEggsWeight(double eggs)
        {
            this.eggs = eggs;
            return this;
        }
        public cakeBuilder setVanillaWeight(double Vanilla)
        {
            this.vanilla = vanilla;
            return this;
        }
        public cakeBuilder setCherryWeight(double cherry)
        {
            this.cherry = cherry;
            return this;
        }
        public cakeBuilder isVegan(boolean vegan)
        {
            this.vegan = vegan;
            return this;
        }
        public cakeBuilder isdiabetes(boolean diabetes)
        {
            this.diabetes = diabetes;
            return this;
        }
        public cake build()
        {
            if(this.vegan && this.eggs!=0){
                System.out.println("Don't add egg Person is vegan");
            }
            if(this.vanilla!=0 && this.sugar==0){
                System.out.println("Vanilla without sugar");
            }
            if(this.sugar!=0 && this.diabetes){
                System.out.println("Person is suffering from diabetes don't add sugar in his cake");
            }
            cake newCake = new cake();
            newCake.sugar = this.sugar;
            newCake.butter = this.butter;
            newCake.eggs = this.eggs;
            newCake.vanilla = this.vanilla;
            newCake.flour = this.flour;
            newCake.bakingPowder = this.bakingPowder;
            newCake.milk = this.milk;
            newCake.cherry = this.cherry;
            return newCake;
        }
    }
}
