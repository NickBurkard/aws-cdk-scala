package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermissionProps {

  def apply(
    functionName: String,
    principal: String,
    action: String,
    eventSourceToken: Option[String] = None,
    sourceArn: Option[String] = None,
    sourceAccount: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnPermissionProps =
    (new software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder)
      .functionName(functionName)
      .principal(principal)
      .action(action)
      .eventSourceToken(eventSourceToken.orNull)
      .sourceArn(sourceArn.orNull)
      .sourceAccount(sourceAccount.orNull)
      .build()
}
