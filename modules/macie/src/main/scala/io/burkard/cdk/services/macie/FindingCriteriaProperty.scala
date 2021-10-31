package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FindingCriteriaProperty {

  def apply(
    criterion: Option[software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionProperty] = None
  ): software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty =
    (new software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty.Builder)
      .criterion(criterion.orNull)
      .build()
}
