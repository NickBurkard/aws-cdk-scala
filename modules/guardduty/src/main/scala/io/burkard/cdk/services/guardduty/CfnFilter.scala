package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFilter {

  def apply(
    internalResourceId: String,
    name: String,
    detectorId: String,
    rank: Number,
    action: String,
    description: String,
    findingCriteria: software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnFilter =
    software.amazon.awscdk.services.guardduty.CfnFilter.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .detectorId(detectorId)
      .rank(rank)
      .action(action)
      .description(description)
      .findingCriteria(findingCriteria)
      .build()
}
