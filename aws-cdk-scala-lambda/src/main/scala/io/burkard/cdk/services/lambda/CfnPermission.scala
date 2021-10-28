package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPermission {

  def apply(
    internalResourceId: String,
    eventSourceToken: Option[String] = None,
    functionName: Option[String] = None,
    principal: Option[String] = None,
    action: Option[String] = None,
    sourceArn: Option[String] = None,
    sourceAccount: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnPermission =
    software.amazon.awscdk.services.lambda.CfnPermission.Builder
      .create(stackCtx, internalResourceId)
      .eventSourceToken(eventSourceToken.orNull)
      .functionName(functionName.orNull)
      .principal(principal.orNull)
      .action(action.orNull)
      .sourceArn(sourceArn.orNull)
      .sourceAccount(sourceAccount.orNull)
      .build()
}
