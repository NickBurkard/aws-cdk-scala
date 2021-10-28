package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFilter {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    detectorId: Option[String] = None,
    rank: Option[Number] = None,
    action: Option[String] = None,
    description: Option[String] = None,
    findingCriteria: Option[software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnFilter =
    software.amazon.awscdk.services.guardduty.CfnFilter.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .detectorId(detectorId.orNull)
      .rank(rank.orNull)
      .action(action.orNull)
      .description(description.orNull)
      .findingCriteria(findingCriteria.orNull)
      .build()
}
