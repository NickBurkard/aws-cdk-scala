package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermission {

  def apply(
    internalResourceId: String,
    functionName: String,
    principal: String,
    action: String,
    eventSourceToken: Option[String] = None,
    sourceArn: Option[String] = None,
    sourceAccount: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnPermission =
    software.amazon.awscdk.services.lambda.CfnPermission.Builder
      .create(stackCtx, internalResourceId)
      .functionName(functionName)
      .principal(principal)
      .action(action)
      .eventSourceToken(eventSourceToken.orNull)
      .sourceArn(sourceArn.orNull)
      .sourceAccount(sourceAccount.orNull)
      .build()
}
