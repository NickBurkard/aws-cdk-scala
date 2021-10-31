package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFindingsFilter {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    position: Option[Number] = None,
    action: Option[String] = None,
    description: Option[String] = None,
    findingCriteria: Option[software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.macie.CfnFindingsFilter =
    software.amazon.awscdk.services.macie.CfnFindingsFilter.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .position(position.orNull)
      .action(action.orNull)
      .description(description.orNull)
      .findingCriteria(findingCriteria.orNull)
      .build()
}
