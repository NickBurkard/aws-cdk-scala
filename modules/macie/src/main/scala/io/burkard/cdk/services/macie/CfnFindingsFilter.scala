package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFindingsFilter {

  def apply(
    internalResourceId: String,
    name: String,
    findingCriteria: software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty,
    position: Option[Number] = None,
    action: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.macie.CfnFindingsFilter =
    software.amazon.awscdk.services.macie.CfnFindingsFilter.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .findingCriteria(findingCriteria)
      .position(position.orNull)
      .action(action.orNull)
      .description(description.orNull)
      .build()
}
