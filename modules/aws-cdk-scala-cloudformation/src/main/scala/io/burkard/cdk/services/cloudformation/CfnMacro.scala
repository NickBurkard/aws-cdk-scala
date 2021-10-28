package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMacro {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    functionName: Option[String] = None,
    description: Option[String] = None,
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CfnMacro =
    software.amazon.awscdk.services.cloudformation.CfnMacro.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .functionName(functionName.orNull)
      .description(description.orNull)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
