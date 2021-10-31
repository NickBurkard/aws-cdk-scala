package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMacro {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    functionName: Option[String] = None,
    description: Option[String] = None,
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnMacro =
    software.amazon.awscdk.CfnMacro.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .functionName(functionName.orNull)
      .description(description.orNull)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
