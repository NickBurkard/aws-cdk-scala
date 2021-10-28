package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFindingsFilterProps {

  def apply(
    name: Option[String] = None,
    position: Option[Number] = None,
    action: Option[String] = None,
    description: Option[String] = None,
    findingCriteria: Option[software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty] = None
  ): software.amazon.awscdk.services.macie.CfnFindingsFilterProps =
    (new software.amazon.awscdk.services.macie.CfnFindingsFilterProps.Builder)
      .name(name.orNull)
      .position(position.orNull)
      .action(action.orNull)
      .description(description.orNull)
      .findingCriteria(findingCriteria.orNull)
      .build()
}
