package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CriterionProperty {

  def apply: software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionProperty =
    (new software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionProperty.Builder)
      
      .build()
}
