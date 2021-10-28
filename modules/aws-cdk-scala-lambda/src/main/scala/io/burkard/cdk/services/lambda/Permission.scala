package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Permission {

  def apply(
    eventSourceToken: Option[String] = None,
    scope: Option[software.constructs.Construct] = None,
    principal: Option[software.amazon.awscdk.services.iam.IPrincipal] = None,
    action: Option[String] = None,
    sourceArn: Option[String] = None,
    sourceAccount: Option[String] = None
  ): software.amazon.awscdk.services.lambda.Permission =
    (new software.amazon.awscdk.services.lambda.Permission.Builder)
      .eventSourceToken(eventSourceToken.orNull)
      .scope(scope.orNull)
      .principal(principal.orNull)
      .action(action.orNull)
      .sourceArn(sourceArn.orNull)
      .sourceAccount(sourceAccount.orNull)
      .build()
}
