package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFindingsFilterProps {

  def apply(
    name: String,
    findingCriteria: software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty,
    position: Option[Number] = None,
    action: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.macie.CfnFindingsFilterProps =
    (new software.amazon.awscdk.services.macie.CfnFindingsFilterProps.Builder)
      .name(name)
      .findingCriteria(findingCriteria)
      .position(position.orNull)
      .action(action.orNull)
      .description(description.orNull)
      .build()
}
