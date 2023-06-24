package structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developers developers) {
        super(developers);
    }

   public String makeCodeReview(){
        return "Make code review";
   }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
