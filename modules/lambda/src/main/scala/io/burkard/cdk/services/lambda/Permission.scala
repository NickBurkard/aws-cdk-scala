package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Permission {

  def apply(
    principal: software.amazon.awscdk.services.iam.IPrincipal,
    eventSourceToken: Option[String] = None,
    scope: Option[software.constructs.Construct] = None,
    action: Option[String] = None,
    sourceArn: Option[String] = None,
    sourceAccount: Option[String] = None
  ): software.amazon.awscdk.services.lambda.Permission =
    (new software.amazon.awscdk.services.lambda.Permission.Builder)
      .principal(principal)
      .eventSourceToken(eventSourceToken.orNull)
      .scope(scope.orNull)
      .action(action.orNull)
      .sourceArn(sourceArn.orNull)
      .sourceAccount(sourceAccount.orNull)
      .build()
}
