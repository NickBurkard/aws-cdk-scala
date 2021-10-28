package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FindingCriteriaProperty {

  def apply(
    criterion: Option[AnyRef] = None,
    itemType: Option[software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty] = None
  ): software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty =
    (new software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder)
      .criterion(criterion.orNull)
      .itemType(itemType.orNull)
      .build()
}
