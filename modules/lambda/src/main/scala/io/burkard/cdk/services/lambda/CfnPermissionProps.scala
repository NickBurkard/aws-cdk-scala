package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPermissionProps {

  def apply(
    eventSourceToken: Option[String] = None,
    functionName: Option[String] = None,
    principal: Option[String] = None,
    action: Option[String] = None,
    sourceArn: Option[String] = None,
    sourceAccount: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnPermissionProps =
    (new software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder)
      .eventSourceToken(eventSourceToken.orNull)
      .functionName(functionName.orNull)
      .principal(principal.orNull)
      .action(action.orNull)
      .sourceArn(sourceArn.orNull)
      .sourceAccount(sourceAccount.orNull)
      .build()
}
