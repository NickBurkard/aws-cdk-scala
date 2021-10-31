package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMacroProps {

  def apply(
    name: Option[String] = None,
    functionName: Option[String] = None,
    description: Option[String] = None,
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  ): software.amazon.awscdk.CfnMacroProps =
    (new software.amazon.awscdk.CfnMacroProps.Builder)
      .name(name.orNull)
      .functionName(functionName.orNull)
      .description(description.orNull)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
