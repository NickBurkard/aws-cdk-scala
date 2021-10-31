package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGroupVersionProps {

  def apply(
    coreDefinitionVersionArn: Option[String] = None,
    deviceDefinitionVersionArn: Option[String] = None,
    subscriptionDefinitionVersionArn: Option[String] = None,
    resourceDefinitionVersionArn: Option[String] = None,
    groupId: Option[String] = None,
    functionDefinitionVersionArn: Option[String] = None,
    connectorDefinitionVersionArn: Option[String] = None,
    loggerDefinitionVersionArn: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnGroupVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnGroupVersionProps.Builder)
      .coreDefinitionVersionArn(coreDefinitionVersionArn.orNull)
      .deviceDefinitionVersionArn(deviceDefinitionVersionArn.orNull)
      .subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn.orNull)
      .resourceDefinitionVersionArn(resourceDefinitionVersionArn.orNull)
      .groupId(groupId.orNull)
      .functionDefinitionVersionArn(functionDefinitionVersionArn.orNull)
      .connectorDefinitionVersionArn(connectorDefinitionVersionArn.orNull)
      .loggerDefinitionVersionArn(loggerDefinitionVersionArn.orNull)
      .build()
}
