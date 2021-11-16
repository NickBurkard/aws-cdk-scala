package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMacro {

  def apply(
    internalResourceId: String,
    name: String,
    functionName: String,
    description: Option[String] = None,
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CfnMacro =
    software.amazon.awscdk.services.cloudformation.CfnMacro.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .functionName(functionName)
      .description(description.orNull)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
