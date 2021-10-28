package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FindingCriteriaProperty {

  def apply(
    criterion: Option[software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionProperty] = None
  ): software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty =
    (new software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty.Builder)
      .criterion(criterion.orNull)
      .build()
}
