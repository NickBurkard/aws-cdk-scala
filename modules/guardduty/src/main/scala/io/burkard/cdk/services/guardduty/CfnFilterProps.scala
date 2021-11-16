package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFilterProps {

  def apply(
    name: String,
    detectorId: String,
    rank: Number,
    action: String,
    description: String,
    findingCriteria: software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty
  ): software.amazon.awscdk.services.guardduty.CfnFilterProps =
    (new software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder)
      .name(name)
      .detectorId(detectorId)
      .rank(rank)
      .action(action)
      .description(description)
      .findingCriteria(findingCriteria)
      .build()
}
