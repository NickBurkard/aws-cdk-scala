package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMacroProps {

  def apply(
    name: String,
    functionName: String,
    description: Option[String] = None,
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnMacroProps =
    (new software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder)
      .name(name)
      .functionName(functionName)
      .description(description.orNull)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
