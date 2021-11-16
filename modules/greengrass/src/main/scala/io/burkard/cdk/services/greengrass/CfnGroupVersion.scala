package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGroupVersion {

  def apply(
    internalResourceId: String,
    groupId: String,
    coreDefinitionVersionArn: Option[String] = None,
    deviceDefinitionVersionArn: Option[String] = None,
    subscriptionDefinitionVersionArn: Option[String] = None,
    resourceDefinitionVersionArn: Option[String] = None,
    functionDefinitionVersionArn: Option[String] = None,
    connectorDefinitionVersionArn: Option[String] = None,
    loggerDefinitionVersionArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnGroupVersion =
    software.amazon.awscdk.services.greengrass.CfnGroupVersion.Builder
      .create(stackCtx, internalResourceId)
      .groupId(groupId)
      .coreDefinitionVersionArn(coreDefinitionVersionArn.orNull)
      .deviceDefinitionVersionArn(deviceDefinitionVersionArn.orNull)
      .subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn.orNull)
      .resourceDefinitionVersionArn(resourceDefinitionVersionArn.orNull)
      .functionDefinitionVersionArn(functionDefinitionVersionArn.orNull)
      .connectorDefinitionVersionArn(connectorDefinitionVersionArn.orNull)
      .loggerDefinitionVersionArn(loggerDefinitionVersionArn.orNull)
      .build()
}
